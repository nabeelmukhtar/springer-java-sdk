package com.springer.api.schema.xpp;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

import com.springer.api.schema.Article;
import com.springer.api.schema.ArticleBackmatter;
import com.springer.api.schema.ArticleHeader;
import com.springer.api.schema.ArticleInfo;
import com.springer.api.schema.Body;
import com.springer.api.schema.BodyRef;
public class ArticleImpl extends BaseSchemaEntity implements Article {
    private final static long serialVersionUID = 2461660169443089969L;
    protected ArticleInfoImpl articleInfo;
    protected ArticleHeaderImpl articleHeader;
    protected BodyImpl body;
    protected List<BodyRef> bodyReves;
    protected ArticleBackmatterImpl articleBackmatter;
    protected String id;
    protected String outputMedium;
    public ArticleInfo getArticleInfo() {
        return articleInfo;
    }
    public void setArticleInfo(ArticleInfo value) {
        articleInfo = ((ArticleInfoImpl) value);
    }
    public ArticleHeader getArticleHeader() {
        return articleHeader;
    }
    public void setArticleHeader(ArticleHeader value) {
        articleHeader = ((ArticleHeaderImpl) value);
    }
    public Body getBody() {
        return body;
    }
    public void setBody(Body value) {
        body = ((BodyImpl) value);
    }
    public List<BodyRef> getBodyReves() {
        if (bodyReves == null) {
            bodyReves = new ArrayList<BodyRef>();
        }
        return this.bodyReves;
    }
    public void setBodyReves(List<BodyRef> value) {
        this.bodyReves = value;
    }
    public ArticleBackmatter getArticleBackmatter() {
        return articleBackmatter;
    }
    public void setArticleBackmatter(ArticleBackmatter value) {
        articleBackmatter = ((ArticleBackmatterImpl) value);
    }
    public String getID() {
        return id;
    }
    public void setID(String value) {
        id = ((String) value);
    }
    public String getOutputMedium() {
        return outputMedium;
    }
    public void setOutputMedium(String value) {
        outputMedium = ((String) value);
    }
    @Override
    public void init(XmlPullParser parser) throws IOException, XmlPullParserException {
        parser.require(XmlPullParser.START_TAG, null, null);
        while (parser.nextTag() == XmlPullParser.START_TAG) {
            String name = parser.getName();
            if (name.equals("ArticleInfo")) {
                ArticleInfoImpl node = new ArticleInfoImpl();
                node.init(parser);
                setArticleInfo(node);
            } else if (name.equals("ArticleHeader")) {
                ArticleHeaderImpl node = new ArticleHeaderImpl();
                node.init(parser);
                setArticleHeader(node);
            } else if (name.equals("Body")) {
                BodyImpl node = new BodyImpl();
                node.init(parser);
                setBody(node);
            } else if (name.equals("BodyRef")) {
                BodyRefImpl node = new BodyRefImpl();
                node.init(parser);
                getBodyReves().add(node);
            } else if (name.equals("ArticleBackmatter")) {
                ArticleBackmatterImpl node = new ArticleBackmatterImpl();
                node.init(parser);
                setArticleBackmatter(node);
            } else {                // Consume something we don't understand.
                LOG.warning("Found tag that we don't recognize: " + name);
                XppUtils.skipSubTree(parser);
            }
        }
        setID(XppUtils.getAttributeValueFromNode(parser, "ID"));
        setOutputMedium(XppUtils.getAttributeValueFromNode(parser, "OutputMedium"));
    }
    @Override
    public void toXml(XmlSerializer serializer) throws IOException {
    }
}
