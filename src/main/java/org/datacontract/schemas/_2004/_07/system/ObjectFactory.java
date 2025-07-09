
package org.datacontract.schemas._2004._07.system;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.datacontract.schemas._2004._07.system package. 
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

    private final static QName _TupleOfintint_QNAME = new QName("http://schemas.datacontract.org/2004/07/System", "TupleOfintint");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.datacontract.schemas._2004._07.system
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TupleOfintint }
     * 
     */
    public TupleOfintint createTupleOfintint() {
        return new TupleOfintint();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TupleOfintint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/System", name = "TupleOfintint")
    public JAXBElement<TupleOfintint> createTupleOfintint(TupleOfintint value) {
        return new JAXBElement<TupleOfintint>(_TupleOfintint_QNAME, TupleOfintint.class, null, value);
    }

}
