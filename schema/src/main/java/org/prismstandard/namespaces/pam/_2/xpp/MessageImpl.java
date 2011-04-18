
package org.prismstandard.namespaces.pam._2.xpp;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.prismstandard.namespaces.pam._2.Message;
import org.w3._1999.xhtml.Body;
import org.w3._1999.xhtml.Head;
import org.w3._1999.xhtml.impl.BodyImpl;
import org.w3._1999.xhtml.impl.HeadImpl;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "head",
    "body"
})
@XmlRootElement(name = "message")
public class MessageImpl
    implements Serializable, Message
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(namespace = "http://www.w3.org/1999/xhtml", required = true, type = HeadImpl.class)
    protected HeadImpl head;
    @XmlElement(namespace = "http://www.w3.org/1999/xhtml", required = true, type = BodyImpl.class)
    protected BodyImpl body;

    public Head getHead() {
        return head;
    }

    public void setHead(Head value) {
        this.head = ((HeadImpl) value);
    }

    public Body getBody() {
        return body;
    }

    public void setBody(Body value) {
        this.body = ((BodyImpl) value);
    }

}
