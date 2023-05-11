
package it.infor.JProtocolloServices;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the it.infor.JProtocolloServices package. 
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

    private final static QName _LeggiAllegato_QNAME = new QName("http://webservices.jprotocollo.jente.infor.arezzo.it/", "leggiAllegato");
    private final static QName _InserisciArrivoResponse_QNAME = new QName("http://webservices.jprotocollo.jente.infor.arezzo.it/", "inserisciArrivoResponse");
    private final static QName _LeggiProtocolloResponse_QNAME = new QName("http://webservices.jprotocollo.jente.infor.arezzo.it/", "leggiProtocolloResponse");
    private final static QName _AllegaDocumentoResponse_QNAME = new QName("http://webservices.jprotocollo.jente.infor.arezzo.it/", "allegaDocumentoResponse");
    private final static QName _InviaProtocolloResponse_QNAME = new QName("http://webservices.jprotocollo.jente.infor.arezzo.it/", "inviaProtocolloResponse");
    private final static QName _ConfermaSegnatura_QNAME = new QName("http://webservices.jprotocollo.jente.infor.arezzo.it/", "confermaSegnatura");
    private final static QName _InserisciPartenzaResponse_QNAME = new QName("http://webservices.jprotocollo.jente.infor.arezzo.it/", "inserisciPartenzaResponse");
    private final static QName _InserisciArrivo_QNAME = new QName("http://webservices.jprotocollo.jente.infor.arezzo.it/", "inserisciArrivo");
    private final static QName _ConfermaSegnaturaResponse_QNAME = new QName("http://webservices.jprotocollo.jente.infor.arezzo.it/", "confermaSegnaturaResponse");
    private final static QName _LeggiProtocollo_QNAME = new QName("http://webservices.jprotocollo.jente.infor.arezzo.it/", "leggiProtocollo");
    private final static QName _AllegaDocumento_QNAME = new QName("http://webservices.jprotocollo.jente.infor.arezzo.it/", "allegaDocumento");
    private final static QName _InviaProtocollo_QNAME = new QName("http://webservices.jprotocollo.jente.infor.arezzo.it/", "inviaProtocollo");
    private final static QName _InserisciInternoResponse_QNAME = new QName("http://webservices.jprotocollo.jente.infor.arezzo.it/", "inserisciInternoResponse");
    private final static QName _InserisciPartenza_QNAME = new QName("http://webservices.jprotocollo.jente.infor.arezzo.it/", "inserisciPartenza");
    private final static QName _InserisciInterno_QNAME = new QName("http://webservices.jprotocollo.jente.infor.arezzo.it/", "inserisciInterno");
    private final static QName _LeggiAllegatoResponse_QNAME = new QName("http://webservices.jprotocollo.jente.infor.arezzo.it/", "leggiAllegatoResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: it.infor.JProtocolloServices
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Protocollo.Annullamento }
     * 
     */
    public Protocollo.Annullamento createProtocolloAnnullamento() {
        return new Protocollo.Annullamento();
    }

    /**
     * Create an instance of {@link it.infor.JProtocolloServices.RispostaLeggiAllegato }
     * 
     */
    public it.infor.JProtocolloServices.RispostaLeggiAllegato createRispostaLeggiAllegato() {
        return new it.infor.JProtocolloServices.RispostaLeggiAllegato();
    }

    /**
     * Create an instance of {@link Estremi }
     * 
     */
    public Estremi createEstremi() {
        return new Estremi();
    }

    /**
     * Create an instance of {@link AltriDati }
     * 
     */
    public AltriDati createAltriDati() {
        return new AltriDati();
    }

    /**
     * Create an instance of {@link Segnatura }
     * 
     */
    public Segnatura createSegnatura() {
        return new Segnatura();
    }

    /**
     * Create an instance of {@link Soggetti }
     * 
     */
    public Soggetti createSoggetti() {
        return new Soggetti();
    }

    /**
     * Create an instance of {@link InviaProtocollo.RichiestaInviaProtocollo }
     * 
     */
    public InviaProtocollo.RichiestaInviaProtocollo createInviaProtocolloRichiestaInviaProtocollo() {
        return new InviaProtocollo.RichiestaInviaProtocollo();
    }

    /**
     * Create an instance of {@link InserisciPartenza }
     * 
     */
    public InserisciPartenza createInserisciPartenza() {
        return new InserisciPartenza();
    }

    /**
     * Create an instance of {@link Soggetti.AltriSoggetti }
     * 
     */
    public Soggetti.AltriSoggetti createSoggettiAltriSoggetti() {
        return new Soggetti.AltriSoggetti();
    }

    /**
     * Create an instance of {@link InserisciArrivo.RichiestaProtocollaArrivo }
     * 
     */
    public InserisciArrivo.RichiestaProtocollaArrivo createInserisciArrivoRichiestaProtocollaArrivo() {
        return new InserisciArrivo.RichiestaProtocollaArrivo();
    }

    /**
     * Create an instance of {@link Soggetto }
     * 
     */
    public Soggetto createSoggetto() {
        return new Soggetto();
    }

    /**
     * Create an instance of {@link Anteatto }
     * 
     */
    public Anteatto createAnteatto() {
        return new Anteatto();
    }

    /**
     * Create an instance of {@link it.infor.JProtocolloServices.RichiestaProtocollaPartenza }
     * 
     */
    public it.infor.JProtocolloServices.RichiestaProtocollaPartenza createRichiestaProtocollaPartenza() {
        return new it.infor.JProtocolloServices.RichiestaProtocollaPartenza();
    }

    /**
     * Create an instance of {@link Tramite }
     * 
     */
    public Tramite createTramite() {
        return new Tramite();
    }

    /**
     * Create an instance of {@link InviaProtocolloResponse.RispostaInviaProtocollo }
     * 
     */
    public InviaProtocolloResponse.RispostaInviaProtocollo createInviaProtocolloResponseRispostaInviaProtocollo() {
        return new InviaProtocolloResponse.RispostaInviaProtocollo();
    }

    /**
     * Create an instance of {@link ConfermaSegnatura }
     * 
     */
    public ConfermaSegnatura createConfermaSegnatura() {
        return new ConfermaSegnatura();
    }

    /**
     * Create an instance of {@link ProtocollaPartenza }
     * 
     */
    public ProtocollaPartenza createProtocollaPartenza() {
        return new ProtocollaPartenza();
    }

    /**
     * Create an instance of {@link Smistamento }
     * 
     */
    public Smistamento createSmistamento() {
        return new Smistamento();
    }

    /**
     * Create an instance of {@link it.infor.JProtocolloServices.RispostaLeggiProtocollo }
     * 
     */
    public it.infor.JProtocolloServices.RispostaLeggiProtocollo createRispostaLeggiProtocollo() {
        return new it.infor.JProtocolloServices.RispostaLeggiProtocollo();
    }

    /**
     * Create an instance of {@link Protocollo }
     * 
     */
    public Protocollo createProtocollo() {
        return new Protocollo();
    }

    /**
     * Create an instance of {@link InserisciInternoResponse }
     * 
     */
    public InserisciInternoResponse createInserisciInternoResponse() {
        return new InserisciInternoResponse();
    }

    /**
     * Create an instance of {@link Classificazione.Fascicolo }
     * 
     */
    public Classificazione.Fascicolo createClassificazioneFascicolo() {
        return new Classificazione.Fascicolo();
    }

    /**
     * Create an instance of {@link AllegaDocumentoResponse.RispostaAllegaDocumento }
     * 
     */
    public AllegaDocumentoResponse.RispostaAllegaDocumento createAllegaDocumentoResponseRispostaAllegaDocumento() {
        return new AllegaDocumentoResponse.RispostaAllegaDocumento();
    }

    /**
     * Create an instance of {@link InserisciInterno.RichiestaProtocollaInterno }
     * 
     */
    public InserisciInterno.RichiestaProtocollaInterno createInserisciInternoRichiestaProtocollaInterno() {
        return new InserisciInterno.RichiestaProtocollaInterno();
    }

    /**
     * Create an instance of {@link Documento.Volume }
     * 
     */
    public Documento.Volume createDocumentoVolume() {
        return new Documento.Volume();
    }

    /**
     * Create an instance of {@link ConfermaSegnatura.RichiestaConfermaSegnatura }
     * 
     */
    public ConfermaSegnatura.RichiestaConfermaSegnatura createConfermaSegnaturaRichiestaConfermaSegnatura() {
        return new ConfermaSegnatura.RichiestaConfermaSegnatura();
    }

    /**
     * Create an instance of {@link LeggiAllegatoResponse }
     * 
     */
    public LeggiAllegatoResponse createLeggiAllegatoResponse() {
        return new LeggiAllegatoResponse();
    }

    /**
     * Create an instance of {@link it.infor.JProtocolloServices.RichiestaConfermaSegnatura }
     * 
     */
    public it.infor.JProtocolloServices.RichiestaConfermaSegnatura createRichiestaConfermaSegnatura() {
        return new it.infor.JProtocolloServices.RichiestaConfermaSegnatura();
    }

    /**
     * Create an instance of {@link LeggiAllegato.RichiestaLeggiAllegato }
     * 
     */
    public LeggiAllegato.RichiestaLeggiAllegato createLeggiAllegatoRichiestaLeggiAllegato() {
        return new LeggiAllegato.RichiestaLeggiAllegato();
    }

    /**
     * Create an instance of {@link Aoo }
     * 
     */
    public Aoo createAoo() {
        return new Aoo();
    }

    /**
     * Create an instance of {@link MittenteInterno }
     * 
     */
    public MittenteInterno createMittenteInterno() {
        return new MittenteInterno();
    }

    /**
     * Create an instance of {@link it.infor.JProtocolloServices.RispostaProtocolla }
     * 
     */
    public it.infor.JProtocolloServices.RispostaProtocolla createRispostaProtocolla() {
        return new it.infor.JProtocolloServices.RispostaProtocolla();
    }

    /**
     * Create an instance of {@link InserisciInternoResponse.RispostaProtocolla }
     * 
     */
    public InserisciInternoResponse.RispostaProtocolla createInserisciInternoResponseRispostaProtocolla() {
        return new InserisciInternoResponse.RispostaProtocolla();
    }

    /**
     * Create an instance of {@link LeggiAllegatoResponse.RispostaLeggiAllegato }
     * 
     */
    public LeggiAllegatoResponse.RispostaLeggiAllegato createLeggiAllegatoResponseRispostaLeggiAllegato() {
        return new LeggiAllegatoResponse.RispostaLeggiAllegato();
    }

    /**
     * Create an instance of {@link Ente }
     * 
     */
    public Ente createEnte() {
        return new Ente();
    }

    /**
     * Create an instance of {@link Corrispondente }
     * 
     */
    public Corrispondente createCorrispondente() {
        return new Corrispondente();
    }

    /**
     * Create an instance of {@link Documento.Formato }
     * 
     */
    public Documento.Formato createDocumentoFormato() {
        return new Documento.Formato();
    }

    /**
     * Create an instance of {@link ProtocollaArrivo }
     * 
     */
    public ProtocollaArrivo createProtocollaArrivo() {
        return new ProtocollaArrivo();
    }

    /**
     * Create an instance of {@link Riferimento }
     * 
     */
    public Riferimento createRiferimento() {
        return new Riferimento();
    }

    /**
     * Create an instance of {@link InserisciPartenzaResponse }
     * 
     */
    public InserisciPartenzaResponse createInserisciPartenzaResponse() {
        return new InserisciPartenzaResponse();
    }

    /**
     * Create an instance of {@link it.infor.JProtocolloServices.RispostaAllegaDocumento }
     * 
     */
    public it.infor.JProtocolloServices.RispostaAllegaDocumento createRispostaAllegaDocumento() {
        return new it.infor.JProtocolloServices.RispostaAllegaDocumento();
    }

    /**
     * Create an instance of {@link it.infor.JProtocolloServices.RichiestaProtocollaInterno }
     * 
     */
    public it.infor.JProtocolloServices.RichiestaProtocollaInterno createRichiestaProtocollaInterno() {
        return new it.infor.JProtocolloServices.RichiestaProtocollaInterno();
    }

    /**
     * Create an instance of {@link AllegaDocumentoResponse }
     * 
     */
    public AllegaDocumentoResponse createAllegaDocumentoResponse() {
        return new AllegaDocumentoResponse();
    }

    /**
     * Create an instance of {@link Documento }
     * 
     */
    public Documento createDocumento() {
        return new Documento();
    }

    /**
     * Create an instance of {@link LeggiProtocolloResponse }
     * 
     */
    public LeggiProtocolloResponse createLeggiProtocolloResponse() {
        return new LeggiProtocolloResponse();
    }

    /**
     * Create an instance of {@link LeggiAllegato }
     * 
     */
    public LeggiAllegato createLeggiAllegato() {
        return new LeggiAllegato();
    }

    /**
     * Create an instance of {@link Uo }
     * 
     */
    public Uo createUo() {
        return new Uo();
    }

    /**
     * Create an instance of {@link it.infor.JProtocolloServices.RichiestaAllegaDocumento }
     * 
     */
    public it.infor.JProtocolloServices.RichiestaAllegaDocumento createRichiestaAllegaDocumento() {
        return new it.infor.JProtocolloServices.RichiestaAllegaDocumento();
    }

    /**
     * Create an instance of {@link InserisciArrivoResponse.RispostaProtocolla }
     * 
     */
    public InserisciArrivoResponse.RispostaProtocolla createInserisciArrivoResponseRispostaProtocolla() {
        return new InserisciArrivoResponse.RispostaProtocolla();
    }

    /**
     * Create an instance of {@link InviaProtocollo }
     * 
     */
    public InviaProtocollo createInviaProtocollo() {
        return new InviaProtocollo();
    }

    /**
     * Create an instance of {@link it.infor.JProtocolloServices.RichiestaProtocollaArrivo }
     * 
     */
    public it.infor.JProtocolloServices.RichiestaProtocollaArrivo createRichiestaProtocollaArrivo() {
        return new it.infor.JProtocolloServices.RichiestaProtocollaArrivo();
    }

    /**
     * Create an instance of {@link Sezione }
     * 
     */
    public Sezione createSezione() {
        return new Sezione();
    }

    /**
     * Create an instance of {@link Affare }
     * 
     */
    public Affare createAffare() {
        return new Affare();
    }

    /**
     * Create an instance of {@link Amministrazione }
     * 
     */
    public Amministrazione createAmministrazione() {
        return new Amministrazione();
    }

    /**
     * Create an instance of {@link InserisciInterno }
     * 
     */
    public InserisciInterno createInserisciInterno() {
        return new InserisciInterno();
    }

    /**
     * Create an instance of {@link Protocollo.Documenti }
     * 
     */
    public Protocollo.Documenti createProtocolloDocumenti() {
        return new Protocollo.Documenti();
    }

    /**
     * Create an instance of {@link ConfermaSegnaturaResponse }
     * 
     */
    public ConfermaSegnaturaResponse createConfermaSegnaturaResponse() {
        return new ConfermaSegnaturaResponse();
    }

    /**
     * Create an instance of {@link LeggiProtocollo.RichiestaLeggiProtocollo }
     * 
     */
    public LeggiProtocollo.RichiestaLeggiProtocollo createLeggiProtocolloRichiestaLeggiProtocollo() {
        return new LeggiProtocollo.RichiestaLeggiProtocollo();
    }

    /**
     * Create an instance of {@link InserisciArrivoResponse }
     * 
     */
    public InserisciArrivoResponse createInserisciArrivoResponse() {
        return new InserisciArrivoResponse();
    }

    /**
     * Create an instance of {@link AllegaDocumento }
     * 
     */
    public AllegaDocumento createAllegaDocumento() {
        return new AllegaDocumento();
    }

    /**
     * Create an instance of {@link Smistamenti }
     * 
     */
    public Smistamenti createSmistamenti() {
        return new Smistamenti();
    }

    /**
     * Create an instance of {@link it.infor.JProtocolloServices.RichiestaLeggiAllegato }
     * 
     */
    public it.infor.JProtocolloServices.RichiestaLeggiAllegato createRichiestaLeggiAllegato() {
        return new it.infor.JProtocolloServices.RichiestaLeggiAllegato();
    }

    /**
     * Create an instance of {@link InserisciPartenza.RichiestaProtocollaPartenza }
     * 
     */
    public InserisciPartenza.RichiestaProtocollaPartenza createInserisciPartenzaRichiestaProtocollaPartenza() {
        return new InserisciPartenza.RichiestaProtocollaPartenza();
    }

    /**
     * Create an instance of {@link Classificazione }
     * 
     */
    public Classificazione createClassificazione() {
        return new Classificazione();
    }

    /**
     * Create an instance of {@link it.infor.JProtocolloServices.RispostaConfermaSegnatura }
     * 
     */
    public it.infor.JProtocolloServices.RispostaConfermaSegnatura createRispostaConfermaSegnatura() {
        return new it.infor.JProtocolloServices.RispostaConfermaSegnatura();
    }

    /**
     * Create an instance of {@link LeggiProtocollo }
     * 
     */
    public LeggiProtocollo createLeggiProtocollo() {
        return new LeggiProtocollo();
    }

    /**
     * Create an instance of {@link it.infor.JProtocolloServices.RispostaInviaProtocollo }
     * 
     */
    public it.infor.JProtocolloServices.RispostaInviaProtocollo createRispostaInviaProtocollo() {
        return new it.infor.JProtocolloServices.RispostaInviaProtocollo();
    }

    /**
     * Create an instance of {@link InserisciArrivo }
     * 
     */
    public InserisciArrivo createInserisciArrivo() {
        return new InserisciArrivo();
    }

    /**
     * Create an instance of {@link Anagrafica }
     * 
     */
    public Anagrafica createAnagrafica() {
        return new Anagrafica();
    }

    /**
     * Create an instance of {@link it.infor.JProtocolloServices.RichiestaInviaProtocollo }
     * 
     */
    public it.infor.JProtocolloServices.RichiestaInviaProtocollo createRichiestaInviaProtocollo() {
        return new it.infor.JProtocolloServices.RichiestaInviaProtocollo();
    }

    /**
     * Create an instance of {@link TipoDocumento }
     * 
     */
    public TipoDocumento createTipoDocumento() {
        return new TipoDocumento();
    }

    /**
     * Create an instance of {@link InserisciPartenzaResponse.RispostaProtocolla }
     * 
     */
    public InserisciPartenzaResponse.RispostaProtocolla createInserisciPartenzaResponseRispostaProtocolla() {
        return new InserisciPartenzaResponse.RispostaProtocolla();
    }

    /**
     * Create an instance of {@link AllegaDocumento.RichiestaAllegaDocumento }
     * 
     */
    public AllegaDocumento.RichiestaAllegaDocumento createAllegaDocumentoRichiestaAllegaDocumento() {
        return new AllegaDocumento.RichiestaAllegaDocumento();
    }

    /**
     * Create an instance of {@link Registro }
     * 
     */
    public Registro createRegistro() {
        return new Registro();
    }

    /**
     * Create an instance of {@link ConfermaSegnaturaResponse.RispostaConfermaSegnatura }
     * 
     */
    public ConfermaSegnaturaResponse.RispostaConfermaSegnatura createConfermaSegnaturaResponseRispostaConfermaSegnatura() {
        return new ConfermaSegnaturaResponse.RispostaConfermaSegnatura();
    }

    /**
     * Create an instance of {@link it.infor.JProtocolloServices.RichiestaLeggiProtocollo }
     * 
     */
    public it.infor.JProtocolloServices.RichiestaLeggiProtocollo createRichiestaLeggiProtocollo() {
        return new it.infor.JProtocolloServices.RichiestaLeggiProtocollo();
    }

    /**
     * Create an instance of {@link ProtocollaInterno }
     * 
     */
    public ProtocollaInterno createProtocollaInterno() {
        return new ProtocollaInterno();
    }

    /**
     * Create an instance of {@link LeggiProtocolloResponse.RispostaLeggiProtocollo }
     * 
     */
    public LeggiProtocolloResponse.RispostaLeggiProtocollo createLeggiProtocolloResponseRispostaLeggiProtocollo() {
        return new LeggiProtocolloResponse.RispostaLeggiProtocollo();
    }

    /**
     * Create an instance of {@link InviaProtocolloResponse }
     * 
     */
    public InviaProtocolloResponse createInviaProtocolloResponse() {
        return new InviaProtocolloResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LeggiAllegato }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.jprotocollo.jente.infor.arezzo.it/", name = "leggiAllegato")
    public JAXBElement<LeggiAllegato> createLeggiAllegato(LeggiAllegato value) {
        return new JAXBElement<LeggiAllegato>(_LeggiAllegato_QNAME, LeggiAllegato.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InserisciArrivoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.jprotocollo.jente.infor.arezzo.it/", name = "inserisciArrivoResponse")
    public JAXBElement<InserisciArrivoResponse> createInserisciArrivoResponse(InserisciArrivoResponse value) {
        return new JAXBElement<InserisciArrivoResponse>(_InserisciArrivoResponse_QNAME, InserisciArrivoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LeggiProtocolloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.jprotocollo.jente.infor.arezzo.it/", name = "leggiProtocolloResponse")
    public JAXBElement<LeggiProtocolloResponse> createLeggiProtocolloResponse(LeggiProtocolloResponse value) {
        return new JAXBElement<LeggiProtocolloResponse>(_LeggiProtocolloResponse_QNAME, LeggiProtocolloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AllegaDocumentoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.jprotocollo.jente.infor.arezzo.it/", name = "allegaDocumentoResponse")
    public JAXBElement<AllegaDocumentoResponse> createAllegaDocumentoResponse(AllegaDocumentoResponse value) {
        return new JAXBElement<AllegaDocumentoResponse>(_AllegaDocumentoResponse_QNAME, AllegaDocumentoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InviaProtocolloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.jprotocollo.jente.infor.arezzo.it/", name = "inviaProtocolloResponse")
    public JAXBElement<InviaProtocolloResponse> createInviaProtocolloResponse(InviaProtocolloResponse value) {
        return new JAXBElement<InviaProtocolloResponse>(_InviaProtocolloResponse_QNAME, InviaProtocolloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConfermaSegnatura }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.jprotocollo.jente.infor.arezzo.it/", name = "confermaSegnatura")
    public JAXBElement<ConfermaSegnatura> createConfermaSegnatura(ConfermaSegnatura value) {
        return new JAXBElement<ConfermaSegnatura>(_ConfermaSegnatura_QNAME, ConfermaSegnatura.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InserisciPartenzaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.jprotocollo.jente.infor.arezzo.it/", name = "inserisciPartenzaResponse")
    public JAXBElement<InserisciPartenzaResponse> createInserisciPartenzaResponse(InserisciPartenzaResponse value) {
        return new JAXBElement<InserisciPartenzaResponse>(_InserisciPartenzaResponse_QNAME, InserisciPartenzaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InserisciArrivo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.jprotocollo.jente.infor.arezzo.it/", name = "inserisciArrivo")
    public JAXBElement<InserisciArrivo> createInserisciArrivo(InserisciArrivo value) {
        return new JAXBElement<InserisciArrivo>(_InserisciArrivo_QNAME, InserisciArrivo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConfermaSegnaturaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.jprotocollo.jente.infor.arezzo.it/", name = "confermaSegnaturaResponse")
    public JAXBElement<ConfermaSegnaturaResponse> createConfermaSegnaturaResponse(ConfermaSegnaturaResponse value) {
        return new JAXBElement<ConfermaSegnaturaResponse>(_ConfermaSegnaturaResponse_QNAME, ConfermaSegnaturaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LeggiProtocollo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.jprotocollo.jente.infor.arezzo.it/", name = "leggiProtocollo")
    public JAXBElement<LeggiProtocollo> createLeggiProtocollo(LeggiProtocollo value) {
        return new JAXBElement<LeggiProtocollo>(_LeggiProtocollo_QNAME, LeggiProtocollo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AllegaDocumento }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.jprotocollo.jente.infor.arezzo.it/", name = "allegaDocumento")
    public JAXBElement<AllegaDocumento> createAllegaDocumento(AllegaDocumento value) {
        return new JAXBElement<AllegaDocumento>(_AllegaDocumento_QNAME, AllegaDocumento.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InviaProtocollo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.jprotocollo.jente.infor.arezzo.it/", name = "inviaProtocollo")
    public JAXBElement<InviaProtocollo> createInviaProtocollo(InviaProtocollo value) {
        return new JAXBElement<InviaProtocollo>(_InviaProtocollo_QNAME, InviaProtocollo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InserisciInternoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.jprotocollo.jente.infor.arezzo.it/", name = "inserisciInternoResponse")
    public JAXBElement<InserisciInternoResponse> createInserisciInternoResponse(InserisciInternoResponse value) {
        return new JAXBElement<InserisciInternoResponse>(_InserisciInternoResponse_QNAME, InserisciInternoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InserisciPartenza }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.jprotocollo.jente.infor.arezzo.it/", name = "inserisciPartenza")
    public JAXBElement<InserisciPartenza> createInserisciPartenza(InserisciPartenza value) {
        return new JAXBElement<InserisciPartenza>(_InserisciPartenza_QNAME, InserisciPartenza.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InserisciInterno }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.jprotocollo.jente.infor.arezzo.it/", name = "inserisciInterno")
    public JAXBElement<InserisciInterno> createInserisciInterno(InserisciInterno value) {
        return new JAXBElement<InserisciInterno>(_InserisciInterno_QNAME, InserisciInterno.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LeggiAllegatoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.jprotocollo.jente.infor.arezzo.it/", name = "leggiAllegatoResponse")
    public JAXBElement<LeggiAllegatoResponse> createLeggiAllegatoResponse(LeggiAllegatoResponse value) {
        return new JAXBElement<LeggiAllegatoResponse>(_LeggiAllegatoResponse_QNAME, LeggiAllegatoResponse.class, null, value);
    }

}
