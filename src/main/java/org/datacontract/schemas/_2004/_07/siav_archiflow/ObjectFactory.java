
package org.datacontract.schemas._2004._07.siav_archiflow;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.datacontract.schemas._2004._07.siav_archiflow package. 
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

    private final static QName _BaseFault_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Faults", "BaseFault");
    private final static QName _DuplicatedArchivalNumberFault_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Faults", "DuplicatedArchivalNumberFault");
    private final static QName _BaseFaultMessage_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Faults", "Message");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.datacontract.schemas._2004._07.siav_archiflow
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BaseFault }
     * 
     */
    public BaseFault createBaseFault() {
        return new BaseFault();
    }

    /**
     * Create an instance of {@link DuplicatedArchivalNumberFault }
     * 
     */
    public DuplicatedArchivalNumberFault createDuplicatedArchivalNumberFault() {
        return new DuplicatedArchivalNumberFault();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Faults", name = "BaseFault")
    public JAXBElement<BaseFault> createBaseFault(BaseFault value) {
        return new JAXBElement<BaseFault>(_BaseFault_QNAME, BaseFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DuplicatedArchivalNumberFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Faults", name = "DuplicatedArchivalNumberFault")
    public JAXBElement<DuplicatedArchivalNumberFault> createDuplicatedArchivalNumberFault(DuplicatedArchivalNumberFault value) {
        return new JAXBElement<DuplicatedArchivalNumberFault>(_DuplicatedArchivalNumberFault_QNAME, DuplicatedArchivalNumberFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Faults", name = "Message", scope = BaseFault.class)
    public JAXBElement<String> createBaseFaultMessage(String value) {
        return new JAXBElement<String>(_BaseFaultMessage_QNAME, String.class, BaseFault.class, value);
    }

}
