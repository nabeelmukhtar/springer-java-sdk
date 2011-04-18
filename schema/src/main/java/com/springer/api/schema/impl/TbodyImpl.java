
package com.springer.api.schema.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.springer.api.schema.Row;
import com.springer.api.schema.Tbody;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "rows"
})
@XmlRootElement(name = "tbody")
public class TbodyImpl
    implements Serializable, Tbody
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "row", required = true, type = RowImpl.class)
    protected List<Row> rows;

    public List<Row> getRows() {
        if (rows == null) {
            rows = new ArrayList<Row>();
        }
        return this.rows;
    }

}
