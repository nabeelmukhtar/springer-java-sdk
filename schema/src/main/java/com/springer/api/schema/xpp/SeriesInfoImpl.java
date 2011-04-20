package com.springer.api.schema.xpp;
import java.io.IOException;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

import com.springer.api.schema.SeriesInfo;
import com.springer.api.schema.SeriesTitle;
public class SeriesInfoImpl extends SeriesIDImpl implements SeriesInfo {
    private final static long serialVersionUID = 2461660169443089969L;
    protected String seriesPrintISSN;
    protected String seriesElectronicISSN;
    protected SeriesTitleImpl seriesTitle;
    protected String seriesAbbreviatedTitle;
    protected String seriesType;
    protected Long tocLevels;
    public String getSeriesPrintISSN() {
        return seriesPrintISSN;
    }
    public void setSeriesPrintISSN(String value) {
        seriesPrintISSN = ((String) value);
    }
    public String getSeriesElectronicISSN() {
        return seriesElectronicISSN;
    }
    public void setSeriesElectronicISSN(String value) {
        seriesElectronicISSN = ((String) value);
    }
    public SeriesTitle getSeriesTitle() {
        return seriesTitle;
    }
    public void setSeriesTitle(SeriesTitle value) {
        seriesTitle = ((SeriesTitleImpl) value);
    }
    public String getSeriesAbbreviatedTitle() {
        return seriesAbbreviatedTitle;
    }
    public void setSeriesAbbreviatedTitle(String value) {
        seriesAbbreviatedTitle = ((String) value);
    }
    public String getSeriesType() {
        return seriesType;
    }
    public void setSeriesType(String value) {
        seriesType = ((String) value);
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
            if (name.equals("SeriesID")) {
                setSeriesID(XppUtils.getElementValueAsLongFromNode(parser));
            } else if (name.equals("SeriesPrintISSN")) {
                setSeriesPrintISSN(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("SeriesElectronicISSN")) {
                setSeriesElectronicISSN(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("SeriesTitle")) {
                SeriesTitleImpl node = new SeriesTitleImpl();
                node.init(parser);
                setSeriesTitle(node);
            } else if (name.equals("SeriesAbbreviatedTitle")) {
                setSeriesAbbreviatedTitle(XppUtils.getElementValueFromNode(parser));
            } else {                // Consume something we don't understand.
                LOG.warning("Found tag that we don't recognize: " + name);
                XppUtils.skipSubTree(parser);
            }
        }
        setSeriesType(XppUtils.getAttributeValueFromNode(parser, "SeriesType"));
        setTocLevels(XppUtils.getAttributeValueAsLongFromNode(parser, "TocLevels"));
    }
    @Override
    public void toXml(XmlSerializer serializer) throws IOException {
    }
}
