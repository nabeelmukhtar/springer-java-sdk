
package com.springer.api.schema.xpp;

import java.io.IOException;
import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

import com.springer.api.schema.ImageObjectElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "ImageObjectElement")
public class ImageObjectElementImpl
    extends BaseSchemaEntity implements ImageObjectElement
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlAttribute(name = "Color", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String color;
    @XmlAttribute(name = "FileRef", required = true)
    protected String fileRef;
    @XmlAttribute(name = "Format", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String format;
    @XmlAttribute(name = "Rendition", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String rendition;
    @XmlAttribute(name = "Type", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String type;

    public String getColor() {
        return color;
    }

    public void setColor(String value) {
        this.color = value;
    }

    public String getFileRef() {
        return fileRef;
    }

    public void setFileRef(String value) {
        this.fileRef = value;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String value) {
        this.format = value;
    }

    public String getRendition() {
        return rendition;
    }

    public void setRendition(String value) {
        this.rendition = value;
    }

    public String getType() {
        return type;
    }

    public void setType(String value) {
        this.type = value;
    }

	@Override
	public void init(XmlPullParser parser) throws IOException, XmlPullParserException {
        parser.require(XmlPullParser.START_TAG, null, null);

        while (parser.nextTag() == XmlPullParser.START_TAG) {
        	String name = parser.getName();
        	
        	if (name.equals("code")) {
        		setCode(XppUtils.getElementValueFromNode(parser));
            } else {
                // Consume something we don't understand.
            	LOG.warning("Found tag that we don't recognize: " + name);
            	XppUtils.skipSubTree(parser);
            }
        }
	}

	@Override
	public void toXml(XmlSerializer serializer) throws IOException {
		XmlSerializer element = serializer.startTag(null, "action");
		XppUtils.setElementValueToNode(element, "code", getCode());
		element.endTag(null, "action");;
	}
}
