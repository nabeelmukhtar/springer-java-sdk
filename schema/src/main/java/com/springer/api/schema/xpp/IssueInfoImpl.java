package com.springer.api.schema.xpp;
import java.io.IOException;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

import com.springer.api.schema.IssueCopyright;
import com.springer.api.schema.IssueHistory;
import com.springer.api.schema.IssueInfo;
import com.springer.api.schema.IssueTitle;
public class IssueInfoImpl extends BaseSchemaEntity implements IssueInfo {
    private final static long serialVersionUID = 2461660169443089969L;
    protected String issueIDStart;
    protected String issueIDEnd;
    protected IssueTitleImpl issueTitle;
    protected String issueArticleCount;
    protected IssueHistoryImpl issueHistory;
    protected IssueCopyrightImpl issueCopyright;
    protected String issueType;
    protected Long tocLevels;
    public String getIssueIDStart() {
        return issueIDStart;
    }
    public void setIssueIDStart(String value) {
        issueIDStart = ((String) value);
    }
    public String getIssueIDEnd() {
        return issueIDEnd;
    }
    public void setIssueIDEnd(String value) {
        issueIDEnd = ((String) value);
    }
    public IssueTitle getIssueTitle() {
        return issueTitle;
    }
    public void setIssueTitle(IssueTitle value) {
        issueTitle = ((IssueTitleImpl) value);
    }
    public String getIssueArticleCount() {
        return issueArticleCount;
    }
    public void setIssueArticleCount(String value) {
        issueArticleCount = ((String) value);
    }
    public IssueHistory getIssueHistory() {
        return issueHistory;
    }
    public void setIssueHistory(IssueHistory value) {
        issueHistory = ((IssueHistoryImpl) value);
    }
    public IssueCopyright getIssueCopyright() {
        return issueCopyright;
    }
    public void setIssueCopyright(IssueCopyright value) {
        issueCopyright = ((IssueCopyrightImpl) value);
    }
    public String getIssueType() {
        return issueType;
    }
    public void setIssueType(String value) {
        issueType = ((String) value);
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
        setIssueType(XppUtils.getAttributeValueFromNode(parser, "IssueType"));
        setTocLevels(XppUtils.getAttributeValueAsLongFromNode(parser, "TocLevels"));
        while (parser.nextTag() == XmlPullParser.START_TAG) {
            String name = parser.getName();
            if (name.equals("IssueIDStart")) {
                setIssueIDStart(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("IssueIDEnd")) {
                setIssueIDEnd(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("IssueTitle")) {
                IssueTitleImpl node = new IssueTitleImpl();
                node.init(parser);
                setIssueTitle(node);
            } else if (name.equals("IssueArticleCount")) {
                setIssueArticleCount(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("IssueHistory")) {
                IssueHistoryImpl node = new IssueHistoryImpl();
                node.init(parser);
                setIssueHistory(node);
            } else if (name.equals("IssueCopyright")) {
                IssueCopyrightImpl node = new IssueCopyrightImpl();
                node.init(parser);
                setIssueCopyright(node);
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
