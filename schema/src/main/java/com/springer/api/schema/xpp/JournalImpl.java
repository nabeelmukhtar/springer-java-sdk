package com.springer.api.schema.xpp;
import java.io.IOException;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

import com.springer.api.schema.Journal;
import com.springer.api.schema.JournalInfo;
import com.springer.api.schema.JournalOnlineFirst;
import com.springer.api.schema.Volume;
public class JournalImpl extends BaseSchemaEntity implements Journal {
    private final static long serialVersionUID = 2461660169443089969L;
    protected JournalInfoImpl journalInfo;
    protected JournalOnlineFirstImpl journalOnlineFirst;
    protected VolumeImpl volume;
    protected String outputMedium;
    public JournalInfo getJournalInfo() {
        return journalInfo;
    }
    public void setJournalInfo(JournalInfo value) {
        journalInfo = ((JournalInfoImpl) value);
    }
    public JournalOnlineFirst getJournalOnlineFirst() {
        return journalOnlineFirst;
    }
    public void setJournalOnlineFirst(JournalOnlineFirst value) {
        journalOnlineFirst = ((JournalOnlineFirstImpl) value);
    }
    public Volume getVolume() {
        return volume;
    }
    public void setVolume(Volume value) {
        volume = ((VolumeImpl) value);
    }
    public String getOutputMedium() {
        return outputMedium;
    }
    public void setOutputMedium(String value) {
        outputMedium = ((String) value);
    }
    @Override
    public void init(XmlPullParser parser) throws IOException, XmlPullParserException {
        parser.require(XmlPullParser.START_TAG, null, null);
        while (parser.nextTag() == XmlPullParser.START_TAG) {
            String name = parser.getName();
            if (name.equals("JournalInfo")) {
                JournalInfoImpl node = new JournalInfoImpl();
                node.init(parser);
                setJournalInfo(node);
            } else if (name.equals("JournalOnlineFirst")) {
                JournalOnlineFirstImpl node = new JournalOnlineFirstImpl();
                node.init(parser);
                setJournalOnlineFirst(node);
            } else if (name.equals("Volume")) {
                VolumeImpl node = new VolumeImpl();
                node.init(parser);
                setVolume(node);
            } else {                // Consume something we don't understand.
                LOG.warning("Found tag that we don't recognize: " + name);
                XppUtils.skipSubTree(parser);
            }
        }
        setOutputMedium(XppUtils.getAttributeValueFromNode(parser, "OutputMedium"));
    }
    @Override
    public void toXml(XmlSerializer serializer) throws IOException {
    }
}
