
package it.jdoc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DocResultStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DocResultStatus">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/WS_Operazioni}Result">
 *       &lt;sequence>
 *         &lt;element name="Iddoc" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="StatusWorkflow" type="{http://schemas.datacontract.org/2004/07/WS_Operazioni}DocStatusWorkflow" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocResultStatus", namespace = "http://schemas.datacontract.org/2004/07/WS_Operazioni", propOrder = {
    "iddoc",
    "statusWorkflow"
})
public class DocResultStatus
    extends Result
{

    @XmlElement(name = "Iddoc")
    protected Long iddoc;
    @XmlElement(name = "StatusWorkflow", nillable = true)
    protected DocStatusWorkflow statusWorkflow;

    /**
     * Gets the value of the iddoc property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIddoc() {
        return iddoc;
    }

    /**
     * Sets the value of the iddoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIddoc(Long value) {
        this.iddoc = value;
    }

    /**
     * Gets the value of the statusWorkflow property.
     * 
     * @return
     *     possible object is
     *     {@link DocStatusWorkflow }
     *     
     */
    public DocStatusWorkflow getStatusWorkflow() {
        return statusWorkflow;
    }

    /**
     * Sets the value of the statusWorkflow property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocStatusWorkflow }
     *     
     */
    public void setStatusWorkflow(DocStatusWorkflow value) {
        this.statusWorkflow = value;
    }

}
