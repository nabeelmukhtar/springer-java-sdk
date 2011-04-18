package com.springer.api.schema.xpp;
import java.io.IOException;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

import com.springer.api.schema.Contact;
public class ContactImpl extends BaseSchemaEntity implements Contact {
    private final static long serialVersionUID = 2461660169443089969L;
    protected String phone;
    protected String fax;
    protected String email;
    public String getPhone() {
        return phone;
    }
    public void setPhone(String value) {
        phone = ((String) value);
    }
    public String getFax() {
        return fax;
    }
    public void setFax(String value) {
        fax = ((String) value);
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String value) {
        email = ((String) value);
    }
    @Override
    public void init(XmlPullParser parser) throws IOException, XmlPullParserException {
        parser.require(XmlPullParser.START_TAG, null, null);
        while (parser.nextTag() == XmlPullParser.START_TAG) {
            String name = parser.getName();
            if (name.equals("Phone")) {
                setPhone(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("Fax")) {
                setFax(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("Email")) {
                setEmail(XppUtils.getElementValueFromNode(parser));
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
