package com.springer.api.schema.xpp;
import java.io.IOException;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

import com.springer.api.schema.ItemContent;
import com.springer.api.schema.ListItem;
public class ListItemImpl extends BaseSchemaEntity implements ListItem {
    private final static long serialVersionUID = 2461660169443089969L;
    protected String itemNumber;
    protected ItemContentImpl itemContent;
    public String getItemNumber() {
        return itemNumber;
    }
    public void setItemNumber(String value) {
        itemNumber = ((String) value);
    }
    public ItemContent getItemContent() {
        return itemContent;
    }
    public void setItemContent(ItemContent value) {
        itemContent = ((ItemContentImpl) value);
    }
    @Override
    public void init(XmlPullParser parser) throws IOException, XmlPullParserException {
        parser.require(XmlPullParser.START_TAG, null, null);
        while (parser.nextTag() == XmlPullParser.START_TAG) {
            String name = parser.getName();
            if (name.equals("ItemNumber")) {
                setItemNumber(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("ItemContent")) {
                ItemContentImpl node = new ItemContentImpl();
                node.init(parser);
                setItemContent(node);
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
