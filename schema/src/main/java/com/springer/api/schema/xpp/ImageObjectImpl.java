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

import com.springer.api.schema.ImageObject;
import com.springer.api.schema.ImageObjectElement;

/**
 * The Class ImageObjectImpl.
 */
public class ImageObjectImpl extends BaseSchemaEntity implements ImageObject {
    
    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The image object element. */
    protected ImageObjectElementImpl imageObjectElement;
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.ImageObject#getImageObjectElement()
     */
    public ImageObjectElement getImageObjectElement() {
        return imageObjectElement;
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.ImageObject#setImageObjectElement(com.springer.api.schema.ImageObjectElement)
     */
    public void setImageObjectElement(ImageObjectElement value) {
        imageObjectElement = ((ImageObjectElementImpl) value);
    }
    
    /* (non-Javadoc)
     * @see com.springer.api.schema.xpp.BaseSchemaEntity#init(org.xmlpull.v1.XmlPullParser)
     */
    @Override
    public void init(XmlPullParser parser) throws IOException, XmlPullParserException {
        parser.require(XmlPullParser.START_TAG, null, null);
        while (parser.nextTag() == XmlPullParser.START_TAG) {
            String name = parser.getName();
            if (name.equals("ImageObject")) {
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
     * @see com.springer.api.schema.xpp.BaseSchemaEntity#toXml(org.xmlpull.v1.XmlSerializer)
     */
    @Override
    public void toXml(XmlSerializer serializer) throws IOException {
    }
}
