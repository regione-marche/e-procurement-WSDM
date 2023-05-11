
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfint;
import org.datacontract.schemas._2004._07.siav_classification_entities_common.ArrayOfDocumentIdentifier;
import org.datacontract.schemas._2004._07.siav_classification_entities_fascicoli.ArrayOfBaseFascicolo;
import org.datacontract.schemas._2004._07.siav_classification_entities_fascicoli.ArrayOfCampiTipoFascicoloValue;
import org.datacontract.schemas._2004._07.siav_classification_entities_fascicoli.ArrayOfFascicoloEntity;
import org.datacontract.schemas._2004._07.siav_classification_entities_fascicoli.ArrayOfFascicoloHistory;
import org.datacontract.schemas._2004._07.siav_classification_entities_fascicoli.ArrayOfLegislatura;
import org.datacontract.schemas._2004._07.siav_classification_entities_fascicoli.FascicoloEntity;
import org.datacontract.schemas._2004._07.siav_classification_entities_fascicoli.FascicoloIdentifier;
import org.datacontract.schemas._2004._07.siav_classification_entities_fascicoli.FascicoloSearcher;
import org.datacontract.schemas._2004._07.siav_classification_entities_fascicoli.Legislatura;
import org.datacontract.schemas._2004._07.siav_classification_entities_fascicoli.LegislaturaIdentifier;
import org.datacontract.schemas._2004._07.siav_classification_entities_tipofascicolo.TipoFascicoloIdentifier;
import org.datacontract.schemas._2004._07.siav_common_baseclass.ArrayOfBaseNote;
import org.datacontract.schemas._2004._07.siav_common_baseclass.BaseIdentifier;
import org.datacontract.schemas._2004._07.siav_common_baseclass.BaseNote;
import org.datacontract.schemas._2004._07.siav_common_baseclass.BaseVisibility;
import org.datacontract.schemas._2004._07.siav_common_baseclass.DateIdentifier;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.tempuri package. 
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

    private final static QName _UpdateFascicolo2PBaseVis_QNAME = new QName("http://tempuri.org/", "pBaseVis");
    private final static QName _UpdateFascicolo2UtenteId_QNAME = new QName("http://tempuri.org/", "UtenteId");
    private final static QName _UpdateFascicolo2PCampiTipoFascColl_QNAME = new QName("http://tempuri.org/", "pCampiTipoFascColl");
    private final static QName _UpdateFascicolo2PFascEntity_QNAME = new QName("http://tempuri.org/", "pFascEntity");
    private final static QName _OpenFascicoloPk_QNAME = new QName("http://tempuri.org/", "Pk");
    private final static QName _DeleteLegislaturaPLegisId_QNAME = new QName("http://tempuri.org/", "pLegisId");
    private final static QName _ReadBaseFascicoloResponsePBaseFascColl_QNAME = new QName("http://tempuri.org/", "pBaseFascColl");
    private final static QName _InsertFascicoloPUtenteId_QNAME = new QName("http://tempuri.org/", "pUtenteId");
    private final static QName _SearchFascicoloResponsePFascColl_QNAME = new QName("http://tempuri.org/", "pFascColl");
    private final static QName _SearchBaseFascicoloPFascSearcher_QNAME = new QName("http://tempuri.org/", "pFascSearcher");
    private final static QName _DeleteFascicoloPFascId_QNAME = new QName("http://tempuri.org/", "pFascId");
    private final static QName _InsertValoreCampiTipoFascicoloPTipoFascId_QNAME = new QName("http://tempuri.org/", "pTipoFascId");
    private final static QName _SendFascicoloStrMessage_QNAME = new QName("http://tempuri.org/", "strMessage");
    private final static QName _InsertFascicolo2ResponseStrCode_QNAME = new QName("http://tempuri.org/", "strCode");
    private final static QName _InsertLegislaturaPLegis_QNAME = new QName("http://tempuri.org/", "pLegis");
    private final static QName _ReadCardsInFolderPUserId_QNAME = new QName("http://tempuri.org/", "pUserId");
    private final static QName _ReadCardsInFolderResponsePDocIdColl_QNAME = new QName("http://tempuri.org/", "pDocIdColl");
    private final static QName _ReadValoreCampiTipoFascicoloResponsePCampitipoFascColl_QNAME = new QName("http://tempuri.org/", "pCampitipoFascColl");
    private final static QName _ReadFascicoloNotesResponsePBaseNoteColl_QNAME = new QName("http://tempuri.org/", "pBaseNoteColl");
    private final static QName _GetClassificheValideResponseListTitItemId_QNAME = new QName("http://tempuri.org/", "ListTitItemId");
    private final static QName _ReadFascicoloHierarchyResponsePFascHierarchyColl_QNAME = new QName("http://tempuri.org/", "pFascHierarchyColl");
    private final static QName _ReadFascicoloHistoryPagedResponsePFascHistoryColl_QNAME = new QName("http://tempuri.org/", "pFascHistoryColl");
    private final static QName _ReadLegislaturaResponsePLegisColl_QNAME = new QName("http://tempuri.org/", "pLegisColl");
    private final static QName _InsertFascicoloNoteResponseNoteInfo_QNAME = new QName("http://tempuri.org/", "NoteInfo");
    private final static QName _InsertFascicoloNotePBaseNote_QNAME = new QName("http://tempuri.org/", "pBaseNote");
    private final static QName _InsertFascicolo2PUtenteID_QNAME = new QName("http://tempuri.org/", "pUtenteID");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.tempuri
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link UpdateFascicolo2 }
     * 
     */
    public UpdateFascicolo2 createUpdateFascicolo2() {
        return new UpdateFascicolo2();
    }

    /**
     * Create an instance of {@link UpdateFascicoloResponse }
     * 
     */
    public UpdateFascicoloResponse createUpdateFascicoloResponse() {
        return new UpdateFascicoloResponse();
    }

    /**
     * Create an instance of {@link DeleteLegislatura }
     * 
     */
    public DeleteLegislatura createDeleteLegislatura() {
        return new DeleteLegislatura();
    }

    /**
     * Create an instance of {@link CheckOutResponse }
     * 
     */
    public CheckOutResponse createCheckOutResponse() {
        return new CheckOutResponse();
    }

    /**
     * Create an instance of {@link InsertFascicolo }
     * 
     */
    public InsertFascicolo createInsertFascicolo() {
        return new InsertFascicolo();
    }

    /**
     * Create an instance of {@link SearchFascicoloResponse }
     * 
     */
    public SearchFascicoloResponse createSearchFascicoloResponse() {
        return new SearchFascicoloResponse();
    }

    /**
     * Create an instance of {@link RecoveryFascicolo }
     * 
     */
    public RecoveryFascicolo createRecoveryFascicolo() {
        return new RecoveryFascicolo();
    }

    /**
     * Create an instance of {@link ReadFascicoloVisibility }
     * 
     */
    public ReadFascicoloVisibility createReadFascicoloVisibility() {
        return new ReadFascicoloVisibility();
    }

    /**
     * Create an instance of {@link UpdateFascicolo2Response }
     * 
     */
    public UpdateFascicolo2Response createUpdateFascicolo2Response() {
        return new UpdateFascicolo2Response();
    }

    /**
     * Create an instance of {@link SearchBaseFascicoloResponse }
     * 
     */
    public SearchBaseFascicoloResponse createSearchBaseFascicoloResponse() {
        return new SearchBaseFascicoloResponse();
    }

    /**
     * Create an instance of {@link CheckOut }
     * 
     */
    public CheckOut createCheckOut() {
        return new CheckOut();
    }

    /**
     * Create an instance of {@link UpdateClassificaFascicoloResponse }
     * 
     */
    public UpdateClassificaFascicoloResponse createUpdateClassificaFascicoloResponse() {
        return new UpdateClassificaFascicoloResponse();
    }

    /**
     * Create an instance of {@link ReadCardsInFolder }
     * 
     */
    public ReadCardsInFolder createReadCardsInFolder() {
        return new ReadCardsInFolder();
    }

    /**
     * Create an instance of {@link UpdateFascicolo }
     * 
     */
    public UpdateFascicolo createUpdateFascicolo() {
        return new UpdateFascicolo();
    }

    /**
     * Create an instance of {@link IsFascicoloUsedResponse }
     * 
     */
    public IsFascicoloUsedResponse createIsFascicoloUsedResponse() {
        return new IsFascicoloUsedResponse();
    }

    /**
     * Create an instance of {@link DeleteCampiTipoFascicoloValue }
     * 
     */
    public DeleteCampiTipoFascicoloValue createDeleteCampiTipoFascicoloValue() {
        return new DeleteCampiTipoFascicoloValue();
    }

    /**
     * Create an instance of {@link ReadFascicoloVisibilityResponse }
     * 
     */
    public ReadFascicoloVisibilityResponse createReadFascicoloVisibilityResponse() {
        return new ReadFascicoloVisibilityResponse();
    }

    /**
     * Create an instance of {@link DeleteLegislaturaResponse }
     * 
     */
    public DeleteLegislaturaResponse createDeleteLegislaturaResponse() {
        return new DeleteLegislaturaResponse();
    }

    /**
     * Create an instance of {@link GetClassificheValideResponse }
     * 
     */
    public GetClassificheValideResponse createGetClassificheValideResponse() {
        return new GetClassificheValideResponse();
    }

    /**
     * Create an instance of {@link ReadFascicoloHierarchyResponse }
     * 
     */
    public ReadFascicoloHierarchyResponse createReadFascicoloHierarchyResponse() {
        return new ReadFascicoloHierarchyResponse();
    }

    /**
     * Create an instance of {@link DeleteCheckOut }
     * 
     */
    public DeleteCheckOut createDeleteCheckOut() {
        return new DeleteCheckOut();
    }

    /**
     * Create an instance of {@link ReadFascicoloHierarchy }
     * 
     */
    public ReadFascicoloHierarchy createReadFascicoloHierarchy() {
        return new ReadFascicoloHierarchy();
    }

    /**
     * Create an instance of {@link DeleteFascicoloResponse }
     * 
     */
    public DeleteFascicoloResponse createDeleteFascicoloResponse() {
        return new DeleteFascicoloResponse();
    }

    /**
     * Create an instance of {@link IsFascicoloUsed }
     * 
     */
    public IsFascicoloUsed createIsFascicoloUsed() {
        return new IsFascicoloUsed();
    }

    /**
     * Create an instance of {@link UpdateStatoFascicoloResponse }
     * 
     */
    public UpdateStatoFascicoloResponse createUpdateStatoFascicoloResponse() {
        return new UpdateStatoFascicoloResponse();
    }

    /**
     * Create an instance of {@link ReadFascicoloHistory }
     * 
     */
    public ReadFascicoloHistory createReadFascicoloHistory() {
        return new ReadFascicoloHistory();
    }

    /**
     * Create an instance of {@link CheckIn }
     * 
     */
    public CheckIn createCheckIn() {
        return new CheckIn();
    }

    /**
     * Create an instance of {@link OpenFascicoloResponse }
     * 
     */
    public OpenFascicoloResponse createOpenFascicoloResponse() {
        return new OpenFascicoloResponse();
    }

    /**
     * Create an instance of {@link GetClassificheValide }
     * 
     */
    public GetClassificheValide createGetClassificheValide() {
        return new GetClassificheValide();
    }

    /**
     * Create an instance of {@link UpdateLegislaturaResponse }
     * 
     */
    public UpdateLegislaturaResponse createUpdateLegislaturaResponse() {
        return new UpdateLegislaturaResponse();
    }

    /**
     * Create an instance of {@link ReadFascicoloResponse }
     * 
     */
    public ReadFascicoloResponse createReadFascicoloResponse() {
        return new ReadFascicoloResponse();
    }

    /**
     * Create an instance of {@link ReadFascicoloHistoryResponse }
     * 
     */
    public ReadFascicoloHistoryResponse createReadFascicoloHistoryResponse() {
        return new ReadFascicoloHistoryResponse();
    }

    /**
     * Create an instance of {@link ReadLegislatura }
     * 
     */
    public ReadLegislatura createReadLegislatura() {
        return new ReadLegislatura();
    }

    /**
     * Create an instance of {@link InsertFascicoloNote }
     * 
     */
    public InsertFascicoloNote createInsertFascicoloNote() {
        return new InsertFascicoloNote();
    }

    /**
     * Create an instance of {@link UpdateLegislatura }
     * 
     */
    public UpdateLegislatura createUpdateLegislatura() {
        return new UpdateLegislatura();
    }

    /**
     * Create an instance of {@link OpenFascicolo }
     * 
     */
    public OpenFascicolo createOpenFascicolo() {
        return new OpenFascicolo();
    }

    /**
     * Create an instance of {@link ReadBaseFascicoloResponse }
     * 
     */
    public ReadBaseFascicoloResponse createReadBaseFascicoloResponse() {
        return new ReadBaseFascicoloResponse();
    }

    /**
     * Create an instance of {@link SendFascicoloResponse }
     * 
     */
    public SendFascicoloResponse createSendFascicoloResponse() {
        return new SendFascicoloResponse();
    }

    /**
     * Create an instance of {@link SearchBaseFascicolo }
     * 
     */
    public SearchBaseFascicolo createSearchBaseFascicolo() {
        return new SearchBaseFascicolo();
    }

    /**
     * Create an instance of {@link RecoveryFascicoloResponse }
     * 
     */
    public RecoveryFascicoloResponse createRecoveryFascicoloResponse() {
        return new RecoveryFascicoloResponse();
    }

    /**
     * Create an instance of {@link DeleteFascicolo }
     * 
     */
    public DeleteFascicolo createDeleteFascicolo() {
        return new DeleteFascicolo();
    }

    /**
     * Create an instance of {@link DeleteAllFascicoliDelResponse }
     * 
     */
    public DeleteAllFascicoliDelResponse createDeleteAllFascicoliDelResponse() {
        return new DeleteAllFascicoliDelResponse();
    }

    /**
     * Create an instance of {@link InsertFascicoloVisibility }
     * 
     */
    public InsertFascicoloVisibility createInsertFascicoloVisibility() {
        return new InsertFascicoloVisibility();
    }

    /**
     * Create an instance of {@link ReadBaseFascicolo }
     * 
     */
    public ReadBaseFascicolo createReadBaseFascicolo() {
        return new ReadBaseFascicolo();
    }

    /**
     * Create an instance of {@link InsertFascicoloResponse }
     * 
     */
    public InsertFascicoloResponse createInsertFascicoloResponse() {
        return new InsertFascicoloResponse();
    }

    /**
     * Create an instance of {@link ReadValoreCampiTipoFascicolo }
     * 
     */
    public ReadValoreCampiTipoFascicolo createReadValoreCampiTipoFascicolo() {
        return new ReadValoreCampiTipoFascicolo();
    }

    /**
     * Create an instance of {@link InsertValoreCampiTipoFascicolo }
     * 
     */
    public InsertValoreCampiTipoFascicolo createInsertValoreCampiTipoFascicolo() {
        return new InsertValoreCampiTipoFascicolo();
    }

    /**
     * Create an instance of {@link SearchFascicolo }
     * 
     */
    public SearchFascicolo createSearchFascicolo() {
        return new SearchFascicolo();
    }

    /**
     * Create an instance of {@link SendFascicolo }
     * 
     */
    public SendFascicolo createSendFascicolo() {
        return new SendFascicolo();
    }

    /**
     * Create an instance of {@link InsertFascicolo2Response }
     * 
     */
    public InsertFascicolo2Response createInsertFascicolo2Response() {
        return new InsertFascicolo2Response();
    }

    /**
     * Create an instance of {@link InsertValoreCampiTipoFascicoloResponse }
     * 
     */
    public InsertValoreCampiTipoFascicoloResponse createInsertValoreCampiTipoFascicoloResponse() {
        return new InsertValoreCampiTipoFascicoloResponse();
    }

    /**
     * Create an instance of {@link InsertLegislatura }
     * 
     */
    public InsertLegislatura createInsertLegislatura() {
        return new InsertLegislatura();
    }

    /**
     * Create an instance of {@link ReadCardsInFolderResponse }
     * 
     */
    public ReadCardsInFolderResponse createReadCardsInFolderResponse() {
        return new ReadCardsInFolderResponse();
    }

    /**
     * Create an instance of {@link DeleteCampiTipoFascicoloValueResponse }
     * 
     */
    public DeleteCampiTipoFascicoloValueResponse createDeleteCampiTipoFascicoloValueResponse() {
        return new DeleteCampiTipoFascicoloValueResponse();
    }

    /**
     * Create an instance of {@link ReadValoreCampiTipoFascicoloResponse }
     * 
     */
    public ReadValoreCampiTipoFascicoloResponse createReadValoreCampiTipoFascicoloResponse() {
        return new ReadValoreCampiTipoFascicoloResponse();
    }

    /**
     * Create an instance of {@link ReadFascicoloNotesResponse }
     * 
     */
    public ReadFascicoloNotesResponse createReadFascicoloNotesResponse() {
        return new ReadFascicoloNotesResponse();
    }

    /**
     * Create an instance of {@link DeleteCheckOutResponse }
     * 
     */
    public DeleteCheckOutResponse createDeleteCheckOutResponse() {
        return new DeleteCheckOutResponse();
    }

    /**
     * Create an instance of {@link CheckInResponse }
     * 
     */
    public CheckInResponse createCheckInResponse() {
        return new CheckInResponse();
    }

    /**
     * Create an instance of {@link InsertLegislaturaResponse }
     * 
     */
    public InsertLegislaturaResponse createInsertLegislaturaResponse() {
        return new InsertLegislaturaResponse();
    }

    /**
     * Create an instance of {@link ReadFascicoloHistoryPagedResponse }
     * 
     */
    public ReadFascicoloHistoryPagedResponse createReadFascicoloHistoryPagedResponse() {
        return new ReadFascicoloHistoryPagedResponse();
    }

    /**
     * Create an instance of {@link CloseFascicolo }
     * 
     */
    public CloseFascicolo createCloseFascicolo() {
        return new CloseFascicolo();
    }

    /**
     * Create an instance of {@link IsFascicoloInCurrentTitolarioResponse }
     * 
     */
    public IsFascicoloInCurrentTitolarioResponse createIsFascicoloInCurrentTitolarioResponse() {
        return new IsFascicoloInCurrentTitolarioResponse();
    }

    /**
     * Create an instance of {@link DeleteAllFascicoliDel }
     * 
     */
    public DeleteAllFascicoliDel createDeleteAllFascicoliDel() {
        return new DeleteAllFascicoliDel();
    }

    /**
     * Create an instance of {@link ReadFascicoloHistoryPaged }
     * 
     */
    public ReadFascicoloHistoryPaged createReadFascicoloHistoryPaged() {
        return new ReadFascicoloHistoryPaged();
    }

    /**
     * Create an instance of {@link UpdateClassificaFascicolo }
     * 
     */
    public UpdateClassificaFascicolo createUpdateClassificaFascicolo() {
        return new UpdateClassificaFascicolo();
    }

    /**
     * Create an instance of {@link ReadFascicoloNotes }
     * 
     */
    public ReadFascicoloNotes createReadFascicoloNotes() {
        return new ReadFascicoloNotes();
    }

    /**
     * Create an instance of {@link InsertFascicoloVisibilityResponse }
     * 
     */
    public InsertFascicoloVisibilityResponse createInsertFascicoloVisibilityResponse() {
        return new InsertFascicoloVisibilityResponse();
    }

    /**
     * Create an instance of {@link CloseFascicoloResponse }
     * 
     */
    public CloseFascicoloResponse createCloseFascicoloResponse() {
        return new CloseFascicoloResponse();
    }

    /**
     * Create an instance of {@link ReadLegislaturaResponse }
     * 
     */
    public ReadLegislaturaResponse createReadLegislaturaResponse() {
        return new ReadLegislaturaResponse();
    }

    /**
     * Create an instance of {@link InsertFascicoloNoteResponse }
     * 
     */
    public InsertFascicoloNoteResponse createInsertFascicoloNoteResponse() {
        return new InsertFascicoloNoteResponse();
    }

    /**
     * Create an instance of {@link ReadFascicolo }
     * 
     */
    public ReadFascicolo createReadFascicolo() {
        return new ReadFascicolo();
    }

    /**
     * Create an instance of {@link UpdateStatoFascicolo }
     * 
     */
    public UpdateStatoFascicolo createUpdateStatoFascicolo() {
        return new UpdateStatoFascicolo();
    }

    /**
     * Create an instance of {@link IsFascicoloInCurrentTitolario }
     * 
     */
    public IsFascicoloInCurrentTitolario createIsFascicoloInCurrentTitolario() {
        return new IsFascicoloInCurrentTitolario();
    }

    /**
     * Create an instance of {@link InsertFascicolo2 }
     * 
     */
    public InsertFascicolo2 createInsertFascicolo2() {
        return new InsertFascicolo2();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseVisibility }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "pBaseVis", scope = UpdateFascicolo2 .class)
    public JAXBElement<BaseVisibility> createUpdateFascicolo2PBaseVis(BaseVisibility value) {
        return new JAXBElement<BaseVisibility>(_UpdateFascicolo2PBaseVis_QNAME, BaseVisibility.class, UpdateFascicolo2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "UtenteId", scope = UpdateFascicolo2 .class)
    public JAXBElement<BaseIdentifier> createUpdateFascicolo2UtenteId(BaseIdentifier value) {
        return new JAXBElement<BaseIdentifier>(_UpdateFascicolo2UtenteId_QNAME, BaseIdentifier.class, UpdateFascicolo2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCampiTipoFascicoloValue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "pCampiTipoFascColl", scope = UpdateFascicolo2 .class)
    public JAXBElement<ArrayOfCampiTipoFascicoloValue> createUpdateFascicolo2PCampiTipoFascColl(ArrayOfCampiTipoFascicoloValue value) {
        return new JAXBElement<ArrayOfCampiTipoFascicoloValue>(_UpdateFascicolo2PCampiTipoFascColl_QNAME, ArrayOfCampiTipoFascicoloValue.class, UpdateFascicolo2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FascicoloEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "pFascEntity", scope = UpdateFascicolo2 .class)
    public JAXBElement<FascicoloEntity> createUpdateFascicolo2PFascEntity(FascicoloEntity value) {
        return new JAXBElement<FascicoloEntity>(_UpdateFascicolo2PFascEntity_QNAME, FascicoloEntity.class, UpdateFascicolo2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "UtenteId", scope = OpenFascicolo.class)
    public JAXBElement<BaseIdentifier> createOpenFascicoloUtenteId(BaseIdentifier value) {
        return new JAXBElement<BaseIdentifier>(_UpdateFascicolo2UtenteId_QNAME, BaseIdentifier.class, OpenFascicolo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FascicoloIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Pk", scope = OpenFascicolo.class)
    public JAXBElement<FascicoloIdentifier> createOpenFascicoloPk(FascicoloIdentifier value) {
        return new JAXBElement<FascicoloIdentifier>(_OpenFascicoloPk_QNAME, FascicoloIdentifier.class, OpenFascicolo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LegislaturaIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "pLegisId", scope = DeleteLegislatura.class)
    public JAXBElement<LegislaturaIdentifier> createDeleteLegislaturaPLegisId(LegislaturaIdentifier value) {
        return new JAXBElement<LegislaturaIdentifier>(_DeleteLegislaturaPLegisId_QNAME, LegislaturaIdentifier.class, DeleteLegislatura.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfBaseFascicolo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "pBaseFascColl", scope = ReadBaseFascicoloResponse.class)
    public JAXBElement<ArrayOfBaseFascicolo> createReadBaseFascicoloResponsePBaseFascColl(ArrayOfBaseFascicolo value) {
        return new JAXBElement<ArrayOfBaseFascicolo>(_ReadBaseFascicoloResponsePBaseFascColl_QNAME, ArrayOfBaseFascicolo.class, ReadBaseFascicoloResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "pUtenteId", scope = InsertFascicolo.class)
    public JAXBElement<BaseIdentifier> createInsertFascicoloPUtenteId(BaseIdentifier value) {
        return new JAXBElement<BaseIdentifier>(_InsertFascicoloPUtenteId_QNAME, BaseIdentifier.class, InsertFascicolo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FascicoloEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "pFascEntity", scope = InsertFascicolo.class)
    public JAXBElement<FascicoloEntity> createInsertFascicoloPFascEntity(FascicoloEntity value) {
        return new JAXBElement<FascicoloEntity>(_UpdateFascicolo2PFascEntity_QNAME, FascicoloEntity.class, InsertFascicolo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfFascicoloEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "pFascColl", scope = SearchFascicoloResponse.class)
    public JAXBElement<ArrayOfFascicoloEntity> createSearchFascicoloResponsePFascColl(ArrayOfFascicoloEntity value) {
        return new JAXBElement<ArrayOfFascicoloEntity>(_SearchFascicoloResponsePFascColl_QNAME, ArrayOfFascicoloEntity.class, SearchFascicoloResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FascicoloSearcher }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "pFascSearcher", scope = SearchBaseFascicolo.class)
    public JAXBElement<FascicoloSearcher> createSearchBaseFascicoloPFascSearcher(FascicoloSearcher value) {
        return new JAXBElement<FascicoloSearcher>(_SearchBaseFascicoloPFascSearcher_QNAME, FascicoloSearcher.class, SearchBaseFascicolo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "UtenteId", scope = RecoveryFascicolo.class)
    public JAXBElement<BaseIdentifier> createRecoveryFascicoloUtenteId(BaseIdentifier value) {
        return new JAXBElement<BaseIdentifier>(_UpdateFascicolo2UtenteId_QNAME, BaseIdentifier.class, RecoveryFascicolo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FascicoloIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Pk", scope = RecoveryFascicolo.class)
    public JAXBElement<FascicoloIdentifier> createRecoveryFascicoloPk(FascicoloIdentifier value) {
        return new JAXBElement<FascicoloIdentifier>(_OpenFascicoloPk_QNAME, FascicoloIdentifier.class, RecoveryFascicolo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "pUtenteId", scope = DeleteFascicolo.class)
    public JAXBElement<BaseIdentifier> createDeleteFascicoloPUtenteId(BaseIdentifier value) {
        return new JAXBElement<BaseIdentifier>(_InsertFascicoloPUtenteId_QNAME, BaseIdentifier.class, DeleteFascicolo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FascicoloIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "pFascId", scope = DeleteFascicolo.class)
    public JAXBElement<FascicoloIdentifier> createDeleteFascicoloPFascId(FascicoloIdentifier value) {
        return new JAXBElement<FascicoloIdentifier>(_DeleteFascicoloPFascId_QNAME, FascicoloIdentifier.class, DeleteFascicolo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FascicoloIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "pFascId", scope = ReadFascicoloVisibility.class)
    public JAXBElement<FascicoloIdentifier> createReadFascicoloVisibilityPFascId(FascicoloIdentifier value) {
        return new JAXBElement<FascicoloIdentifier>(_DeleteFascicoloPFascId_QNAME, FascicoloIdentifier.class, ReadFascicoloVisibility.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseVisibility }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "pBaseVis", scope = InsertFascicoloVisibility.class)
    public JAXBElement<BaseVisibility> createInsertFascicoloVisibilityPBaseVis(BaseVisibility value) {
        return new JAXBElement<BaseVisibility>(_UpdateFascicolo2PBaseVis_QNAME, BaseVisibility.class, InsertFascicoloVisibility.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FascicoloIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "pFascId", scope = InsertFascicoloVisibility.class)
    public JAXBElement<FascicoloIdentifier> createInsertFascicoloVisibilityPFascId(FascicoloIdentifier value) {
        return new JAXBElement<FascicoloIdentifier>(_DeleteFascicoloPFascId_QNAME, FascicoloIdentifier.class, InsertFascicoloVisibility.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FascicoloSearcher }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "pFascSearcher", scope = ReadBaseFascicolo.class)
    public JAXBElement<FascicoloSearcher> createReadBaseFascicoloPFascSearcher(FascicoloSearcher value) {
        return new JAXBElement<FascicoloSearcher>(_SearchBaseFascicoloPFascSearcher_QNAME, FascicoloSearcher.class, ReadBaseFascicolo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FascicoloIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "pFascId", scope = InsertFascicoloResponse.class)
    public JAXBElement<FascicoloIdentifier> createInsertFascicoloResponsePFascId(FascicoloIdentifier value) {
        return new JAXBElement<FascicoloIdentifier>(_DeleteFascicoloPFascId_QNAME, FascicoloIdentifier.class, InsertFascicoloResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FascicoloIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "pFascId", scope = ReadValoreCampiTipoFascicolo.class)
    public JAXBElement<FascicoloIdentifier> createReadValoreCampiTipoFascicoloPFascId(FascicoloIdentifier value) {
        return new JAXBElement<FascicoloIdentifier>(_DeleteFascicoloPFascId_QNAME, FascicoloIdentifier.class, ReadValoreCampiTipoFascicolo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfBaseFascicolo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "pBaseFascColl", scope = SearchBaseFascicoloResponse.class)
    public JAXBElement<ArrayOfBaseFascicolo> createSearchBaseFascicoloResponsePBaseFascColl(ArrayOfBaseFascicolo value) {
        return new JAXBElement<ArrayOfBaseFascicolo>(_ReadBaseFascicoloResponsePBaseFascColl_QNAME, ArrayOfBaseFascicolo.class, SearchBaseFascicoloResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCampiTipoFascicoloValue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "pCampiTipoFascColl", scope = InsertValoreCampiTipoFascicolo.class)
    public JAXBElement<ArrayOfCampiTipoFascicoloValue> createInsertValoreCampiTipoFascicoloPCampiTipoFascColl(ArrayOfCampiTipoFascicoloValue value) {
        return new JAXBElement<ArrayOfCampiTipoFascicoloValue>(_UpdateFascicolo2PCampiTipoFascColl_QNAME, ArrayOfCampiTipoFascicoloValue.class, InsertValoreCampiTipoFascicolo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoFascicoloIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "pTipoFascId", scope = InsertValoreCampiTipoFascicolo.class)
    public JAXBElement<TipoFascicoloIdentifier> createInsertValoreCampiTipoFascicoloPTipoFascId(TipoFascicoloIdentifier value) {
        return new JAXBElement<TipoFascicoloIdentifier>(_InsertValoreCampiTipoFascicoloPTipoFascId_QNAME, TipoFascicoloIdentifier.class, InsertValoreCampiTipoFascicolo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FascicoloIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "pFascId", scope = InsertValoreCampiTipoFascicolo.class)
    public JAXBElement<FascicoloIdentifier> createInsertValoreCampiTipoFascicoloPFascId(FascicoloIdentifier value) {
        return new JAXBElement<FascicoloIdentifier>(_DeleteFascicoloPFascId_QNAME, FascicoloIdentifier.class, InsertValoreCampiTipoFascicolo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FascicoloSearcher }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "pFascSearcher", scope = SearchFascicolo.class)
    public JAXBElement<FascicoloSearcher> createSearchFascicoloPFascSearcher(FascicoloSearcher value) {
        return new JAXBElement<FascicoloSearcher>(_SearchBaseFascicoloPFascSearcher_QNAME, FascicoloSearcher.class, SearchFascicolo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseVisibility }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "pBaseVis", scope = SendFascicolo.class)
    public JAXBElement<BaseVisibility> createSendFascicoloPBaseVis(BaseVisibility value) {
        return new JAXBElement<BaseVisibility>(_UpdateFascicolo2PBaseVis_QNAME, BaseVisibility.class, SendFascicolo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "strMessage", scope = SendFascicolo.class)
    public JAXBElement<String> createSendFascicoloStrMessage(String value) {
        return new JAXBElement<String>(_SendFascicoloStrMessage_QNAME, String.class, SendFascicolo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "pUtenteId", scope = SendFascicolo.class)
    public JAXBElement<BaseIdentifier> createSendFascicoloPUtenteId(BaseIdentifier value) {
        return new JAXBElement<BaseIdentifier>(_InsertFascicoloPUtenteId_QNAME, BaseIdentifier.class, SendFascicolo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FascicoloIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "pFascId", scope = SendFascicolo.class)
    public JAXBElement<FascicoloIdentifier> createSendFascicoloPFascId(FascicoloIdentifier value) {
        return new JAXBElement<FascicoloIdentifier>(_DeleteFascicoloPFascId_QNAME, FascicoloIdentifier.class, SendFascicolo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "strCode", scope = InsertFascicolo2Response.class)
    public JAXBElement<String> createInsertFascicolo2ResponseStrCode(String value) {
        return new JAXBElement<String>(_InsertFascicolo2ResponseStrCode_QNAME, String.class, InsertFascicolo2Response.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FascicoloIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "pFascId", scope = InsertFascicolo2Response.class)
    public JAXBElement<FascicoloIdentifier> createInsertFascicolo2ResponsePFascId(FascicoloIdentifier value) {
        return new JAXBElement<FascicoloIdentifier>(_DeleteFascicoloPFascId_QNAME, FascicoloIdentifier.class, InsertFascicolo2Response.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Legislatura }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "pLegis", scope = InsertLegislatura.class)
    public JAXBElement<Legislatura> createInsertLegislaturaPLegis(Legislatura value) {
        return new JAXBElement<Legislatura>(_InsertLegislaturaPLegis_QNAME, Legislatura.class, InsertLegislatura.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "pUserId", scope = ReadCardsInFolder.class)
    public JAXBElement<BaseIdentifier> createReadCardsInFolderPUserId(BaseIdentifier value) {
        return new JAXBElement<BaseIdentifier>(_ReadCardsInFolderPUserId_QNAME, BaseIdentifier.class, ReadCardsInFolder.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FascicoloIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "pFascId", scope = ReadCardsInFolder.class)
    public JAXBElement<FascicoloIdentifier> createReadCardsInFolderPFascId(FascicoloIdentifier value) {
        return new JAXBElement<FascicoloIdentifier>(_DeleteFascicoloPFascId_QNAME, FascicoloIdentifier.class, ReadCardsInFolder.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDocumentIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "pDocIdColl", scope = ReadCardsInFolderResponse.class)
    public JAXBElement<ArrayOfDocumentIdentifier> createReadCardsInFolderResponsePDocIdColl(ArrayOfDocumentIdentifier value) {
        return new JAXBElement<ArrayOfDocumentIdentifier>(_ReadCardsInFolderResponsePDocIdColl_QNAME, ArrayOfDocumentIdentifier.class, ReadCardsInFolderResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "pUtenteId", scope = UpdateFascicolo.class)
    public JAXBElement<BaseIdentifier> createUpdateFascicoloPUtenteId(BaseIdentifier value) {
        return new JAXBElement<BaseIdentifier>(_InsertFascicoloPUtenteId_QNAME, BaseIdentifier.class, UpdateFascicolo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FascicoloEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "pFascEntity", scope = UpdateFascicolo.class)
    public JAXBElement<FascicoloEntity> createUpdateFascicoloPFascEntity(FascicoloEntity value) {
        return new JAXBElement<FascicoloEntity>(_UpdateFascicolo2PFascEntity_QNAME, FascicoloEntity.class, UpdateFascicolo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FascicoloIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "pFascId", scope = DeleteCampiTipoFascicoloValue.class)
    public JAXBElement<FascicoloIdentifier> createDeleteCampiTipoFascicoloValuePFascId(FascicoloIdentifier value) {
        return new JAXBElement<FascicoloIdentifier>(_DeleteFascicoloPFascId_QNAME, FascicoloIdentifier.class, DeleteCampiTipoFascicoloValue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseVisibility }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "pBaseVis", scope = ReadFascicoloVisibilityResponse.class)
    public JAXBElement<BaseVisibility> createReadFascicoloVisibilityResponsePBaseVis(BaseVisibility value) {
        return new JAXBElement<BaseVisibility>(_UpdateFascicolo2PBaseVis_QNAME, BaseVisibility.class, ReadFascicoloVisibilityResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCampiTipoFascicoloValue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "pCampitipoFascColl", scope = ReadValoreCampiTipoFascicoloResponse.class)
    public JAXBElement<ArrayOfCampiTipoFascicoloValue> createReadValoreCampiTipoFascicoloResponsePCampitipoFascColl(ArrayOfCampiTipoFascicoloValue value) {
        return new JAXBElement<ArrayOfCampiTipoFascicoloValue>(_ReadValoreCampiTipoFascicoloResponsePCampitipoFascColl_QNAME, ArrayOfCampiTipoFascicoloValue.class, ReadValoreCampiTipoFascicoloResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfBaseNote }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "pBaseNoteColl", scope = ReadFascicoloNotesResponse.class)
    public JAXBElement<ArrayOfBaseNote> createReadFascicoloNotesResponsePBaseNoteColl(ArrayOfBaseNote value) {
        return new JAXBElement<ArrayOfBaseNote>(_ReadFascicoloNotesResponsePBaseNoteColl_QNAME, ArrayOfBaseNote.class, ReadFascicoloNotesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ListTitItemId", scope = GetClassificheValideResponse.class)
    public JAXBElement<ArrayOfint> createGetClassificheValideResponseListTitItemId(ArrayOfint value) {
        return new JAXBElement<ArrayOfint>(_GetClassificheValideResponseListTitItemId_QNAME, ArrayOfint.class, GetClassificheValideResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfBaseFascicolo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "pFascHierarchyColl", scope = ReadFascicoloHierarchyResponse.class)
    public JAXBElement<ArrayOfBaseFascicolo> createReadFascicoloHierarchyResponsePFascHierarchyColl(ArrayOfBaseFascicolo value) {
        return new JAXBElement<ArrayOfBaseFascicolo>(_ReadFascicoloHierarchyResponsePFascHierarchyColl_QNAME, ArrayOfBaseFascicolo.class, ReadFascicoloHierarchyResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LegislaturaIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "pLegisId", scope = InsertLegislaturaResponse.class)
    public JAXBElement<LegislaturaIdentifier> createInsertLegislaturaResponsePLegisId(LegislaturaIdentifier value) {
        return new JAXBElement<LegislaturaIdentifier>(_DeleteLegislaturaPLegisId_QNAME, LegislaturaIdentifier.class, InsertLegislaturaResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfFascicoloHistory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "pFascHistoryColl", scope = ReadFascicoloHistoryPagedResponse.class)
    public JAXBElement<ArrayOfFascicoloHistory> createReadFascicoloHistoryPagedResponsePFascHistoryColl(ArrayOfFascicoloHistory value) {
        return new JAXBElement<ArrayOfFascicoloHistory>(_ReadFascicoloHistoryPagedResponsePFascHistoryColl_QNAME, ArrayOfFascicoloHistory.class, ReadFascicoloHistoryPagedResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "UtenteId", scope = ReadFascicoloHierarchy.class)
    public JAXBElement<BaseIdentifier> createReadFascicoloHierarchyUtenteId(BaseIdentifier value) {
        return new JAXBElement<BaseIdentifier>(_UpdateFascicolo2UtenteId_QNAME, BaseIdentifier.class, ReadFascicoloHierarchy.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FascicoloIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "pFascId", scope = ReadFascicoloHierarchy.class)
    public JAXBElement<FascicoloIdentifier> createReadFascicoloHierarchyPFascId(FascicoloIdentifier value) {
        return new JAXBElement<FascicoloIdentifier>(_DeleteFascicoloPFascId_QNAME, FascicoloIdentifier.class, ReadFascicoloHierarchy.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "UtenteId", scope = CloseFascicolo.class)
    public JAXBElement<BaseIdentifier> createCloseFascicoloUtenteId(BaseIdentifier value) {
        return new JAXBElement<BaseIdentifier>(_UpdateFascicolo2UtenteId_QNAME, BaseIdentifier.class, CloseFascicolo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FascicoloIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Pk", scope = CloseFascicolo.class)
    public JAXBElement<FascicoloIdentifier> createCloseFascicoloPk(FascicoloIdentifier value) {
        return new JAXBElement<FascicoloIdentifier>(_OpenFascicoloPk_QNAME, FascicoloIdentifier.class, CloseFascicolo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FascicoloIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Pk", scope = IsFascicoloUsed.class)
    public JAXBElement<FascicoloIdentifier> createIsFascicoloUsedPk(FascicoloIdentifier value) {
        return new JAXBElement<FascicoloIdentifier>(_OpenFascicoloPk_QNAME, FascicoloIdentifier.class, IsFascicoloUsed.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "pUtenteId", scope = DeleteAllFascicoliDel.class)
    public JAXBElement<BaseIdentifier> createDeleteAllFascicoliDelPUtenteId(BaseIdentifier value) {
        return new JAXBElement<BaseIdentifier>(_InsertFascicoloPUtenteId_QNAME, BaseIdentifier.class, DeleteAllFascicoliDel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FascicoloIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "pFascId", scope = ReadFascicoloHistoryPaged.class)
    public JAXBElement<FascicoloIdentifier> createReadFascicoloHistoryPagedPFascId(FascicoloIdentifier value) {
        return new JAXBElement<FascicoloIdentifier>(_DeleteFascicoloPFascId_QNAME, FascicoloIdentifier.class, ReadFascicoloHistoryPaged.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "pUtenteId", scope = UpdateClassificaFascicolo.class)
    public JAXBElement<BaseIdentifier> createUpdateClassificaFascicoloPUtenteId(BaseIdentifier value) {
        return new JAXBElement<BaseIdentifier>(_InsertFascicoloPUtenteId_QNAME, BaseIdentifier.class, UpdateClassificaFascicolo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FascicoloEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "pFascEntity", scope = UpdateClassificaFascicolo.class)
    public JAXBElement<FascicoloEntity> createUpdateClassificaFascicoloPFascEntity(FascicoloEntity value) {
        return new JAXBElement<FascicoloEntity>(_UpdateFascicolo2PFascEntity_QNAME, FascicoloEntity.class, UpdateClassificaFascicolo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FascicoloIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "pFascId", scope = ReadFascicoloHistory.class)
    public JAXBElement<FascicoloIdentifier> createReadFascicoloHistoryPFascId(FascicoloIdentifier value) {
        return new JAXBElement<FascicoloIdentifier>(_DeleteFascicoloPFascId_QNAME, FascicoloIdentifier.class, ReadFascicoloHistory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FascicoloIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "pFascId", scope = ReadFascicoloNotes.class)
    public JAXBElement<FascicoloIdentifier> createReadFascicoloNotesPFascId(FascicoloIdentifier value) {
        return new JAXBElement<FascicoloIdentifier>(_DeleteFascicoloPFascId_QNAME, FascicoloIdentifier.class, ReadFascicoloNotes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "UtenteId", scope = GetClassificheValide.class)
    public JAXBElement<BaseIdentifier> createGetClassificheValideUtenteId(BaseIdentifier value) {
        return new JAXBElement<BaseIdentifier>(_UpdateFascicolo2UtenteId_QNAME, BaseIdentifier.class, GetClassificheValide.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FascicoloIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Pk", scope = GetClassificheValide.class)
    public JAXBElement<FascicoloIdentifier> createGetClassificheValidePk(FascicoloIdentifier value) {
        return new JAXBElement<FascicoloIdentifier>(_OpenFascicoloPk_QNAME, FascicoloIdentifier.class, GetClassificheValide.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfFascicoloEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "pFascColl", scope = ReadFascicoloResponse.class)
    public JAXBElement<ArrayOfFascicoloEntity> createReadFascicoloResponsePFascColl(ArrayOfFascicoloEntity value) {
        return new JAXBElement<ArrayOfFascicoloEntity>(_SearchFascicoloResponsePFascColl_QNAME, ArrayOfFascicoloEntity.class, ReadFascicoloResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLegislatura }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "pLegisColl", scope = ReadLegislaturaResponse.class)
    public JAXBElement<ArrayOfLegislatura> createReadLegislaturaResponsePLegisColl(ArrayOfLegislatura value) {
        return new JAXBElement<ArrayOfLegislatura>(_ReadLegislaturaResponsePLegisColl_QNAME, ArrayOfLegislatura.class, ReadLegislaturaResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DateIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "NoteInfo", scope = InsertFascicoloNoteResponse.class)
    public JAXBElement<DateIdentifier> createInsertFascicoloNoteResponseNoteInfo(DateIdentifier value) {
        return new JAXBElement<DateIdentifier>(_InsertFascicoloNoteResponseNoteInfo_QNAME, DateIdentifier.class, InsertFascicoloNoteResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FascicoloSearcher }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "pFascSearcher", scope = ReadFascicolo.class)
    public JAXBElement<FascicoloSearcher> createReadFascicoloPFascSearcher(FascicoloSearcher value) {
        return new JAXBElement<FascicoloSearcher>(_SearchBaseFascicoloPFascSearcher_QNAME, FascicoloSearcher.class, ReadFascicolo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfFascicoloHistory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "pFascHistoryColl", scope = ReadFascicoloHistoryResponse.class)
    public JAXBElement<ArrayOfFascicoloHistory> createReadFascicoloHistoryResponsePFascHistoryColl(ArrayOfFascicoloHistory value) {
        return new JAXBElement<ArrayOfFascicoloHistory>(_ReadFascicoloHistoryPagedResponsePFascHistoryColl_QNAME, ArrayOfFascicoloHistory.class, ReadFascicoloHistoryResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LegislaturaIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "pLegisId", scope = ReadLegislatura.class)
    public JAXBElement<LegislaturaIdentifier> createReadLegislaturaPLegisId(LegislaturaIdentifier value) {
        return new JAXBElement<LegislaturaIdentifier>(_DeleteLegislaturaPLegisId_QNAME, LegislaturaIdentifier.class, ReadLegislatura.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FascicoloIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "pFascId", scope = UpdateStatoFascicolo.class)
    public JAXBElement<FascicoloIdentifier> createUpdateStatoFascicoloPFascId(FascicoloIdentifier value) {
        return new JAXBElement<FascicoloIdentifier>(_DeleteFascicoloPFascId_QNAME, FascicoloIdentifier.class, UpdateStatoFascicolo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseNote }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "pBaseNote", scope = InsertFascicoloNote.class)
    public JAXBElement<BaseNote> createInsertFascicoloNotePBaseNote(BaseNote value) {
        return new JAXBElement<BaseNote>(_InsertFascicoloNotePBaseNote_QNAME, BaseNote.class, InsertFascicoloNote.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FascicoloIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "pFascId", scope = InsertFascicoloNote.class)
    public JAXBElement<FascicoloIdentifier> createInsertFascicoloNotePFascId(FascicoloIdentifier value) {
        return new JAXBElement<FascicoloIdentifier>(_DeleteFascicoloPFascId_QNAME, FascicoloIdentifier.class, InsertFascicoloNote.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FascicoloIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Pk", scope = IsFascicoloInCurrentTitolario.class)
    public JAXBElement<FascicoloIdentifier> createIsFascicoloInCurrentTitolarioPk(FascicoloIdentifier value) {
        return new JAXBElement<FascicoloIdentifier>(_OpenFascicoloPk_QNAME, FascicoloIdentifier.class, IsFascicoloInCurrentTitolario.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Legislatura }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "pLegis", scope = UpdateLegislatura.class)
    public JAXBElement<Legislatura> createUpdateLegislaturaPLegis(Legislatura value) {
        return new JAXBElement<Legislatura>(_InsertLegislaturaPLegis_QNAME, Legislatura.class, UpdateLegislatura.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseVisibility }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "pBaseVis", scope = InsertFascicolo2 .class)
    public JAXBElement<BaseVisibility> createInsertFascicolo2PBaseVis(BaseVisibility value) {
        return new JAXBElement<BaseVisibility>(_UpdateFascicolo2PBaseVis_QNAME, BaseVisibility.class, InsertFascicolo2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCampiTipoFascicoloValue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "pCampiTipoFascColl", scope = InsertFascicolo2 .class)
    public JAXBElement<ArrayOfCampiTipoFascicoloValue> createInsertFascicolo2PCampiTipoFascColl(ArrayOfCampiTipoFascicoloValue value) {
        return new JAXBElement<ArrayOfCampiTipoFascicoloValue>(_UpdateFascicolo2PCampiTipoFascColl_QNAME, ArrayOfCampiTipoFascicoloValue.class, InsertFascicolo2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "pUtenteID", scope = InsertFascicolo2 .class)
    public JAXBElement<BaseIdentifier> createInsertFascicolo2PUtenteID(BaseIdentifier value) {
        return new JAXBElement<BaseIdentifier>(_InsertFascicolo2PUtenteID_QNAME, BaseIdentifier.class, InsertFascicolo2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FascicoloEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "pFascEntity", scope = InsertFascicolo2 .class)
    public JAXBElement<FascicoloEntity> createInsertFascicolo2PFascEntity(FascicoloEntity value) {
        return new JAXBElement<FascicoloEntity>(_UpdateFascicolo2PFascEntity_QNAME, FascicoloEntity.class, InsertFascicolo2 .class, value);
    }

}
