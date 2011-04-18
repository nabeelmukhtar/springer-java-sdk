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
    protected List<CitationRef> citationRef;
    protected List<Emphasis> emphasis;
    protected List<ExternalRef> externalRef;
    protected List<Figure> figure;
    protected List<MediaObject> mediaObject;
    protected List<Superscript> superscript;
    protected List<Table> table;
    protected List<DefinitionList> definitionList;
    protected List<Equation> equation;
    protected List<Footnote> footnote;
    protected List<InlineEquation> inlineEquation;
    protected List<InternalRef> internalRef;
    protected List<Subscript> subscript;
    public List<CitationRef> getCitationRef() {
        if (citationRef == null) {
            citationRef = new ArrayList<CitationRef>();
        }
        return this.citationRef;
    }
    public void setCitationRef(List<CitationRef> value) {
        this.citationRef = value;
    }
    public List<Emphasis> getEmphasis() {
        if (emphasis == null) {
            emphasis = new ArrayList<Emphasis>();
        }
        return this.emphasis;
    }
    public void setEmphasis(List<Emphasis> value) {
        this.emphasis = value;
    }
    public List<ExternalRef> getExternalRef() {
        if (externalRef == null) {
            externalRef = new ArrayList<ExternalRef>();
        }
        return this.externalRef;
    }
    public void setExternalRef(List<ExternalRef> value) {
        this.externalRef = value;
    }
    public List<Figure> getFigure() {
        if (figure == null) {
            figure = new ArrayList<Figure>();
        }
        return this.figure;
    }
    public void setFigure(List<Figure> value) {
        this.figure = value;
    }
    public List<MediaObject> getMediaObject() {
        if (mediaObject == null) {
            mediaObject = new ArrayList<MediaObject>();
        }
        return this.mediaObject;
    }
    public void setMediaObject(List<MediaObject> value) {
        this.mediaObject = value;
    }
    public List<Superscript> getSuperscript() {
        if (superscript == null) {
            superscript = new ArrayList<Superscript>();
        }
        return this.superscript;
    }
    public void setSuperscript(List<Superscript> value) {
        this.superscript = value;
    }
    public List<Table> getTable() {
        if (table == null) {
            table = new ArrayList<Table>();
        }
        return this.table;
    }
    public void setTable(List<Table> value) {
        this.table = value;
    }
    public List<DefinitionList> getDefinitionList() {
        if (definitionList == null) {
            definitionList = new ArrayList<DefinitionList>();
        }
        return this.definitionList;
    }
    public void setDefinitionList(List<DefinitionList> value) {
        this.definitionList = value;
    }
    public List<Equation> getEquation() {
        if (equation == null) {
            equation = new ArrayList<Equation>();
        }
        return this.equation;
    }
    public void setEquation(List<Equation> value) {
        this.equation = value;
    }
    public List<Footnote> getFootnote() {
        if (footnote == null) {
            footnote = new ArrayList<Footnote>();
        }
        return this.footnote;
    }
    public void setFootnote(List<Footnote> value) {
        this.footnote = value;
    }
    public List<InlineEquation> getInlineEquation() {
        if (inlineEquation == null) {
            inlineEquation = new ArrayList<InlineEquation>();
        }
        return this.inlineEquation;
    }
    public void setInlineEquation(List<InlineEquation> value) {
        this.inlineEquation = value;
    }
    public List<InternalRef> getInternalRef() {
        if (internalRef == null) {
            internalRef = new ArrayList<InternalRef>();
        }
        return this.internalRef;
    }
    public void setInternalRef(List<InternalRef> value) {
        this.internalRef = value;
    }
    public List<Subscript> getSubscript() {
        if (subscript == null) {
            subscript = new ArrayList<Subscript>();
        }
        return this.subscript;
    }
    public void setSubscript(List<Subscript> value) {
        this.subscript = value;
    }
    @Override
    public void init(XmlPullParser parser) throws IOException, XmlPullParserException {
        parser.require(XmlPullParser.START_TAG, null, null);
        while (parser.nextTag() == XmlPullParser.START_TAG) {
            String name = parser.getName();
            if (name.equals("CitationRef")) {
                CitationRefImpl node = new CitationRefImpl();
                node.init(parser);
                getCitationRef().add(node);
            } else if (name.equals("Emphasis")) {
                EmphasisImpl node = new EmphasisImpl();
                node.init(parser);
                getEmphasis().add(node);
            } else if (name.equals("ExternalRef")) {
                ExternalRefImpl node = new ExternalRefImpl();
                node.init(parser);
                getExternalRef().add(node);
            } else if (name.equals("Figure")) {
                FigureImpl node = new FigureImpl();
                node.init(parser);
                getFigure().add(node);
            } else if (name.equals("MediaObject")) {
                MediaObjectImpl node = new MediaObjectImpl();
                node.init(parser);
                getMediaObject().add(node);
            } else if (name.equals("Superscript")) {
                SuperscriptImpl node = new SuperscriptImpl();
                node.init(parser);
                getSuperscript().add(node);
            } else if (name.equals("Table")) {
                TableImpl node = new TableImpl();
                node.init(parser);
                getTable().add(node);
            } else if (name.equals("DefinitionList")) {
                DefinitionListImpl node = new DefinitionListImpl();
                node.init(parser);
                getDefinitionList().add(node);
            } else if (name.equals("Equation")) {
                EquationImpl node = new EquationImpl();
                node.init(parser);
                getEquation().add(node);
            } else if (name.equals("Footnote")) {
                FootnoteImpl node = new FootnoteImpl();
                node.init(parser);
                getFootnote().add(node);
            } else if (name.equals("InlineEquation")) {
                InlineEquationImpl node = new InlineEquationImpl();
                node.init(parser);
                getInlineEquation().add(node);
            } else if (name.equals("InternalRef")) {
                InternalRefImpl node = new InternalRefImpl();
                node.init(parser);
                getInternalRef().add(node);
            } else if (name.equals("Subscript")) {
                SubscriptImpl node = new SubscriptImpl();
                node.init(parser);
                getSubscript().add(node);
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
