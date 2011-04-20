package com.springer.api.schema.xpp;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

import com.springer.api.schema.Affiliation;
import com.springer.api.schema.Editor;
import com.springer.api.schema.EditorGroupElement;
public class EditorGroupElementImpl extends BaseSchemaEntity implements EditorGroupElement {
    private final static long serialVersionUID = 2461660169443089969L;
    protected List<Editor> editors;
    protected List<Affiliation> affiliations;
    public List<Editor> getEditors() {
        if (editors == null) {
            editors = new ArrayList<Editor>();
        }
        return this.editors;
    }
    public void setEditors(List<Editor> value) {
        this.editors = value;
    }
    public List<Affiliation> getAffiliations() {
        if (affiliations == null) {
            affiliations = new ArrayList<Affiliation>();
        }
        return this.affiliations;
    }
    public void setAffiliations(List<Affiliation> value) {
        this.affiliations = value;
    }
    @Override
    public void init(XmlPullParser parser) throws IOException, XmlPullParserException {
        parser.require(XmlPullParser.START_TAG, null, null);
        while (parser.nextTag() == XmlPullParser.START_TAG) {
            String name = parser.getName();
            if (name.equals("Editor")) {
                EditorImpl node = new EditorImpl();
                node.init(parser);
                getEditors().add(node);
            } else if (name.equals("Affiliation")) {
                AffiliationImpl node = new AffiliationImpl();
                node.init(parser);
                getAffiliations().add(node);
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
