
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

import com.springer.api.schema.Journal;
import com.springer.api.schema.Publisher;
import com.springer.api.schema.PublisherInfo;
import com.springer.app.meta.Info;
import com.springer.app.meta.impl.InfoImpl;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "publisherInfo",
    "journal",
    "info"
})
@XmlRootElement(name = "Publisher")
public class PublisherImpl
    extends BaseSchemaEntity implements Publisher
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "PublisherInfo", required = true, type = PublisherInfoImpl.class)
    protected PublisherInfoImpl publisherInfo;
    @XmlElement(name = "Journal", required = true, type = JournalImpl.class)
    protected JournalImpl journal;
    @XmlElement(name = "Info", namespace = "http://www.springer.com/app/meta", required = true, type = InfoImpl.class)
    protected InfoImpl info;
    @XmlAttribute(namespace = "http://www.w3.org/XML/1998/namespace", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String lang;

    public PublisherInfo getPublisherInfo() {
        return publisherInfo;
    }

    public void setPublisherInfo(PublisherInfo value) {
        this.publisherInfo = ((PublisherInfoImpl) value);
    }

    public Journal getJournal() {
        return journal;
    }

    public void setJournal(Journal value) {
        this.journal = ((JournalImpl) value);
    }

    public Info getInfo() {
        return info;
    }

    public void setInfo(Info value) {
        this.info = ((InfoImpl) value);
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String value) {
        this.lang = value;
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
