
package it.archiflow94;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchFoldersByParamOutput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchFoldersByParamOutput">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities}BaseOutput">
 *       &lt;sequence>
 *         &lt;element name="Folders" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Folder.ValueObject}ArrayOfFolder" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchFoldersByParamOutput", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Folder.ValueObject", propOrder = {
    "folders"
})
public class SearchFoldersByParamOutput
    extends BaseOutput
{

    @XmlElement(name = "Folders", nillable = true)
    protected ArrayOfFolder folders;

    /**
     * Gets the value of the folders property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFolder }
     *     
     */
    public ArrayOfFolder getFolders() {
        return folders;
    }

    /**
     * Sets the value of the folders property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFolder }
     *     
     */
    public void setFolders(ArrayOfFolder value) {
        this.folders = value;
    }

}
