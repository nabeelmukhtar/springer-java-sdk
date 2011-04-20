package com.springer.api.schema.xpp;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

import com.springer.api.schema.Abstract;
import com.springer.api.schema.ArticleNote;
import com.springer.api.schema.AuthorGroup;
import com.springer.api.schema.ChapterHeader;
import com.springer.api.schema.KeywordGroup;
public class ChapterHeaderImpl extends BaseSchemaEntity implements ChapterHeader {
    private final static long serialVersionUID = 2461660169443089969L;
    protected AuthorGroupImpl authorGroup;
    protected AbstractImpl _abstract;
    protected KeywordGroupImpl keywordGroup;
    protected List<ArticleNote> articleNotes;
    public AuthorGroup getAuthorGroup() {
        return authorGroup;
    }
    public void setAuthorGroup(AuthorGroup value) {
        authorGroup = ((AuthorGroupImpl) value);
    }
    public Abstract getAbstract() {
        return _abstract;
    }
    public void setAbstract(Abstract value) {
        _abstract = ((AbstractImpl) value);
    }
    public KeywordGroup getKeywordGroup() {
        return keywordGroup;
    }
    public void setKeywordGroup(KeywordGroup value) {
        keywordGroup = ((KeywordGroupImpl) value);
    }
    public List<ArticleNote> getArticleNotes() {
        if (articleNotes == null) {
            articleNotes = new ArrayList<ArticleNote>();
        }
        return this.articleNotes;
    }
    public void setArticleNotes(List<ArticleNote> value) {
        this.articleNotes = value;
    }
    @Override
    public void init(XmlPullParser parser) throws IOException, XmlPullParserException {
        parser.require(XmlPullParser.START_TAG, null, null);
        while (parser.nextTag() == XmlPullParser.START_TAG) {
            String name = parser.getName();
            if (name.equals("AuthorGroup")) {
                AuthorGroupImpl node = new AuthorGroupImpl();
                node.init(parser);
                setAuthorGroup(node);
            } else if (name.equals("Abstract")) {
                AbstractImpl node = new AbstractImpl();
                node.init(parser);
                setAbstract(node);
            } else if (name.equals("KeywordGroup")) {
                KeywordGroupImpl node = new KeywordGroupImpl();
                node.init(parser);
                setKeywordGroup(node);
            } else if (name.equals("ArticleNote")) {
                ArticleNoteImpl node = new ArticleNoteImpl();
                node.init(parser);
                getArticleNotes().add(node);
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
