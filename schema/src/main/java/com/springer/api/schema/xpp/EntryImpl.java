package com.springer.api.schema.xpp;
import java.io.IOException;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

import com.springer.api.schema.Entry;
import com.springer.api.schema.SimplePara;
public class EntryImpl extends BaseSchemaEntity implements Entry {
    private final static long serialVersionUID = 2461660169443089969L;
    protected SimpleParaImpl simplePara;
    protected String align;
    protected String colname;
    protected Long morerows;
    protected String nameend;
    protected String namest;
    public SimplePara getSimplePara() {
        return simplePara;
    }
    public void setSimplePara(SimplePara value) {
        simplePara = ((SimpleParaImpl) value);
    }
    public String getAlign() {
        return align;
    }
    public void setAlign(String value) {
        align = ((String) value);
    }
    public String getColname() {
        return colname;
    }
    public void setColname(String value) {
        colname = ((String) value);
    }
    public Long getMorerows() {
        return morerows;
    }
    public void setMorerows(Long value) {
        morerows = ((Long) value);
    }
    public String getNameend() {
        return nameend;
    }
    public void setNameend(String value) {
        nameend = ((String) value);
    }
    public String getNamest() {
        return namest;
    }
    public void setNamest(String value) {
        namest = ((String) value);
    }
    @Override
    public void init(XmlPullParser parser) throws IOException, XmlPullParserException {
        parser.require(XmlPullParser.START_TAG, null, null);
        while (parser.nextTag() == XmlPullParser.START_TAG) {
            String name = parser.getName();
            if (name.equals("SimplePara")) {
                SimpleParaImpl node = new SimpleParaImpl();
                node.init(parser);
                setSimplePara(node);
            } else {                // Consume something we don't understand.
                LOG.warning("Found tag that we don't recognize: " + name);
                XppUtils.skipSubTree(parser);
            }
        }
        setAlign(XppUtils.getAttributeValueFromNode(parser, "align"));
        setColname(XppUtils.getAttributeValueFromNode(parser, "colname"));
        setMorerows(XppUtils.getAttributeValueAsLongFromNode(parser, "morerows"));
        setNameend(XppUtils.getAttributeValueFromNode(parser, "nameend"));
        setNamest(XppUtils.getAttributeValueFromNode(parser, "namest"));
    }
    @Override
    public void toXml(XmlSerializer serializer) throws IOException {
    }
}
