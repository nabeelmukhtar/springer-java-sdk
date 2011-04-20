package com.springer.api.schema.xpp;
import java.io.IOException;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

import com.springer.api.schema.Affiliation;
import com.springer.api.schema.OrgAddress;
public class AffiliationImpl extends BaseSchemaEntity implements Affiliation {
    private final static long serialVersionUID = 2461660169443089969L;
    protected String orgDivision;
    protected String orgName;
    protected OrgAddressImpl orgAddress;
    protected String id;
    public String getOrgDivision() {
        return orgDivision;
    }
    public void setOrgDivision(String value) {
        orgDivision = ((String) value);
    }
    public String getOrgName() {
        return orgName;
    }
    public void setOrgName(String value) {
        orgName = ((String) value);
    }
    public OrgAddress getOrgAddress() {
        return orgAddress;
    }
    public void setOrgAddress(OrgAddress value) {
        orgAddress = ((OrgAddressImpl) value);
    }
    public String getID() {
        return id;
    }
    public void setID(String value) {
        id = ((String) value);
    }
    @Override
    public void init(XmlPullParser parser) throws IOException, XmlPullParserException {
        parser.require(XmlPullParser.START_TAG, null, null);
        setID(XppUtils.getAttributeValueFromNode(parser, "ID"));
        while (parser.nextTag() == XmlPullParser.START_TAG) {
            String name = parser.getName();
            if (name.equals("OrgDivision")) {
                setOrgDivision(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("OrgName")) {
                setOrgName(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("OrgAddress")) {
                OrgAddressImpl node = new OrgAddressImpl();
                node.init(parser);
                setOrgAddress(node);
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
