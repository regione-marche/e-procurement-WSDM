
package it.easydoc.ProtocolAdminService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for userCompanyCreationResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="userCompanyCreationResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.consorziocsa.it/easydoc/ws}GenericServiceResponse">
 *       &lt;sequence>
 *         &lt;element name="Document_ID" type="{http://www.consorziocsa.it/easydoc/ws}Document_ID" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "userCompanyCreationResponseType", propOrder = {
    "documentID"
})
public class UserCompanyCreationResponseType
    extends GenericServiceResponse
{

    @XmlElement(name = "Document_ID")
    protected DocumentID documentID;

    /**
     * Gets the value of the documentID property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentID }
     *     
     */
    public DocumentID getDocumentID() {
        return documentID;
    }

    /**
     * Sets the value of the documentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentID }
     *     
     */
    public void setDocumentID(DocumentID value) {
        this.documentID = value;
    }

}
