
package com.springer.app.meta.xpp;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.springer.app.meta.Institution;
import com.springer.app.meta.Institutions;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "institution"
})
@XmlRootElement(name = "Institutions")
public class InstitutionsImpl
    extends BaseSchemaEntity implements Institutions
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "Institution", type = InstitutionImpl.class)
    protected List<Institution> institution;

    public List<Institution> getInstitution() {
        if (institution == null) {
            institution = new ArrayList<Institution>();
        }
        return this.institution;
    }

}
