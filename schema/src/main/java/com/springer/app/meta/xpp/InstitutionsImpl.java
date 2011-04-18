package com.springer.app.meta.xpp;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

import com.springer.api.schema.xpp.BaseSchemaEntity;
import com.springer.api.schema.xpp.XppUtils;
import com.springer.app.meta.Institution;
import com.springer.app.meta.Institutions;
public class InstitutionsImpl extends BaseSchemaEntity implements Institutions {
    private final static long serialVersionUID = 2461660169443089969L;
    protected List<Institution> institution;
    public List<Institution> getInstitution() {
        if (institution == null) {
            institution = new ArrayList<Institution>();
        }
        return this.institution;
    }
    public void setInstitution(List<Institution> value) {
        this.institution = value;
    }
    @Override
    public void init(XmlPullParser parser) throws IOException, XmlPullParserException {
        parser.require(XmlPullParser.START_TAG, null, null);
        while (parser.nextTag() == XmlPullParser.START_TAG) {
            String name = parser.getName();
            if (name.equals("Institution")) {
                InstitutionImpl node = new InstitutionImpl();
                node.init(parser);
                getInstitution().add(node);
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
