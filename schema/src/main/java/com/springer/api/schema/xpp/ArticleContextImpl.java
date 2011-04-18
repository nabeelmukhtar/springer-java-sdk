package com.springer.api.schema.xpp;
import java.io.IOException;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

import com.springer.api.schema.ArticleContext;
public class ArticleContextImpl extends BaseSchemaEntity implements ArticleContext {
    private final static long serialVersionUID = 2461660169443089969L;
    protected String journalID;
    protected String volumeIDStart;
    protected String volumeIDEnd;
    protected String issueIDStart;
    protected String issueIDEnd;
    public String getJournalID() {
        return journalID;
    }
    public void setJournalID(String value) {
        journalID = ((String) value);
    }
    public String getVolumeIDStart() {
        return volumeIDStart;
    }
    public void setVolumeIDStart(String value) {
        volumeIDStart = ((String) value);
    }
    public String getVolumeIDEnd() {
        return volumeIDEnd;
    }
    public void setVolumeIDEnd(String value) {
        volumeIDEnd = ((String) value);
    }
    public String getIssueIDStart() {
        return issueIDStart;
    }
    public void setIssueIDStart(String value) {
        issueIDStart = ((String) value);
    }
    public String getIssueIDEnd() {
        return issueIDEnd;
    }
    public void setIssueIDEnd(String value) {
        issueIDEnd = ((String) value);
    }
    @Override
    public void init(XmlPullParser parser) throws IOException, XmlPullParserException {
        parser.require(XmlPullParser.START_TAG, null, null);
        while (parser.nextTag() == XmlPullParser.START_TAG) {
            String name = parser.getName();
            if (name.equals("JournalID")) {
                setJournalID(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("VolumeIDStart")) {
                setVolumeIDStart(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("VolumeIDEnd")) {
                setVolumeIDEnd(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("IssueIDStart")) {
                setIssueIDStart(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("IssueIDEnd")) {
                setIssueIDEnd(XppUtils.getElementValueFromNode(parser));
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
