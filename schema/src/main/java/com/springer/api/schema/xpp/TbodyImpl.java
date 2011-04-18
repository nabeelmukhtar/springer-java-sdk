package com.springer.api.schema.xpp;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

import com.springer.api.schema.Row;
import com.springer.api.schema.Tbody;
public class TbodyImpl extends BaseSchemaEntity implements Tbody {
    private final static long serialVersionUID = 2461660169443089969L;
    protected List<Row> rows;
    public List<Row> getRows() {
        if (rows == null) {
            rows = new ArrayList<Row>();
        }
        return this.rows;
    }
    public void setRows(List<Row> value) {
        this.rows = value;
    }
    @Override
    public void init(XmlPullParser parser) throws IOException, XmlPullParserException {
        parser.require(XmlPullParser.START_TAG, null, null);
        while (parser.nextTag() == XmlPullParser.START_TAG) {
            String name = parser.getName();
            if (name.equals("row")) {
                RowImpl node = new RowImpl();
                node.init(parser);
                getRows().add(node);
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
