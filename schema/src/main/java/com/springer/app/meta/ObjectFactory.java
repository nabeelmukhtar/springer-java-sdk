/*
 * Copyright 2010-2011 Nabeel Mukhtar 
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); 
 * you may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at 
 * 
 *  http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
 * See the License for the specific language governing permissions and
 * limitations under the License. 
 * 
 */

package com.springer.app.meta;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * A factory for creating Object objects.
 */
@XmlRegistry
public class ObjectFactory {

    /** The Constant _OrgName_QNAME. */
    private final static QName _OrgName_QNAME = new QName("http://www.springer.com/app/meta", "OrgName");
    
    /** The Constant _Type_QNAME. */
    private final static QName _Type_QNAME = new QName("http://www.springer.com/app/meta", "Type");
    
    /** The Constant _PublicationType_QNAME. */
    private final static QName _PublicationType_QNAME = new QName("http://www.springer.com/app/meta", "PublicationType");
    
    /** The Constant _GeoOrg_QNAME. */
    private final static QName _GeoOrg_QNAME = new QName("http://www.springer.com/app/meta", "GeoOrg");
    
    /** The Constant _DOI_QNAME. */
    private final static QName _DOI_QNAME = new QName("http://www.springer.com/app/meta", "DOI");
    
    /** The Constant _Journal_QNAME. */
    private final static QName _Journal_QNAME = new QName("http://www.springer.com/app/meta", "Journal");
    
    /** The Constant _PubName_QNAME. */
    private final static QName _PubName_QNAME = new QName("http://www.springer.com/app/meta", "PubName");
    
    /** The Constant _ArticleFirstPage_QNAME. */
    private final static QName _ArticleFirstPage_QNAME = new QName("http://www.springer.com/app/meta", "ArticleFirstPage");
    
    /** The Constant _Author_QNAME. */
    private final static QName _Author_QNAME = new QName("http://www.springer.com/app/meta", "Author");
    
    /** The Constant _ISXN_QNAME. */
    private final static QName _ISXN_QNAME = new QName("http://www.springer.com/app/meta", "ISXN");
    
    /** The Constant _Country_QNAME. */
    private final static QName _Country_QNAME = new QName("http://www.springer.com/app/meta", "Country");
    
    /** The Constant _DateLoaded_QNAME. */
    private final static QName _DateLoaded_QNAME = new QName("http://www.springer.com/app/meta", "DateLoaded");
    
    /** The Constant _Publication_QNAME. */
    private final static QName _Publication_QNAME = new QName("http://www.springer.com/app/meta", "Publication");
    
    /** The Constant _Date_QNAME. */
    private final static QName _Date_QNAME = new QName("http://www.springer.com/app/meta", "Date");

    /**
     * Instantiates a new object factory.
     */
    public ObjectFactory() {
    }

