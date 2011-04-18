/**
 * 
 */
package com.springer.api.services.example;

import java.io.File;
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.io.Writer;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.TypeVariable;
import java.util.Arrays;
import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

import com.springer.api.schema.xpp.BaseSchemaEntity;

/**
 * @author nmukhtar
 *
 */
public class XppCodeGenerator {
	private static final String SOURCE_DIR = "E:\\workspace\\opensource\\springer-java-sdk\\schema\\src\\main\\java\\com\\springer\\api\\schema\\xpp";
	private static final String PACKAGE_NAME = "com.springer.api.schema.xpp";
	private static final List<String> EXCLUDED_FILES = Arrays.asList("XppUtils.java", "ObjectFactory.java", "BaseSchemaEntity.java");

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		File[] sourceFiles = new File(SOURCE_DIR).listFiles(new FilenameFilter() {

			@Override
			public boolean accept(File dir, String name) {
				return name.endsWith(".java") && !EXCLUDED_FILES.contains(name);
		}});
		
		if (sourceFiles != null) {
			for (File file : sourceFiles) {
				backupFile(file);
				FileWriter writer = new FileWriter(file);
				Class<?> clazz = Class.forName(PACKAGE_NAME + "." + file.getName().replace(".java", ""));
				generateCode(clazz, writer);
				writer.close();
				System.out.println("Updated file: " + file.getAbsolutePath());
			}
		}
	}

	private static void backupFile(File file) {
		
	}

	private static void generateCode(Class<?> clazz, Writer out) throws Exception {
		out.write("package com.springer.api.schema.xpp;\r\n");
		out.write("import java.io.IOException;\r\n");
		out.write("import java.util.List;\r\n");
		out.write("import org.xmlpull.v1.XmlPullParser;\r\n");
		out.write("import org.xmlpull.v1.XmlPullParserException;\r\n");
		out.write("import org.xmlpull.v1.XmlSerializer;\r\n");
		out.write("import com.springer.api.schema.*;\r\n");
		out.write("public class " + clazz.getSimpleName() + " extends BaseSchemaEntity implements " + inter(clazz.getSimpleName()) + " {\r\n");
		out.write("    private final static long serialVersionUID = 2461660169443089969L;\r\n");
		Field[] fields = clazz.getDeclaredFields();
		for (Field field : fields) {
			if (!Modifier.isStatic(field.getModifiers())) {
				if (List.class.isAssignableFrom(field.getType())) {
					TypeVariable<?> genericType = field.getType().getTypeParameters()[0];
					out.write("    protected " + field.getType().getSimpleName() + "<" + genericType.getBounds()[0].getClass().getSimpleName() + "> " + field.getName() + ";\r\n");
				} else {
					out.write("    protected " + field.getType().getSimpleName() + " " + field.getName() + ";\r\n");
				}
			}
		}
		
		for (Field field : fields) {
			if (!Modifier.isStatic(field.getModifiers())) {
				if (List.class.isAssignableFrom(field.getType())) {
					TypeVariable<?> genericType = field.getType().getTypeParameters()[0];
					// getter
					out.write("    public " + inter(field.getType().getSimpleName()) + "<" + genericType.getBounds()[0].getClass().getSimpleName() + "> get" + camel(field.getName()) + "() {\r\n");
					out.write("        return " + field.getName() + ";\r\n");
					out.write("    }\r\n");
					
					// setter
					out.write("    public void set" + camel(field.getName()) + "(" + inter(field.getType().getSimpleName()) + "<" + genericType.getBounds()[0].getClass().getSimpleName() + "> value) {\r\n");
					out.write("        " + field.getName() + " = (("  + field.getType().getSimpleName() + ") value);\r\n");
					out.write("    }\r\n");
				} else {
					// getter
					out.write("    public " + inter(field.getType().getSimpleName()) + " get" + camel(field.getName()) + "() {\r\n");
					out.write("        return " + field.getName() + ";\r\n");
					out.write("    }\r\n");
					
					// setter
					out.write("    public void set" + camel(field.getName()) + "(" + inter(field.getType().getSimpleName()) + " value) {\r\n");
					out.write("        " + field.getName() + " = (("  + field.getType().getSimpleName() + ") value);\r\n");
					out.write("    }\r\n");
				}
			}
		}
		
		out.write("    @Override\r\n");
		out.write("    public void init(XmlPullParser parser) throws IOException, XmlPullParserException {\r\n");
		out.write("        parser.require(XmlPullParser.START_TAG, null, null);\r\n");
		out.write("        while (parser.nextTag() == XmlPullParser.START_TAG) {\r\n");
		out.write("            String name = parser.getName();\r\n");
		boolean firstField = true;
		for (Field field : fields) {
			if (!Modifier.isStatic(field.getModifiers())) {
				XmlElement element = field.getAnnotation(XmlElement.class);
				String name = field.getName();
				if (element != null) {
					name = element.name();
				} else {
					XmlAttribute attribute =  field.getAnnotation(XmlAttribute.class);
					if (attribute != null) {
						name = attribute.name();
					} else {
						System.out.println("Could not find desired annotation:" + field.getName());
					}
				}
				if (firstField) {
					out.write("            if (name.equals(\"" + name + "\")) {\r\n");
					firstField = false;
				} else {
					out.write("            } else if (name.equals(\"" + name + "\")) {\r\n");
				}
				if (BaseSchemaEntity.class.isAssignableFrom(field.getType())) {
					out.write("                " + field.getType().getSimpleName() + " node = new " + field.getType().getSimpleName() + "();\r\n");
					out.write("                node.init(parser);\r\n");
					out.write("                set" + camel(field.getName()) + "(node);\r\n");
				} else if (List.class.isAssignableFrom(field.getType())) {
					TypeVariable<?> genericType = field.getType().getTypeParameters()[0];
					out.write("                " + genericType.getBounds()[0].getClass().getSimpleName() + " node = new " + genericType.getBounds()[0].getClass().getSimpleName() + "();\r\n");
					out.write("                node.init(parser);\r\n");
					out.write("                get" + camel(field.getName()) + "().add(node);\r\n");
				} else {
					out.write("                XppUtils.getElementValueFromNode(parser);\r\n");
				}
			}
		}
		out.write("            } else {");
		out.write("                // Consume something we don't understand.\r\n");
		out.write("                LOG.warning(\"Found tag that we don't recognize: \" + name);\r\n");
		out.write("                XppUtils.skipSubTree(parser);\r\n");
		out.write("            }\r\n");
		out.write("        }\r\n");
		out.write("    }\r\n");
		out.write("    @Override\r\n");
		out.write("    public void toXml(XmlSerializer serializer) throws IOException {\r\n");
		out.write("    }\r\n");
		
		out.write("}\r\n");
	}

	private static String camel(String name) {
		return Character.toUpperCase(name.charAt(0)) + name.substring(1);
	}
	
	private static String inter(String name) {
		return name.replace("Impl", "");
	}
}
