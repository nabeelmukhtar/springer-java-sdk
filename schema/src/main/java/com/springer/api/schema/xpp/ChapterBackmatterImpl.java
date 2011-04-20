package com.springer.api.schema.xpp;
import java.io.IOException;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

import com.springer.api.schema.ArticleNote;
import com.springer.api.schema.Bibliography;
import com.springer.api.schema.ChapterBackmatter;
public class ChapterBackmatterImpl extends BaseSchemaEntity implements ChapterBackmatter {
    private final static long serialVersionUID = 2461660169443089969L;
    protected ArticleNoteImpl articleNote;
    protected BibliographyImpl bibliography;
    public ArticleNote getArticleNote() {
        return articleNote;
    }
    public void setArticleNote(ArticleNote value) {
        articleNote = ((ArticleNoteImpl) value);
    }
    public Bibliography getBibliography() {
        return bibliography;
    }
    public void setBibliography(Bibliography value) {
        bibliography = ((BibliographyImpl) value);
    }
    @Override
    public void init(XmlPullParser parser) throws IOException, XmlPullParserException {
        parser.require(XmlPullParser.START_TAG, null, null);
        while (parser.nextTag() == XmlPullParser.START_TAG) {
            String name = parser.getName();
            if (name.equals("ArticleNote")) {
                ArticleNoteImpl node = new ArticleNoteImpl();
                node.init(parser);
                setArticleNote(node);
            } else if (name.equals("Bibliography")) {
                BibliographyImpl node = new BibliographyImpl();
                node.init(parser);
                setBibliography(node);
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
