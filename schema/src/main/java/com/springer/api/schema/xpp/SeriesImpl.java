package com.springer.api.schema.xpp;
import java.io.IOException;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

import com.springer.api.schema.Book;
import com.springer.api.schema.EditorGroup;
import com.springer.api.schema.Series;
import com.springer.api.schema.SeriesInfo;
public class SeriesImpl extends BaseSchemaEntity implements Series {
    private final static long serialVersionUID = 2461660169443089969L;
    protected SeriesInfoImpl seriesInfo;
    protected EditorGroupImpl seriesHeader;
    protected BookImpl book;
    public SeriesInfo getSeriesInfo() {
        return seriesInfo;
    }
    public void setSeriesInfo(SeriesInfo value) {
        seriesInfo = ((SeriesInfoImpl) value);
    }
    public EditorGroup getSeriesHeader() {
        return seriesHeader;
    }
    public void setSeriesHeader(EditorGroup value) {
        seriesHeader = ((EditorGroupImpl) value);
    }
    public Book getBook() {
        return book;
    }
    public void setBook(Book value) {
        book = ((BookImpl) value);
    }
    @Override
    public void init(XmlPullParser parser) throws IOException, XmlPullParserException {
        parser.require(XmlPullParser.START_TAG, null, null);
        while (parser.nextTag() == XmlPullParser.START_TAG) {
            String name = parser.getName();
            if (name.equals("SeriesInfo")) {
                SeriesInfoImpl node = new SeriesInfoImpl();
                node.init(parser);
                setSeriesInfo(node);
            } else if (name.equals("SeriesHeader")) {
                EditorGroupImpl node = new EditorGroupImpl();
                node.init(parser);
                setSeriesHeader(node);
            } else if (name.equals("Book")) {
                BookImpl node = new BookImpl();
                node.init(parser);
                setBook(node);
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
