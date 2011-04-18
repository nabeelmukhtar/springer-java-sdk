package com.springer.api.schema.xpp;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

import com.springer.api.schema.JournalSubject;
import com.springer.api.schema.JournalSubjectGroup;
public class JournalSubjectGroupImpl extends BaseSchemaEntity implements JournalSubjectGroup {
    private final static long serialVersionUID = 2461660169443089969L;
    protected List<JournalSubject> journalSubject;
    public List<JournalSubject> getJournalSubject() {
        if (journalSubject == null) {
            journalSubject = new ArrayList<JournalSubject>();
        }
        return this.journalSubject;
    }
    public void setJournalSubject(List<JournalSubject> value) {
        this.journalSubject = value;
    }
    @Override
    public void init(XmlPullParser parser) throws IOException, XmlPullParserException {
        parser.require(XmlPullParser.START_TAG, null, null);
        while (parser.nextTag() == XmlPullParser.START_TAG) {
            String name = parser.getName();
            if (name.equals("JournalSubject")) {
                JournalSubjectImpl node = new JournalSubjectImpl();
                node.init(parser);
                getJournalSubject().add(node);
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
