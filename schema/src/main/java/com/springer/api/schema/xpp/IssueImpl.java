package com.springer.api.schema.xpp;
import java.io.IOException;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

import com.springer.api.schema.Article;
import com.springer.api.schema.Issue;
import com.springer.api.schema.IssueInfo;
public class IssueImpl extends BaseSchemaEntity implements Issue {
    private final static long serialVersionUID = 2461660169443089969L;
    protected IssueInfoImpl issueInfo;
    protected ArticleImpl article;
    protected String issueType;
    protected String outputMedium;
    public IssueInfo getIssueInfo() {
        return issueInfo;
    }
    public void setIssueInfo(IssueInfo value) {
        issueInfo = ((IssueInfoImpl) value);
    }
    public Article getArticle() {
        return article;
    }
    public void setArticle(Article value) {
        article = ((ArticleImpl) value);
    }
    public String getIssueType() {
        return issueType;
    }
    public void setIssueType(String value) {
        issueType = ((String) value);
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
            if (name.equals("IssueInfo")) {
                IssueInfoImpl node = new IssueInfoImpl();
                node.init(parser);
                setIssueInfo(node);
            } else if (name.equals("Article")) {
                ArticleImpl node = new ArticleImpl();
                node.init(parser);
                setArticle(node);
            } else {                // Consume something we don't understand.
                LOG.warning("Found tag that we don't recognize: " + name);
                XppUtils.skipSubTree(parser);
            }
        }
        setIssueType(XppUtils.getAttributeValueFromNode(parser, "IssueType"));
        setOutputMedium(XppUtils.getAttributeValueFromNode(parser, "OutputMedium"));
    }
    @Override
    public void toXml(XmlSerializer serializer) throws IOException {
    }
}
