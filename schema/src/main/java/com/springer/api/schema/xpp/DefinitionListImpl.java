
package com.springer.api.schema.xpp;

import java.io.IOException;
import java.io.Serializable;
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

import com.springer.api.schema.DefinitionList;
import com.springer.api.schema.DefinitionListEntry;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "definitionListEntry"
})
@XmlRootElement(name = "DefinitionList")
public class DefinitionListImpl extends BaseSchemaEntity implements DefinitionList
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "DefinitionListEntry", required = true, type = DefinitionListEntryImpl.class)
    protected List<DefinitionListEntry> definitionListEntry;

    public List<DefinitionListEntry> getDefinitionListEntry() {
        if (definitionListEntry == null) {
            definitionListEntry = new ArrayList<DefinitionListEntry>();
        }
        return this.definitionListEntry;
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
