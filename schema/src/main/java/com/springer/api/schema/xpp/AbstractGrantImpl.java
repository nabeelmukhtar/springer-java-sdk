
package com.springer.api.schema.xpp;

import java.io.IOException;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

import com.springer.api.schema.AbstractGrant;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "AbstractGrant")
public class AbstractGrantImpl
    extends BaseSchemaEntity implements AbstractGrant
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlAttribute(name = "Grant", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String grant;

    public String getGrant() {
        return grant;
    }

    public void setGrant(String value) {
        this.grant = value;
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