    /**
     * Creates a new Object object.
     * 
     * @return the title
     */
    public Title createTitle() {
        return new Title();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the subject group
     */
    public SubjectGroup createSubjectGroup() {
        return new SubjectGroup();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the info
     */
    public Info createInfo() {
        return new Info();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the authors
     */
    public Authors createAuthors() {
        return new Authors();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the subject
     */
    public Subject createSubject() {
        return new Subject();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the institution
     */
    public Institution createInstitution() {
        return new Institution();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the institutions
     */
    public Institutions createInstitutions() {
        return new Institutions();
    }

    /**
     * Creates a new Object object.
     * 
     * @param value the value
     * 
     * @return the JAXB element< string>
     */
    @XmlElementDecl(namespace = "http://www.springer.com/app/meta", name = "OrgName")
    public JAXBElement<String> createOrgName(String value) {
        return new JAXBElement<String>(_OrgName_QNAME, String.class, null, value);
    }

    /**
     * Creates a new Object object.
     * 
     * @param value the value
     * 
     * @return the JAXB element< string>
     */
    @XmlElementDecl(namespace = "http://www.springer.com/app/meta", name = "Type")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createType(String value) {
        return new JAXBElement<String>(_Type_QNAME, String.class, null, value);
    }

    /**
     * Creates a new Object object.
     * 
     * @param value the value
     * 
     * @return the JAXB element< string>
     */
    @XmlElementDecl(namespace = "http://www.springer.com/app/meta", name = "PublicationType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createPublicationType(String value) {
        return new JAXBElement<String>(_PublicationType_QNAME, String.class, null, value);
    }

    /**
     * Creates a new Object object.
     * 
     * @param value the value
     * 
     * @return the JAXB element< string>
     */
    @XmlElementDecl(namespace = "http://www.springer.com/app/meta", name = "GeoOrg")
    public JAXBElement<String> createGeoOrg(String value) {
        return new JAXBElement<String>(_GeoOrg_QNAME, String.class, null, value);
    }

    /**
     * Creates a new Object object.
     * 
     * @param value the value
     * 
     * @return the JAXB element< string>
     */
    @XmlElementDecl(namespace = "http://www.springer.com/app/meta", name = "DOI")
    public JAXBElement<String> createDOI(String value) {
        return new JAXBElement<String>(_DOI_QNAME, String.class, null, value);
    }

    /**
     * Creates a new Object object.
     * 
     * @param value the value
     * 
     * @return the JAXB element< string>
     */
    @XmlElementDecl(namespace = "http://www.springer.com/app/meta", name = "Journal")
    public JAXBElement<String> createJournal(String value) {
        return new JAXBElement<String>(_Journal_QNAME, String.class, null, value);
    }

    /**
     * Creates a new Object object.
     * 
     * @param value the value
     * 
     * @return the JAXB element< string>
     */
    @XmlElementDecl(namespace = "http://www.springer.com/app/meta", name = "PubName")
    public JAXBElement<String> createPubName(String value) {
        return new JAXBElement<String>(_PubName_QNAME, String.class, null, value);
    }

    /**
     * Creates a new Object object.
     * 
     * @param value the value
     * 
     * @return the JAXB element< string>
     */
    @XmlElementDecl(namespace = "http://www.springer.com/app/meta", name = "ArticleFirstPage")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createArticleFirstPage(String value) {
        return new JAXBElement<String>(_ArticleFirstPage_QNAME, String.class, null, value);
    }

    /**
     * Creates a new Object object.
     * 
     * @param value the value
     * 
     * @return the JAXB element< string>
     */
    @XmlElementDecl(namespace = "http://www.springer.com/app/meta", name = "Author")
    public JAXBElement<String> createAuthor(String value) {
        return new JAXBElement<String>(_Author_QNAME, String.class, null, value);
    }

    /**
     * Creates a new Object object.
     * 
     * @param value the value
     * 
     * @return the JAXB element< string>
     */
    @XmlElementDecl(namespace = "http://www.springer.com/app/meta", name = "ISXN")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createISXN(String value) {
        return new JAXBElement<String>(_ISXN_QNAME, String.class, null, value);
    }

    /**
     * Creates a new Object object.
     * 
     * @param value the value
     * 
     * @return the JAXB element< string>
     */
    @XmlElementDecl(namespace = "http://www.springer.com/app/meta", name = "Country")
    public JAXBElement<String> createCountry(String value) {
        return new JAXBElement<String>(_Country_QNAME, String.class, null, value);
    }

    /**
     * Creates a new Object object.
     * 
     * @param value the value
     * 
     * @return the JAXB element< xml gregorian calendar>
     */
    @XmlElementDecl(namespace = "http://www.springer.com/app/meta", name = "DateLoaded")
    public JAXBElement<XMLGregorianCalendar> createDateLoaded(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DateLoaded_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Creates a new Object object.
     * 
     * @param value the value
     * 
     * @return the JAXB element< string>
     */
    @XmlElementDecl(namespace = "http://www.springer.com/app/meta", name = "Publication")
    public JAXBElement<String> createPublication(String value) {
        return new JAXBElement<String>(_Publication_QNAME, String.class, null, value);
    }

    /**
     * Creates a new Object object.
     * 
     * @param value the value
     * 
     * @return the JAXB element< string>
     */
    @XmlElementDecl(namespace = "http://www.springer.com/app/meta", name = "Date")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createDate(String value) {
        return new JAXBElement<String>(_Date_QNAME, String.class, null, value);
    }

}
