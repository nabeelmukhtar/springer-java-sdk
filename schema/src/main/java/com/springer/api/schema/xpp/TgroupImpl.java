package com.springer.api.schema.xpp;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

import com.springer.api.schema.Colspec;
import com.springer.api.schema.Tbody;
import com.springer.api.schema.Tgroup;
import com.springer.api.schema.Thead;
public class TgroupImpl extends BaseSchemaEntity implements Tgroup {
    private final static long serialVersionUID = 2461660169443089969L;
    protected List<Colspec> colspec;
    protected TheadImpl thead;
    protected TbodyImpl tbody;
    protected String align;
    protected Long cols;
    public List<Colspec> getColspec() {
        if (colspec == null) {
            colspec = new ArrayList<Colspec>();
        }
        return this.colspec;
    }
    public void setColspec(List<Colspec> value) {
        this.colspec = value;
    }
    public Thead getThead() {
        return thead;
    }
    public void setThead(Thead value) {
        thead = ((TheadImpl) value);
    }
    public Tbody getTbody() {
        return tbody;
    }
    public void setTbody(Tbody value) {
        tbody = ((TbodyImpl) value);
    }
    public String getAlign() {
        return align;
    }
    public void setAlign(String value) {
        align = ((String) value);
    }
    public Long getCols() {
        return cols;
    }
    public void setCols(Long value) {
        cols = ((Long) value);
    }
    @Override
    public void init(XmlPullParser parser) throws IOException, XmlPullParserException {
        parser.require(XmlPullParser.START_TAG, null, null);
        while (parser.nextTag() == XmlPullParser.START_TAG) {
            String name = parser.getName();
            if (name.equals("##default")) {
                ColspecImpl node = new ColspecImpl();
                node.init(parser);
                getColspec().add(node);
            } else if (name.equals("##default")) {
                TheadImpl node = new TheadImpl();
                node.init(parser);
                setThead(node);
            } else if (name.equals("##default")) {
                TbodyImpl node = new TbodyImpl();
                node.init(parser);
                setTbody(node);
            } else {                // Consume something we don't understand.
                LOG.warning("Found tag that we don't recognize: " + name);
                XppUtils.skipSubTree(parser);
            }
        }
        setAlign(XppUtils.getAttributeValueFromNode(parser, "##default"));
        setCols(XppUtils.getAttributeValueAsLongFromNode(parser, "##default"));
    }
    @Override
    public void toXml(XmlSerializer serializer) throws IOException {
    }
}
