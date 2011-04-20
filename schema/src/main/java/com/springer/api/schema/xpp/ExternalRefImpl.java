package com.springer.api.schema.xpp;
import java.io.IOException;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

import com.springer.api.schema.ExternalRef;
import com.springer.api.schema.RefSource;
import com.springer.api.schema.RefTarget;
public class ExternalRefImpl extends BaseSchemaEntity implements ExternalRef {
    private final static long serialVersionUID = 2461660169443089969L;
    protected RefSourceImpl refSource;
    protected RefTargetImpl refTarget;
    public RefSourceImpl getRefSource() {
        return refSource;
    }
    public void setRefSource(RefSource value) {
        refSource = ((RefSourceImpl) value);
    }
    public RefTarget getRefTarget() {
        return refTarget;
    }
    public void setRefTarget(RefTarget value) {
        refTarget = ((RefTargetImpl) value);
    }
    @Override
    public void init(XmlPullParser parser) throws IOException, XmlPullParserException {
        parser.require(XmlPullParser.START_TAG, null, null);
        while (parser.nextTag() == XmlPullParser.START_TAG) {
            String name = parser.getName();
            if (name.equals("RefSource")) {
            	RefSourceImpl node = new RefSourceImpl();
            	node.init(parser);
                setRefSource(node);
            } else if (name.equals("RefTarget")) {
                RefTargetImpl node = new RefTargetImpl();
                node.init(parser);
                setRefTarget(node);
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
