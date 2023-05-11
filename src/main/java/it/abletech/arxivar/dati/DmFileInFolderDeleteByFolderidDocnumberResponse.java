
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
 *         &lt;element name="Dm_FileInFolder_Delete_By_Folderid_DocnumberResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "dmFileInFolderDeleteByFolderidDocnumberResult"
})
@XmlRootElement(name = "Dm_FileInFolder_Delete_By_Folderid_DocnumberResponse")
public class DmFileInFolderDeleteByFolderidDocnumberResponse {

    @XmlElement(name = "Dm_FileInFolder_Delete_By_Folderid_DocnumberResult")
    protected int dmFileInFolderDeleteByFolderidDocnumberResult;

    /**
     * Gets the value of the dmFileInFolderDeleteByFolderidDocnumberResult property.
     * 
     */
    public int getDmFileInFolderDeleteByFolderidDocnumberResult() {
        return dmFileInFolderDeleteByFolderidDocnumberResult;
    }

    /**
     * Sets the value of the dmFileInFolderDeleteByFolderidDocnumberResult property.
     * 
     */
    public void setDmFileInFolderDeleteByFolderidDocnumberResult(int value) {
        this.dmFileInFolderDeleteByFolderidDocnumberResult = value;
    }

}
