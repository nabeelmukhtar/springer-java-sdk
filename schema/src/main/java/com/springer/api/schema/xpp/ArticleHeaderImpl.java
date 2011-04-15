
package com.springer.api.schema.xpp;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.springer.api.schema.Abstract;
import com.springer.api.schema.ArticleHeader;
import com.springer.api.schema.AuthorGroup;
import com.springer.api.schema.KeywordGroup;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "authorGroup",
    "_abstract",
    "keywordGroup"
})
@XmlRootElement(name = "ArticleHeader")
public class ArticleHeaderImpl
    implements Serializable, ArticleHeader
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "AuthorGroup", required = true, type = AuthorGroupImpl.class)
    protected AuthorGroupImpl authorGroup;
    @XmlElement(name = "Abstract", required = true, type = AbstractImpl.class)
    protected AbstractImpl _abstract;
    @XmlElement(name = "KeywordGroup", required = true, type = KeywordGroupImpl.class)
    protected KeywordGroupImpl keywordGroup;

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

}
