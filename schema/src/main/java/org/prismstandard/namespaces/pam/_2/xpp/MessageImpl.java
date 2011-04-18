package org.prismstandard.namespaces.pam._2.xpp;
import java.io.IOException;

import org.prismstandard.namespaces.pam._2.Message;
import org.w3._1999.xhtml.Body;
import org.w3._1999.xhtml.Head;
import org.w3._1999.xhtml.xpp.BodyImpl;
import org.w3._1999.xhtml.xpp.HeadImpl;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

import com.springer.api.schema.xpp.BaseSchemaEntity;
import com.springer.api.schema.xpp.XppUtils;
public class MessageImpl extends BaseSchemaEntity implements Message {
    private final static long serialVersionUID = 2461660169443089969L;
    protected HeadImpl head;
    protected BodyImpl body;
    public Head getHead() {
        return head;
    }
    public void setHead(Head value) {
        head = ((HeadImpl) value);
    }
    public Body getBody() {
        return body;
    }
    public void setBody(Body value) {
        body = ((BodyImpl) value);
    }
    @Override
    public void init(XmlPullParser parser) throws IOException, XmlPullParserException {
        parser.require(XmlPullParser.START_TAG, null, null);
        while (parser.nextTag() == XmlPullParser.START_TAG) {
            String name = parser.getName();
            if (name.equals("##default")) {
                setHead(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("##default")) {
                setBody(XppUtils.getElementValueFromNode(parser));
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
