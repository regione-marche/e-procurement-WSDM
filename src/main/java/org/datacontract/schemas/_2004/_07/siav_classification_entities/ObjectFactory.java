
package org.datacontract.schemas._2004._07.siav_classification_entities;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.datacontract.schemas._2004._07.siav_classification_entities package. 
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

    private final static QName _SortingTypes_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Types", "SortingTypes");
    private final static QName _EntityQueryType_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Types", "EntityQueryType");
    private final static QName _FascHistoryOrder_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Types", "FascHistoryOrder");
    private final static QName _FascicoloDiffType_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Types", "FascicoloDiffType");
    private final static QName _NumerationType_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Types", "NumerationType");
    private final static QName _EntityDataType_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Types", "EntityDataType");
    private final static QName _ReadEntityType_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Types", "ReadEntityType");
    private final static QName _ConservationType_QNAME = new QName("http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Types", "ConservationType");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.datacontract.schemas._2004._07.siav_classification_entities
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SortingTypes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Types", name = "SortingTypes")
    public JAXBElement<SortingTypes> createSortingTypes(SortingTypes value) {
        return new JAXBElement<SortingTypes>(_SortingTypes_QNAME, SortingTypes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityQueryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Types", name = "EntityQueryType")
    public JAXBElement<EntityQueryType> createEntityQueryType(EntityQueryType value) {
        return new JAXBElement<EntityQueryType>(_EntityQueryType_QNAME, EntityQueryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FascHistoryOrder }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Types", name = "FascHistoryOrder")
    public JAXBElement<FascHistoryOrder> createFascHistoryOrder(FascHistoryOrder value) {
        return new JAXBElement<FascHistoryOrder>(_FascHistoryOrder_QNAME, FascHistoryOrder.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FascicoloDiffType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Types", name = "FascicoloDiffType")
    public JAXBElement<FascicoloDiffType> createFascicoloDiffType(FascicoloDiffType value) {
        return new JAXBElement<FascicoloDiffType>(_FascicoloDiffType_QNAME, FascicoloDiffType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NumerationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Types", name = "NumerationType")
    public JAXBElement<NumerationType> createNumerationType(NumerationType value) {
        return new JAXBElement<NumerationType>(_NumerationType_QNAME, NumerationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityDataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Types", name = "EntityDataType")
    public JAXBElement<EntityDataType> createEntityDataType(EntityDataType value) {
        return new JAXBElement<EntityDataType>(_EntityDataType_QNAME, EntityDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadEntityType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Types", name = "ReadEntityType")
    public JAXBElement<ReadEntityType> createReadEntityType(ReadEntityType value) {
        return new JAXBElement<ReadEntityType>(_ReadEntityType_QNAME, ReadEntityType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConservationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Types", name = "ConservationType")
    public JAXBElement<ConservationType> createConservationType(ConservationType value) {
        return new JAXBElement<ConservationType>(_ConservationType_QNAME, ConservationType.class, null, value);
    }

}
