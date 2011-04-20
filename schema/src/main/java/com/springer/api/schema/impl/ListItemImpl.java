
package com.springer.api.schema.impl;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.springer.api.schema.ItemContent;
import com.springer.api.schema.ListItem;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "itemNumber",
    "itemContent"
})
@XmlRootElement(name = "ListItem")
public class ListItemImpl
    implements Serializable, ListItem
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "ItemNumber", required = true)
    protected String itemNumber;
    @XmlElement(name = "ItemContent", required = true, type = ItemContentImpl.class)
    protected ItemContentImpl itemContent;

    public String getItemNumber() {
        return itemNumber;
    }

    public void setItemNumber(String value) {
        this.itemNumber = value;
    }

    public ItemContent getItemContent() {
        return itemContent;
    }

    public void setItemContent(ItemContent value) {
        this.itemContent = ((ItemContentImpl) value);
    }

}
