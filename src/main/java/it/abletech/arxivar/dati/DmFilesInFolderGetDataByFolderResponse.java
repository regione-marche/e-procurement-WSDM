
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
 *         &lt;element name="Dm_FilesInFolder_GetData_ByFolderResult" type="{http://www.Abletech.it/Arxivar}ArrayOfDm_FileInFolder" minOccurs="0"/>
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
    "dmFilesInFolderGetDataByFolderResult"
})
@XmlRootElement(name = "Dm_FilesInFolder_GetData_ByFolderResponse")
public class DmFilesInFolderGetDataByFolderResponse {

    @XmlElement(name = "Dm_FilesInFolder_GetData_ByFolderResult")
    protected ArrayOfDmFileInFolder dmFilesInFolderGetDataByFolderResult;

    /**
     * Gets the value of the dmFilesInFolderGetDataByFolderResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDmFileInFolder }
     *     
     */
    public ArrayOfDmFileInFolder getDmFilesInFolderGetDataByFolderResult() {
        return dmFilesInFolderGetDataByFolderResult;
    }

    /**
     * Sets the value of the dmFilesInFolderGetDataByFolderResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDmFileInFolder }
     *     
     */
    public void setDmFilesInFolderGetDataByFolderResult(ArrayOfDmFileInFolder value) {
        this.dmFilesInFolderGetDataByFolderResult = value;
    }

}
