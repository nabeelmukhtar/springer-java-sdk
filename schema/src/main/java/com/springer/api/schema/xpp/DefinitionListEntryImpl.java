
package com.springer.api.schema.xpp;

import java.io.IOException;
import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

import com.springer.api.schema.DefinitionListEntry;
import com.springer.api.schema.Description;
import com.springer.api.schema.Term;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "term",
    "description"
})
@XmlRootElement(name = "DefinitionListEntry")
public class DefinitionListEntryImpl
    extends BaseSchemaEntity implements DefinitionListEntry
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "Term", required = true, type = TermImpl.class)
    protected TermImpl term;
    @XmlElement(name = "Description", required = true, type = DescriptionImpl.class)
    protected DescriptionImpl description;

    public Term getTerm() {
        return term;
    }

    public void setTerm(Term value) {
        this.term = ((TermImpl) value);
    }

    public Description getDescription() {
        return description;
    }

    public void setDescription(Description value) {
        this.description = ((DescriptionImpl) value);
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
