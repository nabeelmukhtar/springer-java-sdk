package com.springer.api.schema.xpp;
import java.io.IOException;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

import com.springer.api.schema.Caption;
import com.springer.api.schema.Table;
import com.springer.api.schema.Tfooter;
import com.springer.api.schema.Tgroup;
public class TableImpl extends BaseSchemaEntity implements Table {
    private final static long serialVersionUID = 2461660169443089969L;
    protected TableImpl table;
    protected CaptionImpl caption;
    protected TgroupImpl tgroup;
    protected TfooterImpl tfooter;
    protected String _float;
    protected String id;
    public Table getTable() {
        return table;
    }
    public void setTable(Table value) {
        table = ((TableImpl) value);
    }
    public Caption getCaption() {
        return caption;
    }
    public void setCaption(Caption value) {
        caption = ((CaptionImpl) value);
    }
    public Tgroup getTgroup() {
        return tgroup;
    }
    public void setTgroup(Tgroup value) {
        tgroup = ((TgroupImpl) value);
    }
    public Tfooter getTfooter() {
        return tfooter;
    }
    public void setTfooter(Tfooter value) {
        tfooter = ((TfooterImpl) value);
    }
    public String getFloat() {
        return _float;
    }
    public void setFloat(String value) {
        _float = ((String) value);
    }
    public String getID() {
        return id;
    }
    public void setID(String value) {
        id = ((String) value);
    }
    @Override
    public void init(XmlPullParser parser) throws IOException, XmlPullParserException {
        parser.require(XmlPullParser.START_TAG, null, null);
        while (parser.nextTag() == XmlPullParser.START_TAG) {
            String name = parser.getName();
            if (name.equals("Table")) {
                TableImpl node = new TableImpl();
                node.init(parser);
                setTable(node);
            } else if (name.equals("Caption")) {
                CaptionImpl node = new CaptionImpl();
                node.init(parser);
                setCaption(node);
            } else if (name.equals("tgroup")) {
                TgroupImpl node = new TgroupImpl();
                node.init(parser);
                setTgroup(node);
            } else if (name.equals("tfooter")) {
                TfooterImpl node = new TfooterImpl();
                node.init(parser);
                setTfooter(node);
            } else {                // Consume something we don't understand.
                LOG.warning("Found tag that we don't recognize: " + name);
                XppUtils.skipSubTree(parser);
            }
        }
        setFloat(XppUtils.getAttributeValueFromNode(parser, "Float"));
        setID(XppUtils.getAttributeValueFromNode(parser, "ID"));
    }
    @Override
    public void toXml(XmlSerializer serializer) throws IOException {
    }
}
