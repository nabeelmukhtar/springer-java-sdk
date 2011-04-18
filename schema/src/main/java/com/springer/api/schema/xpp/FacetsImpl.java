package com.springer.api.schema.xpp;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

import com.springer.api.schema.Facet;
import com.springer.api.schema.Facets;
public class FacetsImpl extends BaseSchemaEntity implements Facets {
    private final static long serialVersionUID = 2461660169443089969L;
    protected List<Facet> facets;
    public List<Facet> getFacets() {
        if (facets == null) {
            facets = new ArrayList<Facet>();
        }
        return this.facets;
    }
    public void setFacets(List<Facet> value) {
        this.facets = value;
    }
    @Override
    public void init(XmlPullParser parser) throws IOException, XmlPullParserException {
        parser.require(XmlPullParser.START_TAG, null, null);
        while (parser.nextTag() == XmlPullParser.START_TAG) {
            String name = parser.getName();
            if (name.equals("facet")) {
                FacetImpl node = new FacetImpl();
                node.init(parser);
                getFacets().add(node);
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
