
package com.springer.api.schema.impl;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.springer.api.schema.Book;
import com.springer.api.schema.BookInfo;
import com.springer.api.schema.Chapter;
import com.springer.api.schema.EditorGroup;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "bookInfo",
    "bookHeader",
    "chapter"
})
@XmlRootElement(name = "Book")
public class BookImpl
    implements Serializable, Book
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "BookInfo", required = true, type = BookInfoImpl.class)
    protected BookInfoImpl bookInfo;
    @XmlElement(name = "BookHeader", required = true, type = EditorGroupImpl.class)
    protected EditorGroupImpl bookHeader;
    @XmlElement(name = "Chapter", required = true, type = ChapterImpl.class)
    protected ChapterImpl chapter;
    @XmlAttribute(name = "Language", required = true)
    protected String language;
    @XmlAttribute(name = "OutputMedium", required = true)
    protected String outputMedium;

    public BookInfo getBookInfo() {
        return bookInfo;
    }

    public void setBookInfo(BookInfo value) {
        this.bookInfo = ((BookInfoImpl) value);
    }

    public EditorGroup getBookHeader() {
        return bookHeader;
    }

    public void setBookHeader(EditorGroup value) {
        this.bookHeader = ((EditorGroupImpl) value);
    }

    public Chapter getChapter() {
        return chapter;
    }

    public void setChapter(Chapter value) {
        this.chapter = ((ChapterImpl) value);
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String value) {
        this.language = value;
    }

    public String getOutputMedium() {
        return outputMedium;
    }

    public void setOutputMedium(String value) {
        this.outputMedium = value;
    }

}
