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
    protected List<JournalSubject> journalSubjects;
    public List<JournalSubject> getJournalSubjects() {
        if (journalSubjects == null) {
            journalSubjects = new ArrayList<JournalSubject>();
        }
        return this.journalSubjects;
    }
    public void setJournalSubjects(List<JournalSubject> value) {
        this.journalSubjects = value;
    }
    @Override
    public void init(XmlPullParser parser) throws IOException, XmlPullParserException {
        parser.require(XmlPullParser.START_TAG, null, null);
        while (parser.nextTag() == XmlPullParser.START_TAG) {
            String name = parser.getName();
            if (name.equals("JournalSubject")) {
                JournalSubjectImpl node = new JournalSubjectImpl();
                node.init(parser);
                getJournalSubjects().add(node);
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
