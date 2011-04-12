
package com.springer.api.xpp;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.w3._2001.xmlschema.Adapter1;

import com.springer.api.VolumeInfo;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "volumeIDStart",
    "volumeIDEnd",
    "volumeIssueCount"
})
@XmlRootElement(name = "VolumeInfo")
public class VolumeInfoImpl
    implements Serializable, VolumeInfo
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "VolumeIDStart", required = true)
    protected String volumeIDStart;
    @XmlElement(name = "VolumeIDEnd", required = true)
    protected String volumeIDEnd;
    @XmlElement(name = "VolumeIssueCount", required = true)
    protected String volumeIssueCount;
    @XmlAttribute(name = "TocLevels", required = true)
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected Long tocLevels;
    @XmlAttribute(name = "VolumeType", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String volumeType;

    public String getVolumeIDStart() {
        return volumeIDStart;
    }

    public void setVolumeIDStart(String value) {
        this.volumeIDStart = value;
    }

    public String getVolumeIDEnd() {
        return volumeIDEnd;
    }

    public void setVolumeIDEnd(String value) {
        this.volumeIDEnd = value;
    }

    public String getVolumeIssueCount() {
        return volumeIssueCount;
    }

    public void setVolumeIssueCount(String value) {
        this.volumeIssueCount = value;
    }

    public Long getTocLevels() {
        return tocLevels;
    }

    public void setTocLevels(Long value) {
        this.tocLevels = value;
    }

    public String getVolumeType() {
        return volumeType;
    }

    public void setVolumeType(String value) {
        this.volumeType = value;
    }

}
