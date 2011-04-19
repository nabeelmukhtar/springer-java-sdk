
package com.springer.app.meta;

import java.util.Date;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;
import com.springer.app.meta.impl.AuthorsImpl;
import com.springer.app.meta.impl.InfoImpl;
import com.springer.app.meta.impl.InstitutionImpl;
import com.springer.app.meta.impl.InstitutionsImpl;
import com.springer.app.meta.impl.SubjectGroupImpl;
import com.springer.app.meta.impl.SubjectImpl;
import com.springer.app.meta.impl.TitleImpl;
import org.w3._2001.xmlschema.Adapter1;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.springer.app.meta package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static Void _useJAXBProperties = null;
    private final static QName _OrgName_QNAME = new QName("http://www.springer.com/app/meta", "OrgName");
    private final static QName _Type_QNAME = new QName("http://www.springer.com/app/meta", "Type");
    private final static QName _PublicationType_QNAME = new QName("http://www.springer.com/app/meta", "PublicationType");
    private final static QName _GeoOrg_QNAME = new QName("http://www.springer.com/app/meta", "GeoOrg");
    private final static QName _DOI_QNAME = new QName("http://www.springer.com/app/meta", "DOI");
    private final static QName _Journal_QNAME = new QName("http://www.springer.com/app/meta", "Journal");
    private final static QName _PubName_QNAME = new QName("http://www.springer.com/app/meta", "PubName");
    private final static QName _ArticleFirstPage_QNAME = new QName("http://www.springer.com/app/meta", "ArticleFirstPage");
    private final static QName _Author_QNAME = new QName("http://www.springer.com/app/meta", "Author");
    private final static QName _ISXN_QNAME = new QName("http://www.springer.com/app/meta", "ISXN");
    private final static QName _Country_QNAME = new QName("http://www.springer.com/app/meta", "Country");
    private final static QName _DateLoaded_QNAME = new QName("http://www.springer.com/app/meta", "DateLoaded");
    private final static QName _Publication_QNAME = new QName("http://www.springer.com/app/meta", "Publication");
    private final static QName _Date_QNAME = new QName("http://www.springer.com/app/meta", "Date");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.springer.app.meta
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Institutions }
     * 
     */
    public Institutions createInstitutions() {
        return new InstitutionsImpl();
    }

    /**
     * Create an instance of {@link SubjectGroup }
     * 
     */
    public SubjectGroup createSubjectGroup() {
        return new SubjectGroupImpl();
    }

    /**
     * Create an instance of {@link Institution }
     * 
     */
    public Institution createInstitution() {
        return new InstitutionImpl();
    }

    /**
     * Create an instance of {@link Authors }
     * 
     */
    public Authors createAuthors() {
        return new AuthorsImpl();
    }

    /**
     * Create an instance of {@link Info }
     * 
     */
    public Info createInfo() {
        return new InfoImpl();
    }

    /**
     * Create an instance of {@link Subject }
     * 
     */
    public Subject createSubject() {
        return new SubjectImpl();
    }

    /**
     * Create an instance of {@link Title }
     * 
     */
    public Title createTitle() {
        return new TitleImpl();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.springer.com/app/meta", name = "OrgName")
    public JAXBElement<String> createOrgName(String value) {
        return new JAXBElement<String>(_OrgName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.springer.com/app/meta", name = "Type")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createType(String value) {
        return new JAXBElement<String>(_Type_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.springer.com/app/meta", name = "PublicationType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createPublicationType(String value) {
        return new JAXBElement<String>(_PublicationType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.springer.com/app/meta", name = "GeoOrg")
    public JAXBElement<String> createGeoOrg(String value) {
        return new JAXBElement<String>(_GeoOrg_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.springer.com/app/meta", name = "DOI")
    public JAXBElement<String> createDOI(String value) {
        return new JAXBElement<String>(_DOI_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.springer.com/app/meta", name = "Journal")
    public JAXBElement<String> createJournal(String value) {
        return new JAXBElement<String>(_Journal_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.springer.com/app/meta", name = "PubName")
    public JAXBElement<String> createPubName(String value) {
        return new JAXBElement<String>(_PubName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.springer.com/app/meta", name = "ArticleFirstPage")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createArticleFirstPage(String value) {
        return new JAXBElement<String>(_ArticleFirstPage_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.springer.com/app/meta", name = "Author")
    public JAXBElement<String> createAuthor(String value) {
        return new JAXBElement<String>(_Author_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.springer.com/app/meta", name = "ISXN")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createISXN(String value) {
        return new JAXBElement<String>(_ISXN_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.springer.com/app/meta", name = "Country")
    public JAXBElement<String> createCountry(String value) {
        return new JAXBElement<String>(_Country_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Date }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.springer.com/app/meta", name = "DateLoaded")
    @XmlJavaTypeAdapter(Adapter1 .class)
    public JAXBElement<Date> createDateLoaded(Date value) {
        return new JAXBElement<Date>(_DateLoaded_QNAME, Date.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.springer.com/app/meta", name = "Publication")
    public JAXBElement<String> createPublication(String value) {
        return new JAXBElement<String>(_Publication_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.springer.com/app/meta", name = "Date")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createDate(String value) {
        return new JAXBElement<String>(_Date_QNAME, String.class, null, value);
    }

}
