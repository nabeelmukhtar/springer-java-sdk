
package com.springer.api.schema.xpp;

import java.io.IOException;
import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

import com.springer.api.schema.Caption;
import com.springer.api.schema.Figure;
import com.springer.api.schema.MediaObject;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "caption",
    "mediaObject"
})
@XmlRootElement(name = "Figure")
public class FigureImpl extends BaseSchemaEntity implements Figure
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "Caption", type = CaptionImpl.class)
    protected CaptionImpl caption;
    @XmlElement(name = "MediaObject", required = true, type = MediaObjectImpl.class)
    protected MediaObjectImpl mediaObject;
    @XmlAttribute(name = "Category", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String category;
    @XmlAttribute(name = "Float", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String _float;
    @XmlAttribute(name = "ID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String id;

    public Caption getCaption() {
        return caption;
    }

    public void setCaption(Caption value) {
        this.caption = ((CaptionImpl) value);
    }

    public MediaObject getMediaObject() {
        return mediaObject;
    }

    public void setMediaObject(MediaObject value) {
        this.mediaObject = ((MediaObjectImpl) value);
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String value) {
        this.category = value;
    }

    public String getFloat() {
        return _float;
    }

    public void setFloat(String value) {
        this._float = value;
    }

    public String getID() {
        return id;
    }

    public void setID(String value) {
        this.id = value;
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
