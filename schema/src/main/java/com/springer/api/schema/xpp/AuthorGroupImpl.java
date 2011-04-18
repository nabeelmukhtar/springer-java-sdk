package com.springer.api.schema.xpp;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

import com.springer.api.schema.Affiliation;
import com.springer.api.schema.Author;
import com.springer.api.schema.AuthorGroup;
public class AuthorGroupImpl extends BaseSchemaEntity implements AuthorGroup {
    private final static long serialVersionUID = 2461660169443089969L;
    protected List<Author> author;
    protected List<Affiliation> affiliation;
    public List<Author> getAuthor() {
        if (author == null) {
            author = new ArrayList<Author>();
        }
        return this.author;
    }
    public void setAuthor(List<Author> value) {
        this.author = value;
    }
    public List<Affiliation> getAffiliation() {
        if (affiliation == null) {
            affiliation = new ArrayList<Affiliation>();
        }
        return this.affiliation;
    }
    public void setAffiliation(List<Affiliation> value) {
        this.affiliation = value;
    }
    @Override
    public void init(XmlPullParser parser) throws IOException, XmlPullParserException {
        parser.require(XmlPullParser.START_TAG, null, null);
        while (parser.nextTag() == XmlPullParser.START_TAG) {
            String name = parser.getName();
            if (name.equals("Author")) {
                AuthorImpl node = new AuthorImpl();
                node.init(parser);
                getAuthor().add(node);
            } else if (name.equals("Affiliation")) {
                AffiliationImpl node = new AffiliationImpl();
                node.init(parser);
                getAffiliation().add(node);
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
