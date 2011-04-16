
package com.springer.api.schema.xpp;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

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

import com.springer.api.schema.Heading;
import com.springer.api.schema.KeywordGroup;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "heading",
    "keyword"
})
@XmlRootElement(name = "KeywordGroup")
public class KeywordGroupImpl
    extends BaseSchemaEntity implements KeywordGroup
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "Heading", type = HeadingImpl.class)
    protected HeadingImpl heading;
    @XmlElement(name = "Keyword", required = true)
    protected List<String> keyword;
    @XmlAttribute(name = "Language", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String language;

    public Heading getHeading() {
        return heading;
    }

    public void setHeading(Heading value) {
        this.heading = ((HeadingImpl) value);
    }

    public List<String> getKeyword() {
        if (keyword == null) {
            keyword = new ArrayList<String>();
        }
        return this.keyword;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String value) {
        this.language = value;
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
