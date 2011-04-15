
package com.springer.api.schema.xpp;

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
    "entry"
})
@XmlRootElement(name = "row")
public class RowImpl
    extends BaseSchemaEntity implements Row
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(required = true, type = EntryImpl.class)
    protected List<Entry> entry;

    public List<Entry> getEntry() {
        if (entry == null) {
            entry = new ArrayList<Entry>();
        }
        return this.entry;
    }

}
