
package it.archiflow93.classification;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BaseFascicolo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaseFascicolo">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.ValueObject}BaseValueObject">
 *       &lt;sequence>
 *         &lt;element name="Classification_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodeNum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CodeNumFree" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DocNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="FascicoloId" type="{http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.Identifier}FascicoloIdentifier" minOccurs="0"/>
 *         &lt;element name="IsOpen" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsTitolarioCurrentOrEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsTitolarioItemObsolete" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Label" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ParentId" type="{http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.Identifier}FascicoloIdentifier" minOccurs="0"/>
 *         &lt;element name="TipoFascicolo" type="{http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.TipoFascicolo.Identifier}TipoFascicoloIdentifier" minOccurs="0"/>
 *         &lt;element name="TitolarioItem_id" type="{http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.TitolarioItem.Identifier}TitolarioItemIdentifier" minOccurs="0"/>
 *         &lt;element name="Visibility" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseFascicolo", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject", propOrder = {
    "classificationCode",
    "codeNum",
    "codeNumFree",
    "docNumber",
    "fascicoloId",
    "isOpen",
    "isTitolarioCurrentOrEnabled",
    "isTitolarioItemObsolete",
    "label",
    "parentId",
    "tipoFascicolo",
    "titolarioItemId",
    "visibility"
})
@XmlSeeAlso({
    FascicoloEntity.class
})
public class BaseFascicolo
    extends BaseValueObject
{

    @XmlElement(name = "Classification_Code", nillable = true)
    protected String classificationCode;
    @XmlElement(name = "CodeNum")
    protected Integer codeNum;
    @XmlElement(name = "CodeNumFree", nillable = true)
    protected String codeNumFree;
    @XmlElement(name = "DocNumber")
    protected Integer docNumber;
    @XmlElement(name = "FascicoloId", nillable = true)
    protected FascicoloIdentifier fascicoloId;
    @XmlElement(name = "IsOpen")
    protected Boolean isOpen;
    @XmlElement(name = "IsTitolarioCurrentOrEnabled")
    protected Boolean isTitolarioCurrentOrEnabled;
    @XmlElement(name = "IsTitolarioItemObsolete")
    protected Boolean isTitolarioItemObsolete;
    @XmlElement(name = "Label", nillable = true)
    protected String label;
    @XmlElement(name = "ParentId", nillable = true)
    protected FascicoloIdentifier parentId;
    @XmlElement(name = "TipoFascicolo", nillable = true)
    protected TipoFascicoloIdentifier tipoFascicolo;
    @XmlElement(name = "TitolarioItem_id", nillable = true)
    protected TitolarioItemIdentifier titolarioItemId;
    @XmlElement(name = "Visibility")
    protected Integer visibility;

    /**
     * Gets the value of the classificationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassificationCode() {
        return classificationCode;
    }

    /**
     * Sets the value of the classificationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassificationCode(String value) {
        this.classificationCode = value;
    }

    /**
     * Gets the value of the codeNum property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodeNum() {
        return codeNum;
    }

    /**
     * Sets the value of the codeNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodeNum(Integer value) {
        this.codeNum = value;
    }

    /**
     * Gets the value of the codeNumFree property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeNumFree() {
        return codeNumFree;
    }

    /**
     * Sets the value of the codeNumFree property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeNumFree(String value) {
        this.codeNumFree = value;
    }

    /**
     * Gets the value of the docNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDocNumber() {
        return docNumber;
    }

    /**
     * Sets the value of the docNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDocNumber(Integer value) {
        this.docNumber = value;
    }

    /**
     * Gets the value of the fascicoloId property.
     * 
     * @return
     *     possible object is
     *     {@link FascicoloIdentifier }
     *     
     */
    public FascicoloIdentifier getFascicoloId() {
        return fascicoloId;
    }

    /**
     * Sets the value of the fascicoloId property.
     * 
     * @param value
     *     allowed object is
     *     {@link FascicoloIdentifier }
     *     
     */
    public void setFascicoloId(FascicoloIdentifier value) {
        this.fascicoloId = value;
    }

    /**
     * Gets the value of the isOpen property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsOpen() {
        return isOpen;
    }

    /**
     * Sets the value of the isOpen property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsOpen(Boolean value) {
        this.isOpen = value;
    }

    /**
     * Gets the value of the isTitolarioCurrentOrEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsTitolarioCurrentOrEnabled() {
        return isTitolarioCurrentOrEnabled;
    }

    /**
     * Sets the value of the isTitolarioCurrentOrEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsTitolarioCurrentOrEnabled(Boolean value) {
        this.isTitolarioCurrentOrEnabled = value;
    }

    /**
     * Gets the value of the isTitolarioItemObsolete property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsTitolarioItemObsolete() {
        return isTitolarioItemObsolete;
    }

    /**
     * Sets the value of the isTitolarioItemObsolete property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsTitolarioItemObsolete(Boolean value) {
        this.isTitolarioItemObsolete = value;
    }

    /**
     * Gets the value of the label property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabel(String value) {
        this.label = value;
    }

    /**
     * Gets the value of the parentId property.
     * 
     * @return
     *     possible object is
     *     {@link FascicoloIdentifier }
     *     
     */
    public FascicoloIdentifier getParentId() {
        return parentId;
    }

    /**
     * Sets the value of the parentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link FascicoloIdentifier }
     *     
     */
    public void setParentId(FascicoloIdentifier value) {
        this.parentId = value;
    }

    /**
     * Gets the value of the tipoFascicolo property.
     * 
     * @return
     *     possible object is
     *     {@link TipoFascicoloIdentifier }
     *     
     */
    public TipoFascicoloIdentifier getTipoFascicolo() {
        return tipoFascicolo;
    }

    /**
     * Sets the value of the tipoFascicolo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoFascicoloIdentifier }
     *     
     */
    public void setTipoFascicolo(TipoFascicoloIdentifier value) {
        this.tipoFascicolo = value;
    }

    /**
     * Gets the value of the titolarioItemId property.
     * 
     * @return
     *     possible object is
     *     {@link TitolarioItemIdentifier }
     *     
     */
    public TitolarioItemIdentifier getTitolarioItemId() {
        return titolarioItemId;
    }

    /**
     * Sets the value of the titolarioItemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TitolarioItemIdentifier }
     *     
     */
    public void setTitolarioItemId(TitolarioItemIdentifier value) {
        this.titolarioItemId = value;
    }

    /**
     * Gets the value of the visibility property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getVisibility() {
        return visibility;
    }

    /**
     * Sets the value of the visibility property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setVisibility(Integer value) {
        this.visibility = value;
    }

}
