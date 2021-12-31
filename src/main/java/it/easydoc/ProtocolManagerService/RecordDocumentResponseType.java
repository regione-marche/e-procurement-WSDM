
package it.easydoc.ProtocolManagerService;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for recordDocumentResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="recordDocumentResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.consorziocsa.it/easydoc/ws}GenericServiceResponse">
 *       &lt;sequence>
 *         &lt;element name="ProtocolDocuments" type="{http://www.consorziocsa.it/easydoc/ws}Document_ID" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "recordDocumentResponseType", propOrder = {
    "protocolDocuments"
})
public class RecordDocumentResponseType
    extends GenericServiceResponse
{

    @XmlElement(name = "ProtocolDocuments", required = true)
    protected List<DocumentID> protocolDocuments;

    /**
     * Gets the value of the protocolDocuments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the protocolDocuments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProtocolDocuments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentID }
     * 
     * 
     */
    public List<DocumentID> getProtocolDocuments() {
        if (protocolDocuments == null) {
            protocolDocuments = new ArrayList<DocumentID>();
        }
        return this.protocolDocuments;
    }

}
