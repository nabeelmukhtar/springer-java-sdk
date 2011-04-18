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
    protected List<AuthorName> authorNames;
    protected List<Biography> biographies;
    protected List<Contact> contacts;
    protected String affiliationIDS;
    protected String correspondingAffiliationID;
    public List<AuthorName> getAuthorNames() {
        if (authorNames == null) {
            authorNames = new ArrayList<AuthorName>();
        }
        return this.authorNames;
    }
    public void setAuthorNames(List<AuthorName> value) {
        this.authorNames = value;
    }
    public List<Biography> getBiographies() {
        if (biographies == null) {
            biographies = new ArrayList<Biography>();
        }
        return this.biographies;
    }
    public void setBiographies(List<Biography> value) {
        this.biographies = value;
    }
    public List<Contact> getContacts() {
        if (contacts == null) {
            contacts = new ArrayList<Contact>();
        }
        return this.contacts;
    }
    public void setContacts(List<Contact> value) {
        this.contacts = value;
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
                getAuthorNames().add(node);
            } else if (name.equals("Biography")) {
                BiographyImpl node = new BiographyImpl();
                node.init(parser);
                getBiographies().add(node);
            } else if (name.equals("Contact")) {
                ContactImpl node = new ContactImpl();
                node.init(parser);
                getContacts().add(node);
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
