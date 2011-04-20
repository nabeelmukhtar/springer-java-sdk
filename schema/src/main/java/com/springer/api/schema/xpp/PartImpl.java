package com.springer.api.schema.xpp;
import java.io.IOException;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

import com.springer.api.schema.Chapter;
import com.springer.api.schema.Part;
import com.springer.api.schema.PartInfo;
public class PartImpl extends BaseSchemaEntity implements Part {
    private final static long serialVersionUID = 2461660169443089969L;
    protected PartInfoImpl partInfo;
    protected ChapterImpl chapter;
    protected String id;
    public PartInfo getPartInfo() {
        return partInfo;
    }
    public void setPartInfo(PartInfo value) {
        partInfo = ((PartInfoImpl) value);
    }
    public Chapter getChapter() {
        return chapter;
    }
    public void setChapter(Chapter value) {
        chapter = ((ChapterImpl) value);
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
        setID(XppUtils.getAttributeValueFromNode(parser, "ID"));
        while (parser.nextTag() == XmlPullParser.START_TAG) {
            String name = parser.getName();
            if (name.equals("PartInfo")) {
                PartInfoImpl node = new PartInfoImpl();
                node.init(parser);
                setPartInfo(node);
            } else if (name.equals("Chapter")) {
                ChapterImpl node = new ChapterImpl();
                node.init(parser);
                setChapter(node);
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
