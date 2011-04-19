
package org.w3._1999.xhtml;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import org.w3._1999.xhtml.impl.BodyImpl;
import org.w3._1999.xhtml.impl.HeadImpl;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.w3._1999.xhtml package. 
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
    private final static QName _Sub_QNAME = new QName("http://www.w3.org/1999/xhtml", "sub");
    private final static QName _P_QNAME = new QName("http://www.w3.org/1999/xhtml", "p");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.w3._1999.xhtml
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Head }
     * 
     */
    public Head createHead() {
        return new HeadImpl();
    }

    /**
     * Create an instance of {@link Body }
     * 
     */
    public Body createBody() {
        return new BodyImpl();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/1999/xhtml", name = "sub")
    public JAXBElement<String> createSub(String value) {
        return new JAXBElement<String>(_Sub_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/1999/xhtml", name = "p")
    public JAXBElement<String> createP(String value) {
        return new JAXBElement<String>(_P_QNAME, String.class, null, value);
    }

}
