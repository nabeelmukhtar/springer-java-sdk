
package com.springer.api.schema.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.springer.api.schema.Entry;
import com.springer.api.schema.Row;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "entries"
})
@XmlRootElement(name = "row")
public class RowImpl
    implements Serializable, Row
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "entry", required = true, type = EntryImpl.class)
    protected List<Entry> entries;

    public List<Entry> getEntries() {
        if (entries == null) {
            entries = new ArrayList<Entry>();
        }
        return this.entries;
    }

}
