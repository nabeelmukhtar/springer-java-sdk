
package com.springer.api.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.springer.api.Author;
import com.springer.api.Authors;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "author"
})
@XmlRootElement(name = "Authors")
public class AuthorsImpl implements Serializable, Authors
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "Author", required = true, type = AuthorImpl.class)
    protected List<Author> author;

    public List<Author> getAuthor() {
        if (author == null) {
            author = new ArrayList<Author>();
        }
        return this.author;
    }

}
