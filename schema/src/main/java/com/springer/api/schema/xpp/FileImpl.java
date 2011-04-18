package com.springer.api.schema.xpp;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

import com.springer.api.schema.File;
import com.springer.api.schema.Path;
public class FileImpl extends BaseSchemaEntity implements File {
    private final static long serialVersionUID = 2461660169443089969L;
    protected Boolean color;
    protected String format;
    protected List<Path> path;
    protected String type;
    public Boolean getColor() {
        return color;
    }
    public void setColor(Boolean value) {
        color = ((Boolean) value);
    }
    public String getFormat() {
        return format;
    }
    public void setFormat(String value) {
        format = ((String) value);
    }
    public List<Path> getPath() {
        if (path == null) {
            path = new ArrayList<Path>();
        }
        return this.path;
    }
    public void setPath(List<Path> value) {
        this.path = value;
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
            if (name.equals("Color")) {
                setColor(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("Format")) {
                setFormat(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("Path")) {
                PathImpl node = new PathImpl();
                node.init(parser);
                getPath().add(node);
            } else if (name.equals("Type")) {
                setType(XppUtils.getElementValueFromNode(parser));
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
