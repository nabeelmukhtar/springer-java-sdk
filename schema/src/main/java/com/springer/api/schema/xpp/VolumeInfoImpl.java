package com.springer.api.schema.xpp;
import java.io.IOException;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

import com.springer.api.schema.VolumeInfo;
public class VolumeInfoImpl extends BaseSchemaEntity implements VolumeInfo {
    private final static long serialVersionUID = 2461660169443089969L;
    protected String volumeIDStart;
    protected String volumeIDEnd;
    protected String volumeIssueCount;
    protected Long tocLevels;
    protected String volumeType;
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
    public String getVolumeIssueCount() {
        return volumeIssueCount;
    }
    public void setVolumeIssueCount(String value) {
        volumeIssueCount = ((String) value);
    }
    public Long getTocLevels() {
        return tocLevels;
    }
    public void setTocLevels(Long value) {
        tocLevels = ((Long) value);
    }
    public String getVolumeType() {
        return volumeType;
    }
    public void setVolumeType(String value) {
        volumeType = ((String) value);
    }
    @Override
    public void init(XmlPullParser parser) throws IOException, XmlPullParserException {
        parser.require(XmlPullParser.START_TAG, null, null);
        while (parser.nextTag() == XmlPullParser.START_TAG) {
            String name = parser.getName();
            if (name.equals("VolumeIDStart")) {
                setVolumeIDStart(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("VolumeIDEnd")) {
                setVolumeIDEnd(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("VolumeIssueCount")) {
                setVolumeIssueCount(XppUtils.getElementValueFromNode(parser));
            } else {                // Consume something we don't understand.
                LOG.warning("Found tag that we don't recognize: " + name);
                XppUtils.skipSubTree(parser);
            }
        }
        setTocLevels(XppUtils.getAttributeValueAsLongFromNode(parser, "TocLevels"));
        setVolumeType(XppUtils.getAttributeValueFromNode(parser, "VolumeType"));
    }
    @Override
    public void toXml(XmlSerializer serializer) throws IOException {
    }
}
