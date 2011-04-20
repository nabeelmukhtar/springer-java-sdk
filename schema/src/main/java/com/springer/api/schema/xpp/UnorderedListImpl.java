/*
 * Copyright 2010-2011 Nabeel Mukhtar 
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); 
 * you may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at 
 * 
 *  http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
 * See the License for the specific language governing permissions and
 * limitations under the License. 
 * 
 */
package com.springer.api.schema.xpp;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

import com.springer.api.schema.ItemContent;
import com.springer.api.schema.UnorderedList;

/**
 * The Class UnorderedListImpl.
 */
public class UnorderedListImpl extends BaseSchemaEntity implements UnorderedList {
    
    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The item contents. */
    protected List<ItemContent> itemContents;
    
    /** The mark. */
    protected String mark;
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.UnorderedList#getItemContents()
     */
    public List<ItemContent> getItemContents() {
        if (itemContents == null) {
            itemContents = new ArrayList<ItemContent>();
        }
        return this.itemContents;
    }
    
    /**
     * Sets the item contents.
     * 
     * @param value the new item contents
     */
    public void setItemContents(List<ItemContent> value) {
        this.itemContents = value;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.UnorderedList#getMark()
     */
    public String getMark() {
        return mark;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.UnorderedList#setMark(java.lang.String)
     */
    public void setMark(String value) {
        mark = ((String) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.xpp.BaseSchemaEntity#init(org.xmlpull.v1.XmlPullParser)
     */
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
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.xpp.BaseSchemaEntity#toXml(org.xmlpull.v1.XmlSerializer)
     */
    @Override
    public void toXml(XmlSerializer serializer) throws IOException {
    }
}
