package com.springer.api.schema.xpp;
import java.io.IOException;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

import com.springer.api.schema.PartContext;
import com.springer.api.schema.PartInfo;
public class PartInfoImpl extends BaseSchemaEntity implements PartInfo {
    private final static long serialVersionUID = 2461660169443089969L;
    protected Long partID;
    protected String partNumber;
    protected Long partSequenceNumber;
    protected String partTitle;
    protected Long partChapterCount;
    protected PartContextImpl partContext;
    protected Long tocLevels;
    public Long getPartID() {
        return partID;
    }
    public void setPartID(Long value) {
        partID = ((Long) value);
    }
    public String getPartNumber() {
        return partNumber;
    }
    public void setPartNumber(String value) {
        partNumber = ((String) value);
    }
    public Long getPartSequenceNumber() {
        return partSequenceNumber;
    }
    public void setPartSequenceNumber(Long value) {
        partSequenceNumber = ((Long) value);
    }
    public String getPartTitle() {
        return partTitle;
    }
    public void setPartTitle(String value) {
        partTitle = ((String) value);
    }
    public Long getPartChapterCount() {
        return partChapterCount;
    }
    public void setPartChapterCount(Long value) {
        partChapterCount = ((Long) value);
    }
    public PartContext getPartContext() {
        return partContext;
    }
    public void setPartContext(PartContext value) {
        partContext = ((PartContextImpl) value);
    }
    public Long getTocLevels() {
        return tocLevels;
    }
    public void setTocLevels(Long value) {
        tocLevels = ((Long) value);
    }
    @Override
    public void init(XmlPullParser parser) throws IOException, XmlPullParserException {
        parser.require(XmlPullParser.START_TAG, null, null);
        while (parser.nextTag() == XmlPullParser.START_TAG) {
            String name = parser.getName();
            if (name.equals("PartID")) {
                setPartID(XppUtils.getElementValueAsLongFromNode(parser));
            } else if (name.equals("PartNumber")) {
                setPartNumber(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("PartSequenceNumber")) {
                setPartSequenceNumber(XppUtils.getElementValueAsLongFromNode(parser));
            } else if (name.equals("PartTitle")) {
                setPartTitle(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("PartChapterCount")) {
                setPartChapterCount(XppUtils.getElementValueAsLongFromNode(parser));
            } else if (name.equals("PartContext")) {
                PartContextImpl node = new PartContextImpl();
                node.init(parser);
                setPartContext(node);
            } else {                // Consume something we don't understand.
                LOG.warning("Found tag that we don't recognize: " + name);
                XppUtils.skipSubTree(parser);
            }
        }
        setTocLevels(XppUtils.getAttributeValueAsLongFromNode(parser, "TocLevels"));
    }
    @Override
    public void toXml(XmlSerializer serializer) throws IOException {
    }
}
