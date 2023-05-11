
package it.archiflow93.classification;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDocumentIdentifier complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDocumentIdentifier">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DocumentIdentifier" type="{http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Common.Identifier}DocumentIdentifier" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDocumentIdentifier", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Common.Identifier", propOrder = {
    "documentIdentifier"
})
public class ArrayOfDocumentIdentifier {

    @XmlElement(name = "DocumentIdentifier", nillable = true)
    protected List<DocumentIdentifier> documentIdentifier;

    /**
     * Gets the value of the documentIdentifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the documentIdentifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocumentIdentifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentIdentifier }
     * 
     * 
     */
    public List<DocumentIdentifier> getDocumentIdentifier() {
        if (documentIdentifier == null) {
            documentIdentifier = new ArrayList<DocumentIdentifier>();
        }
        return this.documentIdentifier;
    }

}
