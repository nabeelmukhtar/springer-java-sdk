
package com.springer.api.schema.xpp;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import com.springer.api.schema.File;
import com.springer.api.schema.Path;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "color",
    "format",
    "path",
    "type"
})
@XmlRootElement(name = "File")
public class FileImpl implements Serializable, File
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "Color")
    protected Boolean color;
    @XmlElement(name = "Format")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String format;
    @XmlElement(name = "Path", required = true, type = PathImpl.class)
    protected List<Path> path;
    @XmlElement(name = "Type")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String type;

    public Boolean isColor() {
        return color;
    }

    public void setColor(Boolean value) {
        this.color = value;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String value) {
        this.format = value;
    }

    public List<Path> getPath() {
        if (path == null) {
            path = new ArrayList<Path>();
        }
        return this.path;
    }

    public String getType() {
        return type;
    }

    public void setType(String value) {
        this.type = value;
    }

}
