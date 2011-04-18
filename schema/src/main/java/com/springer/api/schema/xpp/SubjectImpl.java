package com.springer.api.schema.xpp;
import java.io.IOException;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

import com.springer.api.schema.Subject;
public class SubjectImpl extends BaseSchemaEntity implements Subject {
    private final static long serialVersionUID = 2461660169443089969L;
    protected String content;
    protected String code;
    protected Long priority;
    protected String type;
    public String getContent() {
        return content;
    }
    public void setContent(String value) {
        content = ((String) value);
    }
    public String getCode() {
        return code;
    }
    public void setCode(String value) {
        code = ((String) value);
    }
    public Long getPriority() {
        return priority;
    }
    public void setPriority(Long value) {
        priority = ((Long) value);
    }
    public String getType() {
        return type;
    }
    public void setType(String value) {
        type = ((String) value);
    }
    @Override
    public void init(XmlPullParser parser) throws IOException, XmlPullParserException {
        parser.require(XmlPullParser.START_TAG, null, null);
        while (parser.nextTag() == XmlPullParser.START_TAG) {
            String name = parser.getName();
        }
        setCode(XppUtils.getAttributeValueFromNode(parser, "Code"));
        setPriority(XppUtils.getAttributeValueAsLongFromNode(parser, "Priority"));
        setType(XppUtils.getAttributeValueFromNode(parser, "Type"));
    }
    @Override
    public void toXml(XmlSerializer serializer) throws IOException {
    }
}
