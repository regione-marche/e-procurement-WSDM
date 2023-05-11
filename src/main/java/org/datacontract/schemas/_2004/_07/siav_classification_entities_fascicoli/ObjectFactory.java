
package org.datacontract.schemas._2004._07.siav_classification_entities_fascicoli;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfint;
import org.datacontract.schemas._2004._07.siav_classification_entities_common.CustomDateTimeNullable;
import org.datacontract.schemas._2004._07.siav_classification_entities_common.DocumentIdentifier;
import org.datacontract.schemas._2004._07.siav_classification_entities_tipofascicolo.CampiTipoFascicoloIdentifier;
import org.datacontract.schemas._2004._07.siav_classification_entities_tipofascicolo.TipoFascicoloIdentifier;
import org.datacontract.schemas._2004._07.siav_classification_entities_titolario.TitolarioIdentifier;
import org.datacontract.schemas._2004._07.siav_classification_entities_titolarioitem.TitolarioItemIdentifier;
import org.datacontract.schemas._2004._07.siav_common_baseclass.BaseIdentifier;
import org.datacontract.schemas._2004._07.siav_common_baseclass.BaseVisibility;
import org.datacontract.schemas._2004._07.siav_common_baseclass.BaseVisibilityDesc;
import org.datacontract.schemas._2004._07.siav_common_baseclass.TypeIdentifierComplete;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.datacontract.schemas._2004._07.siav_classification_entities_fascicoli package. 
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

    private final static QName _BaseFascicolo_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject", "BaseFascicolo");
    private final static QName _ArrayOfBaseFascicolo_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject", "ArrayOfBaseFascicolo");
    private final static QName _FascicoloIdentifier_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.Identifier", "FascicoloIdentifier");
    private final static QName _ArrayOfLegislatura_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject", "ArrayOfLegislatura");
    private final static QName _ArrayOfFascicoloEntity_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject", "ArrayOfFascicoloEntity");
    private final static QName _ArrayOfCampiTipoFascicoloValue_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject", "ArrayOfCampiTipoFascicoloValue");
    private final static QName _LegislaturaIdentifier_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject", "LegislaturaIdentifier");
    private final static QName _CampiTipoFascicoloValue_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject", "CampiTipoFascicoloValue");
    private final static QName _FascicoloSearcher_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.Searcher", "FascicoloSearcher");
    private final static QName _FascicoloEntity_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject", "FascicoloEntity");
    private final static QName _Legislatura_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject", "Legislatura");
    private final static QName _FascicoloHistory_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject", "FascicoloHistory");
    private final static QName _ArrayOfFascicoloHistory_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject", "ArrayOfFascicoloHistory");
    private final static QName _FascicoloHistoryFascicoloOldId_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject", "FascicoloOldId");
    private final static QName _FascicoloHistoryHistoryVis_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject", "HistoryVis");
    private final static QName _FascicoloHistoryDocumentDesc_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject", "DocumentDesc");
    private final static QName _FascicoloHistoryNameAuthorDel_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject", "NameAuthorDel");
    private final static QName _FascicoloHistoryHistoryVisDesc_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject", "HistoryVisDesc");
    private final static QName _FascicoloHistoryDocumentId_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject", "DocumentId");
    private final static QName _BaseFascicoloCodeNumFree_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject", "CodeNumFree");
    private final static QName _BaseFascicoloTitolarioItemId_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject", "TitolarioItem_id");
    private final static QName _BaseFascicoloTipoFascicolo_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject", "TipoFascicolo");
    private final static QName _BaseFascicoloLabel_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject", "Label");
    private final static QName _BaseFascicoloFascicoloId_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject", "FascicoloId");
    private final static QName _BaseFascicoloClassificationCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject", "Classification_Code");
    private final static QName _BaseFascicoloParentId_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject", "ParentId");
    private final static QName _CampiTipoFascicoloValueCampoId_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject", "CampoId");
    private final static QName _CampiTipoFascicoloValueFascId_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject", "FascId");
    private final static QName _CampiTipoFascicoloValueValueStr_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject", "ValueStr");
    private final static QName _CampiTipoFascicoloValueValueDate_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject", "ValueDate");
    private final static QName _FascicoloEntityUOManufacturerDescription_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject", "UO_ManufacturerDescription");
    private final static QName _FascicoloEntityCloseData_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject", "CloseData");
    private final static QName _FascicoloEntityNote_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject", "Note");
    private final static QName _FascicoloEntityFirstDocumentId_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject", "FirstDocumentId");
    private final static QName _FascicoloEntityUserIdResp_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject", "UserId_Resp");
    private final static QName _FascicoloEntityLocationName_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject", "LocationName");
    private final static QName _FascicoloEntitySubject_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject", "Subject");
    private final static QName _FascicoloEntityOpenData_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject", "OpenData");
    private final static QName _FascicoloEntityThesaurus_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject", "Thesaurus");
    private final static QName _FascicoloEntityLastDocumentId_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject", "LastDocumentId");
    private final static QName _FascicoloEntityDescription_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject", "Description");
    private final static QName _FascicoloSearcherListUOResponsible_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.Searcher", "List_UO_Responsible");
    private final static QName _FascicoloSearcherParentId_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.Searcher", "ParentId");
    private final static QName _FascicoloSearcherTitolarioId_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.Searcher", "TitolarioId");
    private final static QName _FascicoloSearcherCodeNumFrom_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.Searcher", "Code_Num_From");
    private final static QName _FascicoloSearcherTitolarioItemId_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.Searcher", "TitolarioItem_id");
    private final static QName _FascicoloSearcherLocationName_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.Searcher", "LocationName");
    private final static QName _FascicoloSearcherCloseDataFrom_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.Searcher", "CloseDataFrom");
    private final static QName _FascicoloSearcherThesaurus_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.Searcher", "Thesaurus");
    private final static QName _FascicoloSearcherCodeNumTo_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.Searcher", "Code_Num_To");
    private final static QName _FascicoloSearcherFascicoloFields_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.Searcher", "FascicoloFields");
    private final static QName _FascicoloSearcherCloseDataTo_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.Searcher", "CloseDataTo");
    private final static QName _FascicoloSearcherSubject_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.Searcher", "Subject");
    private final static QName _FascicoloSearcherFascicoloIdTo_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.Searcher", "FascicoloId_To");
    private final static QName _FascicoloSearcherOpenDataFrom_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.Searcher", "OpenDataFrom");
    private final static QName _FascicoloSearcherOpenDataTo_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.Searcher", "OpenDataTo");
    private final static QName _FascicoloSearcherDescription_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.Searcher", "Description");
    private final static QName _FascicoloSearcherListUOManufacturer_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.Searcher", "List_UO_Manufacturer");
    private final static QName _FascicoloSearcherLegislaturaCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.Searcher", "LegislaturaCode");
    private final static QName _FascicoloSearcherFascicoloIdFrom_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.Searcher", "FascicoloId_From");
    private final static QName _FascicoloSearcherListUserIdResp_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.Searcher", "List_UserId_Resp");
    private final static QName _FascicoloSearcherNote_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.Searcher", "Note");
    private final static QName _FascicoloSearcherUtenteId_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.Searcher", "UtenteId");
    private final static QName _FascicoloSearcherClassificationCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.Searcher", "Classification_Code");
    private final static QName _FascicoloSearcherFascicoloVis_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.Searcher", "FascicoloVis");
    private final static QName _FascicoloSearcherCodeNum_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.Searcher", "Code_Num");
    private final static QName _FascicoloSearcherFascicoloId_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.Searcher", "FascicoloId");
    private final static QName _FascicoloSearcherTipoFascicolo_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.Searcher", "TipoFascicolo");
    private final static QName _FascicoloSearcherLabel_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.Searcher", "Label");
    private final static QName _FascicoloSearcherListClassificationID_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.Searcher", "List_Classification_ID");
    private final static QName _LegislaturaCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject", "Code");
    private final static QName _LegislaturaId_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject", "Id");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.datacontract.schemas._2004._07.siav_classification_entities_fascicoli
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link LegislaturaIdentifier }
     * 
     */
    public LegislaturaIdentifier createLegislaturaIdentifier() {
        return new LegislaturaIdentifier();
    }

    /**
     * Create an instance of {@link FascicoloIdentifier }
     * 
     */
    public FascicoloIdentifier createFascicoloIdentifier() {
        return new FascicoloIdentifier();
    }

    /**
     * Create an instance of {@link ArrayOfFascicoloEntity }
     * 
     */
    public ArrayOfFascicoloEntity createArrayOfFascicoloEntity() {
        return new ArrayOfFascicoloEntity();
    }

    /**
     * Create an instance of {@link ArrayOfFascicoloHistory }
     * 
     */
    public ArrayOfFascicoloHistory createArrayOfFascicoloHistory() {
        return new ArrayOfFascicoloHistory();
    }

    /**
     * Create an instance of {@link CampiTipoFascicoloValue }
     * 
     */
    public CampiTipoFascicoloValue createCampiTipoFascicoloValue() {
        return new CampiTipoFascicoloValue();
    }

    /**
     * Create an instance of {@link FascicoloEntity }
     * 
     */
    public FascicoloEntity createFascicoloEntity() {
        return new FascicoloEntity();
    }

    /**
     * Create an instance of {@link ArrayOfCampiTipoFascicoloValue }
     * 
     */
    public ArrayOfCampiTipoFascicoloValue createArrayOfCampiTipoFascicoloValue() {
        return new ArrayOfCampiTipoFascicoloValue();
    }

    /**
     * Create an instance of {@link ArrayOfLegislatura }
     * 
     */
    public ArrayOfLegislatura createArrayOfLegislatura() {
        return new ArrayOfLegislatura();
    }

    /**
     * Create an instance of {@link FascicoloHistory }
     * 
     */
    public FascicoloHistory createFascicoloHistory() {
        return new FascicoloHistory();
    }

    /**
     * Create an instance of {@link ArrayOfBaseFascicolo }
     * 
     */
    public ArrayOfBaseFascicolo createArrayOfBaseFascicolo() {
        return new ArrayOfBaseFascicolo();
    }

    /**
     * Create an instance of {@link BaseFascicolo }
     * 
     */
    public BaseFascicolo createBaseFascicolo() {
        return new BaseFascicolo();
    }

    /**
     * Create an instance of {@link FascicoloSearcher }
     * 
     */
    public FascicoloSearcher createFascicoloSearcher() {
        return new FascicoloSearcher();
    }

    /**
     * Create an instance of {@link Legislatura }
     * 
     */
    public Legislatura createLegislatura() {
        return new Legislatura();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseFascicolo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject", name = "BaseFascicolo")
    public JAXBElement<BaseFascicolo> createBaseFascicolo(BaseFascicolo value) {
        return new JAXBElement<BaseFascicolo>(_BaseFascicolo_QNAME, BaseFascicolo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfBaseFascicolo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject", name = "ArrayOfBaseFascicolo")
    public JAXBElement<ArrayOfBaseFascicolo> createArrayOfBaseFascicolo(ArrayOfBaseFascicolo value) {
        return new JAXBElement<ArrayOfBaseFascicolo>(_ArrayOfBaseFascicolo_QNAME, ArrayOfBaseFascicolo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FascicoloIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.Identifier", name = "FascicoloIdentifier")
    public JAXBElement<FascicoloIdentifier> createFascicoloIdentifier(FascicoloIdentifier value) {
        return new JAXBElement<FascicoloIdentifier>(_FascicoloIdentifier_QNAME, FascicoloIdentifier.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLegislatura }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject", name = "ArrayOfLegislatura")
    public JAXBElement<ArrayOfLegislatura> createArrayOfLegislatura(ArrayOfLegislatura value) {
        return new JAXBElement<ArrayOfLegislatura>(_ArrayOfLegislatura_QNAME, ArrayOfLegislatura.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfFascicoloEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject", name = "ArrayOfFascicoloEntity")
    public JAXBElement<ArrayOfFascicoloEntity> createArrayOfFascicoloEntity(ArrayOfFascicoloEntity value) {
        return new JAXBElement<ArrayOfFascicoloEntity>(_ArrayOfFascicoloEntity_QNAME, ArrayOfFascicoloEntity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCampiTipoFascicoloValue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject", name = "ArrayOfCampiTipoFascicoloValue")
    public JAXBElement<ArrayOfCampiTipoFascicoloValue> createArrayOfCampiTipoFascicoloValue(ArrayOfCampiTipoFascicoloValue value) {
        return new JAXBElement<ArrayOfCampiTipoFascicoloValue>(_ArrayOfCampiTipoFascicoloValue_QNAME, ArrayOfCampiTipoFascicoloValue.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LegislaturaIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject", name = "LegislaturaIdentifier")
    public JAXBElement<LegislaturaIdentifier> createLegislaturaIdentifier(LegislaturaIdentifier value) {
        return new JAXBElement<LegislaturaIdentifier>(_LegislaturaIdentifier_QNAME, LegislaturaIdentifier.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CampiTipoFascicoloValue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject", name = "CampiTipoFascicoloValue")
    public JAXBElement<CampiTipoFascicoloValue> createCampiTipoFascicoloValue(CampiTipoFascicoloValue value) {
        return new JAXBElement<CampiTipoFascicoloValue>(_CampiTipoFascicoloValue_QNAME, CampiTipoFascicoloValue.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FascicoloSearcher }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.Searcher", name = "FascicoloSearcher")
    public JAXBElement<FascicoloSearcher> createFascicoloSearcher(FascicoloSearcher value) {
        return new JAXBElement<FascicoloSearcher>(_FascicoloSearcher_QNAME, FascicoloSearcher.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FascicoloEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject", name = "FascicoloEntity")
    public JAXBElement<FascicoloEntity> createFascicoloEntity(FascicoloEntity value) {
        return new JAXBElement<FascicoloEntity>(_FascicoloEntity_QNAME, FascicoloEntity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Legislatura }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject", name = "Legislatura")
    public JAXBElement<Legislatura> createLegislatura(Legislatura value) {
        return new JAXBElement<Legislatura>(_Legislatura_QNAME, Legislatura.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FascicoloHistory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject", name = "FascicoloHistory")
    public JAXBElement<FascicoloHistory> createFascicoloHistory(FascicoloHistory value) {
        return new JAXBElement<FascicoloHistory>(_FascicoloHistory_QNAME, FascicoloHistory.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfFascicoloHistory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject", name = "ArrayOfFascicoloHistory")
    public JAXBElement<ArrayOfFascicoloHistory> createArrayOfFascicoloHistory(ArrayOfFascicoloHistory value) {
        return new JAXBElement<ArrayOfFascicoloHistory>(_ArrayOfFascicoloHistory_QNAME, ArrayOfFascicoloHistory.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FascicoloIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject", name = "FascicoloOldId", scope = FascicoloHistory.class)
    public JAXBElement<FascicoloIdentifier> createFascicoloHistoryFascicoloOldId(FascicoloIdentifier value) {
        return new JAXBElement<FascicoloIdentifier>(_FascicoloHistoryFascicoloOldId_QNAME, FascicoloIdentifier.class, FascicoloHistory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseVisibility }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject", name = "HistoryVis", scope = FascicoloHistory.class)
    public JAXBElement<BaseVisibility> createFascicoloHistoryHistoryVis(BaseVisibility value) {
        return new JAXBElement<BaseVisibility>(_FascicoloHistoryHistoryVis_QNAME, BaseVisibility.class, FascicoloHistory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject", name = "DocumentDesc", scope = FascicoloHistory.class)
    public JAXBElement<String> createFascicoloHistoryDocumentDesc(String value) {
        return new JAXBElement<String>(_FascicoloHistoryDocumentDesc_QNAME, String.class, FascicoloHistory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject", name = "NameAuthorDel", scope = FascicoloHistory.class)
    public JAXBElement<String> createFascicoloHistoryNameAuthorDel(String value) {
        return new JAXBElement<String>(_FascicoloHistoryNameAuthorDel_QNAME, String.class, FascicoloHistory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseVisibilityDesc }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject", name = "HistoryVisDesc", scope = FascicoloHistory.class)
    public JAXBElement<BaseVisibilityDesc> createFascicoloHistoryHistoryVisDesc(BaseVisibilityDesc value) {
        return new JAXBElement<BaseVisibilityDesc>(_FascicoloHistoryHistoryVisDesc_QNAME, BaseVisibilityDesc.class, FascicoloHistory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject", name = "DocumentId", scope = FascicoloHistory.class)
    public JAXBElement<DocumentIdentifier> createFascicoloHistoryDocumentId(DocumentIdentifier value) {
        return new JAXBElement<DocumentIdentifier>(_FascicoloHistoryDocumentId_QNAME, DocumentIdentifier.class, FascicoloHistory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject", name = "CodeNumFree", scope = BaseFascicolo.class)
    public JAXBElement<String> createBaseFascicoloCodeNumFree(String value) {
        return new JAXBElement<String>(_BaseFascicoloCodeNumFree_QNAME, String.class, BaseFascicolo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TitolarioItemIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject", name = "TitolarioItem_id", scope = BaseFascicolo.class)
    public JAXBElement<TitolarioItemIdentifier> createBaseFascicoloTitolarioItemId(TitolarioItemIdentifier value) {
        return new JAXBElement<TitolarioItemIdentifier>(_BaseFascicoloTitolarioItemId_QNAME, TitolarioItemIdentifier.class, BaseFascicolo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoFascicoloIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject", name = "TipoFascicolo", scope = BaseFascicolo.class)
    public JAXBElement<TipoFascicoloIdentifier> createBaseFascicoloTipoFascicolo(TipoFascicoloIdentifier value) {
        return new JAXBElement<TipoFascicoloIdentifier>(_BaseFascicoloTipoFascicolo_QNAME, TipoFascicoloIdentifier.class, BaseFascicolo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject", name = "Label", scope = BaseFascicolo.class)
    public JAXBElement<String> createBaseFascicoloLabel(String value) {
        return new JAXBElement<String>(_BaseFascicoloLabel_QNAME, String.class, BaseFascicolo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FascicoloIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject", name = "FascicoloId", scope = BaseFascicolo.class)
    public JAXBElement<FascicoloIdentifier> createBaseFascicoloFascicoloId(FascicoloIdentifier value) {
        return new JAXBElement<FascicoloIdentifier>(_BaseFascicoloFascicoloId_QNAME, FascicoloIdentifier.class, BaseFascicolo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject", name = "Classification_Code", scope = BaseFascicolo.class)
    public JAXBElement<String> createBaseFascicoloClassificationCode(String value) {
        return new JAXBElement<String>(_BaseFascicoloClassificationCode_QNAME, String.class, BaseFascicolo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FascicoloIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject", name = "ParentId", scope = BaseFascicolo.class)
    public JAXBElement<FascicoloIdentifier> createBaseFascicoloParentId(FascicoloIdentifier value) {
        return new JAXBElement<FascicoloIdentifier>(_BaseFascicoloParentId_QNAME, FascicoloIdentifier.class, BaseFascicolo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CampiTipoFascicoloIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject", name = "CampoId", scope = CampiTipoFascicoloValue.class)
    public JAXBElement<CampiTipoFascicoloIdentifier> createCampiTipoFascicoloValueCampoId(CampiTipoFascicoloIdentifier value) {
        return new JAXBElement<CampiTipoFascicoloIdentifier>(_CampiTipoFascicoloValueCampoId_QNAME, CampiTipoFascicoloIdentifier.class, CampiTipoFascicoloValue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FascicoloIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject", name = "FascId", scope = CampiTipoFascicoloValue.class)
    public JAXBElement<FascicoloIdentifier> createCampiTipoFascicoloValueFascId(FascicoloIdentifier value) {
        return new JAXBElement<FascicoloIdentifier>(_CampiTipoFascicoloValueFascId_QNAME, FascicoloIdentifier.class, CampiTipoFascicoloValue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject", name = "ValueStr", scope = CampiTipoFascicoloValue.class)
    public JAXBElement<String> createCampiTipoFascicoloValueValueStr(String value) {
        return new JAXBElement<String>(_CampiTipoFascicoloValueValueStr_QNAME, String.class, CampiTipoFascicoloValue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomDateTimeNullable }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject", name = "ValueDate", scope = CampiTipoFascicoloValue.class)
    public JAXBElement<CustomDateTimeNullable> createCampiTipoFascicoloValueValueDate(CustomDateTimeNullable value) {
        return new JAXBElement<CustomDateTimeNullable>(_CampiTipoFascicoloValueValueDate_QNAME, CustomDateTimeNullable.class, CampiTipoFascicoloValue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject", name = "UO_ManufacturerDescription", scope = FascicoloEntity.class)
    public JAXBElement<String> createFascicoloEntityUOManufacturerDescription(String value) {
        return new JAXBElement<String>(_FascicoloEntityUOManufacturerDescription_QNAME, String.class, FascicoloEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomDateTimeNullable }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject", name = "CloseData", scope = FascicoloEntity.class)
    public JAXBElement<CustomDateTimeNullable> createFascicoloEntityCloseData(CustomDateTimeNullable value) {
        return new JAXBElement<CustomDateTimeNullable>(_FascicoloEntityCloseData_QNAME, CustomDateTimeNullable.class, FascicoloEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject", name = "Note", scope = FascicoloEntity.class)
    public JAXBElement<String> createFascicoloEntityNote(String value) {
        return new JAXBElement<String>(_FascicoloEntityNote_QNAME, String.class, FascicoloEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject", name = "FirstDocumentId", scope = FascicoloEntity.class)
    public JAXBElement<DocumentIdentifier> createFascicoloEntityFirstDocumentId(DocumentIdentifier value) {
        return new JAXBElement<DocumentIdentifier>(_FascicoloEntityFirstDocumentId_QNAME, DocumentIdentifier.class, FascicoloEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TypeIdentifierComplete }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject", name = "UserId_Resp", scope = FascicoloEntity.class)
    public JAXBElement<TypeIdentifierComplete> createFascicoloEntityUserIdResp(TypeIdentifierComplete value) {
        return new JAXBElement<TypeIdentifierComplete>(_FascicoloEntityUserIdResp_QNAME, TypeIdentifierComplete.class, FascicoloEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject", name = "LocationName", scope = FascicoloEntity.class)
    public JAXBElement<String> createFascicoloEntityLocationName(String value) {
        return new JAXBElement<String>(_FascicoloEntityLocationName_QNAME, String.class, FascicoloEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject", name = "Subject", scope = FascicoloEntity.class)
    public JAXBElement<String> createFascicoloEntitySubject(String value) {
        return new JAXBElement<String>(_FascicoloEntitySubject_QNAME, String.class, FascicoloEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomDateTimeNullable }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject", name = "OpenData", scope = FascicoloEntity.class)
    public JAXBElement<CustomDateTimeNullable> createFascicoloEntityOpenData(CustomDateTimeNullable value) {
        return new JAXBElement<CustomDateTimeNullable>(_FascicoloEntityOpenData_QNAME, CustomDateTimeNullable.class, FascicoloEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject", name = "Thesaurus", scope = FascicoloEntity.class)
    public JAXBElement<String> createFascicoloEntityThesaurus(String value) {
        return new JAXBElement<String>(_FascicoloEntityThesaurus_QNAME, String.class, FascicoloEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject", name = "LastDocumentId", scope = FascicoloEntity.class)
    public JAXBElement<DocumentIdentifier> createFascicoloEntityLastDocumentId(DocumentIdentifier value) {
        return new JAXBElement<DocumentIdentifier>(_FascicoloEntityLastDocumentId_QNAME, DocumentIdentifier.class, FascicoloEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject", name = "Description", scope = FascicoloEntity.class)
    public JAXBElement<String> createFascicoloEntityDescription(String value) {
        return new JAXBElement<String>(_FascicoloEntityDescription_QNAME, String.class, FascicoloEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.Searcher", name = "List_UO_Responsible", scope = FascicoloSearcher.class)
    public JAXBElement<ArrayOfint> createFascicoloSearcherListUOResponsible(ArrayOfint value) {
        return new JAXBElement<ArrayOfint>(_FascicoloSearcherListUOResponsible_QNAME, ArrayOfint.class, FascicoloSearcher.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FascicoloIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.Searcher", name = "ParentId", scope = FascicoloSearcher.class)
    public JAXBElement<FascicoloIdentifier> createFascicoloSearcherParentId(FascicoloIdentifier value) {
        return new JAXBElement<FascicoloIdentifier>(_FascicoloSearcherParentId_QNAME, FascicoloIdentifier.class, FascicoloSearcher.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TitolarioIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.Searcher", name = "TitolarioId", scope = FascicoloSearcher.class)
    public JAXBElement<TitolarioIdentifier> createFascicoloSearcherTitolarioId(TitolarioIdentifier value) {
        return new JAXBElement<TitolarioIdentifier>(_FascicoloSearcherTitolarioId_QNAME, TitolarioIdentifier.class, FascicoloSearcher.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.Searcher", name = "Code_Num_From", scope = FascicoloSearcher.class)
    public JAXBElement<String> createFascicoloSearcherCodeNumFrom(String value) {
        return new JAXBElement<String>(_FascicoloSearcherCodeNumFrom_QNAME, String.class, FascicoloSearcher.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TitolarioItemIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.Searcher", name = "TitolarioItem_id", scope = FascicoloSearcher.class)
    public JAXBElement<TitolarioItemIdentifier> createFascicoloSearcherTitolarioItemId(TitolarioItemIdentifier value) {
        return new JAXBElement<TitolarioItemIdentifier>(_FascicoloSearcherTitolarioItemId_QNAME, TitolarioItemIdentifier.class, FascicoloSearcher.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.Searcher", name = "LocationName", scope = FascicoloSearcher.class)
    public JAXBElement<String> createFascicoloSearcherLocationName(String value) {
        return new JAXBElement<String>(_FascicoloSearcherLocationName_QNAME, String.class, FascicoloSearcher.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomDateTimeNullable }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.Searcher", name = "CloseDataFrom", scope = FascicoloSearcher.class)
    public JAXBElement<CustomDateTimeNullable> createFascicoloSearcherCloseDataFrom(CustomDateTimeNullable value) {
        return new JAXBElement<CustomDateTimeNullable>(_FascicoloSearcherCloseDataFrom_QNAME, CustomDateTimeNullable.class, FascicoloSearcher.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.Searcher", name = "Thesaurus", scope = FascicoloSearcher.class)
    public JAXBElement<String> createFascicoloSearcherThesaurus(String value) {
        return new JAXBElement<String>(_FascicoloSearcherThesaurus_QNAME, String.class, FascicoloSearcher.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.Searcher", name = "Code_Num_To", scope = FascicoloSearcher.class)
    public JAXBElement<String> createFascicoloSearcherCodeNumTo(String value) {
        return new JAXBElement<String>(_FascicoloSearcherCodeNumTo_QNAME, String.class, FascicoloSearcher.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCampiTipoFascicoloValue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.Searcher", name = "FascicoloFields", scope = FascicoloSearcher.class)
    public JAXBElement<ArrayOfCampiTipoFascicoloValue> createFascicoloSearcherFascicoloFields(ArrayOfCampiTipoFascicoloValue value) {
        return new JAXBElement<ArrayOfCampiTipoFascicoloValue>(_FascicoloSearcherFascicoloFields_QNAME, ArrayOfCampiTipoFascicoloValue.class, FascicoloSearcher.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomDateTimeNullable }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.Searcher", name = "CloseDataTo", scope = FascicoloSearcher.class)
    public JAXBElement<CustomDateTimeNullable> createFascicoloSearcherCloseDataTo(CustomDateTimeNullable value) {
        return new JAXBElement<CustomDateTimeNullable>(_FascicoloSearcherCloseDataTo_QNAME, CustomDateTimeNullable.class, FascicoloSearcher.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.Searcher", name = "Subject", scope = FascicoloSearcher.class)
    public JAXBElement<String> createFascicoloSearcherSubject(String value) {
        return new JAXBElement<String>(_FascicoloSearcherSubject_QNAME, String.class, FascicoloSearcher.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FascicoloIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.Searcher", name = "FascicoloId_To", scope = FascicoloSearcher.class)
    public JAXBElement<FascicoloIdentifier> createFascicoloSearcherFascicoloIdTo(FascicoloIdentifier value) {
        return new JAXBElement<FascicoloIdentifier>(_FascicoloSearcherFascicoloIdTo_QNAME, FascicoloIdentifier.class, FascicoloSearcher.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomDateTimeNullable }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.Searcher", name = "OpenDataFrom", scope = FascicoloSearcher.class)
    public JAXBElement<CustomDateTimeNullable> createFascicoloSearcherOpenDataFrom(CustomDateTimeNullable value) {
        return new JAXBElement<CustomDateTimeNullable>(_FascicoloSearcherOpenDataFrom_QNAME, CustomDateTimeNullable.class, FascicoloSearcher.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomDateTimeNullable }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.Searcher", name = "OpenDataTo", scope = FascicoloSearcher.class)
    public JAXBElement<CustomDateTimeNullable> createFascicoloSearcherOpenDataTo(CustomDateTimeNullable value) {
        return new JAXBElement<CustomDateTimeNullable>(_FascicoloSearcherOpenDataTo_QNAME, CustomDateTimeNullable.class, FascicoloSearcher.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.Searcher", name = "Description", scope = FascicoloSearcher.class)
    public JAXBElement<String> createFascicoloSearcherDescription(String value) {
        return new JAXBElement<String>(_FascicoloSearcherDescription_QNAME, String.class, FascicoloSearcher.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.Searcher", name = "List_UO_Manufacturer", scope = FascicoloSearcher.class)
    public JAXBElement<ArrayOfint> createFascicoloSearcherListUOManufacturer(ArrayOfint value) {
        return new JAXBElement<ArrayOfint>(_FascicoloSearcherListUOManufacturer_QNAME, ArrayOfint.class, FascicoloSearcher.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.Searcher", name = "LegislaturaCode", scope = FascicoloSearcher.class)
    public JAXBElement<String> createFascicoloSearcherLegislaturaCode(String value) {
        return new JAXBElement<String>(_FascicoloSearcherLegislaturaCode_QNAME, String.class, FascicoloSearcher.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FascicoloIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.Searcher", name = "FascicoloId_From", scope = FascicoloSearcher.class)
    public JAXBElement<FascicoloIdentifier> createFascicoloSearcherFascicoloIdFrom(FascicoloIdentifier value) {
        return new JAXBElement<FascicoloIdentifier>(_FascicoloSearcherFascicoloIdFrom_QNAME, FascicoloIdentifier.class, FascicoloSearcher.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.Searcher", name = "List_UserId_Resp", scope = FascicoloSearcher.class)
    public JAXBElement<ArrayOfint> createFascicoloSearcherListUserIdResp(ArrayOfint value) {
        return new JAXBElement<ArrayOfint>(_FascicoloSearcherListUserIdResp_QNAME, ArrayOfint.class, FascicoloSearcher.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.Searcher", name = "Note", scope = FascicoloSearcher.class)
    public JAXBElement<String> createFascicoloSearcherNote(String value) {
        return new JAXBElement<String>(_FascicoloSearcherNote_QNAME, String.class, FascicoloSearcher.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.Searcher", name = "UtenteId", scope = FascicoloSearcher.class)
    public JAXBElement<BaseIdentifier> createFascicoloSearcherUtenteId(BaseIdentifier value) {
        return new JAXBElement<BaseIdentifier>(_FascicoloSearcherUtenteId_QNAME, BaseIdentifier.class, FascicoloSearcher.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.Searcher", name = "Classification_Code", scope = FascicoloSearcher.class)
    public JAXBElement<String> createFascicoloSearcherClassificationCode(String value) {
        return new JAXBElement<String>(_FascicoloSearcherClassificationCode_QNAME, String.class, FascicoloSearcher.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseVisibility }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.Searcher", name = "FascicoloVis", scope = FascicoloSearcher.class)
    public JAXBElement<BaseVisibility> createFascicoloSearcherFascicoloVis(BaseVisibility value) {
        return new JAXBElement<BaseVisibility>(_FascicoloSearcherFascicoloVis_QNAME, BaseVisibility.class, FascicoloSearcher.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.Searcher", name = "Code_Num", scope = FascicoloSearcher.class)
    public JAXBElement<String> createFascicoloSearcherCodeNum(String value) {
        return new JAXBElement<String>(_FascicoloSearcherCodeNum_QNAME, String.class, FascicoloSearcher.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FascicoloIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.Searcher", name = "FascicoloId", scope = FascicoloSearcher.class)
    public JAXBElement<FascicoloIdentifier> createFascicoloSearcherFascicoloId(FascicoloIdentifier value) {
        return new JAXBElement<FascicoloIdentifier>(_FascicoloSearcherFascicoloId_QNAME, FascicoloIdentifier.class, FascicoloSearcher.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoFascicoloIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.Searcher", name = "TipoFascicolo", scope = FascicoloSearcher.class)
    public JAXBElement<TipoFascicoloIdentifier> createFascicoloSearcherTipoFascicolo(TipoFascicoloIdentifier value) {
        return new JAXBElement<TipoFascicoloIdentifier>(_FascicoloSearcherTipoFascicolo_QNAME, TipoFascicoloIdentifier.class, FascicoloSearcher.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.Searcher", name = "Label", scope = FascicoloSearcher.class)
    public JAXBElement<String> createFascicoloSearcherLabel(String value) {
        return new JAXBElement<String>(_FascicoloSearcherLabel_QNAME, String.class, FascicoloSearcher.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.Searcher", name = "List_Classification_ID", scope = FascicoloSearcher.class)
    public JAXBElement<ArrayOfint> createFascicoloSearcherListClassificationID(ArrayOfint value) {
        return new JAXBElement<ArrayOfint>(_FascicoloSearcherListClassificationID_QNAME, ArrayOfint.class, FascicoloSearcher.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject", name = "Code", scope = Legislatura.class)
    public JAXBElement<String> createLegislaturaCode(String value) {
        return new JAXBElement<String>(_LegislaturaCode_QNAME, String.class, Legislatura.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LegislaturaIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject", name = "Id", scope = Legislatura.class)
    public JAXBElement<LegislaturaIdentifier> createLegislaturaId(LegislaturaIdentifier value) {
        return new JAXBElement<LegislaturaIdentifier>(_LegislaturaId_QNAME, LegislaturaIdentifier.class, Legislatura.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject", name = "Description", scope = Legislatura.class)
    public JAXBElement<String> createLegislaturaDescription(String value) {
        return new JAXBElement<String>(_FascicoloEntityDescription_QNAME, String.class, Legislatura.class, value);
    }

}
