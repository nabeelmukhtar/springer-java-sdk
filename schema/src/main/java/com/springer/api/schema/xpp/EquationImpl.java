
package com.springer.api.schema.xpp;

import java.io.IOException;
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
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

import com.springer.api.schema.Equation;
import com.springer.api.schema.EquationSource;
import com.springer.api.schema.MediaObject;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "equationNumber",
    "mediaObject",
    "equationSource"
})
@XmlRootElement(name = "Equation")
public class EquationImpl extends BaseSchemaEntity implements Equation
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "EquationNumber", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected Long equationNumber;
    @XmlElement(name = "MediaObject", required = true, type = MediaObjectImpl.class)
    protected MediaObjectImpl mediaObject;
    @XmlElement(name = "EquationSource", required = true, type = EquationSourceImpl.class)
    protected EquationSourceImpl equationSource;
    @XmlAttribute(name = "ID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String id;

    public Long getEquationNumber() {
        return equationNumber;
    }

    public void setEquationNumber(Long value) {
        this.equationNumber = value;
    }

    public MediaObject getMediaObject() {
        return mediaObject;
    }

    public void setMediaObject(MediaObject value) {
        this.mediaObject = ((MediaObjectImpl) value);
    }

    public EquationSource getEquationSource() {
        return equationSource;
    }

    public void setEquationSource(EquationSource value) {
        this.equationSource = ((EquationSourceImpl) value);
    }

    public String getID() {
        return id;
    }

    public void setID(String value) {
        this.id = value;
    }

	@Override
	public void init(XmlPullParser parser) throws IOException, XmlPullParserException {
        parser.require(XmlPullParser.START_TAG, null, null);

        while (parser.nextTag() == XmlPullParser.START_TAG) {
        	String name = parser.getName();
        	
        	if (name.equals("code")) {
        		setCode(XppUtils.getElementValueFromNode(parser));
            } else {
                // Consume something we don't understand.
            	LOG.warning("Found tag that we don't recognize: " + name);
            	XppUtils.skipSubTree(parser);
            }
        }
	}

	@Override
	public void toXml(XmlSerializer serializer) throws IOException {
		XmlSerializer element = serializer.startTag(null, "action");
		XppUtils.setElementValueToNode(element, "code", getCode());
		element.endTag(null, "action");;
	}
}
