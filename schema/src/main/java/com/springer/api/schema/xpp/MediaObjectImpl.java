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

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

import com.springer.api.schema.MediaObject;
import com.springer.api.schema.TextObject;

/**
 * The Class MediaObjectImpl.
 */
public class MediaObjectImpl extends ImageObjectImpl implements MediaObject {
    
    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The text object. */
    protected TextObjectImpl textObject;
    
    /** The id. */
    protected String id;
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.MediaObject#getTextObject()
     */
    public TextObject getTextObject() {
        return textObject;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.MediaObject#setTextObject(com.springer.api.schema.TextObject)
     */
    public void setTextObject(TextObject value) {
        textObject = ((TextObjectImpl) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.MediaObject#getID()
     */
    public String getID() {
        return id;
    }

    /* (non-Javadoc)
     * @see com.springer.api.schema.MediaObject#setID(java.lang.String)
     */
    public void setID(String value) {
        this.id = value;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.xpp.ImageObjectImpl#init(org.xmlpull.v1.XmlPullParser)
     */
    @Override
    public void init(XmlPullParser parser) throws IOException, XmlPullParserException {
        parser.require(XmlPullParser.START_TAG, null, null);
        setID(XppUtils.getAttributeValueFromNode(parser, "ID"));
        while (parser.nextTag() == XmlPullParser.START_TAG) {
            String name = parser.getName();
            if (name.equals("TextObject")) {
                TextObjectImpl node = new TextObjectImpl();
                node.init(parser);
                setTextObject(node);
            } else if (name.equals("ImageObject")) {
                ImageObjectElementImpl node = new ImageObjectElementImpl();
                node.init(parser);
                setImageObjectElement(node);
        	} else {                // Consume something we don't understand.
                LOG.warning("Found tag that we don't recognize: " + name);
                XppUtils.skipSubTree(parser);
            }
        }
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.xpp.ImageObjectImpl#toXml(org.xmlpull.v1.XmlSerializer)
     */
    @Override
    public void toXml(XmlSerializer serializer) throws IOException {
    }
}
