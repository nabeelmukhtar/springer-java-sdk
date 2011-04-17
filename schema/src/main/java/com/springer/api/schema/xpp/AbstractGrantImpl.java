
package com.springer.api.schema.xpp;

import java.io.IOException;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

import com.springer.api.schema.AbstractGrant;

public class AbstractGrantImpl
    extends BaseSchemaEntity implements AbstractGrant
{

    private final static long serialVersionUID = 2461660169443089969L;
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
        	
        	if (name.equals("Grant")) {
        		setGrant(XppUtils.getElementValueFromNode(parser));
            } else {
                // Consume something we don't understand.
            	LOG.warning("Found tag that we don't recognize: " + name);
            	XppUtils.skipSubTree(parser);
            }
        }
	}

	@Override
	public void toXml(XmlSerializer serializer) throws IOException {
		XmlSerializer element = serializer.startTag(null, "AbstractGrant");
		XppUtils.setElementValueToNode(element, "Grant", getGrant());
		element.endTag(null, "AbstractGrant");
	}

}
