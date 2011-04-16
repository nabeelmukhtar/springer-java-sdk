
package com.springer.api.schema.xpp;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlMixed;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

import com.springer.api.schema.Para;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "content"
})
@XmlRootElement(name = "Para")
public class ParaImpl extends BaseSchemaEntity implements Para
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElementRefs({
        @XmlElementRef(name = "InternalRef", type = InternalRefImpl.class),
        @XmlElementRef(name = "Superscript", type = SuperscriptImpl.class),
        @XmlElementRef(name = "MediaObject", type = MediaObjectImpl.class),
        @XmlElementRef(name = "Table", type = TableImpl.class),
        @XmlElementRef(name = "Equation", type = EquationImpl.class),
        @XmlElementRef(name = "ExternalRef", type = ExternalRefImpl.class),
        @XmlElementRef(name = "Emphasis", type = EmphasisImpl.class),
        @XmlElementRef(name = "InlineEquation", type = InlineEquationImpl.class),
        @XmlElementRef(name = "DefinitionList", type = DefinitionListImpl.class),
        @XmlElementRef(name = "Footnote", type = FootnoteImpl.class),
        @XmlElementRef(name = "CitationRef", type = CitationRefImpl.class),
        @XmlElementRef(name = "Figure", type = FigureImpl.class),
        @XmlElementRef(name = "Subscript", type = SubscriptImpl.class)
    })
    @XmlMixed
    protected List<Object> content;

    public List<Object> getContent() {
        if (content == null) {
            content = new ArrayList<Object>();
        }
        return this.content;
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
