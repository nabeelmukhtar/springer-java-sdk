package com.springer.api.schema.xpp;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

import com.springer.api.schema.CitationRef;
import com.springer.api.schema.DefinitionList;
import com.springer.api.schema.Emphasis;
import com.springer.api.schema.Equation;
import com.springer.api.schema.ExternalRef;
import com.springer.api.schema.Figure;
import com.springer.api.schema.Footnote;
import com.springer.api.schema.InlineEquation;
import com.springer.api.schema.InternalRef;
import com.springer.api.schema.MediaObject;
import com.springer.api.schema.Para;
import com.springer.api.schema.Subscript;
import com.springer.api.schema.Superscript;
import com.springer.api.schema.Table;
public class ParaImpl extends BaseSchemaEntity implements Para {
    private final static long serialVersionUID = 2461660169443089969L;
    protected List<CitationRef> citationReves;
    protected List<Emphasis> emphasises;
    protected List<ExternalRef> externalReves;
    protected List<Figure> figures;
    protected List<MediaObject> mediaObjects;
    protected List<Superscript> superscripts;
    protected List<Table> tables;
    protected List<DefinitionList> definitionLists;
    protected List<Equation> equations;
    protected List<Footnote> footnotes;
    protected List<InlineEquation> inlineEquations;
    protected List<InternalRef> internalReves;
    protected List<Subscript> subscripts;
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
    public List<ExternalRef> getExternalReves() {
        if (externalReves == null) {
            externalReves = new ArrayList<ExternalRef>();
        }
        return this.externalReves;
    }
    public void setExternalReves(List<ExternalRef> value) {
        this.externalReves = value;
    }
    public List<Figure> getFigures() {
        if (figures == null) {
            figures = new ArrayList<Figure>();
        }
        return this.figures;
    }
    public void setFigures(List<Figure> value) {
        this.figures = value;
    }
    public List<MediaObject> getMediaObjects() {
        if (mediaObjects == null) {
            mediaObjects = new ArrayList<MediaObject>();
        }
        return this.mediaObjects;
    }
    public void setMediaObjects(List<MediaObject> value) {
        this.mediaObjects = value;
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
    public List<Table> getTables() {
        if (tables == null) {
            tables = new ArrayList<Table>();
        }
        return this.tables;
    }
    public void setTables(List<Table> value) {
        this.tables = value;
    }
    public List<DefinitionList> getDefinitionLists() {
        if (definitionLists == null) {
            definitionLists = new ArrayList<DefinitionList>();
        }
        return this.definitionLists;
    }
    public void setDefinitionLists(List<DefinitionList> value) {
        this.definitionLists = value;
    }
    public List<Equation> getEquations() {
        if (equations == null) {
            equations = new ArrayList<Equation>();
        }
        return this.equations;
    }
    public void setEquations(List<Equation> value) {
        this.equations = value;
    }
    public List<Footnote> getFootnotes() {
        if (footnotes == null) {
            footnotes = new ArrayList<Footnote>();
        }
        return this.footnotes;
    }
    public void setFootnotes(List<Footnote> value) {
        this.footnotes = value;
    }
    public List<InlineEquation> getInlineEquations() {
        if (inlineEquations == null) {
            inlineEquations = new ArrayList<InlineEquation>();
        }
        return this.inlineEquations;
    }
    public void setInlineEquations(List<InlineEquation> value) {
        this.inlineEquations = value;
    }
    public List<InternalRef> getInternalReves() {
        if (internalReves == null) {
            internalReves = new ArrayList<InternalRef>();
        }
        return this.internalReves;
    }
    public void setInternalReves(List<InternalRef> value) {
        this.internalReves = value;
    }
    public List<Subscript> getSubscripts() {
        if (subscripts == null) {
            subscripts = new ArrayList<Subscript>();
        }
        return this.subscripts;
    }
    public void setSubscripts(List<Subscript> value) {
        this.subscripts = value;
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
            } else if (name.equals("ExternalRef")) {
                ExternalRefImpl node = new ExternalRefImpl();
                node.init(parser);
                getExternalReves().add(node);
            } else if (name.equals("Figure")) {
                FigureImpl node = new FigureImpl();
                node.init(parser);
                getFigures().add(node);
            } else if (name.equals("MediaObject")) {
                MediaObjectImpl node = new MediaObjectImpl();
                node.init(parser);
                getMediaObjects().add(node);
            } else if (name.equals("Superscript")) {
                SuperscriptImpl node = new SuperscriptImpl();
                node.init(parser);
                getSuperscripts().add(node);
            } else if (name.equals("Table")) {
                TableImpl node = new TableImpl();
                node.init(parser);
                getTables().add(node);
            } else if (name.equals("DefinitionList")) {
                DefinitionListImpl node = new DefinitionListImpl();
                node.init(parser);
                getDefinitionLists().add(node);
            } else if (name.equals("Equation")) {
                EquationImpl node = new EquationImpl();
                node.init(parser);
                getEquations().add(node);
            } else if (name.equals("Footnote")) {
                FootnoteImpl node = new FootnoteImpl();
                node.init(parser);
                getFootnotes().add(node);
            } else if (name.equals("InlineEquation")) {
                InlineEquationImpl node = new InlineEquationImpl();
                node.init(parser);
                getInlineEquations().add(node);
            } else if (name.equals("InternalRef")) {
                InternalRefImpl node = new InternalRefImpl();
                node.init(parser);
                getInternalReves().add(node);
            } else if (name.equals("Subscript")) {
                SubscriptImpl node = new SubscriptImpl();
                node.init(parser);
                getSubscripts().add(node);
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
