package com.springer.api.schema.xpp;
import java.io.IOException;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

import com.springer.api.schema.JournalInfo;
import com.springer.api.schema.JournalSubjectGroup;
public class JournalInfoImpl extends BaseSchemaEntity implements JournalInfo {
    private final static long serialVersionUID = 2461660169443089969L;
    protected String journalID;
    protected String journalPrintISSN;
    protected String journalElectronicISSN;
    protected Long journalSPIN;
    protected String journalTitle;
    protected String journalSubTitle;
    protected String journalAbbreviatedTitle;
    protected JournalSubjectGroupImpl journalSubjectGroup;
    protected String journalProductType;
    protected String numberingStyle;
    public String getJournalID() {
        return journalID;
    }
    public void setJournalID(String value) {
        journalID = ((String) value);
    }
    public String getJournalPrintISSN() {
        return journalPrintISSN;
    }
    public void setJournalPrintISSN(String value) {
        journalPrintISSN = ((String) value);
    }
    public String getJournalElectronicISSN() {
        return journalElectronicISSN;
    }
    public void setJournalElectronicISSN(String value) {
        journalElectronicISSN = ((String) value);
    }
    public Long getJournalSPIN() {
        return journalSPIN;
    }
    public void setJournalSPIN(Long value) {
        journalSPIN = ((Long) value);
    }
    public String getJournalTitle() {
        return journalTitle;
    }
    public void setJournalTitle(String value) {
        journalTitle = ((String) value);
    }
    public String getJournalSubTitle() {
        return journalSubTitle;
    }
    public void setJournalSubTitle(String value) {
        journalSubTitle = ((String) value);
    }
    public String getJournalAbbreviatedTitle() {
        return journalAbbreviatedTitle;
    }
    public void setJournalAbbreviatedTitle(String value) {
        journalAbbreviatedTitle = ((String) value);
    }
    public JournalSubjectGroup getJournalSubjectGroup() {
        return journalSubjectGroup;
    }
    public void setJournalSubjectGroup(JournalSubjectGroup value) {
        journalSubjectGroup = ((JournalSubjectGroupImpl) value);
    }
    public String getJournalProductType() {
        return journalProductType;
    }
    public void setJournalProductType(String value) {
        journalProductType = ((String) value);
    }
    public String getNumberingStyle() {
        return numberingStyle;
    }
    public void setNumberingStyle(String value) {
        numberingStyle = ((String) value);
    }
    @Override
    public void init(XmlPullParser parser) throws IOException, XmlPullParserException {
        parser.require(XmlPullParser.START_TAG, null, null);
        while (parser.nextTag() == XmlPullParser.START_TAG) {
            String name = parser.getName();
            if (name.equals("JournalID")) {
                setJournalID(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("JournalPrintISSN")) {
                setJournalPrintISSN(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("JournalElectronicISSN")) {
                setJournalElectronicISSN(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("JournalSPIN")) {
                setJournalSPIN(XppUtils.getElementValueAsLongFromNode(parser));
            } else if (name.equals("JournalTitle")) {
                setJournalTitle(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("JournalSubTitle")) {
                setJournalSubTitle(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("JournalAbbreviatedTitle")) {
                setJournalAbbreviatedTitle(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("JournalSubjectGroup")) {
                JournalSubjectGroupImpl node = new JournalSubjectGroupImpl();
                node.init(parser);
                setJournalSubjectGroup(node);
            } else {                // Consume something we don't understand.
                LOG.warning("Found tag that we don't recognize: " + name);
                XppUtils.skipSubTree(parser);
            }
        }
        setJournalProductType(XppUtils.getAttributeValueFromNode(parser, "JournalProductType"));
        setNumberingStyle(XppUtils.getAttributeValueFromNode(parser, "NumberingStyle"));
    }
    @Override
    public void toXml(XmlSerializer serializer) throws IOException {
    }
}
