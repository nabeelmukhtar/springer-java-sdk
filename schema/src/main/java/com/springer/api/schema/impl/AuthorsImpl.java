
package com.springer.api.schema.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.springer.api.schema.Authors;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "authors"
})
@XmlRootElement(name = "Authors")
public class AuthorsImpl
    implements Serializable, Authors
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "Author", required = true)
    protected List<String> authors;

    public List<String> getAuthors() {
        if (authors == null) {
            authors = new ArrayList<String>();
        }
        return this.authors;
    }

}
