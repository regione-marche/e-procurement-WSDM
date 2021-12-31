
package it.archiflow96.classification;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


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
@XmlType(name = "FascicoloHistory", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject", propOrder = {
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

    @XmlElement(name = "DocumentDesc", nillable = true)
    protected String documentDesc;
    @XmlElement(name = "DocumentId", nillable = true)
    protected DocumentIdentifier documentId;
    @XmlElement(name = "FascicoloOldId", nillable = true)
    protected FascicoloIdentifier fascicoloOldId;
    @XmlElement(name = "HistoryVis", nillable = true)
    protected BaseVisibility historyVis;
    @XmlElement(name = "HistoryVisDesc", nillable = true)
    protected BaseVisibilityDesc historyVisDesc;
    @XmlElement(name = "NameAuthorDel", nillable = true)
    protected String nameAuthorDel;

    /**
     * Gets the value of the documentDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentDesc() {
        return documentDesc;
    }

    /**
     * Sets the value of the documentDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentDesc(String value) {
        this.documentDesc = value;
    }

    /**
     * Gets the value of the documentId property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentifier }
     *     
     */
    public DocumentIdentifier getDocumentId() {
        return documentId;
    }

    /**
     * Sets the value of the documentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentifier }
     *     
     */
    public void setDocumentId(DocumentIdentifier value) {
        this.documentId = value;
    }

    /**
     * Gets the value of the fascicoloOldId property.
     * 
     * @return
     *     possible object is
     *     {@link FascicoloIdentifier }
     *     
     */
    public FascicoloIdentifier getFascicoloOldId() {
        return fascicoloOldId;
    }

    /**
     * Sets the value of the fascicoloOldId property.
     * 
     * @param value
     *     allowed object is
     *     {@link FascicoloIdentifier }
     *     
     */
    public void setFascicoloOldId(FascicoloIdentifier value) {
        this.fascicoloOldId = value;
    }

    /**
     * Gets the value of the historyVis property.
     * 
     * @return
     *     possible object is
     *     {@link BaseVisibility }
     *     
     */
    public BaseVisibility getHistoryVis() {
        return historyVis;
    }

    /**
     * Sets the value of the historyVis property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseVisibility }
     *     
     */
    public void setHistoryVis(BaseVisibility value) {
        this.historyVis = value;
    }

    /**
     * Gets the value of the historyVisDesc property.
     * 
     * @return
     *     possible object is
     *     {@link BaseVisibilityDesc }
     *     
     */
    public BaseVisibilityDesc getHistoryVisDesc() {
        return historyVisDesc;
    }

    /**
     * Sets the value of the historyVisDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseVisibilityDesc }
     *     
     */
    public void setHistoryVisDesc(BaseVisibilityDesc value) {
        this.historyVisDesc = value;
    }

    /**
     * Gets the value of the nameAuthorDel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameAuthorDel() {
        return nameAuthorDel;
    }

    /**
     * Sets the value of the nameAuthorDel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameAuthorDel(String value) {
        this.nameAuthorDel = value;
    }

}
