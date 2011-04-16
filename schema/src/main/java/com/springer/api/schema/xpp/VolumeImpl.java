
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

import com.springer.api.schema.Issue;
import com.springer.api.schema.Volume;
import com.springer.api.schema.VolumeInfo;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "volumeInfo",
    "issue"
})
@XmlRootElement(name = "Volume")
public class VolumeImpl
    extends BaseSchemaEntity implements Volume
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "VolumeInfo", required = true, type = VolumeInfoImpl.class)
    protected VolumeInfoImpl volumeInfo;
    @XmlElement(name = "Issue", required = true, type = IssueImpl.class)
    protected IssueImpl issue;
    @XmlAttribute(name = "OutputMedium")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String outputMedium;

    public VolumeInfo getVolumeInfo() {
        return volumeInfo;
    }

    public void setVolumeInfo(VolumeInfo value) {
        this.volumeInfo = ((VolumeInfoImpl) value);
    }

    public Issue getIssue() {
        return issue;
    }

    public void setIssue(Issue value) {
        this.issue = ((IssueImpl) value);
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
