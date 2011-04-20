
package com.springer.api.schema.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.springer.api.schema.ItemContent;
import com.springer.api.schema.UnorderedList;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "itemContents"
})
@XmlRootElement(name = "UnorderedList")
public class UnorderedListImpl implements Serializable, UnorderedList
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "ItemContent", required = true, type = ItemContentImpl.class)
    protected List<ItemContent> itemContents;
    @XmlAttribute(name = "Mark", required = true)
    protected String mark;

    public List<ItemContent> getItemContents() {
        if (itemContents == null) {
            itemContents = new ArrayList<ItemContent>();
        }
        return this.itemContents;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String value) {
        this.mark = value;
    }

}
