package com.springer.api.schema.xpp;
import java.io.IOException;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

import com.springer.api.schema.ChapterContext;
import com.springer.api.schema.ChapterCopyright;
import com.springer.api.schema.ChapterGrants;
import com.springer.api.schema.ChapterHistory;
import com.springer.api.schema.ChapterInfo;
import com.springer.api.schema.ChapterTitle;
public class ChapterInfoImpl extends BaseSchemaEntity implements ChapterInfo {
    private final static long serialVersionUID = 2461660169443089969L;
    protected Long chapterID;
    protected String chapterDOI;
    protected Long chapterSequenceNumber;
    protected ChapterTitleImpl chapterTitle;
    protected Long chapterFirstPage;
    protected Long chapterLastPage;
    protected ChapterCopyrightImpl chapterCopyright;
    protected ChapterHistoryImpl chapterHistory;
    protected ChapterGrantsImpl chapterGrants;
    protected ChapterContextImpl chapterContext;
    protected String chapterType;
    protected String containsESM;
    protected String language;
    protected Long numberingDepth;
    protected String numberingStyle;
    protected String outputMedium;
    protected Long tocLevels;
    public Long getChapterID() {
        return chapterID;
    }
    public void setChapterID(Long value) {
        chapterID = ((Long) value);
    }
    public String getChapterDOI() {
        return chapterDOI;
    }
    public void setChapterDOI(String value) {
        chapterDOI = ((String) value);
    }
    public Long getChapterSequenceNumber() {
        return chapterSequenceNumber;
    }
    public void setChapterSequenceNumber(Long value) {
        chapterSequenceNumber = ((Long) value);
    }
    public ChapterTitle getChapterTitle() {
        return chapterTitle;
    }
    public void setChapterTitle(ChapterTitle value) {
        chapterTitle = ((ChapterTitleImpl) value);
    }
    public Long getChapterFirstPage() {
        return chapterFirstPage;
    }
    public void setChapterFirstPage(Long value) {
        chapterFirstPage = ((Long) value);
    }
    public Long getChapterLastPage() {
        return chapterLastPage;
    }
    public void setChapterLastPage(Long value) {
        chapterLastPage = ((Long) value);
    }
    public ChapterCopyright getChapterCopyright() {
        return chapterCopyright;
    }
    public void setChapterCopyright(ChapterCopyright value) {
        chapterCopyright = ((ChapterCopyrightImpl) value);
    }
    public ChapterHistory getChapterHistory() {
        return chapterHistory;
    }
    public void setChapterHistory(ChapterHistory value) {
        chapterHistory = ((ChapterHistoryImpl) value);
    }
    public ChapterGrants getChapterGrants() {
        return chapterGrants;
    }
    public void setChapterGrants(ChapterGrants value) {
        chapterGrants = ((ChapterGrantsImpl) value);
    }
    public ChapterContext getChapterContext() {
        return chapterContext;
    }
    public void setChapterContext(ChapterContext value) {
        chapterContext = ((ChapterContextImpl) value);
    }
    public String getChapterType() {
        return chapterType;
    }
    public void setChapterType(String value) {
        chapterType = ((String) value);
    }
    public String getContainsESM() {
        return containsESM;
    }
    public void setContainsESM(String value) {
        containsESM = ((String) value);
    }
    public String getLanguage() {
        return language;
    }
    public void setLanguage(String value) {
        language = ((String) value);
    }
    public Long getNumberingDepth() {
        return numberingDepth;
    }
    public void setNumberingDepth(Long value) {
        numberingDepth = ((Long) value);
    }
    public String getNumberingStyle() {
        return numberingStyle;
    }
    public void setNumberingStyle(String value) {
        numberingStyle = ((String) value);
    }
    public String getOutputMedium() {
        return outputMedium;
    }
    public void setOutputMedium(String value) {
        outputMedium = ((String) value);
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
            if (name.equals("ChapterID")) {
                setChapterID(XppUtils.getElementValueAsLongFromNode(parser));
            } else if (name.equals("ChapterDOI")) {
                setChapterDOI(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("ChapterSequenceNumber")) {
                setChapterSequenceNumber(XppUtils.getElementValueAsLongFromNode(parser));
            } else if (name.equals("ChapterTitle")) {
                ChapterTitleImpl node = new ChapterTitleImpl();
                node.init(parser);
                setChapterTitle(node);
            } else if (name.equals("ChapterFirstPage")) {
                setChapterFirstPage(XppUtils.getElementValueAsLongFromNode(parser));
            } else if (name.equals("ChapterLastPage")) {
                setChapterLastPage(XppUtils.getElementValueAsLongFromNode(parser));
            } else if (name.equals("ChapterCopyright")) {
                ChapterCopyrightImpl node = new ChapterCopyrightImpl();
                node.init(parser);
                setChapterCopyright(node);
            } else if (name.equals("ChapterHistory")) {
                ChapterHistoryImpl node = new ChapterHistoryImpl();
                node.init(parser);
                setChapterHistory(node);
            } else if (name.equals("ChapterGrants")) {
                ChapterGrantsImpl node = new ChapterGrantsImpl();
                node.init(parser);
                setChapterGrants(node);
            } else if (name.equals("ChapterContext")) {
                ChapterContextImpl node = new ChapterContextImpl();
                node.init(parser);
                setChapterContext(node);
            } else {                // Consume something we don't understand.
                LOG.warning("Found tag that we don't recognize: " + name);
                XppUtils.skipSubTree(parser);
            }
        }
        setChapterType(XppUtils.getAttributeValueFromNode(parser, "ChapterType"));
        setContainsESM(XppUtils.getAttributeValueFromNode(parser, "ContainsESM"));
        setLanguage(XppUtils.getAttributeValueFromNode(parser, "Language"));
        setNumberingDepth(XppUtils.getAttributeValueAsLongFromNode(parser, "NumberingDepth"));
        setNumberingStyle(XppUtils.getAttributeValueFromNode(parser, "NumberingStyle"));
        setOutputMedium(XppUtils.getAttributeValueFromNode(parser, "OutputMedium"));
        setTocLevels(XppUtils.getAttributeValueAsLongFromNode(parser, "TocLevels"));
    }
    @Override
    public void toXml(XmlSerializer serializer) throws IOException {
    }
}
