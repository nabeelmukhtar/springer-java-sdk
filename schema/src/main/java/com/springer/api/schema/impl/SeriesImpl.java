
package com.springer.api.schema.impl;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.springer.api.schema.Book;
import com.springer.api.schema.EditorGroup;
import com.springer.api.schema.Series;
import com.springer.api.schema.SeriesInfo;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "seriesInfo",
    "seriesHeader",
    "book"
})
@XmlRootElement(name = "Series")
public class SeriesImpl
    implements Serializable, Series
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "SeriesInfo", required = true, type = SeriesInfoImpl.class)
    protected SeriesInfoImpl seriesInfo;
    @XmlElement(name = "SeriesHeader", type = EditorGroupImpl.class)
    protected EditorGroupImpl seriesHeader;
    @XmlElement(name = "Book", required = true, type = BookImpl.class)
    protected BookImpl book;

    public SeriesInfo getSeriesInfo() {
        return seriesInfo;
    }

    public void setSeriesInfo(SeriesInfo value) {
        this.seriesInfo = ((SeriesInfoImpl) value);
    }

    public EditorGroup getSeriesHeader() {
        return seriesHeader;
    }

    public void setSeriesHeader(EditorGroup value) {
        this.seriesHeader = ((EditorGroupImpl) value);
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book value) {
        this.book = ((BookImpl) value);
    }

}
