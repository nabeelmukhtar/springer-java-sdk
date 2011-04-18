package com.springer.api.schema.xpp;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

import com.springer.api.schema.BibUnstructured;
import com.springer.api.schema.Emphasis;
import com.springer.api.schema.ExternalRef;
public class BibUnstructuredImpl extends BaseSchemaEntity implements BibUnstructured {
    private final static long serialVersionUID = 2461660169443089969L;
    protected List<Emphasis> emphasises;
    protected List<ExternalRef> externalReves;
    public List<Emphasis> getEmphasises() {
        if (emphasises == null) {
            emphasises = new ArrayList<Emphasis>();
        }
        return this.emphasises;
    }
    public void setEmphasises(List<Emphasis> value) {
        this.emphasises = value;
    }
    public List<ExternalRef> getExternalReves() {
        if (externalReves == null) {
            externalReves = new ArrayList<ExternalRef>();
        }
        return this.externalReves;
    }
    public void setExternalReves(List<ExternalRef> value) {
        this.externalReves = value;
    }
    @Override
    public void init(XmlPullParser parser) throws IOException, XmlPullParserException {
        parser.require(XmlPullParser.START_TAG, null, null);
        while (parser.nextTag() == XmlPullParser.START_TAG) {
            String name = parser.getName();
            if (name.equals("Emphasis")) {
                EmphasisImpl node = new EmphasisImpl();
                node.init(parser);
                getEmphasises().add(node);
            } else if (name.equals("ExternalRef")) {
                ExternalRefImpl node = new ExternalRefImpl();
                node.init(parser);
                getExternalReves().add(node);
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
