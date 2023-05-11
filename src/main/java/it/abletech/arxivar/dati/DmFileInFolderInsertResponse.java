
package it.abletech.arxivar.dati;

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
 *         &lt;element name="Dm_FileInFolder_InsertResult" type="{http://www.Abletech.it/Arxivar}Dm_FileInFolder" minOccurs="0"/>
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
    "dmFileInFolderInsertResult"
})
@XmlRootElement(name = "Dm_FileInFolder_InsertResponse")
public class DmFileInFolderInsertResponse {

    @XmlElement(name = "Dm_FileInFolder_InsertResult")
    protected DmFileInFolder dmFileInFolderInsertResult;

    /**
     * Gets the value of the dmFileInFolderInsertResult property.
     * 
     * @return
     *     possible object is
     *     {@link DmFileInFolder }
     *     
     */
    public DmFileInFolder getDmFileInFolderInsertResult() {
        return dmFileInFolderInsertResult;
    }

    /**
     * Sets the value of the dmFileInFolderInsertResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmFileInFolder }
     *     
     */
    public void setDmFileInFolderInsertResult(DmFileInFolder value) {
        this.dmFileInFolderInsertResult = value;
    }

}
