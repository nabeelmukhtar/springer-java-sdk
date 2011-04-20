package com.springer.api.schema.xpp;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

import com.springer.api.schema.BookSubject;
import com.springer.api.schema.BookSubjectGroup;
import com.springer.api.schema.SubjectCollection;
public class BookSubjectGroupImpl extends BaseSchemaEntity implements BookSubjectGroup {
    private final static long serialVersionUID = 2461660169443089969L;
    protected List<BookSubject> bookSubjects;
    protected SubjectCollectionImpl subjectCollection;
    public List<BookSubject> getBookSubjects() {
        if (bookSubjects == null) {
            bookSubjects = new ArrayList<BookSubject>();
        }
        return this.bookSubjects;
    }
    public void setBookSubjects(List<BookSubject> value) {
        this.bookSubjects = value;
    }
    public SubjectCollection getSubjectCollection() {
        return subjectCollection;
    }
    public void setSubjectCollection(SubjectCollection value) {
        subjectCollection = ((SubjectCollectionImpl) value);
    }
    @Override
    public void init(XmlPullParser parser) throws IOException, XmlPullParserException {
        parser.require(XmlPullParser.START_TAG, null, null);
        while (parser.nextTag() == XmlPullParser.START_TAG) {
            String name = parser.getName();
            if (name.equals("BookSubject")) {
                BookSubjectImpl node = new BookSubjectImpl();
                node.init(parser);
                getBookSubjects().add(node);
            } else if (name.equals("SubjectCollection")) {
                SubjectCollectionImpl node = new SubjectCollectionImpl();
                node.init(parser);
                setSubjectCollection(node);
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
