
package com.springer.api.xpp;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.springer.api.Article;
import com.springer.api.JournalOnlineFirst;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "article"
})
@XmlRootElement(name = "JournalOnlineFirst")
public class JournalOnlineFirstImpl
    implements Serializable, JournalOnlineFirst
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "Article", required = true, type = ArticleImpl.class)
    protected ArticleImpl article;

    public Article getArticle() {
        return article;
    }

    public void setArticle(Article value) {
        this.article = ((ArticleImpl) value);
    }

}
