
package com.springer.api.schema.xpp;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.w3._2001.xmlschema.Adapter1;

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
    implements Serializable, IssueHistory
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

}
