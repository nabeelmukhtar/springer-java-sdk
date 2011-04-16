
package com.springer.api.schema.xpp;

import java.io.IOException;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

import com.springer.api.schema.Abstract;
import com.springer.api.schema.ArticleHeader;
import com.springer.api.schema.AuthorGroup;
import com.springer.api.schema.KeywordGroup;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "authorGroup",
    "_abstract",
    "keywordGroup"
})
@XmlRootElement(name = "ArticleHeader")
public class ArticleHeaderImpl
    extends BaseSchemaEntity implements ArticleHeader
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "AuthorGroup", required = true, type = AuthorGroupImpl.class)
    protected AuthorGroupImpl authorGroup;
    @XmlElement(name = "Abstract", required = true, type = AbstractImpl.class)
    protected AbstractImpl _abstract;
    @XmlElement(name = "KeywordGroup", required = true, type = KeywordGroupImpl.class)
    protected KeywordGroupImpl keywordGroup;

    public AuthorGroup getAuthorGroup() {
        return authorGroup;
    }

    public void setAuthorGroup(AuthorGroup value) {
        this.authorGroup = ((AuthorGroupImpl) value);
    }

    public Abstract getAbstract() {
        return _abstract;
    }

    public void setAbstract(Abstract value) {
        this._abstract = ((AbstractImpl) value);
    }

    public KeywordGroup getKeywordGroup() {
        return keywordGroup;
    }

    public void setKeywordGroup(KeywordGroup value) {
        this.keywordGroup = ((KeywordGroupImpl) value);
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
