
package com.springer.api.schema.impl;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.w3._2001.xmlschema.Adapter2;

import com.springer.api.schema.BookTitle;
import com.springer.api.schema.ChapterContext;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "partID",
    "bookID",
    "bookTitle"
})
@XmlRootElement(name = "ChapterContext")
public class ChapterContextImpl
    extends SeriesIDImpl
    implements Serializable, ChapterContext
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "PartID", type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "integer")
    protected Long partID;
    @XmlElement(name = "BookID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String bookID;
    @XmlElement(name = "BookTitle", required = true, type = BookTitleImpl.class)
    protected BookTitleImpl bookTitle;

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
        this.bookID = value;
    }

    public BookTitle getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(BookTitle value) {
        this.bookTitle = ((BookTitleImpl) value);
    }

}
