
package it.archiflow96;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="strSessionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="enAccessLevel" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types}AccessLevel" minOccurs="0"/>
 *         &lt;element name="archiveIds" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfshort" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "strSessionId",
    "enAccessLevel",
    "archiveIds"
})
@XmlRootElement(name = "GetDocumentTypesFromArchives")
public class GetDocumentTypesFromArchives {

    @XmlElement(nillable = true)
    protected String strSessionId;
    protected AccessLevel enAccessLevel;
    @XmlElement(nillable = true)
    protected ArrayOfshort archiveIds;

    /**
     * Gets the value of the strSessionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrSessionId() {
        return strSessionId;
    }

    /**
     * Sets the value of the strSessionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrSessionId(String value) {
        this.strSessionId = value;
    }

    /**
     * Gets the value of the enAccessLevel property.
     * 
     * @return
     *     possible object is
     *     {@link AccessLevel }
     *     
     */
    public AccessLevel getEnAccessLevel() {
        return enAccessLevel;
    }

    /**
     * Sets the value of the enAccessLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccessLevel }
     *     
     */
    public void setEnAccessLevel(AccessLevel value) {
        this.enAccessLevel = value;
    }

    /**
     * Gets the value of the archiveIds property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfshort }
     *     
     */
    public ArrayOfshort getArchiveIds() {
        return archiveIds;
    }

    /**
     * Sets the value of the archiveIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfshort }
     *     
     */
    public void setArchiveIds(ArrayOfshort value) {
        this.archiveIds = value;
    }

}
