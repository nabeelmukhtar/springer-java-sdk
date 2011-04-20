
package com.springer.api.schema.impl;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.springer.api.schema.Journal;
import com.springer.api.schema.JournalInfo;
import com.springer.api.schema.JournalOnlineFirst;
import com.springer.api.schema.Volume;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "journalInfo",
    "journalOnlineFirst",
    "volume"
})
@XmlRootElement(name = "Journal")
public class JournalImpl
    implements Serializable, Journal
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "JournalInfo", required = true, type = JournalInfoImpl.class)
    protected JournalInfoImpl journalInfo;
    @XmlElement(name = "JournalOnlineFirst", required = true, type = JournalOnlineFirstImpl.class)
    protected JournalOnlineFirstImpl journalOnlineFirst;
    @XmlElement(name = "Volume", required = true, type = VolumeImpl.class)
    protected VolumeImpl volume;
    @XmlAttribute(name = "OutputMedium")
    protected String outputMedium;

    public JournalInfo getJournalInfo() {
        return journalInfo;
    }

    public void setJournalInfo(JournalInfo value) {
        this.journalInfo = ((JournalInfoImpl) value);
    }

    public JournalOnlineFirst getJournalOnlineFirst() {
        return journalOnlineFirst;
    }

    public void setJournalOnlineFirst(JournalOnlineFirst value) {
        this.journalOnlineFirst = ((JournalOnlineFirstImpl) value);
    }

    public Volume getVolume() {
        return volume;
    }

    public void setVolume(Volume value) {
        this.volume = ((VolumeImpl) value);
    }

    public String getOutputMedium() {
        return outputMedium;
    }

    public void setOutputMedium(String value) {
        this.outputMedium = value;
    }

}
