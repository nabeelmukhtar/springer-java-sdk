
package com.springer.api.schema.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.springer.api.schema.Abstract;
import com.springer.api.schema.ArticleNote;
import com.springer.api.schema.AuthorGroup;
import com.springer.api.schema.ChapterHeader;
import com.springer.api.schema.KeywordGroup;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "authorGroup",
    "_abstract",
    "keywordGroup",
    "articleNotes"
})
@XmlRootElement(name = "ChapterHeader")
public class ChapterHeaderImpl
    implements Serializable, ChapterHeader
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "AuthorGroup", required = true, type = AuthorGroupImpl.class)
    protected AuthorGroupImpl authorGroup;
    @XmlElement(name = "Abstract", type = AbstractImpl.class)
    protected AbstractImpl _abstract;
    @XmlElement(name = "KeywordGroup", type = KeywordGroupImpl.class)
    protected KeywordGroupImpl keywordGroup;
    @XmlElement(name = "ArticleNote", type = ArticleNoteImpl.class)
    protected List<ArticleNote> articleNotes;

    public AuthorGroup getAuthorGroup() {
        return authorGroup;
    }

    public void setAuthorGroup(AuthorGroup value) {
        this.authorGroup = ((AuthorGroupImpl) value);
    }

    public Abstract getAbstract() {
        return _abstract;
    }

    public void setAbstract(Abstract value) {
        this._abstract = ((AbstractImpl) value);
    }

    public KeywordGroup getKeywordGroup() {
        return keywordGroup;
    }

    public void setKeywordGroup(KeywordGroup value) {
        this.keywordGroup = ((KeywordGroupImpl) value);
    }

    public List<ArticleNote> getArticleNotes() {
        if (articleNotes == null) {
            articleNotes = new ArrayList<ArticleNote>();
        }
        return this.articleNotes;
    }

}
