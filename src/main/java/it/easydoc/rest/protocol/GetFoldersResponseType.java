
package it.easydoc.rest.protocol;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetFoldersResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetFoldersResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.consorziocsa.it/easydoc/ws}GenericServiceResponse">
 *       &lt;sequence>
 *         &lt;element name="Folder" type="{http://www.consorziocsa.it/easydoc/ws}FolderType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetFoldersResponseType", propOrder = {
    "folder"
})
public class GetFoldersResponseType
    extends GenericServiceResponse
{

    @XmlElement(name = "Folder")
    protected List<FolderType> folder;

    /**
     * Gets the value of the folder property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the folder property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFolder().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FolderType }
     * 
     * 
     */
    public List<FolderType> getFolder() {
        if (folder == null) {
            folder = new ArrayList<FolderType>();
        }
        return this.folder;
    }

}
