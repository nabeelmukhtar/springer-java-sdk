package com.springer.api.schema.xpp;
import java.io.IOException;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

import com.springer.api.schema.Book;
import com.springer.api.schema.BookInfo;
import com.springer.api.schema.Chapter;
import com.springer.api.schema.EditorGroup;
import com.springer.api.schema.Part;

public class BookImpl extends BaseSchemaEntity implements Book {
    private final static long serialVersionUID = 2461660169443089969L;
    protected BookInfoImpl bookInfo;
    protected EditorGroupImpl bookHeader;
    protected ChapterImpl chapter;
    protected String language;
    protected String outputMedium;
    protected PartImpl part;
    
    public Part getPart() {
        return part;
    }

    public void setPart(Part value) {
        this.part = ((PartImpl) value);
    }
    public BookInfo getBookInfo() {
        return bookInfo;
    }
    public void setBookInfo(BookInfo value) {
        bookInfo = ((BookInfoImpl) value);
    }
    public EditorGroup getBookHeader() {
        return bookHeader;
    }
    public void setBookHeader(EditorGroup value) {
        bookHeader = ((EditorGroupImpl) value);
    }
    public Chapter getChapter() {
        return chapter;
    }
    public void setChapter(Chapter value) {
        chapter = ((ChapterImpl) value);
    }
    public String getLanguage() {
        return language;
    }
    public void setLanguage(String value) {
        language = ((String) value);
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
        setLanguage(XppUtils.getAttributeValueFromNode(parser, "Language"));
        setOutputMedium(XppUtils.getAttributeValueFromNode(parser, "OutputMedium"));
        while (parser.nextTag() == XmlPullParser.START_TAG) {
            String name = parser.getName();
            if (name.equals("BookInfo")) {
                BookInfoImpl node = new BookInfoImpl();
                node.init(parser);
                setBookInfo(node);
            } else if (name.equals("BookHeader")) {
                EditorGroupImpl node = new EditorGroupImpl();
                node.init(parser);
                setBookHeader(node);
            } else if (name.equals("Chapter")) {
                ChapterImpl node = new ChapterImpl();
                node.init(parser);
                setChapter(node);
            } else if (name.equals("Part")) {
            	PartImpl node = new PartImpl();
                node.init(parser);
                setPart(node);
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
