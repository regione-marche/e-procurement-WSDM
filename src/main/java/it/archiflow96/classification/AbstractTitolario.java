
package it.archiflow96.classification;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AbstractTitolario complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbstractTitolario">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.ValueObject}BaseValueObject">
 *       &lt;sequence>
 *         &lt;element name="MaxLevel" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MaxLevelSubfolder" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MultipleSerieArchiving" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="StoreOnlyInSubfolders" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractTitolario", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Titolario.ValueObject", propOrder = {
    "maxLevel",
    "maxLevelSubfolder",
    "multipleSerieArchiving",
    "storeOnlyInSubfolders"
})
@XmlSeeAlso({
    BaseTitolario.class,
    TitolarioTemplateEntity.class
})
public class AbstractTitolario
    extends BaseValueObject
{

    @XmlElement(name = "MaxLevel")
    protected Integer maxLevel;
    @XmlElement(name = "MaxLevelSubfolder")
    protected Integer maxLevelSubfolder;
    @XmlElement(name = "MultipleSerieArchiving")
    protected Boolean multipleSerieArchiving;
    @XmlElement(name = "StoreOnlyInSubfolders")
    protected Boolean storeOnlyInSubfolders;

    /**
     * Gets the value of the maxLevel property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxLevel() {
        return maxLevel;
    }

    /**
     * Sets the value of the maxLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxLevel(Integer value) {
        this.maxLevel = value;
    }

    /**
     * Gets the value of the maxLevelSubfolder property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxLevelSubfolder() {
        return maxLevelSubfolder;
    }

    /**
     * Sets the value of the maxLevelSubfolder property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxLevelSubfolder(Integer value) {
        this.maxLevelSubfolder = value;
    }

    /**
     * Gets the value of the multipleSerieArchiving property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMultipleSerieArchiving() {
        return multipleSerieArchiving;
    }

    /**
     * Sets the value of the multipleSerieArchiving property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMultipleSerieArchiving(Boolean value) {
        this.multipleSerieArchiving = value;
    }

    /**
     * Gets the value of the storeOnlyInSubfolders property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStoreOnlyInSubfolders() {
        return storeOnlyInSubfolders;
    }

    /**
     * Sets the value of the storeOnlyInSubfolders property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStoreOnlyInSubfolders(Boolean value) {
        this.storeOnlyInSubfolders = value;
    }

}
