
package com.springer.api.schema.impl;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.springer.api.schema.Caption;
import com.springer.api.schema.Table;
import com.springer.api.schema.Tfooter;
import com.springer.api.schema.Tgroup;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "table",
    "caption",
    "tgroup",
    "tfooter"
})
@XmlRootElement(name = "Table")
public class TableImpl implements Serializable, Table
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "Table", type = TableImpl.class)
    protected TableImpl table;
    @XmlElement(name = "Caption", type = CaptionImpl.class)
    protected CaptionImpl caption;
    @XmlElement(type = TgroupImpl.class)
    protected TgroupImpl tgroup;
    @XmlElement(type = TfooterImpl.class)
    protected TfooterImpl tfooter;
    @XmlAttribute(name = "Float")
    protected String _float;
    @XmlAttribute(name = "ID")
    protected String id;

    public Table getTable() {
        return table;
    }

    public void setTable(Table value) {
        this.table = ((TableImpl) value);
    }

    public Caption getCaption() {
        return caption;
    }

    public void setCaption(Caption value) {
        this.caption = ((CaptionImpl) value);
    }

    public Tgroup getTgroup() {
        return tgroup;
    }

    public void setTgroup(Tgroup value) {
        this.tgroup = ((TgroupImpl) value);
    }

    public Tfooter getTfooter() {
        return tfooter;
    }

    public void setTfooter(Tfooter value) {
        this.tfooter = ((TfooterImpl) value);
    }

    public String getFloat() {
        return _float;
    }

    public void setFloat(String value) {
        this._float = value;
    }

    public String getID() {
        return id;
    }

    public void setID(String value) {
        this.id = value;
    }

}
