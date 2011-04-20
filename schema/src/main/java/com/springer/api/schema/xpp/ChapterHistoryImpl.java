package com.springer.api.schema.xpp;
import java.io.IOException;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

import com.springer.api.schema.ChapterHistory;
import com.springer.api.schema.OnlineDate;
import com.springer.api.schema.RegistrationDate;
public class ChapterHistoryImpl extends BaseSchemaEntity implements ChapterHistory {
    private final static long serialVersionUID = 2461660169443089969L;
    protected RegistrationDateImpl registrationDate;
    protected OnlineDateImpl onlineDate;
    public RegistrationDate getRegistrationDate() {
        return registrationDate;
    }
    public void setRegistrationDate(RegistrationDate value) {
        registrationDate = ((RegistrationDateImpl) value);
    }
    public OnlineDate getOnlineDate() {
        return onlineDate;
    }
    public void setOnlineDate(OnlineDate value) {
        onlineDate = ((OnlineDateImpl) value);
    }
    @Override
    public void init(XmlPullParser parser) throws IOException, XmlPullParserException {
        parser.require(XmlPullParser.START_TAG, null, null);
        while (parser.nextTag() == XmlPullParser.START_TAG) {
            String name = parser.getName();
            if (name.equals("RegistrationDate")) {
                RegistrationDateImpl node = new RegistrationDateImpl();
                node.init(parser);
                setRegistrationDate(node);
            } else if (name.equals("OnlineDate")) {
                OnlineDateImpl node = new OnlineDateImpl();
                node.init(parser);
                setOnlineDate(node);
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
