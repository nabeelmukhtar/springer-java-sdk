package com.springer.api.schema.xpp;
import java.io.IOException;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

import com.springer.api.schema.BookTitle;
import com.springer.api.schema.ChapterContext;
public class ChapterContextImpl extends SeriesIDImpl implements ChapterContext {
    private final static long serialVersionUID = 2461660169443089969L;
    protected String bookID;
    protected BookTitleImpl bookTitle;
    protected Long partID;
    
    public Long getPartID() {
        return partID;
    }

    public void setPartID(Long value) {
        this.partID = value;
    }
    public String getBookID() {
        return bookID;
    }
    public void setBookID(String value) {
        bookID = ((String) value);
    }
    public BookTitle getBookTitle() {
        return bookTitle;
    }
    public void setBookTitle(BookTitle value) {
        bookTitle = ((BookTitleImpl) value);
    }
    @Override
    public void init(XmlPullParser parser) throws IOException, XmlPullParserException {
        parser.require(XmlPullParser.START_TAG, null, null);
        while (parser.nextTag() == XmlPullParser.START_TAG) {
            String name = parser.getName();
            if (name.equals("SeriesID")) {
                setSeriesID(XppUtils.getElementValueAsLongFromNode(parser));
            } else if (name.equals("BookID")) {
                setBookID(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("PartID")) {
                setPartID(XppUtils.getElementValueAsLongFromNode(parser));
            } else if (name.equals("BookTitle")) {
                BookTitleImpl node = new BookTitleImpl();
                node.init(parser);
                setBookTitle(node);
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
