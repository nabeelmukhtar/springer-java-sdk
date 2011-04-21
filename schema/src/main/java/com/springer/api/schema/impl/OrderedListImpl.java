
package com.springer.api.schema.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.springer.api.schema.ListItem;
import com.springer.api.schema.OrderedList;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "listItems"
})
@XmlRootElement(name = "OrderedList")
public class OrderedListImpl implements Serializable, OrderedList
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "ListItem", required = true, type = ListItemImpl.class)
    protected List<ListItem> listItems;

    public List<ListItem> getListItems() {
        if (listItems == null) {
            listItems = new ArrayList<ListItem>();
        }
        return this.listItems;
    }

}
