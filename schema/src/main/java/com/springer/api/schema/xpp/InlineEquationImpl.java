package com.springer.api.schema.xpp;
import java.io.IOException;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

import com.springer.api.schema.EquationSource;
import com.springer.api.schema.ImageObject;
import com.springer.api.schema.InlineEquation;
public class InlineEquationImpl extends BaseSchemaEntity implements InlineEquation {
    private final static long serialVersionUID = 2461660169443089969L;
    protected ImageObjectImpl inlineMediaObject;
    protected EquationSourceImpl equationSource;
    protected String id;
    public ImageObject getInlineMediaObject() {
        return inlineMediaObject;
    }
    public void setInlineMediaObject(ImageObject value) {
        inlineMediaObject = ((ImageObjectImpl) value);
    }
    public EquationSource getEquationSource() {
        return equationSource;
    }
    public void setEquationSource(EquationSource value) {
        equationSource = ((EquationSourceImpl) value);
    }
    public String getId() {
        return id;
    }
    public void setId(String value) {
        id = ((String) value);
    }
    @Override
    public void init(XmlPullParser parser) throws IOException, XmlPullParserException {
        parser.require(XmlPullParser.START_TAG, null, null);
        while (parser.nextTag() == XmlPullParser.START_TAG) {
            String name = parser.getName();
            if (name.equals("InlineMediaObject")) {
                ImageObjectImpl node = new ImageObjectImpl();
                node.init(parser);
                setInlineMediaObject(node);
            } else if (name.equals("EquationSource")) {
                EquationSourceImpl node = new EquationSourceImpl();
                node.init(parser);
                setEquationSource(node);
            } else {                // Consume something we don't understand.
                LOG.warning("Found tag that we don't recognize: " + name);
                XppUtils.skipSubTree(parser);
            }
        }
        setId(XppUtils.getAttributeValueFromNode(parser, "ID"));
    }
    @Override
    public void toXml(XmlSerializer serializer) throws IOException {
    }
}
