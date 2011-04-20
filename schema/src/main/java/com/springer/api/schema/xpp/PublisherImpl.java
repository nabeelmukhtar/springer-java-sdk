package com.springer.api.schema.xpp;
import java.io.IOException;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

import com.springer.api.schema.Journal;
import com.springer.api.schema.Publisher;
import com.springer.api.schema.PublisherInfo;
import com.springer.api.schema.Series;
import com.springer.app.meta.Info;
import com.springer.app.meta.xpp.InfoImpl;
public class PublisherImpl extends BaseSchemaEntity implements Publisher {
    private final static long serialVersionUID = 2461660169443089969L;
    protected PublisherInfoImpl publisherInfo;
    protected JournalImpl journal;
    protected InfoImpl info;
    protected String lang;
    protected SeriesImpl series;
    public PublisherInfo getPublisherInfo() {
        return publisherInfo;
    }
    public void setPublisherInfo(PublisherInfo value) {
        publisherInfo = ((PublisherInfoImpl) value);
    }
    public Journal getJournal() {
        return journal;
    }
    public void setJournal(Journal value) {
        journal = ((JournalImpl) value);
    }
    public Info getInfo() {
        return info;
    }
    public void setInfo(Info value) {
        info = ((InfoImpl) value);
    }
    public String getLang() {
        return lang;
    }
    public void setLang(String value) {
        lang = ((String) value);
    }
    public Series getSeries() {
        return series;
    }

    public void setSeries(Series value) {
        this.series = ((SeriesImpl) value);
    }
    @Override
    public void init(XmlPullParser parser) throws IOException, XmlPullParserException {
        parser.require(XmlPullParser.START_TAG, null, null);
        setLang(XppUtils.getAttributeValueFromNode(parser, "lang"));
        while (parser.nextTag() == XmlPullParser.START_TAG) {
            String name = parser.getName();
            if (name.equals("PublisherInfo")) {
                PublisherInfoImpl node = new PublisherInfoImpl();
                node.init(parser);
                setPublisherInfo(node);
            } else if (name.equals("Journal")) {
                JournalImpl node = new JournalImpl();
                node.init(parser);
                setJournal(node);
            } else if (name.equals("Series")) {
            	SeriesImpl node = new SeriesImpl();
                node.init(parser);
                setSeries(node);
            } else if (name.equals("meta:Info")) {
            	InfoImpl node = new InfoImpl();
            	node.init(parser);
                setInfo(node);
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
