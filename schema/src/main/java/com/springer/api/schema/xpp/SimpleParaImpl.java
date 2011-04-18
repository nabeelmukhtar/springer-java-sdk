package com.springer.api.schema.xpp;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

import com.springer.api.schema.CitationRef;
import com.springer.api.schema.Emphasis;
import com.springer.api.schema.SimplePara;
import com.springer.api.schema.Superscript;
public class SimpleParaImpl extends BaseSchemaEntity implements SimplePara {
    private final static long serialVersionUID = 2461660169443089969L;
    protected List<CitationRef> citationReves;
    protected List<Emphasis> emphasises;
    protected List<Superscript> superscripts;
    public List<CitationRef> getCitationReves() {
        if (citationReves == null) {
            citationReves = new ArrayList<CitationRef>();
        }
        return this.citationReves;
    }
    public void setCitationReves(List<CitationRef> value) {
        this.citationReves = value;
    }
    public List<Emphasis> getEmphasises() {
        if (emphasises == null) {
            emphasises = new ArrayList<Emphasis>();
        }
        return this.emphasises;
    }
    public void setEmphasises(List<Emphasis> value) {
        this.emphasises = value;
    }
    public List<Superscript> getSuperscripts() {
        if (superscripts == null) {
            superscripts = new ArrayList<Superscript>();
        }
        return this.superscripts;
    }
    public void setSuperscripts(List<Superscript> value) {
        this.superscripts = value;
    }
    @Override
    public void init(XmlPullParser parser) throws IOException, XmlPullParserException {
        parser.require(XmlPullParser.START_TAG, null, null);
        while (parser.nextTag() == XmlPullParser.START_TAG) {
            String name = parser.getName();
            if (name.equals("CitationRef")) {
                CitationRefImpl node = new CitationRefImpl();
                node.init(parser);
                getCitationReves().add(node);
            } else if (name.equals("Emphasis")) {
                EmphasisImpl node = new EmphasisImpl();
                node.init(parser);
                getEmphasises().add(node);
            } else if (name.equals("Superscript")) {
                SuperscriptImpl node = new SuperscriptImpl();
                node.init(parser);
                getSuperscripts().add(node);
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
