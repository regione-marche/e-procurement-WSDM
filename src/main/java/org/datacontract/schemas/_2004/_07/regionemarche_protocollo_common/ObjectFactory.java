
package org.datacontract.schemas._2004._07.regionemarche_protocollo_common;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.datacontract.schemas._2004._07.regionemarche_protocollo_common package. 
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

    private final static QName _IpaEntry_QNAME = new QName("http://schemas.datacontract.org/2004/07/RegioneMarche.Protocollo.Common.Tipi", "IpaEntry");
    private final static QName _TipoDocumento_QNAME = new QName("http://schemas.datacontract.org/2004/07/RegioneMarche.Protocollo.Common.Tipi", "TipoDocumento");
    private final static QName _TipoMessaggioInterop_QNAME = new QName("http://schemas.datacontract.org/2004/07/RegioneMarche.Protocollo.Common.TipiInterop", "TipoMessaggioInterop");
    private final static QName _TipoStatoProtocollo_QNAME = new QName("http://schemas.datacontract.org/2004/07/RegioneMarche.Protocollo.Common.Tipi", "TipoStatoProtocollo");
    private final static QName _TipoDirezioneMessaggio_QNAME = new QName("http://schemas.datacontract.org/2004/07/RegioneMarche.Protocollo.Common.TipiInterop", "TipoDirezioneMessaggio");
    private final static QName _MessaggioClass_QNAME = new QName("http://schemas.datacontract.org/2004/07/RegioneMarche.Protocollo.Common.Tipi", "MessaggioClass");
    private final static QName _SoggettiXml_QNAME = new QName("http://schemas.datacontract.org/2004/07/RegioneMarche.Protocollo.Common.Tipi", "SoggettiXml");
    private final static QName _TipoProtocollo_QNAME = new QName("http://schemas.datacontract.org/2004/07/RegioneMarche.Protocollo.Common.Tipi", "TipoProtocollo");
    private final static QName _TipoStatoSpedizione_QNAME = new QName("http://schemas.datacontract.org/2004/07/RegioneMarche.Protocollo.Common.TipiInterop", "TipoStatoSpedizione");
    private final static QName _ArrayOfIpaEntry_QNAME = new QName("http://schemas.datacontract.org/2004/07/RegioneMarche.Protocollo.Common.Tipi", "ArrayOfIpaEntry");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.datacontract.schemas._2004._07.regionemarche_protocollo_common
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link IpaEntry }
     * 
     */
    public IpaEntry createIpaEntry() {
        return new IpaEntry();
    }

    /**
     * Create an instance of {@link TipoDocumento }
     * 
     */
    public TipoDocumento createTipoDocumento() {
        return new TipoDocumento();
    }

    /**
     * Create an instance of {@link SoggettiXml }
     * 
     */
    public SoggettiXml createSoggettiXml() {
        return new SoggettiXml();
    }

    /**
     * Create an instance of {@link MessaggioClass }
     * 
     */
    public MessaggioClass createMessaggioClass() {
        return new MessaggioClass();
    }

    /**
     * Create an instance of {@link ArrayOfIpaEntry }
     * 
     */
    public ArrayOfIpaEntry createArrayOfIpaEntry() {
        return new ArrayOfIpaEntry();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IpaEntry }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/RegioneMarche.Protocollo.Common.Tipi", name = "IpaEntry")
    public JAXBElement<IpaEntry> createIpaEntry(IpaEntry value) {
        return new JAXBElement<IpaEntry>(_IpaEntry_QNAME, IpaEntry.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoDocumento }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/RegioneMarche.Protocollo.Common.Tipi", name = "TipoDocumento")
    public JAXBElement<TipoDocumento> createTipoDocumento(TipoDocumento value) {
        return new JAXBElement<TipoDocumento>(_TipoDocumento_QNAME, TipoDocumento.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link SoggettiXml }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/RegioneMarche.Protocollo.Common.Tipi", name = "SoggettiXml")
    public JAXBElement<SoggettiXml> createSoggettiXml(SoggettiXml value) {
        return new JAXBElement<SoggettiXml>(_SoggettiXml_QNAME, SoggettiXml.class, null, value);
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

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfIpaEntry }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/RegioneMarche.Protocollo.Common.Tipi", name = "ArrayOfIpaEntry")
    public JAXBElement<ArrayOfIpaEntry> createArrayOfIpaEntry(ArrayOfIpaEntry value) {
        return new JAXBElement<ArrayOfIpaEntry>(_ArrayOfIpaEntry_QNAME, ArrayOfIpaEntry.class, null, value);
    }

}
