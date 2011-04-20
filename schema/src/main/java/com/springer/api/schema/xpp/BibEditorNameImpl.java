package com.springer.api.schema.xpp;
import java.io.IOException;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

import com.springer.api.schema.BibEditorName;
public class BibEditorNameImpl extends BaseSchemaEntity implements BibEditorName {
    private final static long serialVersionUID = 2461660169443089969L;
    protected String initials;
    protected String familyName;
    protected String particle;
    public String getInitials() {
        return initials;
    }
    public void setInitials(String value) {
        initials = ((String) value);
    }
    public String getFamilyName() {
        return familyName;
    }
    public void setFamilyName(String value) {
        familyName = ((String) value);
    }
    public String getParticle() {
        return particle;
    }
    public void setParticle(String value) {
        particle = ((String) value);
    }
    @Override
    public void init(XmlPullParser parser) throws IOException, XmlPullParserException {
        parser.require(XmlPullParser.START_TAG, null, null);
        while (parser.nextTag() == XmlPullParser.START_TAG) {
            String name = parser.getName();
            if (name.equals("Initials")) {
                setInitials(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("FamilyName")) {
                setFamilyName(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("Particle")) {
                setParticle(XppUtils.getElementValueFromNode(parser));
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
