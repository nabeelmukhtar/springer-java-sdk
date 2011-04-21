
package com.springer.api.schema.impl;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.springer.api.schema.EditorGroup;
import com.springer.api.schema.EditorGroupElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EditorGroup", propOrder = {
    "editorGroupElement"
})
public class EditorGroupImpl
    implements Serializable, EditorGroup
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "EditorGroupElement", required = true, type = EditorGroupElementImpl.class)
    protected EditorGroupElementImpl editorGroupElement;

    public EditorGroupElement getEditorGroupElement() {
        return editorGroupElement;
    }

    public void setEditorGroupElement(EditorGroupElement value) {
        this.editorGroupElement = ((EditorGroupElementImpl) value);
    }

}
