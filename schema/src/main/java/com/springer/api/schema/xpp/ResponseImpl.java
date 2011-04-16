
package com.springer.api.schema.xpp;

import java.io.IOException;
import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

import com.springer.api.schema.Facets;
import com.springer.api.schema.Records;
import com.springer.api.schema.Response;
import com.springer.api.schema.Result;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "query",
    "apiKey",
    "result",
    "records",
    "facets"
})
@XmlRootElement(name = "response")
public class ResponseImpl
    extends BaseSchemaEntity implements Response
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String query;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String apiKey;
    @XmlElement(required = true, type = ResultImpl.class)
    protected ResultImpl result;
    @XmlElement(required = true, type = RecordsImpl.class)
    protected RecordsImpl records;
    @XmlElement(required = true, type = FacetsImpl.class)
    protected FacetsImpl facets;

    public String getQuery() {
        return query;
    }

    public void setQuery(String value) {
        this.query = value;
    }

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String value) {
        this.apiKey = value;
    }

    public Result getResult() {
        return result;
    }

    public void setResult(Result value) {
        this.result = ((ResultImpl) value);
    }

    public Records getRecords() {
        return records;
    }

    public void setRecords(Records value) {
        this.records = ((RecordsImpl) value);
    }

    public Facets getFacets() {
        return facets;
    }

    public void setFacets(Facets value) {
        this.facets = ((FacetsImpl) value);
    }

	@Override
	public void init(XmlPullParser parser) throws IOException, XmlPullParserException {
        parser.require(XmlPullParser.START_TAG, null, null);

        while (parser.nextTag() == XmlPullParser.START_TAG) {
        	String name = parser.getName();
        	
        	if (name.equals("code")) {
        		setCode(XppUtils.getElementValueFromNode(parser));
            } else {
                // Consume something we don't understand.
            	LOG.warning("Found tag that we don't recognize: " + name);
            	XppUtils.skipSubTree(parser);
            }
        }
	}

	@Override
	public void toXml(XmlSerializer serializer) throws IOException {
		XmlSerializer element = serializer.startTag(null, "action");
		XppUtils.setElementValueToNode(element, "code", getCode());
		element.endTag(null, "action");;
	}
}
