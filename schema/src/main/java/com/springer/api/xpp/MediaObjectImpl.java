
package com.springer.api.xpp;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.springer.api.MediaObject;
import com.springer.api.TextObject;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "textObject"
})
@XmlRootElement(name = "MediaObject")
public class MediaObjectImpl
    extends ImageObjectImpl
    implements Serializable, MediaObject
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "TextObject", type = TextObjectImpl.class)
    protected TextObjectImpl textObject;

    public TextObject getTextObject() {
        return textObject;
    }

    public void setTextObject(TextObject value) {
        this.textObject = ((TextObjectImpl) value);
    }

}
