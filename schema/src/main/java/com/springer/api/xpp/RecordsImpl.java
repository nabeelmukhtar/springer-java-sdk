
package com.springer.api.xpp;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.prismstandard.namespaces.pam._2.Message;
import org.prismstandard.namespaces.pam._2.impl.MessageImpl;

import com.springer.api.Record;
import com.springer.api.Records;
import com.springer.api.Result;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "result",
    "message",
    "record"
})
@XmlRootElement(name = "records")
public class RecordsImpl
    implements Serializable, Records
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(type = ResultImpl.class)
    protected List<Result> result;
    @XmlElement(namespace = "http://prismstandard.org/namespaces/pam/2.0/", type = MessageImpl.class)
    protected List<Message> message;
    @XmlElement(type = RecordImpl.class)
    protected List<Record> record;

    public List<Result> getResult() {
        if (result == null) {
            result = new ArrayList<Result>();
        }
        return this.result;
    }

    public List<Message> getMessage() {
        if (message == null) {
            message = new ArrayList<Message>();
        }
        return this.message;
    }

    public List<Record> getRecord() {
        if (record == null) {
            record = new ArrayList<Record>();
        }
        return this.record;
    }

}
