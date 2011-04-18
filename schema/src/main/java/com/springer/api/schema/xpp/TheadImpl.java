package com.springer.api.schema.xpp;
import java.io.IOException;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

import com.springer.api.schema.Row;
import com.springer.api.schema.Thead;
public class TheadImpl extends BaseSchemaEntity implements Thead {
    private final static long serialVersionUID = 2461660169443089969L;
    protected RowImpl row;
    public Row getRow() {
        return row;
    }
    public void setRow(Row value) {
        row = ((RowImpl) value);
    }
    @Override
    public void init(XmlPullParser parser) throws IOException, XmlPullParserException {
        parser.require(XmlPullParser.START_TAG, null, null);
        while (parser.nextTag() == XmlPullParser.START_TAG) {
            String name = parser.getName();
            if (name.equals("##default")) {
                RowImpl node = new RowImpl();
                node.init(parser);
                setRow(node);
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
