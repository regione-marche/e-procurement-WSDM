//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.06.01 at 11:53:10 AM CEST 
//


package it.engineering.documentale.xsd.fileudtoextract;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the it.engineering.documentale.xsd.fileudtoextract package. 
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

    private final static QName _FileUDToExtract_QNAME = new QName("", "FileUDToExtract");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: it.engineering.documentale.xsd.fileudtoextract
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EstremiRegNumType }
     * 
     */
    public EstremiRegNumType createEstremiRegNumType() {
        return new EstremiRegNumType();
    }

    /**
     * Create an instance of {@link EstremiXidentificazioneVerDocType }
     * 
     */
    public EstremiXidentificazioneVerDocType createEstremiXidentificazioneVerDocType() {
        return new EstremiXidentificazioneVerDocType();
    }

    /**
     * Create an instance of {@link EstremiXIdentificazioneFileUDType }
     * 
     */
    public EstremiXIdentificazioneFileUDType createEstremiXIdentificazioneFileUDType() {
        return new EstremiXIdentificazioneFileUDType();
    }

    /**
     * Create an instance of {@link OggDiTabDiSistemaType }
     * 
     */
    public OggDiTabDiSistemaType createOggDiTabDiSistemaType() {
        return new OggDiTabDiSistemaType();
    }

    /**
     * Create an instance of {@link EstremiXIdentificazioneUDType }
     * 
     */
    public EstremiXIdentificazioneUDType createEstremiXIdentificazioneUDType() {
        return new EstremiXIdentificazioneUDType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EstremiXidentificazioneVerDocType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "FileUDToExtract")
    public JAXBElement<EstremiXidentificazioneVerDocType> createFileUDToExtract(EstremiXidentificazioneVerDocType value) {
        return new JAXBElement<EstremiXidentificazioneVerDocType>(_FileUDToExtract_QNAME, EstremiXidentificazioneVerDocType.class, null, value);
    }

}
