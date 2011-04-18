
package com.springer.api.schema.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.springer.api.schema.Image;
import com.springer.api.schema.Images;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "images"
})
@XmlRootElement(name = "Images")
public class ImagesImpl
    implements Serializable, Images
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "Image", type = ImageImpl.class)
    protected List<Image> images;

    public List<Image> getImages() {
        if (images == null) {
            images = new ArrayList<Image>();
        }
        return this.images;
    }

}
