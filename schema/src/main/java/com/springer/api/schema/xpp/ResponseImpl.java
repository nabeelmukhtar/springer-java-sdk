package com.springer.api.schema.xpp;
import java.io.IOException;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

import com.springer.api.schema.Facets;
import com.springer.api.schema.Records;
import com.springer.api.schema.Response;
import com.springer.api.schema.Result;
public class ResponseImpl extends BaseSchemaEntity implements Response {
    private final static long serialVersionUID = 2461660169443089969L;
    protected String query;
    protected String apiKey;
    protected ResultImpl result;
    protected RecordsImpl records;
    protected FacetsImpl facets;
    public String getQuery() {
        return query;
    }
    public void setQuery(String value) {
        query = ((String) value);
    }
    public String getApiKey() {
        return apiKey;
    }
    public void setApiKey(String value) {
        apiKey = ((String) value);
    }
    public Result getResult() {
        return result;
    }
    public void setResult(Result value) {
        result = ((ResultImpl) value);
    }
    public Records getRecords() {
        return records;
    }
    public void setRecords(Records value) {
        records = ((RecordsImpl) value);
    }
    public Facets getFacets() {
        return facets;
    }
    public void setFacets(Facets value) {
        facets = ((FacetsImpl) value);
    }
    @Override
    public void init(XmlPullParser parser) throws IOException, XmlPullParserException {
        parser.require(XmlPullParser.START_TAG, null, null);
        while (parser.nextTag() == XmlPullParser.START_TAG) {
            String name = parser.getName();
            if (name.equals("query")) {
                setQuery(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("apiKey")) {
                setApiKey(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("result")) {
                ResultImpl node = new ResultImpl();
                node.init(parser);
                setResult(node);
            } else if (name.equals("records")) {
                RecordsImpl node = new RecordsImpl();
                node.init(parser);
                setRecords(node);
            } else if (name.equals("facets")) {
                FacetsImpl node = new FacetsImpl();
                node.init(parser);
                setFacets(node);
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
