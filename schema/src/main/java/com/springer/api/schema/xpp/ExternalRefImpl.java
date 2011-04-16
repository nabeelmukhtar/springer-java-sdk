
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

import com.springer.api.schema.ExternalRef;
import com.springer.api.schema.RefTarget;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "refSource",
    "refTarget"
})
@XmlRootElement(name = "ExternalRef")
public class ExternalRefImpl extends BaseSchemaEntity implements ExternalRef
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "RefSource", required = true)
    protected String refSource;
    @XmlElement(name = "RefTarget", required = true, type = RefTargetImpl.class)
    protected RefTargetImpl refTarget;

    public String getRefSource() {
        return refSource;
    }

    public void setRefSource(String value) {
        this.refSource = value;
    }

    public RefTarget getRefTarget() {
        return refTarget;
    }

    public void setRefTarget(RefTarget value) {
        this.refTarget = ((RefTargetImpl) value);
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
