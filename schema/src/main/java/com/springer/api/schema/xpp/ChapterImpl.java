package com.springer.api.schema.xpp;
import java.io.IOException;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

import com.springer.api.schema.BodyRef;
import com.springer.api.schema.Chapter;
import com.springer.api.schema.ChapterBackmatter;
import com.springer.api.schema.ChapterHeader;
import com.springer.api.schema.ChapterInfo;
public class ChapterImpl extends BaseSchemaEntity implements Chapter {
    private final static long serialVersionUID = 2461660169443089969L;
    protected ChapterInfoImpl chapterInfo;
    protected ChapterHeaderImpl chapterHeader;
    protected BodyRefImpl bodyRef;
    protected ChapterBackmatterImpl chapterBackmatter;
    protected String id;
    protected String language;
    public ChapterInfo getChapterInfo() {
        return chapterInfo;
    }
    public void setChapterInfo(ChapterInfo value) {
        chapterInfo = ((ChapterInfoImpl) value);
    }
    public ChapterHeader getChapterHeader() {
        return chapterHeader;
    }
    public void setChapterHeader(ChapterHeader value) {
        chapterHeader = ((ChapterHeaderImpl) value);
    }
    public BodyRef getBodyRef() {
        return bodyRef;
    }
    public void setBodyRef(BodyRef value) {
        bodyRef = ((BodyRefImpl) value);
    }
    public ChapterBackmatter getChapterBackmatter() {
        return chapterBackmatter;
    }
    public void setChapterBackmatter(ChapterBackmatter value) {
        chapterBackmatter = ((ChapterBackmatterImpl) value);
    }
    public String getID() {
        return id;
    }
    public void setID(String value) {
        id = ((String) value);
    }
    public String getLanguage() {
        return language;
    }
    public void setLanguage(String value) {
        language = ((String) value);
    }
    @Override
    public void init(XmlPullParser parser) throws IOException, XmlPullParserException {
        parser.require(XmlPullParser.START_TAG, null, null);
        while (parser.nextTag() == XmlPullParser.START_TAG) {
            String name = parser.getName();
            if (name.equals("ChapterInfo")) {
                ChapterInfoImpl node = new ChapterInfoImpl();
                node.init(parser);
                setChapterInfo(node);
            } else if (name.equals("ChapterHeader")) {
                ChapterHeaderImpl node = new ChapterHeaderImpl();
                node.init(parser);
                setChapterHeader(node);
            } else if (name.equals("BodyRef")) {
                BodyRefImpl node = new BodyRefImpl();
                node.init(parser);
                setBodyRef(node);
            } else if (name.equals("ChapterBackmatter")) {
                ChapterBackmatterImpl node = new ChapterBackmatterImpl();
                node.init(parser);
                setChapterBackmatter(node);
            } else {                // Consume something we don't understand.
                LOG.warning("Found tag that we don't recognize: " + name);
                XppUtils.skipSubTree(parser);
            }
        }
        setID(XppUtils.getAttributeValueFromNode(parser, "ID"));
        setLanguage(XppUtils.getAttributeValueFromNode(parser, "Language"));
    }
    @Override
    public void toXml(XmlSerializer serializer) throws IOException {
    }
}
