
package com.springer.api.schema.impl;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.springer.api.schema.ArticleNote;
import com.springer.api.schema.Bibliography;
import com.springer.api.schema.ChapterBackmatter;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "articleNote",
    "bibliography"
})
@XmlRootElement(name = "ChapterBackmatter")
public class ChapterBackmatterImpl
    implements Serializable, ChapterBackmatter
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "ArticleNote", type = ArticleNoteImpl.class)
    protected ArticleNoteImpl articleNote;
    @XmlElement(name = "Bibliography", required = true, type = BibliographyImpl.class)
    protected BibliographyImpl bibliography;

    public ArticleNote getArticleNote() {
        return articleNote;
    }

    public void setArticleNote(ArticleNote value) {
        this.articleNote = ((ArticleNoteImpl) value);
    }

    public Bibliography getBibliography() {
        return bibliography;
    }

    public void setBibliography(Bibliography value) {
        this.bibliography = ((BibliographyImpl) value);
    }

}
