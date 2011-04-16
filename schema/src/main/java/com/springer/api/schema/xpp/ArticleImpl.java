
package com.springer.api.schema.xpp;

import java.io.IOException;
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

import com.springer.api.schema.Article;
import com.springer.api.schema.ArticleBackmatter;
import com.springer.api.schema.ArticleHeader;
import com.springer.api.schema.ArticleInfo;
import com.springer.api.schema.Body;
import com.springer.api.schema.BodyRef;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "articleInfo",
    "articleHeader",
    "body",
    "bodyRef",
    "articleBackmatter"
})
@XmlRootElement(name = "Article")
public class ArticleImpl
    extends BaseSchemaEntity implements Article
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "ArticleInfo", required = true, type = ArticleInfoImpl.class)
    protected ArticleInfoImpl articleInfo;
    @XmlElement(name = "ArticleHeader", required = true, type = ArticleHeaderImpl.class)
    protected ArticleHeaderImpl articleHeader;
    @XmlElement(name = "Body", type = BodyImpl.class)
    protected BodyImpl body;
    @XmlElement(name = "BodyRef", required = true, type = BodyRefImpl.class)
    protected List<BodyRef> bodyRef;
    @XmlElement(name = "ArticleBackmatter", required = true, type = ArticleBackmatterImpl.class)
    protected ArticleBackmatterImpl articleBackmatter;
    @XmlAttribute(name = "ID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String id;
    @XmlAttribute(name = "OutputMedium")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String outputMedium;

    public ArticleInfo getArticleInfo() {
        return articleInfo;
    }

    public void setArticleInfo(ArticleInfo value) {
        this.articleInfo = ((ArticleInfoImpl) value);
    }

    public ArticleHeader getArticleHeader() {
        return articleHeader;
    }

    public void setArticleHeader(ArticleHeader value) {
        this.articleHeader = ((ArticleHeaderImpl) value);
    }

    public Body getBody() {
        return body;
    }

    public void setBody(Body value) {
        this.body = ((BodyImpl) value);
    }

    public List<BodyRef> getBodyRef() {
        if (bodyRef == null) {
            bodyRef = new ArrayList<BodyRef>();
        }
        return this.bodyRef;
    }

    public ArticleBackmatter getArticleBackmatter() {
        return articleBackmatter;
    }

    public void setArticleBackmatter(ArticleBackmatter value) {
        this.articleBackmatter = ((ArticleBackmatterImpl) value);
    }

    public String getID() {
        return id;
    }

    public void setID(String value) {
        this.id = value;
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
