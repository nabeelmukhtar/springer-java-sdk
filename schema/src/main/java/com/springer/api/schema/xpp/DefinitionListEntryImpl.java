package com.springer.api.schema.xpp;
import java.io.IOException;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

import com.springer.api.schema.DefinitionListEntry;
import com.springer.api.schema.Description;
import com.springer.api.schema.Term;
public class DefinitionListEntryImpl extends BaseSchemaEntity implements DefinitionListEntry {
    private final static long serialVersionUID = 2461660169443089969L;
    protected TermImpl term;
    protected DescriptionImpl description;
    public Term getTerm() {
        return term;
    }
    public void setTerm(Term value) {
        term = ((TermImpl) value);
    }
    public Description getDescription() {
        return description;
    }
    public void setDescription(Description value) {
        description = ((DescriptionImpl) value);
    }
    @Override
    public void init(XmlPullParser parser) throws IOException, XmlPullParserException {
        parser.require(XmlPullParser.START_TAG, null, null);
        while (parser.nextTag() == XmlPullParser.START_TAG) {
            String name = parser.getName();
            if (name.equals("Term")) {
                TermImpl node = new TermImpl();
                node.init(parser);
                setTerm(node);
            } else if (name.equals("Description")) {
                DescriptionImpl node = new DescriptionImpl();
                node.init(parser);
                setDescription(node);
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
