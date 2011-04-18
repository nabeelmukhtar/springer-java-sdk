package com.springer.api.schema.xpp;
import java.io.IOException;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

import com.springer.api.schema.AuthorName;
public class AuthorNameImpl extends BaseSchemaEntity implements AuthorName {
    private final static long serialVersionUID = 2461660169443089969L;
    protected String givenName;
    protected String familyName;
    protected String displayOrder;
    public String getGivenName() {
        return givenName;
    }
    public void setGivenName(String value) {
        givenName = ((String) value);
    }
    public String getFamilyName() {
        return familyName;
    }
    public void setFamilyName(String value) {
        familyName = ((String) value);
    }
    public String getDisplayOrder() {
        return displayOrder;
    }
    public void setDisplayOrder(String value) {
        displayOrder = ((String) value);
    }
    @Override
    public void init(XmlPullParser parser) throws IOException, XmlPullParserException {
        parser.require(XmlPullParser.START_TAG, null, null);
        while (parser.nextTag() == XmlPullParser.START_TAG) {
            String name = parser.getName();
            if (name.equals("GivenName")) {
                setGivenName(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("FamilyName")) {
                setFamilyName(XppUtils.getElementValueFromNode(parser));
            } else {                // Consume something we don't understand.
                LOG.warning("Found tag that we don't recognize: " + name);
                XppUtils.skipSubTree(parser);
            }
        }
        setDisplayOrder(XppUtils.getAttributeValueFromNode(parser, "DisplayOrder"));
    }
    @Override
    public void toXml(XmlSerializer serializer) throws IOException {
    }
}
