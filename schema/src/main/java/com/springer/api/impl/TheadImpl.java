
package com.springer.api.impl;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.springer.api.Row;
import com.springer.api.Thead;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "row"
})
@XmlRootElement(name = "thead")
public class TheadImpl
    implements Serializable, Thead
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(required = true, type = RowImpl.class)
    protected RowImpl row;

    public Row getRow() {
        return row;
    }

    public void setRow(Row value) {
        this.row = ((RowImpl) value);
    }

}
