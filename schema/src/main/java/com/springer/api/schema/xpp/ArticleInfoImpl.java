package com.springer.api.schema.xpp;
import java.io.IOException;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

import com.springer.api.schema.ArticleContext;
import com.springer.api.schema.ArticleCopyright;
import com.springer.api.schema.ArticleGrants;
import com.springer.api.schema.ArticleHistory;
import com.springer.api.schema.ArticleInfo;
import com.springer.api.schema.ArticleSubTitle;
import com.springer.api.schema.ArticleTitle;
public class ArticleInfoImpl extends BaseSchemaEntity implements ArticleInfo {
    private final static long serialVersionUID = 2461660169443089969L;
    protected String articleID;
    protected String articleDOI;
    protected String articleSequenceNumber;
    protected ArticleTitleImpl articleTitle;
    protected ArticleSubTitleImpl articleSubTitle;
    protected String articleCategory;
    protected String articleFirstPage;
    protected String articleLastPage;
    protected ArticleHistoryImpl articleHistory;
    protected String articleEditorialResponsibility;
    protected ArticleCopyrightImpl articleCopyright;
    protected ArticleGrantsImpl articleGrants;
    protected ArticleContextImpl articleContext;
    protected String articleCitation;
    protected String articleType;
    protected String containsESM;
    protected String language;
    protected String numberingStyle;
    protected Long tocLevels;
    public String getArticleID() {
        return articleID;
    }
    public void setArticleID(String value) {
        articleID = ((String) value);
    }
    public String getArticleDOI() {
        return articleDOI;
    }
    public void setArticleDOI(String value) {
        articleDOI = ((String) value);
    }
    public String getArticleSequenceNumber() {
        return articleSequenceNumber;
    }
    public void setArticleSequenceNumber(String value) {
        articleSequenceNumber = ((String) value);
    }
    public ArticleTitle getArticleTitle() {
        return articleTitle;
    }
    public void setArticleTitle(ArticleTitle value) {
        articleTitle = ((ArticleTitleImpl) value);
    }
    public ArticleSubTitle getArticleSubTitle() {
        return articleSubTitle;
    }
    public void setArticleSubTitle(ArticleSubTitle value) {
        articleSubTitle = ((ArticleSubTitleImpl) value);
    }
    public String getArticleCategory() {
        return articleCategory;
    }
    public void setArticleCategory(String value) {
        articleCategory = ((String) value);
    }
    public String getArticleFirstPage() {
        return articleFirstPage;
    }
    public void setArticleFirstPage(String value) {
        articleFirstPage = ((String) value);
    }
    public String getArticleLastPage() {
        return articleLastPage;
    }
    public void setArticleLastPage(String value) {
        articleLastPage = ((String) value);
    }
    public ArticleHistory getArticleHistory() {
        return articleHistory;
    }
    public void setArticleHistory(ArticleHistory value) {
        articleHistory = ((ArticleHistoryImpl) value);
    }
    public String getArticleEditorialResponsibility() {
        return articleEditorialResponsibility;
    }
    public void setArticleEditorialResponsibility(String value) {
        articleEditorialResponsibility = ((String) value);
    }
    public ArticleCopyright getArticleCopyright() {
        return articleCopyright;
    }
    public void setArticleCopyright(ArticleCopyright value) {
        articleCopyright = ((ArticleCopyrightImpl) value);
    }
    public ArticleGrants getArticleGrants() {
        return articleGrants;
    }
    public void setArticleGrants(ArticleGrants value) {
        articleGrants = ((ArticleGrantsImpl) value);
    }
    public ArticleContext getArticleContext() {
        return articleContext;
    }
    public void setArticleContext(ArticleContext value) {
        articleContext = ((ArticleContextImpl) value);
    }
    public String getArticleCitation() {
        return articleCitation;
    }
    public void setArticleCitation(String value) {
        articleCitation = ((String) value);
    }
    public String getArticleType() {
        return articleType;
    }
    public void setArticleType(String value) {
        articleType = ((String) value);
    }
    public String getContainsESM() {
        return containsESM;
    }
    public void setContainsESM(String value) {
        containsESM = ((String) value);
    }
    public String getLanguage() {
        return language;
    }
    public void setLanguage(String value) {
        language = ((String) value);
    }
    public String getNumberingStyle() {
        return numberingStyle;
    }
    public void setNumberingStyle(String value) {
        numberingStyle = ((String) value);
    }
    public Long getTocLevels() {
        return tocLevels;
    }
    public void setTocLevels(Long value) {
        tocLevels = ((Long) value);
    }
    @Override
    public void init(XmlPullParser parser) throws IOException, XmlPullParserException {
        parser.require(XmlPullParser.START_TAG, null, null);
        setArticleCitation(XppUtils.getAttributeValueFromNode(parser, "ArticleCitation"));
        setArticleType(XppUtils.getAttributeValueFromNode(parser, "ArticleType"));
        setContainsESM(XppUtils.getAttributeValueFromNode(parser, "ContainsESM"));
        setLanguage(XppUtils.getAttributeValueFromNode(parser, "Language"));
        setNumberingStyle(XppUtils.getAttributeValueFromNode(parser, "NumberingStyle"));
        setTocLevels(XppUtils.getAttributeValueAsLongFromNode(parser, "TocLevels"));
        while (parser.nextTag() == XmlPullParser.START_TAG) {
            String name = parser.getName();
            if (name.equals("ArticleID")) {
                setArticleID(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("ArticleDOI")) {
                setArticleDOI(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("ArticleSequenceNumber")) {
                setArticleSequenceNumber(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("ArticleTitle")) {
                ArticleTitleImpl node = new ArticleTitleImpl();
                node.init(parser);
                setArticleTitle(node);
            } else if (name.equals("ArticleSubTitle")) {
                ArticleSubTitleImpl node = new ArticleSubTitleImpl();
                node.init(parser);
                setArticleSubTitle(node);
            } else if (name.equals("ArticleCategory")) {
                setArticleCategory(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("ArticleFirstPage")) {
                setArticleFirstPage(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("ArticleLastPage")) {
                setArticleLastPage(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("ArticleHistory")) {
                ArticleHistoryImpl node = new ArticleHistoryImpl();
                node.init(parser);
                setArticleHistory(node);
            } else if (name.equals("ArticleEditorialResponsibility")) {
                setArticleEditorialResponsibility(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("ArticleCopyright")) {
                ArticleCopyrightImpl node = new ArticleCopyrightImpl();
                node.init(parser);
                setArticleCopyright(node);
            } else if (name.equals("ArticleGrants")) {
                ArticleGrantsImpl node = new ArticleGrantsImpl();
                node.init(parser);
                setArticleGrants(node);
            } else if (name.equals("ArticleContext")) {
                ArticleContextImpl node = new ArticleContextImpl();
                node.init(parser);
                setArticleContext(node);
            } else {                // Consume something we don't understand.
                LOG.warning("Found tag that we don't recognize: " + name);
                XppUtils.skipSubTree(parser);
            }
        }
    }
    @Override
    public void toXml(XmlSerializer serializer) throws IOException {
    }
}
