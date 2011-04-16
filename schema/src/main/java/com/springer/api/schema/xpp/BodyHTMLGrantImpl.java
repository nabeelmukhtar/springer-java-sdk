
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

import com.springer.api.schema.BodyHTMLGrant;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "BodyHTMLGrant")
public class BodyHTMLGrantImpl
    extends BaseSchemaEntity implements BodyHTMLGrant
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlAttribute(name = "Grant", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String grant;

    public String getGrant() {
        return grant;
    }

    public void setGrant(String value) {
        this.grant = value;
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
