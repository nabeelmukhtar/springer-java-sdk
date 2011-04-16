
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
import com.springer.api.schema.JournalInfo;
import com.springer.api.schema.JournalOnlineFirst;
import com.springer.api.schema.Volume;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "journalInfo",
    "journalOnlineFirst",
    "volume"
})
@XmlRootElement(name = "Journal")
public class JournalImpl
    extends BaseSchemaEntity implements Journal
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "JournalInfo", required = true, type = JournalInfoImpl.class)
    protected JournalInfoImpl journalInfo;
    @XmlElement(name = "JournalOnlineFirst", type = JournalOnlineFirstImpl.class)
    protected JournalOnlineFirstImpl journalOnlineFirst;
    @XmlElement(name = "Volume", type = VolumeImpl.class)
    protected VolumeImpl volume;
    @XmlAttribute(name = "OutputMedium")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String outputMedium;

    public JournalInfo getJournalInfo() {
        return journalInfo;
    }

    public void setJournalInfo(JournalInfo value) {
        this.journalInfo = ((JournalInfoImpl) value);
    }

    public JournalOnlineFirst getJournalOnlineFirst() {
        return journalOnlineFirst;
    }

    public void setJournalOnlineFirst(JournalOnlineFirst value) {
        this.journalOnlineFirst = ((JournalOnlineFirstImpl) value);
    }

    public Volume getVolume() {
        return volume;
    }

    public void setVolume(Volume value) {
        this.volume = ((VolumeImpl) value);
    }

    public String getOutputMedium() {
        return outputMedium;
    }

    public void setOutputMedium(String value) {
        this.outputMedium = value;
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
