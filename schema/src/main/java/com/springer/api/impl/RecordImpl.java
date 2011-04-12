
package com.springer.api.impl;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.springer.api.Image;
import com.springer.api.Record;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "image"
})
@XmlRootElement(name = "record")
public class RecordImpl
    implements Serializable, Record
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "Image", required = true, type = ImageImpl.class)
    protected ImageImpl image;

    public Image getImage() {
        return image;
    }

    public void setImage(Image value) {
        this.image = ((ImageImpl) value);
    }

}
