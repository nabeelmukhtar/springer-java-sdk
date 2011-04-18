package com.springer.api.schema.xpp;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

import com.springer.api.schema.DefinitionList;
import com.springer.api.schema.DefinitionListEntry;
public class DefinitionListImpl extends BaseSchemaEntity implements DefinitionList {
    private final static long serialVersionUID = 2461660169443089969L;
    protected List<DefinitionListEntry> definitionListEntry;
    public List<DefinitionListEntry> getDefinitionListEntry() {
        if (definitionListEntry == null) {
            definitionListEntry = new ArrayList<DefinitionListEntry>();
        }
        return this.definitionListEntry;
    }
    public void setDefinitionListEntry(List<DefinitionListEntry> value) {
        this.definitionListEntry = value;
    }
    @Override
    public void init(XmlPullParser parser) throws IOException, XmlPullParserException {
        parser.require(XmlPullParser.START_TAG, null, null);
        while (parser.nextTag() == XmlPullParser.START_TAG) {
            String name = parser.getName();
            if (name.equals("DefinitionListEntry")) {
                DefinitionListEntryImpl node = new DefinitionListEntryImpl();
                node.init(parser);
                getDefinitionListEntry().add(node);
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
