
package com.springer.api.xpp;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.springer.api.Keywords;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "keyword"
})
@XmlRootElement(name = "Keywords")
public class KeywordsImpl implements Serializable, Keywords
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "Keyword")
    protected List<String> keyword;

    public List<String> getKeyword() {
        if (keyword == null) {
            keyword = new ArrayList<String>();
        }
        return this.keyword;
    }

}
