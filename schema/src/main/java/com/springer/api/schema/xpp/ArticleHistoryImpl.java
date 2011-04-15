
package com.springer.api.schema.xpp;

import java.io.IOException;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

import com.springer.api.schema.Accepted;
import com.springer.api.schema.ArticleHistory;
import com.springer.api.schema.OnlineDate;
import com.springer.api.schema.Received;
import com.springer.api.schema.RegistrationDate;
import com.springer.api.schema.Revised;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "registrationDate",
    "received",
    "revised",
    "accepted",
    "onlineDate"
})
@XmlRootElement(name = "ArticleHistory")
public class ArticleHistoryImpl
    extends BaseSchemaEntity implements ArticleHistory
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "RegistrationDate", type = RegistrationDateImpl.class)
    protected RegistrationDateImpl registrationDate;
    @XmlElement(name = "Received", type = ReceivedImpl.class)
    protected ReceivedImpl received;
    @XmlElement(name = "Revised", type = RevisedImpl.class)
    protected RevisedImpl revised;
    @XmlElement(name = "Accepted", type = AcceptedImpl.class)
    protected AcceptedImpl accepted;
    @XmlElement(name = "OnlineDate", type = OnlineDateImpl.class)
    protected OnlineDateImpl onlineDate;

    public RegistrationDate getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(RegistrationDate value) {
        this.registrationDate = ((RegistrationDateImpl) value);
    }

    public Received getReceived() {
        return received;
    }

    public void setReceived(Received value) {
        this.received = ((ReceivedImpl) value);
    }

    public Revised getRevised() {
        return revised;
    }

    public void setRevised(Revised value) {
        this.revised = ((RevisedImpl) value);
    }

    public Accepted getAccepted() {
        return accepted;
    }

    public void setAccepted(Accepted value) {
        this.accepted = ((AcceptedImpl) value);
    }

    public OnlineDate getOnlineDate() {
        return onlineDate;
    }

    public void setOnlineDate(OnlineDate value) {
        this.onlineDate = ((OnlineDateImpl) value);
    }

	@Override
	public void init(XmlPullParser parser) throws IOException,
			XmlPullParserException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void toXml(XmlSerializer serializer) throws IOException {
		// TODO Auto-generated method stub
		
	}

}
