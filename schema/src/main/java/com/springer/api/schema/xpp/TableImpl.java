
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

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

import com.springer.api.schema.Caption;
import com.springer.api.schema.Table;
import com.springer.api.schema.Tfooter;
import com.springer.api.schema.Tgroup;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "table",
    "caption",
    "tgroup",
    "tfooter"
})
@XmlRootElement(name = "Table")
public class TableImpl extends BaseSchemaEntity implements Table
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "Table", type = TableImpl.class)
    protected TableImpl table;
    @XmlElement(name = "Caption", type = CaptionImpl.class)
    protected CaptionImpl caption;
    @XmlElement(type = TgroupImpl.class)
    protected TgroupImpl tgroup;
    @XmlElement(type = TfooterImpl.class)
    protected TfooterImpl tfooter;
    @XmlAttribute(name = "Float")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String _float;
    @XmlAttribute(name = "ID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String id;

    public Table getTable() {
        return table;
    }

    public void setTable(Table value) {
        this.table = ((TableImpl) value);
    }

    public Caption getCaption() {
        return caption;
    }

    public void setCaption(Caption value) {
        this.caption = ((CaptionImpl) value);
    }

    public Tgroup getTgroup() {
        return tgroup;
    }

    public void setTgroup(Tgroup value) {
        this.tgroup = ((TgroupImpl) value);
    }

    public Tfooter getTfooter() {
        return tfooter;
    }

    public void setTfooter(Tfooter value) {
        this.tfooter = ((TfooterImpl) value);
    }

    public String getFloat() {
        return _float;
    }

    public void setFloat(String value) {
        this._float = value;
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
