package com.springer.api.schema.xpp;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.prismstandard.namespaces.pam._2.Message;
import org.prismstandard.namespaces.pam._2.xpp.MessageImpl;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

import com.springer.api.schema.Record;
import com.springer.api.schema.Records;
import com.springer.api.schema.Result;
public class RecordsImpl extends BaseSchemaEntity implements Records {
    private final static long serialVersionUID = 2461660169443089969L;
    protected List<Result> results;
    protected List<Message> messages;
    protected List<Record> records;
    public List<Result> getResults() {
        if (results == null) {
            results = new ArrayList<Result>();
        }
        return this.results;
    }
    public void setResults(List<Result> value) {
        this.results = value;
    }
    public List<Message> getMessages() {
        if (messages == null) {
            messages = new ArrayList<Message>();
        }
        return this.messages;
    }
    public void setMessages(List<Message> value) {
        this.messages = value;
    }
    public List<Record> getRecords() {
        if (records == null) {
            records = new ArrayList<Record>();
        }
        return this.records;
    }
    public void setRecords(List<Record> value) {
        this.records = value;
    }
    @Override
    public void init(XmlPullParser parser) throws IOException, XmlPullParserException {
        parser.require(XmlPullParser.START_TAG, null, null);
        while (parser.nextTag() == XmlPullParser.START_TAG) {
            String name = parser.getName();
            if (name.equals("result")) {
                ResultImpl node = new ResultImpl();
                node.init(parser);
                getResults().add(node);
            } else if (name.equals("message")) {
                MessageImpl node = new MessageImpl();
                node.init(parser);
                getMessages().add(node);
            } else if (name.equals("record")) {
                RecordImpl node = new RecordImpl();
                node.init(parser);
                getRecords().add(node);
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
