
package com.springer.api.schema.xpp;

import java.io.IOException;
import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.w3._2001.xmlschema.Adapter1;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

import com.springer.api.schema.IssueCopyright;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "copyrightHolderName",
    "copyrightYear"
})
@XmlRootElement(name = "IssueCopyright")
public class IssueCopyrightImpl
    extends BaseSchemaEntity implements IssueCopyright
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "CopyrightHolderName", required = true)
    protected String copyrightHolderName;
    @XmlElement(name = "CopyrightYear", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected Long copyrightYear;

    public String getCopyrightHolderName() {
        return copyrightHolderName;
    }

    public void setCopyrightHolderName(String value) {
        this.copyrightHolderName = value;
    }

    public Long getCopyrightYear() {
        return copyrightYear;
    }

    public void setCopyrightYear(Long value) {
        this.copyrightYear = value;
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
