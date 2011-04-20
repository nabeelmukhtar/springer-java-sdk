package com.springer.api.schema.xpp;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

import com.springer.api.schema.ListItem;
import com.springer.api.schema.OrderedList;
public class OrderedListImpl extends BaseSchemaEntity implements OrderedList {
    private final static long serialVersionUID = 2461660169443089969L;
    protected List<ListItem> listItems;
    public List<ListItem> getListItems() {
        if (listItems == null) {
            listItems = new ArrayList<ListItem>();
        }
        return this.listItems;
    }
    public void setListItems(List<ListItem> value) {
        this.listItems = value;
    }
    @Override
    public void init(XmlPullParser parser) throws IOException, XmlPullParserException {
        parser.require(XmlPullParser.START_TAG, null, null);
        while (parser.nextTag() == XmlPullParser.START_TAG) {
            String name = parser.getName();
            if (name.equals("ListItem")) {
                ListItemImpl node = new ListItemImpl();
                node.init(parser);
                getListItems().add(node);
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
