
package com.springer.api.schema.xpp;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import com.springer.api.schema.EquationSource;
import com.springer.api.schema.ImageObject;
import com.springer.api.schema.InlineEquation;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "inlineMediaObject",
    "equationSource"
})
@XmlRootElement(name = "InlineEquation")
public class InlineEquationImpl extends BaseSchemaEntity implements InlineEquation
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "InlineMediaObject", required = true, type = ImageObjectImpl.class)
    protected ImageObjectImpl inlineMediaObject;
    @XmlElement(name = "EquationSource", required = true, type = EquationSourceImpl.class)
    protected EquationSourceImpl equationSource;
    @XmlAttribute(name = "ID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String id;

    public ImageObject getInlineMediaObject() {
        return inlineMediaObject;
    }

    public void setInlineMediaObject(ImageObject value) {
        this.inlineMediaObject = ((ImageObjectImpl) value);
    }

    public EquationSource getEquationSource() {
        return equationSource;
    }

    public void setEquationSource(EquationSource value) {
        this.equationSource = ((EquationSourceImpl) value);
    }

    public String getID() {
        return id;
    }

    public void setID(String value) {
        this.id = value;
    }

}
