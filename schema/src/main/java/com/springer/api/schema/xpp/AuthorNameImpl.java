package com.springer.api.schema.xpp;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

import com.springer.api.schema.AuthorName;
public class AuthorNameImpl extends BaseSchemaEntity implements AuthorName {
    private final static long serialVersionUID = 2461660169443089969L;
    protected List<String> givenNames;
    protected String particle;
    protected String familyName;
    protected String displayOrder;
    public List<String> getGivenNames() {
        if (givenNames == null) {
            givenNames = new ArrayList<String>();
        }
        return this.givenNames;
    }
    public void setGivenNames(List<String> value) {
        this.givenNames = value;
    }
    public String getParticle() {
        return particle;
    }
    public void setParticle(String value) {
        particle = ((String) value);
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
        setDisplayOrder(XppUtils.getAttributeValueFromNode(parser, "DisplayOrder"));
        while (parser.nextTag() == XmlPullParser.START_TAG) {
            String name = parser.getName();
            if (name.equals("GivenName")) {
                getGivenNames().add(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("Particle")) {
                setParticle(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("FamilyName")) {
                setFamilyName(XppUtils.getElementValueFromNode(parser));
            } else {                // Consume something we don't understand.
                LOG.warning("Found tag that we don't recognize: " + name);
                XppUtils.skipSubTree(parser);
            }
        }
    }
    @Override
    public void toXml(XmlSerializer serializer) throws IOException {
    }
}
