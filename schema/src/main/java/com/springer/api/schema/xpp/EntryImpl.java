
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

import com.springer.api.schema.Entry;
import com.springer.api.schema.SimplePara;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "simplePara"
})
@XmlRootElement(name = "entry")
public class EntryImpl
    extends BaseSchemaEntity implements Entry
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "SimplePara", type = SimpleParaImpl.class)
    protected SimpleParaImpl simplePara;
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String align;
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String colname;
    @XmlAttribute
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected Long morerows;
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String nameend;
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String namest;

    public SimplePara getSimplePara() {
        return simplePara;
    }

    public void setSimplePara(SimplePara value) {
        this.simplePara = ((SimpleParaImpl) value);
    }

    public String getAlign() {
        return align;
    }

    public void setAlign(String value) {
        this.align = value;
    }

    public String getColname() {
        return colname;
    }

    public void setColname(String value) {
        this.colname = value;
    }

    public Long getMorerows() {
        return morerows;
    }

    public void setMorerows(Long value) {
        this.morerows = value;
    }

    public String getNameend() {
        return nameend;
    }

    public void setNameend(String value) {
        this.nameend = value;
    }

    public String getNamest() {
        return namest;
    }

    public void setNamest(String value) {
        this.namest = value;
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
