
package com.springer.api.schema.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.springer.api.schema.DefinitionList;
import com.springer.api.schema.DefinitionListEntry;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "definitionListEntries"
})
@XmlRootElement(name = "DefinitionList")
public class DefinitionListImpl implements Serializable, DefinitionList
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "DefinitionListEntry", required = true, type = DefinitionListEntryImpl.class)
    protected List<DefinitionListEntry> definitionListEntries;

    public List<DefinitionListEntry> getDefinitionListEntries() {
        if (definitionListEntries == null) {
            definitionListEntries = new ArrayList<DefinitionListEntry>();
        }
        return this.definitionListEntries;
    }

}
