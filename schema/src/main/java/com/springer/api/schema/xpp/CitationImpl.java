
package com.springer.api.schema.xpp;

import java.io.IOException;
import java.io.Serializable;
import java.math.BigDecimal;

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

import com.springer.api.schema.BibArticle;
import com.springer.api.schema.BibBook;
import com.springer.api.schema.BibChapter;
import com.springer.api.schema.BibUnstructured;
import com.springer.api.schema.Citation;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "citationNumber",
    "bibArticle",
    "bibBook",
    "bibChapter",
    "bibUnstructured"
})
@XmlRootElement(name = "Citation")
public class CitationImpl
    extends BaseSchemaEntity implements Citation
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "CitationNumber", required = true)
    protected BigDecimal citationNumber;
    @XmlElement(name = "BibArticle", type = BibArticleImpl.class)
    protected BibArticleImpl bibArticle;
    @XmlElement(name = "BibBook", type = BibBookImpl.class)
    protected BibBookImpl bibBook;
    @XmlElement(name = "BibChapter", type = BibChapterImpl.class)
    protected BibChapterImpl bibChapter;
    @XmlElement(name = "BibUnstructured", type = BibUnstructuredImpl.class)
    protected BibUnstructuredImpl bibUnstructured;
    @XmlAttribute(name = "ID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String id;

    public BigDecimal getCitationNumber() {
        return citationNumber;
    }

    public void setCitationNumber(BigDecimal value) {
        this.citationNumber = value;
    }

    public BibArticle getBibArticle() {
        return bibArticle;
    }

    public void setBibArticle(BibArticle value) {
        this.bibArticle = ((BibArticleImpl) value);
    }

    public BibBook getBibBook() {
        return bibBook;
    }

    public void setBibBook(BibBook value) {
        this.bibBook = ((BibBookImpl) value);
    }

    public BibChapter getBibChapter() {
        return bibChapter;
    }

    public void setBibChapter(BibChapter value) {
        this.bibChapter = ((BibChapterImpl) value);
    }

    public BibUnstructured getBibUnstructured() {
        return bibUnstructured;
    }

    public void setBibUnstructured(BibUnstructured value) {
        this.bibUnstructured = ((BibUnstructuredImpl) value);
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
