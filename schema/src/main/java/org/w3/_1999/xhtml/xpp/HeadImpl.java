package org.w3._1999.xhtml.xpp;
import java.io.IOException;

import org.w3._1999.xhtml.Head;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

import org.prismstandard.namespaces.pam._2.Article;
import org.prismstandard.namespaces.pam._2.xpp.ArticleImpl;
import com.springer.api.schema.xpp.BaseSchemaEntity;
import com.springer.api.schema.xpp.XppUtils;
public class HeadImpl extends BaseSchemaEntity implements Head {
    private final static long serialVersionUID = 2461660169443089969L;
    protected ArticleImpl article;
    public Article getArticle() {
        return article;
    }
    public void setArticle(Article value) {
        article = ((ArticleImpl) value);
    }
    @Override
    public void init(XmlPullParser parser) throws IOException, XmlPullParserException {
        parser.require(XmlPullParser.START_TAG, null, null);
        while (parser.nextTag() == XmlPullParser.START_TAG) {
            String name = parser.getName();
            if (name.equals("pam:article")) {
            	ArticleImpl node = new ArticleImpl();
            	node.init(parser);
                setArticle(node);
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
