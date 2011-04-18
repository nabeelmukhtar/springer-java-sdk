package com.springer.api.schema.xpp;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;
import com.springer.api.schema.*;
public class RecordsImpl extends BaseSchemaEntity implements Records {
    private final static long serialVersionUID = 2461660169443089969L;
    protected List<Result> result;
    protected List<Message> message;
    protected List<Record> record;
    public List<Result> getResult() {
        if (result == null) {
            result = new ArrayList<Result>();
        }
        return this.result;
    }
    public void setResult(List<Result> value) {
        this.result = value;
    }
    public List<Message> getMessage() {
        if (message == null) {
            message = new ArrayList<Message>();
        }
        return this.message;
    }
    public void setMessage(List<Message> value) {
        this.message = value;
    }
    public List<Record> getRecord() {
        if (record == null) {
            record = new ArrayList<Record>();
        }
        return this.record;
    }
    public void setRecord(List<Record> value) {
        this.record = value;
    }
    @Override
    public void init(XmlPullParser parser) throws IOException, XmlPullParserException {
        parser.require(XmlPullParser.START_TAG, null, null);
        while (parser.nextTag() == XmlPullParser.START_TAG) {
            String name = parser.getName();
            if (name.equals("##default")) {
                ResultImpl node = new ResultImpl();
                node.init(parser);
                getResult().add(node);
            } else if (name.equals("##default")) {
                MessageImpl node = new MessageImpl();
                node.init(parser);
                getMessage().add(node);
            } else if (name.equals("##default")) {
                RecordImpl node = new RecordImpl();
                node.init(parser);
                getRecord().add(node);
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
