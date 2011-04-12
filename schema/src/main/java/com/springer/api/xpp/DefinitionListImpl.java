
package com.springer.api.xpp;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.springer.api.DefinitionList;
import com.springer.api.DefinitionListEntry;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "definitionListEntry"
})
@XmlRootElement(name = "DefinitionList")
public class DefinitionListImpl implements Serializable, DefinitionList
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "DefinitionListEntry", required = true, type = DefinitionListEntryImpl.class)
    protected List<DefinitionListEntry> definitionListEntry;

    public List<DefinitionListEntry> getDefinitionListEntry() {
        if (definitionListEntry == null) {
            definitionListEntry = new ArrayList<DefinitionListEntry>();
        }
        return this.definitionListEntry;
    }

}
