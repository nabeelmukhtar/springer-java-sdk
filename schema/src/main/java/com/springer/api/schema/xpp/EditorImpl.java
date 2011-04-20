package com.springer.api.schema.xpp;
import java.io.IOException;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

import com.springer.api.schema.Contact;
import com.springer.api.schema.Editor;
import com.springer.api.schema.EditorName;
public class EditorImpl extends BaseSchemaEntity implements Editor {
    private final static long serialVersionUID = 2461660169443089969L;
    protected EditorNameImpl editorName;
    protected ContactImpl contact;
    protected String affiliationIDS;
    public EditorName getEditorName() {
        return editorName;
    }
    public void setEditorName(EditorName value) {
        editorName = ((EditorNameImpl) value);
    }
    public Contact getContact() {
        return contact;
    }
    public void setContact(Contact value) {
        contact = ((ContactImpl) value);
    }
    public String getAffiliationIDS() {
        return affiliationIDS;
    }
    public void setAffiliationIDS(String value) {
        affiliationIDS = ((String) value);
    }
    @Override
    public void init(XmlPullParser parser) throws IOException, XmlPullParserException {
        parser.require(XmlPullParser.START_TAG, null, null);
        while (parser.nextTag() == XmlPullParser.START_TAG) {
            String name = parser.getName();
            if (name.equals("EditorName")) {
                EditorNameImpl node = new EditorNameImpl();
                node.init(parser);
                setEditorName(node);
            } else if (name.equals("Contact")) {
                ContactImpl node = new ContactImpl();
                node.init(parser);
                setContact(node);
            } else {                // Consume something we don't understand.
                LOG.warning("Found tag that we don't recognize: " + name);
                XppUtils.skipSubTree(parser);
            }
        }
        setAffiliationIDS(XppUtils.getAttributeValueFromNode(parser, "AffiliationIDS"));
    }
    @Override
    public void toXml(XmlSerializer serializer) throws IOException {
    }
}
