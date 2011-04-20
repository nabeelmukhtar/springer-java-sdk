package com.springer.api.schema.xpp;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

import com.springer.api.schema.ItemContent;
import com.springer.api.schema.UnorderedList;
public class UnorderedListImpl extends BaseSchemaEntity implements UnorderedList {
    private final static long serialVersionUID = 2461660169443089969L;
    protected List<ItemContent> itemContents;
    protected String mark;
    public List<ItemContent> getItemContents() {
        if (itemContents == null) {
            itemContents = new ArrayList<ItemContent>();
        }
        return this.itemContents;
    }
    public void setItemContents(List<ItemContent> value) {
        this.itemContents = value;
    }
    public String getMark() {
        return mark;
    }
    public void setMark(String value) {
        mark = ((String) value);
    }
    @Override
    public void init(XmlPullParser parser) throws IOException, XmlPullParserException {
        parser.require(XmlPullParser.START_TAG, null, null);
        setMark(XppUtils.getAttributeValueFromNode(parser, "Mark"));
        while (parser.nextTag() == XmlPullParser.START_TAG) {
            String name = parser.getName();
            if (name.equals("ItemContent")) {
                ItemContentImpl node = new ItemContentImpl();
                node.init(parser);
                getItemContents().add(node);
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
