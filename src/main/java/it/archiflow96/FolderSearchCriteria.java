
package it.archiflow96;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FolderSearchCriteria complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FolderSearchCriteria">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FoldersId" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfint" minOccurs="0"/>
 *         &lt;element name="StoreDossierOptions" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types}SearchOptions" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FolderSearchCriteria", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject", propOrder = {
    "foldersId",
    "storeDossierOptions"
})
public class FolderSearchCriteria {

    @XmlElement(name = "FoldersId", nillable = true)
    protected ArrayOfint foldersId;
    @XmlElement(name = "StoreDossierOptions")
    protected SearchOptions storeDossierOptions;

    /**
     * Gets the value of the foldersId property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfint }
     *     
     */
    public ArrayOfint getFoldersId() {
        return foldersId;
    }

    /**
     * Sets the value of the foldersId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfint }
     *     
     */
    public void setFoldersId(ArrayOfint value) {
        this.foldersId = value;
    }

    /**
     * Gets the value of the storeDossierOptions property.
     * 
     * @return
     *     possible object is
     *     {@link SearchOptions }
     *     
     */
    public SearchOptions getStoreDossierOptions() {
        return storeDossierOptions;
    }

    /**
     * Sets the value of the storeDossierOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchOptions }
     *     
     */
    public void setStoreDossierOptions(SearchOptions value) {
        this.storeDossierOptions = value;
    }

}
