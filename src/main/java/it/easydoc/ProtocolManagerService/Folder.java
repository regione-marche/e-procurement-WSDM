
package it.easydoc.ProtocolManagerService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Folder complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Folder">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FolderCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DominioCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Folder", propOrder = {
    "folderCode",
    "dominioCode"
})
public class Folder {

    @XmlElement(name = "FolderCode", required = true)
    protected String folderCode;
    @XmlElement(name = "DominioCode")
    protected String dominioCode;

    /**
     * Gets the value of the folderCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFolderCode() {
        return folderCode;
    }

    /**
     * Sets the value of the folderCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFolderCode(String value) {
        this.folderCode = value;
    }

    /**
     * Gets the value of the dominioCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDominioCode() {
        return dominioCode;
    }

    /**
     * Sets the value of the dominioCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDominioCode(String value) {
        this.dominioCode = value;
    }

}
