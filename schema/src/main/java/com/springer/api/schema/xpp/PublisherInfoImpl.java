
package com.springer.api.schema.xpp;

import java.io.IOException;
import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

import com.springer.api.schema.PublisherInfo;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "publisherName",
    "publisherLocation",
    "publisherURL"
})
@XmlRootElement(name = "PublisherInfo")
public class PublisherInfoImpl
    extends BaseSchemaEntity implements PublisherInfo
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "PublisherName", required = true)
    protected String publisherName;
    @XmlElement(name = "PublisherLocation", required = true)
    protected String publisherLocation;
    @XmlElement(name = "PublisherURL")
    protected String publisherURL;

    public String getPublisherName() {
        return publisherName;
    }

    public void setPublisherName(String value) {
        this.publisherName = value;
    }

    public String getPublisherLocation() {
        return publisherLocation;
    }

    public void setPublisherLocation(String value) {
        this.publisherLocation = value;
    }

    public String getPublisherURL() {
        return publisherURL;
    }

    public void setPublisherURL(String value) {
        this.publisherURL = value;
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
