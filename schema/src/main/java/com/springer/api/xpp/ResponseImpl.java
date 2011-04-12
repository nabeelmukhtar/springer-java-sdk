
package com.springer.api.xpp;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import com.springer.api.Facets;
import com.springer.api.Records;
import com.springer.api.Response;
import com.springer.api.Result;

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
    implements Serializable, Response
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

}
