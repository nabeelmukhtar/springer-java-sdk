
package org.prismstandard.namespaces.pam._2;

import javax.xml.bind.annotation.XmlRegistry;
import org.prismstandard.namespaces.pam._2.impl.ArticleImpl;
import org.prismstandard.namespaces.pam._2.impl.MessageImpl;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.prismstandard.namespaces.pam._2 package. 
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

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.prismstandard.namespaces.pam._2
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Message }
     * 
     */
    public Message createMessage() {
        return new MessageImpl();
    }

    /**
     * Create an instance of {@link Article }
     * 
     */
    public Article createArticle() {
        return new ArticleImpl();
    }

}
