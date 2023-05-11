
package it.iride.wsfascicolo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the it.iride.wsfascicolo package. 
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

    private final static QName _String_QNAME = new QName("http://tempuri.org/", "string");
    private final static QName _FascicoloOut_QNAME = new QName("http://tempuri.org/", "FascicoloOut");
    private final static QName _EsitoOperazione_QNAME = new QName("http://tempuri.org/", "EsitoOperazione");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: it.iride.wsfascicolo
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CancellaFascicoloResponse }
     * 
     */
    public CancellaFascicoloResponse createCancellaFascicoloResponse() {
        return new CancellaFascicoloResponse();
    }

    /**
     * Create an instance of {@link LeggiFascicolo }
     * 
     */
    public LeggiFascicolo createLeggiFascicolo() {
        return new LeggiFascicolo();
    }

    /**
     * Create an instance of {@link CreaFascicoloStringResponse }
     * 
     */
    public CreaFascicoloStringResponse createCreaFascicoloStringResponse() {
        return new CreaFascicoloStringResponse();
    }

    /**
     * Create an instance of {@link LeggiFascicoloResponse }
     * 
     */
    public LeggiFascicoloResponse createLeggiFascicoloResponse() {
        return new LeggiFascicoloResponse();
    }

    /**
     * Create an instance of {@link ModificaFascicolo }
     * 
     */
    public ModificaFascicolo createModificaFascicolo() {
        return new ModificaFascicolo();
    }

    /**
     * Create an instance of {@link LeggiFascicoloString }
     * 
     */
    public LeggiFascicoloString createLeggiFascicoloString() {
        return new LeggiFascicoloString();
    }

    /**
     * Create an instance of {@link CreaFascicoloResponse }
     * 
     */
    public CreaFascicoloResponse createCreaFascicoloResponse() {
        return new CreaFascicoloResponse();
    }

    /**
     * Create an instance of {@link CancellaFascicolo }
     * 
     */
    public CancellaFascicolo createCancellaFascicolo() {
        return new CancellaFascicolo();
    }

    /**
     * Create an instance of {@link CreaSottoFascicolo }
     * 
     */
    public CreaSottoFascicolo createCreaSottoFascicolo() {
        return new CreaSottoFascicolo();
    }

    /**
     * Create an instance of {@link CreaSottoFascicoloString }
     * 
     */
    public CreaSottoFascicoloString createCreaSottoFascicoloString() {
        return new CreaSottoFascicoloString();
    }

    /**
     * Create an instance of {@link FascicolaDocumentoResponse }
     * 
     */
    public FascicolaDocumentoResponse createFascicolaDocumentoResponse() {
        return new FascicolaDocumentoResponse();
    }

    /**
     * Create an instance of {@link FascicoloOut }
     * 
     */
    public FascicoloOut createFascicoloOut() {
        return new FascicoloOut();
    }

    /**
     * Create an instance of {@link CreaSottoFascicoloStringResponse }
     * 
     */
    public CreaSottoFascicoloStringResponse createCreaSottoFascicoloStringResponse() {
        return new CreaSottoFascicoloStringResponse();
    }

    /**
     * Create an instance of {@link ModificaFascicoloResponse }
     * 
     */
    public ModificaFascicoloResponse createModificaFascicoloResponse() {
        return new ModificaFascicoloResponse();
    }

    /**
     * Create an instance of {@link EsitoOperazione }
     * 
     */
    public EsitoOperazione createEsitoOperazione() {
        return new EsitoOperazione();
    }

    /**
     * Create an instance of {@link ArrayOfDocumentoFascicoloOut }
     * 
     */
    public ArrayOfDocumentoFascicoloOut createArrayOfDocumentoFascicoloOut() {
        return new ArrayOfDocumentoFascicoloOut();
    }

    /**
     * Create an instance of {@link DocumentoFascicoloOut }
     * 
     */
    public DocumentoFascicoloOut createDocumentoFascicoloOut() {
        return new DocumentoFascicoloOut();
    }

    /**
     * Create an instance of {@link CreaFascicolo }
     * 
     */
    public CreaFascicolo createCreaFascicolo() {
        return new CreaFascicolo();
    }

    /**
     * Create an instance of {@link FascicoloIn }
     * 
     */
    public FascicoloIn createFascicoloIn() {
        return new FascicoloIn();
    }

    /**
     * Create an instance of {@link LeggiFascicoloStringResponse }
     * 
     */
    public LeggiFascicoloStringResponse createLeggiFascicoloStringResponse() {
        return new LeggiFascicoloStringResponse();
    }

    /**
     * Create an instance of {@link CreaSottoFascicoloResponse }
     * 
     */
    public CreaSottoFascicoloResponse createCreaSottoFascicoloResponse() {
        return new CreaSottoFascicoloResponse();
    }

    /**
     * Create an instance of {@link FascicolaDocumento }
     * 
     */
    public FascicolaDocumento createFascicolaDocumento() {
        return new FascicolaDocumento();
    }

    /**
     * Create an instance of {@link CreaFascicoloString }
     * 
     */
    public CreaFascicoloString createCreaFascicoloString() {
        return new CreaFascicoloString();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "string")
    public JAXBElement<String> createString(String value) {
        return new JAXBElement<String>(_String_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FascicoloOut }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "FascicoloOut")
    public JAXBElement<FascicoloOut> createFascicoloOut(FascicoloOut value) {
        return new JAXBElement<FascicoloOut>(_FascicoloOut_QNAME, FascicoloOut.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EsitoOperazione }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "EsitoOperazione")
    public JAXBElement<EsitoOperazione> createEsitoOperazione(EsitoOperazione value) {
        return new JAXBElement<EsitoOperazione>(_EsitoOperazione_QNAME, EsitoOperazione.class, null, value);
    }

}
