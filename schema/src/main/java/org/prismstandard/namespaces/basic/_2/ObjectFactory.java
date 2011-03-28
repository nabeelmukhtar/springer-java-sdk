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

package org.prismstandard.namespaces.basic._2;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;


/**
 * A factory for creating Object objects.
 */
@XmlRegistry
public class ObjectFactory {

    /** The Constant _PublicationName_QNAME. */
    private final static QName _PublicationName_QNAME = new QName("http://prismstandard.org/namespaces/basic/2.0/", "publicationName");
    
    /** The Constant _Url_QNAME. */
    private final static QName _Url_QNAME = new QName("http://prismstandard.org/namespaces/basic/2.0/", "url");
    
    /** The Constant _PublicationDate_QNAME. */
    private final static QName _PublicationDate_QNAME = new QName("http://prismstandard.org/namespaces/basic/2.0/", "publicationDate");
    
    /** The Constant _StartingPage_QNAME. */
    private final static QName _StartingPage_QNAME = new QName("http://prismstandard.org/namespaces/basic/2.0/", "startingPage");
    
    /** The Constant _Copyright_QNAME. */
    private final static QName _Copyright_QNAME = new QName("http://prismstandard.org/namespaces/basic/2.0/", "copyright");
    
    /** The Constant _Isbn_QNAME. */
    private final static QName _Isbn_QNAME = new QName("http://prismstandard.org/namespaces/basic/2.0/", "isbn");
    
    /** The Constant _Issn_QNAME. */
    private final static QName _Issn_QNAME = new QName("http://prismstandard.org/namespaces/basic/2.0/", "issn");
    
    /** The Constant _Doi_QNAME. */
    private final static QName _Doi_QNAME = new QName("http://prismstandard.org/namespaces/basic/2.0/", "doi");

    /**
     * Instantiates a new object factory.
     */
    public ObjectFactory() {
    }

    /**
     * Creates a new Object object.
     * 
     * @return the volume
     */
    public Volume createVolume() {
        return new Volume();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the number
     */
    public Number createNumber() {
        return new Number();
    }

    /**
     * Creates a new Object object.
     * 
     * @param value the value
     * 
     * @return the JAXB element< string>
     */
    @XmlElementDecl(namespace = "http://prismstandard.org/namespaces/basic/2.0/", name = "publicationName")
    public JAXBElement<String> createPublicationName(String value) {
        return new JAXBElement<String>(_PublicationName_QNAME, String.class, null, value);
    }

    /**
     * Creates a new Object object.
     * 
     * @param value the value
     * 
     * @return the JAXB element< string>
     */
    @XmlElementDecl(namespace = "http://prismstandard.org/namespaces/basic/2.0/", name = "url")
    public JAXBElement<String> createUrl(String value) {
        return new JAXBElement<String>(_Url_QNAME, String.class, null, value);
    }

    /**
     * Creates a new Object object.
     * 
     * @param value the value
     * 
     * @return the JAXB element< string>
     */
    @XmlElementDecl(namespace = "http://prismstandard.org/namespaces/basic/2.0/", name = "publicationDate")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createPublicationDate(String value) {
        return new JAXBElement<String>(_PublicationDate_QNAME, String.class, null, value);
    }

    /**
     * Creates a new Object object.
     * 
     * @param value the value
     * 
     * @return the JAXB element< string>
     */
    @XmlElementDecl(namespace = "http://prismstandard.org/namespaces/basic/2.0/", name = "startingPage")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createStartingPage(String value) {
        return new JAXBElement<String>(_StartingPage_QNAME, String.class, null, value);
    }

    /**
     * Creates a new Object object.
     * 
     * @param value the value
     * 
     * @return the JAXB element< string>
     */
    @XmlElementDecl(namespace = "http://prismstandard.org/namespaces/basic/2.0/", name = "copyright")
    public JAXBElement<String> createCopyright(String value) {
        return new JAXBElement<String>(_Copyright_QNAME, String.class, null, value);
    }

    /**
     * Creates a new Object object.
     * 
     * @param value the value
     * 
     * @return the JAXB element< string>
     */
    @XmlElementDecl(namespace = "http://prismstandard.org/namespaces/basic/2.0/", name = "isbn")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createIsbn(String value) {
        return new JAXBElement<String>(_Isbn_QNAME, String.class, null, value);
    }

    /**
     * Creates a new Object object.
     * 
     * @param value the value
     * 
     * @return the JAXB element< string>
     */
    @XmlElementDecl(namespace = "http://prismstandard.org/namespaces/basic/2.0/", name = "issn")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createIssn(String value) {
        return new JAXBElement<String>(_Issn_QNAME, String.class, null, value);
    }

    /**
     * Creates a new Object object.
     * 
     * @param value the value
     * 
     * @return the JAXB element< string>
     */
    @XmlElementDecl(namespace = "http://prismstandard.org/namespaces/basic/2.0/", name = "doi")
    public JAXBElement<String> createDoi(String value) {
        return new JAXBElement<String>(_Doi_QNAME, String.class, null, value);
    }

}
