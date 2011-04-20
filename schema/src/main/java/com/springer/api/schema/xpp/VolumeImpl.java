package com.springer.api.schema.xpp;
import java.io.IOException;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

import com.springer.api.schema.Issue;
import com.springer.api.schema.Volume;
import com.springer.api.schema.VolumeInfo;
public class VolumeImpl extends BaseSchemaEntity implements Volume {
    private final static long serialVersionUID = 2461660169443089969L;
    protected VolumeInfoImpl volumeInfo;
    protected IssueImpl issue;
    protected String outputMedium;
    public VolumeInfo getVolumeInfo() {
        return volumeInfo;
    }
    public void setVolumeInfo(VolumeInfo value) {
        volumeInfo = ((VolumeInfoImpl) value);
    }
    public Issue getIssue() {
        return issue;
    }
    public void setIssue(Issue value) {
        issue = ((IssueImpl) value);
    }
    public String getOutputMedium() {
        return outputMedium;
    }
    public void setOutputMedium(String value) {
        outputMedium = ((String) value);
    }
    @Override
    public void init(XmlPullParser parser) throws IOException, XmlPullParserException {
        parser.require(XmlPullParser.START_TAG, null, null);
        setOutputMedium(XppUtils.getAttributeValueFromNode(parser, "OutputMedium"));
        while (parser.nextTag() == XmlPullParser.START_TAG) {
            String name = parser.getName();
            if (name.equals("VolumeInfo")) {
                VolumeInfoImpl node = new VolumeInfoImpl();
                node.init(parser);
                setVolumeInfo(node);
            } else if (name.equals("Issue")) {
                IssueImpl node = new IssueImpl();
                node.init(parser);
                setIssue(node);
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
