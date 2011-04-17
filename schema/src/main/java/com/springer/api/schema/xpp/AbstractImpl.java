
package com.springer.api.schema.xpp;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

import com.springer.api.schema.Abstract;
import com.springer.api.schema.AbstractSection;
import com.springer.api.schema.Heading;
import com.springer.api.schema.Para;

public class AbstractImpl
    extends BaseSchemaEntity implements Abstract
{

    private final static long serialVersionUID = 2461660169443089969L;
    protected HeadingImpl heading;
    protected ParaImpl para;
    protected List<AbstractSection> abstractSection;
    protected String id;
    protected String language;
    protected String outputMedium;

    public Heading getHeading() {
        return heading;
    }

    public void setHeading(Heading value) {
        this.heading = ((HeadingImpl) value);
    }

    public Para getPara() {
        return para;
    }

    public void setPara(Para value) {
        this.para = ((ParaImpl) value);
    }

    public List<AbstractSection> getAbstractSection() {
        if (abstractSection == null) {
            abstractSection = new ArrayList<AbstractSection>();
        }
        return this.abstractSection;
    }

    public String getID() {
        return id;
    }

    public void setID(String value) {
        this.id = value;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String value) {
        this.language = value;
    }

    public String getOutputMedium() {
        return outputMedium;
    }

    public void setOutputMedium(String value) {
        this.outputMedium = value;
    }

	@Override
	public void init(XmlPullParser parser) throws IOException, XmlPullParserException {
        parser.require(XmlPullParser.START_TAG, null, null);

        while (parser.nextTag() == XmlPullParser.START_TAG) {
        	String name = parser.getName();
        	
        	if (name.equals("Heading")) {
        		HeadingImpl node = new HeadingImpl();
        		node.init(parser);
        		setHeading(node);
            } else if (name.equals("Para")) {
            	ParaImpl node = new ParaImpl();
        		node.init(parser);
        		setPara(node);
            } else if (name.equals("AbstractSection")) {
            	AbstractSectionImpl node = new AbstractSectionImpl();
        		node.init(parser);
        		getAbstractSection().add(node);
            } else if (name.equals("ID")) {
        		setID(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("Language")) {
        		setLanguage(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("OutputMedium")) {
        		setOutputMedium(XppUtils.getElementValueFromNode(parser));
            } else {
                // Consume something we don't understand.
            	LOG.warning("Found tag that we don't recognize: " + name);
            	XppUtils.skipSubTree(parser);
            }
        }
	}

	@Override
	public void toXml(XmlSerializer serializer) throws IOException {
		XmlSerializer element = serializer.startTag(null, "Abstract");
		element.endTag(null, "Abstract");;
	}
}
