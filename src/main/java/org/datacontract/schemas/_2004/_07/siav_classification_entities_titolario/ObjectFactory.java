
package org.datacontract.schemas._2004._07.siav_classification_entities_titolario;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.datacontract.schemas._2004._07.siav_classification_entities_titolario package. 
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

    private final static QName _TitolarioIdentifier_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Titolario.Identifier", "TitolarioIdentifier");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.datacontract.schemas._2004._07.siav_classification_entities_titolario
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TitolarioIdentifier }
     * 
     */
    public TitolarioIdentifier createTitolarioIdentifier() {
        return new TitolarioIdentifier();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TitolarioIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Titolario.Identifier", name = "TitolarioIdentifier")
    public JAXBElement<TitolarioIdentifier> createTitolarioIdentifier(TitolarioIdentifier value) {
        return new JAXBElement<TitolarioIdentifier>(_TitolarioIdentifier_QNAME, TitolarioIdentifier.class, null, value);
    }

}
