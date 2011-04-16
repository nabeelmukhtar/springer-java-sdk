
package com.springer.api.schema.xpp;

import java.io.IOException;
import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.w3._2001.xmlschema.Adapter1;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

import com.springer.api.schema.CoverDate;
import com.springer.api.schema.IssueHistory;
import com.springer.api.schema.OnlineDate;
import com.springer.api.schema.PrintDate;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "onlineDate",
    "printDate",
    "coverDate",
    "pricelistYear"
})
@XmlRootElement(name = "IssueHistory")
public class IssueHistoryImpl
    extends BaseSchemaEntity implements IssueHistory
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "OnlineDate", type = OnlineDateImpl.class)
    protected OnlineDateImpl onlineDate;
    @XmlElement(name = "PrintDate", required = true, type = PrintDateImpl.class)
    protected PrintDateImpl printDate;
    @XmlElement(name = "CoverDate", type = CoverDateImpl.class)
    protected CoverDateImpl coverDate;
    @XmlElement(name = "PricelistYear", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected Long pricelistYear;

    public OnlineDate getOnlineDate() {
        return onlineDate;
    }

    public void setOnlineDate(OnlineDate value) {
        this.onlineDate = ((OnlineDateImpl) value);
    }

    public PrintDate getPrintDate() {
        return printDate;
    }

    public void setPrintDate(PrintDate value) {
        this.printDate = ((PrintDateImpl) value);
    }

    public CoverDate getCoverDate() {
        return coverDate;
    }

    public void setCoverDate(CoverDate value) {
        this.coverDate = ((CoverDateImpl) value);
    }

    public Long getPricelistYear() {
        return pricelistYear;
    }

    public void setPricelistYear(Long value) {
        this.pricelistYear = value;
    }

	@Override
	public void init(XmlPullParser parser) throws IOException, XmlPullParserException {
        parser.require(XmlPullParser.START_TAG, null, null);

        while (parser.nextTag() == XmlPullParser.START_TAG) {
        	String name = parser.getName();
        	
        	if (name.equals("code")) {
        		setCode(XppUtils.getElementValueFromNode(parser));
            } else {
                // Consume something we don't understand.
            	LOG.warning("Found tag that we don't recognize: " + name);
            	XppUtils.skipSubTree(parser);
            }
        }
	}

	@Override
	public void toXml(XmlSerializer serializer) throws IOException {
		XmlSerializer element = serializer.startTag(null, "action");
		XppUtils.setElementValueToNode(element, "code", getCode());
		element.endTag(null, "action");;
	}
}
