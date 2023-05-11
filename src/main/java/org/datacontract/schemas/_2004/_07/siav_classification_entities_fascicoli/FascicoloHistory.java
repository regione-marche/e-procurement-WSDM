
package org.datacontract.schemas._2004._07.siav_classification_entities_fascicoli;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.siav_classification_entities_common.DocumentIdentifier;
import org.datacontract.schemas._2004._07.siav_common_baseclass.BaseHistory;
import org.datacontract.schemas._2004._07.siav_common_baseclass.BaseVisibility;
import org.datacontract.schemas._2004._07.siav_common_baseclass.BaseVisibilityDesc;


/**
 * <p>Java class for FascicoloHistory complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FascicoloHistory">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.ValueObject}BaseHistory">
 *       &lt;sequence>
 *         &lt;element name="DocumentDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DocumentId" type="{http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Common.Identifier}DocumentIdentifier" minOccurs="0"/>
 *         &lt;element name="FascicoloOldId" type="{http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.Identifier}FascicoloIdentifier" minOccurs="0"/>
 *         &lt;element name="HistoryVis" type="{http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.ValueObject}BaseVisibility" minOccurs="0"/>
 *         &lt;element name="HistoryVisDesc" type="{http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.ValueObject}BaseVisibilityDesc" minOccurs="0"/>
 *         &lt;element name="NameAuthorDel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FascicoloHistory", propOrder = {
    "documentDesc",
    "documentId",
    "fascicoloOldId",
    "historyVis",
    "historyVisDesc",
    "nameAuthorDel"
})
public class FascicoloHistory
    extends BaseHistory
{

    @XmlElementRef(name = "DocumentDesc", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject", type = JAXBElement.class)
    protected JAXBElement<String> documentDesc;
    @XmlElementRef(name = "DocumentId", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject", type = JAXBElement.class)
    protected JAXBElement<DocumentIdentifier> documentId;
    @XmlElementRef(name = "FascicoloOldId", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject", type = JAXBElement.class)
    protected JAXBElement<FascicoloIdentifier> fascicoloOldId;
    @XmlElementRef(name = "HistoryVis", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject", type = JAXBElement.class)
    protected JAXBElement<BaseVisibility> historyVis;
    @XmlElementRef(name = "HistoryVisDesc", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject", type = JAXBElement.class)
    protected JAXBElement<BaseVisibilityDesc> historyVisDesc;
    @XmlElementRef(name = "NameAuthorDel", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject", type = JAXBElement.class)
    protected JAXBElement<String> nameAuthorDel;

    /**
     * Gets the value of the documentDesc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDocumentDesc() {
        return documentDesc;
    }

    /**
     * Sets the value of the documentDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDocumentDesc(JAXBElement<String> value) {
        this.documentDesc = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the documentId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DocumentIdentifier }{@code >}
     *     
     */
    public JAXBElement<DocumentIdentifier> getDocumentId() {
        return documentId;
    }

    /**
     * Sets the value of the documentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DocumentIdentifier }{@code >}
     *     
     */
    public void setDocumentId(JAXBElement<DocumentIdentifier> value) {
        this.documentId = ((JAXBElement<DocumentIdentifier> ) value);
    }

    /**
     * Gets the value of the fascicoloOldId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FascicoloIdentifier }{@code >}
     *     
     */
    public JAXBElement<FascicoloIdentifier> getFascicoloOldId() {
        return fascicoloOldId;
    }

    /**
     * Sets the value of the fascicoloOldId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FascicoloIdentifier }{@code >}
     *     
     */
    public void setFascicoloOldId(JAXBElement<FascicoloIdentifier> value) {
        this.fascicoloOldId = ((JAXBElement<FascicoloIdentifier> ) value);
    }

    /**
     * Gets the value of the historyVis property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BaseVisibility }{@code >}
     *     
     */
    public JAXBElement<BaseVisibility> getHistoryVis() {
        return historyVis;
    }

    /**
     * Sets the value of the historyVis property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BaseVisibility }{@code >}
     *     
     */
    public void setHistoryVis(JAXBElement<BaseVisibility> value) {
        this.historyVis = ((JAXBElement<BaseVisibility> ) value);
    }

    /**
     * Gets the value of the historyVisDesc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BaseVisibilityDesc }{@code >}
     *     
     */
    public JAXBElement<BaseVisibilityDesc> getHistoryVisDesc() {
        return historyVisDesc;
    }

    /**
     * Sets the value of the historyVisDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BaseVisibilityDesc }{@code >}
     *     
     */
    public void setHistoryVisDesc(JAXBElement<BaseVisibilityDesc> value) {
        this.historyVisDesc = ((JAXBElement<BaseVisibilityDesc> ) value);
    }

    /**
     * Gets the value of the nameAuthorDel property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNameAuthorDel() {
        return nameAuthorDel;
    }

    /**
     * Sets the value of the nameAuthorDel property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNameAuthorDel(JAXBElement<String> value) {
        this.nameAuthorDel = ((JAXBElement<String> ) value);
    }

}
