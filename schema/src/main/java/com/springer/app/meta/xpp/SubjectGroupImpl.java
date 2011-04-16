
package com.springer.app.meta.xpp;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

import com.springer.api.schema.xpp.BaseSchemaEntity;
import com.springer.api.schema.xpp.XppUtils;
import com.springer.app.meta.Subject;
import com.springer.app.meta.SubjectGroup;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "subject"
})
@XmlRootElement(name = "SubjectGroup")
public class SubjectGroupImpl
    extends BaseSchemaEntity implements SubjectGroup
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "Subject", required = true, type = SubjectImpl.class)
    protected List<Subject> subject;

    public List<Subject> getSubject() {
        if (subject == null) {
            subject = new ArrayList<Subject>();
        }
        return this.subject;
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
