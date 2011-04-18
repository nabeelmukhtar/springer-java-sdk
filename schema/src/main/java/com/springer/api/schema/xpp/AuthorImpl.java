package com.springer.api.schema.xpp;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

import com.springer.api.schema.Author;
import com.springer.api.schema.AuthorName;
import com.springer.api.schema.Biography;
import com.springer.api.schema.Contact;
public class AuthorImpl extends BaseSchemaEntity implements Author {
    private final static long serialVersionUID = 2461660169443089969L;
    protected List<AuthorName> authorName;
    protected List<Biography> biography;
    protected List<Contact> contact;
    protected String affiliationIDS;
    protected String correspondingAffiliationID;
    public List<AuthorName> getAuthorName() {
        if (authorName == null) {
            authorName = new ArrayList<AuthorName>();
        }
        return this.authorName;
    }
    public void setAuthorName(List<AuthorName> value) {
        this.authorName = value;
    }
    public List<Biography> getBiography() {
        if (biography == null) {
            biography = new ArrayList<Biography>();
        }
        return this.biography;
    }
    public void setBiography(List<Biography> value) {
        this.biography = value;
    }
    public List<Contact> getContact() {
        if (contact == null) {
            contact = new ArrayList<Contact>();
        }
        return this.contact;
    }
    public void setContact(List<Contact> value) {
        this.contact = value;
    }
    public String getAffiliationIDS() {
        return affiliationIDS;
    }
    public void setAffiliationIDS(String value) {
        affiliationIDS = ((String) value);
    }
    public String getCorrespondingAffiliationID() {
        return correspondingAffiliationID;
    }
    public void setCorrespondingAffiliationID(String value) {
        correspondingAffiliationID = ((String) value);
    }
    @Override
    public void init(XmlPullParser parser) throws IOException, XmlPullParserException {
        parser.require(XmlPullParser.START_TAG, null, null);
        while (parser.nextTag() == XmlPullParser.START_TAG) {
            String name = parser.getName();
            if (name.equals("AuthorName")) {
                AuthorNameImpl node = new AuthorNameImpl();
                node.init(parser);
                getAuthorName().add(node);
            } else if (name.equals("Biography")) {
                BiographyImpl node = new BiographyImpl();
                node.init(parser);
                getBiography().add(node);
            } else if (name.equals("Contact")) {
                ContactImpl node = new ContactImpl();
                node.init(parser);
                getContact().add(node);
            } else {                // Consume something we don't understand.
                LOG.warning("Found tag that we don't recognize: " + name);
                XppUtils.skipSubTree(parser);
            }
        }
        setAffiliationIDS(XppUtils.getAttributeValueFromNode(parser, "AffiliationIDS"));
        setCorrespondingAffiliationID(XppUtils.getAttributeValueFromNode(parser, "CorrespondingAffiliationID"));
    }
    @Override
    public void toXml(XmlSerializer serializer) throws IOException {
    }
}
