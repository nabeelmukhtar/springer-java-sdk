
package com.springer.api.schema.impl;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.springer.api.schema.BodyRef;
import com.springer.api.schema.Chapter;
import com.springer.api.schema.ChapterBackmatter;
import com.springer.api.schema.ChapterHeader;
import com.springer.api.schema.ChapterInfo;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "chapterInfo",
    "chapterHeader",
    "bodyRef",
    "chapterBackmatter"
})
@XmlRootElement(name = "Chapter")
public class ChapterImpl
    implements Serializable, Chapter
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "ChapterInfo", required = true, type = ChapterInfoImpl.class)
    protected ChapterInfoImpl chapterInfo;
    @XmlElement(name = "ChapterHeader", required = true, type = ChapterHeaderImpl.class)
    protected ChapterHeaderImpl chapterHeader;
    @XmlElement(name = "BodyRef", required = true, type = BodyRefImpl.class)
    protected BodyRefImpl bodyRef;
    @XmlElement(name = "ChapterBackmatter", type = ChapterBackmatterImpl.class)
    protected ChapterBackmatterImpl chapterBackmatter;
    @XmlAttribute(name = "ID", required = true)
    protected String id;
    @XmlAttribute(name = "Language", required = true)
    protected String language;

    public ChapterInfo getChapterInfo() {
        return chapterInfo;
    }

    public void setChapterInfo(ChapterInfo value) {
        this.chapterInfo = ((ChapterInfoImpl) value);
    }

    public ChapterHeader getChapterHeader() {
        return chapterHeader;
    }

    public void setChapterHeader(ChapterHeader value) {
        this.chapterHeader = ((ChapterHeaderImpl) value);
    }

    public BodyRef getBodyRef() {
        return bodyRef;
    }

    public void setBodyRef(BodyRef value) {
        this.bodyRef = ((BodyRefImpl) value);
    }

    public ChapterBackmatter getChapterBackmatter() {
        return chapterBackmatter;
    }

    public void setChapterBackmatter(ChapterBackmatter value) {
        this.chapterBackmatter = ((ChapterBackmatterImpl) value);
    }

    public String getID() {
        return id;
    }

    public void setID(String value) {
        this.id = value;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String value) {
        this.language = value;
    }

}
