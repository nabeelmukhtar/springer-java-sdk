
package com.springer.api.schema.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlMixed;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.springer.api.schema.RefSource;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "content"
})
@XmlRootElement(name = "RefSource")
public class RefSourceImpl
    implements Serializable, RefSource
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElementRefs({
        @XmlElementRef(name = "Literal", type = JAXBElement.class),
        @XmlElementRef(name = "Emphasis", type = EmphasisImpl.class)
    })
    @XmlMixed
    protected List<Object> content;

    public List<Object> getContent() {
        if (content == null) {
            content = new ArrayList<Object>();
        }
        return this.content;
    }

}
