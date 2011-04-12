
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

import com.springer.api.Issue;
import com.springer.api.Volume;
import com.springer.api.VolumeInfo;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "volumeInfo",
    "issue"
})
@XmlRootElement(name = "Volume")
public class VolumeImpl
    implements Serializable, Volume
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "VolumeInfo", required = true, type = VolumeInfoImpl.class)
    protected VolumeInfoImpl volumeInfo;
    @XmlElement(name = "Issue", required = true, type = IssueImpl.class)
    protected IssueImpl issue;
    @XmlAttribute(name = "OutputMedium")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String outputMedium;

    public VolumeInfo getVolumeInfo() {
        return volumeInfo;
    }

    public void setVolumeInfo(VolumeInfo value) {
        this.volumeInfo = ((VolumeInfoImpl) value);
    }

    public Issue getIssue() {
        return issue;
    }

    public void setIssue(Issue value) {
        this.issue = ((IssueImpl) value);
    }

    public String getOutputMedium() {
        return outputMedium;
    }

    public void setOutputMedium(String value) {
        this.outputMedium = value;
    }

}
