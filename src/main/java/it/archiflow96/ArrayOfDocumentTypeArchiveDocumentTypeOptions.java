
package it.archiflow96;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDocumentType.ArchiveDocumentTypeOptions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDocumentType.ArchiveDocumentTypeOptions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DocumentType.ArchiveDocumentTypeOptions" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject}DocumentType.ArchiveDocumentTypeOptions" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDocumentType.ArchiveDocumentTypeOptions", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject", propOrder = {
    "documentTypeArchiveDocumentTypeOptions"
})
public class ArrayOfDocumentTypeArchiveDocumentTypeOptions {

    @XmlElement(name = "DocumentType.ArchiveDocumentTypeOptions", nillable = true)
    protected List<DocumentTypeArchiveDocumentTypeOptions> documentTypeArchiveDocumentTypeOptions;

    /**
     * Gets the value of the documentTypeArchiveDocumentTypeOptions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the documentTypeArchiveDocumentTypeOptions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocumentTypeArchiveDocumentTypeOptions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentTypeArchiveDocumentTypeOptions }
     * 
     * 
     */
    public List<DocumentTypeArchiveDocumentTypeOptions> getDocumentTypeArchiveDocumentTypeOptions() {
        if (documentTypeArchiveDocumentTypeOptions == null) {
            documentTypeArchiveDocumentTypeOptions = new ArrayList<DocumentTypeArchiveDocumentTypeOptions>();
        }
        return this.documentTypeArchiveDocumentTypeOptions;
    }

}
