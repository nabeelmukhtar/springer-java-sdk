package com.springer.api.schema.xpp;
import java.io.IOException;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

import com.springer.api.schema.CoverDate;
import com.springer.api.schema.IssueHistory;
import com.springer.api.schema.OnlineDate;
import com.springer.api.schema.PrintDate;
public class IssueHistoryImpl extends BaseSchemaEntity implements IssueHistory {
    private final static long serialVersionUID = 2461660169443089969L;
    protected OnlineDateImpl onlineDate;
    protected PrintDateImpl printDate;
    protected CoverDateImpl coverDate;
    protected Long pricelistYear;
    public OnlineDate getOnlineDate() {
        return onlineDate;
    }
    public void setOnlineDate(OnlineDate value) {
        onlineDate = ((OnlineDateImpl) value);
    }
    public PrintDate getPrintDate() {
        return printDate;
    }
    public void setPrintDate(PrintDate value) {
        printDate = ((PrintDateImpl) value);
    }
    public CoverDate getCoverDate() {
        return coverDate;
    }
    public void setCoverDate(CoverDate value) {
        coverDate = ((CoverDateImpl) value);
    }
    public Long getPricelistYear() {
        return pricelistYear;
    }
    public void setPricelistYear(Long value) {
        pricelistYear = ((Long) value);
    }
    @Override
    public void init(XmlPullParser parser) throws IOException, XmlPullParserException {
        parser.require(XmlPullParser.START_TAG, null, null);
        while (parser.nextTag() == XmlPullParser.START_TAG) {
            String name = parser.getName();
            if (name.equals("OnlineDate")) {
                OnlineDateImpl node = new OnlineDateImpl();
                node.init(parser);
                setOnlineDate(node);
            } else if (name.equals("PrintDate")) {
                PrintDateImpl node = new PrintDateImpl();
                node.init(parser);
                setPrintDate(node);
            } else if (name.equals("CoverDate")) {
                CoverDateImpl node = new CoverDateImpl();
                node.init(parser);
                setCoverDate(node);
            } else if (name.equals("PricelistYear")) {
                setPricelistYear(XppUtils.getElementValueAsLongFromNode(parser));
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
