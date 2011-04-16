
package com.springer.api.schema.xpp;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlMixed;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

import com.springer.api.schema.Author;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "content"
})
@XmlRootElement(name = "Author")
public class AuthorImpl
    extends BaseSchemaEntity implements Author
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElementRefs({
        @XmlElementRef(name = "AuthorName", type = AuthorNameImpl.class),
        @XmlElementRef(name = "Biography", type = BiographyImpl.class),
        @XmlElementRef(name = "Contact", type = ContactImpl.class)
    })
    @XmlMixed
    protected List<Object> content;
    @XmlAttribute(name = "AffiliationIDS")
    protected String affiliationIDS;
    @XmlAttribute(name = "CorrespondingAffiliationID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String correspondingAffiliationID;

    public List<Object> getContent() {
        if (content == null) {
            content = new ArrayList<Object>();
        }
        return this.content;
    }

    public String getAffiliationIDS() {
        return affiliationIDS;
    }

    public void setAffiliationIDS(String value) {
        this.affiliationIDS = value;
    }

    public String getCorrespondingAffiliationID() {
        return correspondingAffiliationID;
    }

    public void setCorrespondingAffiliationID(String value) {
        this.correspondingAffiliationID = value;
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
