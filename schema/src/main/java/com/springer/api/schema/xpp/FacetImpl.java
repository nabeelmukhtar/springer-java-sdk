package com.springer.api.schema.xpp;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

import com.springer.api.schema.Facet;
import com.springer.api.schema.FacetValue;
public class FacetImpl extends BaseSchemaEntity implements Facet {
    private final static long serialVersionUID = 2461660169443089969L;
    protected List<FacetValue> facetValues;
    protected String name;
    public List<FacetValue> getFacetValues() {
        if (facetValues == null) {
            facetValues = new ArrayList<FacetValue>();
        }
        return this.facetValues;
    }
    public void setFacetValues(List<FacetValue> value) {
        this.facetValues = value;
    }
    public String getName() {
        return name;
    }
    public void setName(String value) {
        name = ((String) value);
    }
    @Override
    public void init(XmlPullParser parser) throws IOException, XmlPullParserException {
        parser.require(XmlPullParser.START_TAG, null, null);
        while (parser.nextTag() == XmlPullParser.START_TAG) {
            String name = parser.getName();
            if (name.equals("facet-value")) {
                FacetValueImpl node = new FacetValueImpl();
                node.init(parser);
                getFacetValues().add(node);
            } else {                // Consume something we don't understand.
                LOG.warning("Found tag that we don't recognize: " + name);
                XppUtils.skipSubTree(parser);
            }
        }
        setName(XppUtils.getAttributeValueFromNode(parser, "name"));
    }
    @Override
    public void toXml(XmlSerializer serializer) throws IOException {
    }
}
