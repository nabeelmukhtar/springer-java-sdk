
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

import com.springer.api.schema.BibAuthorName;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "initials",
    "familyName",
    "particle"
})
@XmlRootElement(name = "BibAuthorName")
public class BibAuthorNameImpl
    extends BaseSchemaEntity implements BibAuthorName
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "Initials", required = true)
    protected String initials;
    @XmlElement(name = "FamilyName", required = true)
    protected String familyName;
    @XmlElement(name = "Particle")
    protected String particle;

    public String getInitials() {
        return initials;
    }

    public void setInitials(String value) {
        this.initials = value;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String value) {
        this.familyName = value;
    }

    public String getParticle() {
        return particle;
    }

    public void setParticle(String value) {
        this.particle = value;
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
