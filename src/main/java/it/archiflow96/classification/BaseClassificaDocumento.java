
package it.archiflow96.classification;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BaseClassificaDocumento complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaseClassificaDocumento">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.ValueObject}BaseValueObject">
 *       &lt;sequence>
 *         &lt;element name="FascDocColl" type="{http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject}ArrayOfBaseFascicoloDocumento" minOccurs="0"/>
 *         &lt;element name="Id" type="{http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Titolario.Identifier}ClassificaDocIdentifier" minOccurs="0"/>
 *         &lt;element name="Primary" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TitolarioItemId" type="{http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.TitolarioItem.Identifier}TitolarioItemIdentifier" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseClassificaDocumento", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Titolario.ValueObject", propOrder = {
    "fascDocColl",
    "id",
    "primary",
    "titolarioItemId"
})
@XmlSeeAlso({
    ClassificaDocumentoEntity.class
})
public class BaseClassificaDocumento
    extends BaseValueObject
{

    @XmlElement(name = "FascDocColl", nillable = true)
    protected ArrayOfBaseFascicoloDocumento fascDocColl;
    @XmlElement(name = "Id", nillable = true)
    protected ClassificaDocIdentifier id;
    @XmlElement(name = "Primary")
    protected Integer primary;
    @XmlElement(name = "TitolarioItemId", nillable = true)
    protected TitolarioItemIdentifier titolarioItemId;

    /**
     * Gets the value of the fascDocColl property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBaseFascicoloDocumento }
     *     
     */
    public ArrayOfBaseFascicoloDocumento getFascDocColl() {
        return fascDocColl;
    }

    /**
     * Sets the value of the fascDocColl property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBaseFascicoloDocumento }
     *     
     */
    public void setFascDocColl(ArrayOfBaseFascicoloDocumento value) {
        this.fascDocColl = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link ClassificaDocIdentifier }
     *     
     */
    public ClassificaDocIdentifier getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassificaDocIdentifier }
     *     
     */
    public void setId(ClassificaDocIdentifier value) {
        this.id = value;
    }

    /**
     * Gets the value of the primary property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPrimary() {
        return primary;
    }

    /**
     * Sets the value of the primary property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPrimary(Integer value) {
        this.primary = value;
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

}
