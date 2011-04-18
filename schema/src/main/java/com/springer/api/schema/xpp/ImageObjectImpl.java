
package com.springer.api.schema.xpp;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.springer.api.schema.ImageObject;
import com.springer.api.schema.ImageObjectElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImageObject", propOrder = {
    "imageObjectElement"
})
public class ImageObjectImpl
    implements Serializable, ImageObject
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "ImageObjectElement", required = true, type = ImageObjectElementImpl.class)
    protected ImageObjectElementImpl imageObjectElement;

    public ImageObjectElement getImageObjectElement() {
        return imageObjectElement;
    }

    public void setImageObjectElement(ImageObjectElement value) {
        this.imageObjectElement = ((ImageObjectElementImpl) value);
    }

}
