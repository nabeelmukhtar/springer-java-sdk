
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

import com.springer.api.schema.AuthorName;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "givenName",
    "familyName"
})
@XmlRootElement(name = "AuthorName")
public class AuthorNameImpl extends BaseSchemaEntity implements AuthorName
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "GivenName", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String givenName;
    @XmlElement(name = "FamilyName", required = true)
    protected String familyName;
    @XmlAttribute(name = "DisplayOrder", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String displayOrder;

    public String getGivenName() {
        return givenName;
    }

    public void setGivenName(String value) {
        this.givenName = value;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String value) {
        this.familyName = value;
    }

    public String getDisplayOrder() {
        return displayOrder;
    }

    public void setDisplayOrder(String value) {
        this.displayOrder = value;
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
