
package com.springer.api.schema.impl;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.springer.api.schema.Chapter;
import com.springer.api.schema.Part;
import com.springer.api.schema.PartInfo;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "partInfo",
    "chapter"
})
@XmlRootElement(name = "Part")
public class PartImpl
    implements Serializable, Part
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "PartInfo", required = true, type = PartInfoImpl.class)
    protected PartInfoImpl partInfo;
    @XmlElement(name = "Chapter", required = true, type = ChapterImpl.class)
    protected ChapterImpl chapter;
    @XmlAttribute(name = "ID", required = true)
    protected String id;

    public PartInfo getPartInfo() {
        return partInfo;
    }

    public void setPartInfo(PartInfo value) {
        this.partInfo = ((PartInfoImpl) value);
    }

    public Chapter getChapter() {
        return chapter;
    }

    public void setChapter(Chapter value) {
        this.chapter = ((ChapterImpl) value);
    }

    public String getID() {
        return id;
    }

    public void setID(String value) {
        this.id = value;
    }

}
