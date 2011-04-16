
package com.springer.api.schema.xpp;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

import com.springer.api.schema.File;
import com.springer.api.schema.Path;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "color",
    "format",
    "path",
    "type"
})
@XmlRootElement(name = "File")
public class FileImpl extends BaseSchemaEntity implements File
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "Color")
    protected Boolean color;
    @XmlElement(name = "Format")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String format;
    @XmlElement(name = "Path", required = true, type = PathImpl.class)
    protected List<Path> path;
    @XmlElement(name = "Type")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String type;

    public Boolean isColor() {
        return color;
    }

    public void setColor(Boolean value) {
        this.color = value;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String value) {
        this.format = value;
    }

    public List<Path> getPath() {
        if (path == null) {
            path = new ArrayList<Path>();
        }
        return this.path;
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
