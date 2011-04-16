
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

import org.w3._1999.xhtml.P;
import org.w3._1999.xhtml.impl.PImpl;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

import com.springer.api.schema.Caption;
import com.springer.api.schema.CaptionContent;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "p",
    "captionNumber",
    "captionContent"
})
@XmlRootElement(name = "Caption")
public class CaptionImpl
    extends BaseSchemaEntity implements Caption
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(type = PImpl.class)
    protected PImpl p;
    @XmlElement(name = "CaptionNumber")
    protected String captionNumber;
    @XmlElement(name = "CaptionContent", type = CaptionContentImpl.class)
    protected CaptionContentImpl captionContent;
    @XmlAttribute(name = "Language")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String language;

    public P getP() {
        return p;
    }

    public void setP(P value) {
        this.p = ((PImpl) value);
    }

    public String getCaptionNumber() {
        return captionNumber;
    }

    public void setCaptionNumber(String value) {
        this.captionNumber = value;
    }

    public CaptionContent getCaptionContent() {
        return captionContent;
    }

    public void setCaptionContent(CaptionContent value) {
        this.captionContent = ((CaptionContentImpl) value);
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String value) {
        this.language = value;
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
