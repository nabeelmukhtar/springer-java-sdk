package com.springer.api.schema.xpp;
import java.io.IOException;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

import com.springer.api.schema.ArticleCopyright;
public class ArticleCopyrightImpl extends BaseSchemaEntity implements ArticleCopyright {
    private final static long serialVersionUID = 2461660169443089969L;
    protected String copyrightHolderName;
    protected Long copyrightYear;
    public String getCopyrightHolderName() {
        return copyrightHolderName;
    }
    public void setCopyrightHolderName(String value) {
        copyrightHolderName = ((String) value);
    }
    public Long getCopyrightYear() {
        return copyrightYear;
    }
    public void setCopyrightYear(Long value) {
        copyrightYear = ((Long) value);
    }
    @Override
    public void init(XmlPullParser parser) throws IOException, XmlPullParserException {
        parser.require(XmlPullParser.START_TAG, null, null);
        while (parser.nextTag() == XmlPullParser.START_TAG) {
            String name = parser.getName();
            if (name.equals("CopyrightHolderName")) {
                setCopyrightHolderName(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("CopyrightYear")) {
                setCopyrightYear(XppUtils.getElementValueAsLongFromNode(parser));
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
