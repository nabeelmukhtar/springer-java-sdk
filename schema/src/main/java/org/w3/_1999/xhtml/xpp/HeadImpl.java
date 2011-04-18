
package org.w3._1999.xhtml.xpp;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.prismstandard.namespaces.pam._2.Article;
import org.prismstandard.namespaces.pam._2.impl.ArticleImpl;
import org.w3._1999.xhtml.Head;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "article"
})
@XmlRootElement(name = "head")
public class HeadImpl
    implements Serializable, Head
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(namespace = "http://prismstandard.org/namespaces/pam/2.0/", required = true, type = ArticleImpl.class)
    protected ArticleImpl article;

    public Article getArticle() {
        return article;
    }

    public void setArticle(Article value) {
        this.article = ((ArticleImpl) value);
    }

}
