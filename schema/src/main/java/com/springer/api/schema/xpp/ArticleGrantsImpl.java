
package com.springer.api.schema.xpp;

import java.io.IOException;

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

import com.springer.api.schema.AbstractGrant;
import com.springer.api.schema.ArticleGrants;
import com.springer.api.schema.BibliographyGrant;
import com.springer.api.schema.BodyHTMLGrant;
import com.springer.api.schema.BodyPDFGrant;
import com.springer.api.schema.ESMGrant;
import com.springer.api.schema.MetadataGrant;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "metadataGrant",
    "abstractGrant",
    "bodyPDFGrant",
    "bodyHTMLGrant",
    "bibliographyGrant",
    "esmGrant"
})
@XmlRootElement(name = "ArticleGrants")
public class ArticleGrantsImpl
    extends BaseSchemaEntity implements ArticleGrants
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "MetadataGrant", required = true, type = MetadataGrantImpl.class)
    protected MetadataGrantImpl metadataGrant;
    @XmlElement(name = "AbstractGrant", required = true, type = AbstractGrantImpl.class)
    protected AbstractGrantImpl abstractGrant;
    @XmlElement(name = "BodyPDFGrant", required = true, type = BodyPDFGrantImpl.class)
    protected BodyPDFGrantImpl bodyPDFGrant;
    @XmlElement(name = "BodyHTMLGrant", required = true, type = BodyHTMLGrantImpl.class)
    protected BodyHTMLGrantImpl bodyHTMLGrant;
    @XmlElement(name = "BibliographyGrant", required = true, type = BibliographyGrantImpl.class)
    protected BibliographyGrantImpl bibliographyGrant;
    @XmlElement(name = "ESMGrant", required = true, type = ESMGrantImpl.class)
    protected ESMGrantImpl esmGrant;
    @XmlAttribute(name = "Type", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String type;

    public MetadataGrant getMetadataGrant() {
        return metadataGrant;
    }

    public void setMetadataGrant(MetadataGrant value) {
        this.metadataGrant = ((MetadataGrantImpl) value);
    }

    public AbstractGrant getAbstractGrant() {
        return abstractGrant;
    }

    public void setAbstractGrant(AbstractGrant value) {
        this.abstractGrant = ((AbstractGrantImpl) value);
    }

    public BodyPDFGrant getBodyPDFGrant() {
        return bodyPDFGrant;
    }

    public void setBodyPDFGrant(BodyPDFGrant value) {
        this.bodyPDFGrant = ((BodyPDFGrantImpl) value);
    }

    public BodyHTMLGrant getBodyHTMLGrant() {
        return bodyHTMLGrant;
    }

    public void setBodyHTMLGrant(BodyHTMLGrant value) {
        this.bodyHTMLGrant = ((BodyHTMLGrantImpl) value);
    }

    public BibliographyGrant getBibliographyGrant() {
        return bibliographyGrant;
    }

    public void setBibliographyGrant(BibliographyGrant value) {
        this.bibliographyGrant = ((BibliographyGrantImpl) value);
    }

    public ESMGrant getESMGrant() {
        return esmGrant;
    }

    public void setESMGrant(ESMGrant value) {
        this.esmGrant = ((ESMGrantImpl) value);
    }

    public String getType() {
        return type;
    }

    public void setType(String value) {
        this.type = value;
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
