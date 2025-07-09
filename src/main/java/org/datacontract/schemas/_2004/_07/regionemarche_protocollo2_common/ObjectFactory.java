
package org.datacontract.schemas._2004._07.regionemarche_protocollo2_common;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.datacontract.schemas._2004._07.regionemarche_protocollo2_common package. 
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

    private final static QName _TipoMessaggioInterop_QNAME = new QName("http://schemas.datacontract.org/2004/07/RegioneMarche.Protocollo.Common.TipiInterop", "TipoMessaggioInterop");
    private final static QName _TipoStatoProtocollo_QNAME = new QName("http://schemas.datacontract.org/2004/07/RegioneMarche.Protocollo.Common.Tipi", "TipoStatoProtocollo");
    private final static QName _TipoDirezioneMessaggio_QNAME = new QName("http://schemas.datacontract.org/2004/07/RegioneMarche.Protocollo.Common.TipiInterop", "TipoDirezioneMessaggio");
    private final static QName _MessaggioClass_QNAME = new QName("http://schemas.datacontract.org/2004/07/RegioneMarche.Protocollo.Common.Tipi", "MessaggioClass");
    private final static QName _TipoProtocollo_QNAME = new QName("http://schemas.datacontract.org/2004/07/RegioneMarche.Protocollo.Common.Tipi", "TipoProtocollo");
    private final static QName _TipoStatoSpedizione_QNAME = new QName("http://schemas.datacontract.org/2004/07/RegioneMarche.Protocollo.Common.TipiInterop", "TipoStatoSpedizione");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.datacontract.schemas._2004._07.regionemarche_protocollo2_common
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link MessaggioClass }
     * 
     */
    public MessaggioClass createMessaggioClass() {
        return new MessaggioClass();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoMessaggioInterop }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/RegioneMarche.Protocollo.Common.TipiInterop", name = "TipoMessaggioInterop")
    public JAXBElement<TipoMessaggioInterop> createTipoMessaggioInterop(TipoMessaggioInterop value) {
        return new JAXBElement<TipoMessaggioInterop>(_TipoMessaggioInterop_QNAME, TipoMessaggioInterop.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoStatoProtocollo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/RegioneMarche.Protocollo.Common.Tipi", name = "TipoStatoProtocollo")
    public JAXBElement<TipoStatoProtocollo> createTipoStatoProtocollo(TipoStatoProtocollo value) {
        return new JAXBElement<TipoStatoProtocollo>(_TipoStatoProtocollo_QNAME, TipoStatoProtocollo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoDirezioneMessaggio }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/RegioneMarche.Protocollo.Common.TipiInterop", name = "TipoDirezioneMessaggio")
    public JAXBElement<TipoDirezioneMessaggio> createTipoDirezioneMessaggio(TipoDirezioneMessaggio value) {
        return new JAXBElement<TipoDirezioneMessaggio>(_TipoDirezioneMessaggio_QNAME, TipoDirezioneMessaggio.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MessaggioClass }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/RegioneMarche.Protocollo.Common.Tipi", name = "MessaggioClass")
    public JAXBElement<MessaggioClass> createMessaggioClass(MessaggioClass value) {
        return new JAXBElement<MessaggioClass>(_MessaggioClass_QNAME, MessaggioClass.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoProtocollo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/RegioneMarche.Protocollo.Common.Tipi", name = "TipoProtocollo")
    public JAXBElement<TipoProtocollo> createTipoProtocollo(TipoProtocollo value) {
        return new JAXBElement<TipoProtocollo>(_TipoProtocollo_QNAME, TipoProtocollo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoStatoSpedizione }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/RegioneMarche.Protocollo.Common.TipiInterop", name = "TipoStatoSpedizione")
    public JAXBElement<TipoStatoSpedizione> createTipoStatoSpedizione(TipoStatoSpedizione value) {
        return new JAXBElement<TipoStatoSpedizione>(_TipoStatoSpedizione_QNAME, TipoStatoSpedizione.class, null, value);
    }

}
