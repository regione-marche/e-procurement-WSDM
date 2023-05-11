
package org.datacontract.schemas._2004._07.siav_classification_entities_fascicoli;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.siav_classification_entities_tipofascicolo.TipoFascicoloIdentifier;
import org.datacontract.schemas._2004._07.siav_classification_entities_titolarioitem.TitolarioItemIdentifier;
import org.datacontract.schemas._2004._07.siav_common_baseclass.BaseValueObject;


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
@XmlType(name = "BaseFascicolo", propOrder = {
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

    @XmlElementRef(name = "Classification_Code", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject", type = JAXBElement.class)
    protected JAXBElement<String> classificationCode;
    @XmlElement(name = "CodeNum")
    protected Integer codeNum;
    @XmlElementRef(name = "CodeNumFree", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject", type = JAXBElement.class)
    protected JAXBElement<String> codeNumFree;
    @XmlElement(name = "DocNumber")
    protected Integer docNumber;
    @XmlElementRef(name = "FascicoloId", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject", type = JAXBElement.class)
    protected JAXBElement<FascicoloIdentifier> fascicoloId;
    @XmlElement(name = "IsOpen")
    protected Boolean isOpen;
    @XmlElement(name = "IsTitolarioCurrentOrEnabled")
    protected Boolean isTitolarioCurrentOrEnabled;
    @XmlElement(name = "IsTitolarioItemObsolete")
    protected Boolean isTitolarioItemObsolete;
    @XmlElementRef(name = "Label", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject", type = JAXBElement.class)
    protected JAXBElement<String> label;
    @XmlElementRef(name = "ParentId", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject", type = JAXBElement.class)
    protected JAXBElement<FascicoloIdentifier> parentId;
    @XmlElementRef(name = "TipoFascicolo", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject", type = JAXBElement.class)
    protected JAXBElement<TipoFascicoloIdentifier> tipoFascicolo;
    @XmlElementRef(name = "TitolarioItem_id", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject", type = JAXBElement.class)
    protected JAXBElement<TitolarioItemIdentifier> titolarioItemId;
    @XmlElement(name = "Visibility")
    protected Integer visibility;

    /**
     * Gets the value of the classificationCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getClassificationCode() {
        return classificationCode;
    }

    /**
     * Sets the value of the classificationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setClassificationCode(JAXBElement<String> value) {
        this.classificationCode = ((JAXBElement<String> ) value);
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
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodeNumFree() {
        return codeNumFree;
    }

    /**
     * Sets the value of the codeNumFree property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodeNumFree(JAXBElement<String> value) {
        this.codeNumFree = ((JAXBElement<String> ) value);
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
     *     {@link JAXBElement }{@code <}{@link FascicoloIdentifier }{@code >}
     *     
     */
    public JAXBElement<FascicoloIdentifier> getFascicoloId() {
        return fascicoloId;
    }

    /**
     * Sets the value of the fascicoloId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FascicoloIdentifier }{@code >}
     *     
     */
    public void setFascicoloId(JAXBElement<FascicoloIdentifier> value) {
        this.fascicoloId = ((JAXBElement<FascicoloIdentifier> ) value);
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
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLabel(JAXBElement<String> value) {
        this.label = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the parentId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FascicoloIdentifier }{@code >}
     *     
     */
    public JAXBElement<FascicoloIdentifier> getParentId() {
        return parentId;
    }

    /**
     * Sets the value of the parentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FascicoloIdentifier }{@code >}
     *     
     */
    public void setParentId(JAXBElement<FascicoloIdentifier> value) {
        this.parentId = ((JAXBElement<FascicoloIdentifier> ) value);
    }

    /**
     * Gets the value of the tipoFascicolo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TipoFascicoloIdentifier }{@code >}
     *     
     */
    public JAXBElement<TipoFascicoloIdentifier> getTipoFascicolo() {
        return tipoFascicolo;
    }

    /**
     * Sets the value of the tipoFascicolo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TipoFascicoloIdentifier }{@code >}
     *     
     */
    public void setTipoFascicolo(JAXBElement<TipoFascicoloIdentifier> value) {
        this.tipoFascicolo = ((JAXBElement<TipoFascicoloIdentifier> ) value);
    }

    /**
     * Gets the value of the titolarioItemId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TitolarioItemIdentifier }{@code >}
     *     
     */
    public JAXBElement<TitolarioItemIdentifier> getTitolarioItemId() {
        return titolarioItemId;
    }

    /**
     * Sets the value of the titolarioItemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TitolarioItemIdentifier }{@code >}
     *     
     */
    public void setTitolarioItemId(JAXBElement<TitolarioItemIdentifier> value) {
        this.titolarioItemId = ((JAXBElement<TitolarioItemIdentifier> ) value);
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
