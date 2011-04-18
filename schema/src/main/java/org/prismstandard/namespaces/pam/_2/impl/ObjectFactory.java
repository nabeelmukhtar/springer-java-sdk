
package org.prismstandard.namespaces.pam._2.impl;

import javax.xml.bind.annotation.XmlRegistry;
import org.prismstandard.namespaces.pam._2.Article;
import org.prismstandard.namespaces.pam._2.Message;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.prismstandard.namespaces.pam._2.impl package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.prismstandard.namespaces.pam._2.impl
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Article }
     * 
     */
    public ArticleImpl createArticle() {
        return new ArticleImpl();
    }

    /**
     * Create an instance of {@link Message }
     * 
     */
    public MessageImpl createMessage() {
        return new MessageImpl();
    }

}
