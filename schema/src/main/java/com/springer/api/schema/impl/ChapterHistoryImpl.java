
package com.springer.api.schema.impl;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.springer.api.schema.ChapterHistory;
import com.springer.api.schema.OnlineDate;
import com.springer.api.schema.RegistrationDate;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "registrationDate",
    "onlineDate"
})
@XmlRootElement(name = "ChapterHistory")
public class ChapterHistoryImpl
    implements Serializable, ChapterHistory
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "RegistrationDate", required = true, type = RegistrationDateImpl.class)
    protected RegistrationDateImpl registrationDate;
    @XmlElement(name = "OnlineDate", required = true, type = OnlineDateImpl.class)
    protected OnlineDateImpl onlineDate;

    public RegistrationDate getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(RegistrationDate value) {
        this.registrationDate = ((RegistrationDateImpl) value);
    }

    public OnlineDate getOnlineDate() {
        return onlineDate;
    }

    public void setOnlineDate(OnlineDate value) {
        this.onlineDate = ((OnlineDateImpl) value);
    }

}
