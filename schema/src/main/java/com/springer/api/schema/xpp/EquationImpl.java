package com.springer.api.schema.xpp;
import java.io.IOException;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

import com.springer.api.schema.Equation;
import com.springer.api.schema.EquationSource;
import com.springer.api.schema.MediaObject;
public class EquationImpl extends BaseSchemaEntity implements Equation {
    private final static long serialVersionUID = 2461660169443089969L;
    protected Long equationNumber;
    protected MediaObjectImpl mediaObject;
    protected EquationSourceImpl equationSource;
    protected String id;
    public Long getEquationNumber() {
        return equationNumber;
    }
    public void setEquationNumber(Long value) {
        equationNumber = ((Long) value);
    }
    public MediaObject getMediaObject() {
        return mediaObject;
    }
    public void setMediaObject(MediaObject value) {
        mediaObject = ((MediaObjectImpl) value);
    }
    public EquationSource getEquationSource() {
        return equationSource;
    }
    public void setEquationSource(EquationSource value) {
        equationSource = ((EquationSourceImpl) value);
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
            if (name.equals("EquationNumber")) {
                setEquationNumber(XppUtils.getElementValueAsLongFromNode(parser));
            } else if (name.equals("MediaObject")) {
                MediaObjectImpl node = new MediaObjectImpl();
                node.init(parser);
                setMediaObject(node);
            } else if (name.equals("EquationSource")) {
                EquationSourceImpl node = new EquationSourceImpl();
                node.init(parser);
                setEquationSource(node);
            } else {                // Consume something we don't understand.
                LOG.warning("Found tag that we don't recognize: " + name);
                XppUtils.skipSubTree(parser);
            }
        }
        setID(XppUtils.getAttributeValueFromNode(parser, "ID"));
    }
    @Override
    public void toXml(XmlSerializer serializer) throws IOException {
    }
}
