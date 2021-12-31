
package it.jdoc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DocStatusWorkflow complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DocStatusWorkflow">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IdDocStatusWorkflow" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="WorkflowAuthorizationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WorkflowStatusDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocStatusWorkflow", namespace = "http://schemas.datacontract.org/2004/07/WS_Operazioni", propOrder = {
    "idDocStatusWorkflow",
    "workflowAuthorizationType",
    "workflowStatusDescription"
})
public class DocStatusWorkflow {

    @XmlElement(name = "IdDocStatusWorkflow")
    protected Long idDocStatusWorkflow;
    @XmlElement(name = "WorkflowAuthorizationType", nillable = true)
    protected String workflowAuthorizationType;
    @XmlElement(name = "WorkflowStatusDescription", nillable = true)
    protected String workflowStatusDescription;

    /**
     * Gets the value of the idDocStatusWorkflow property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdDocStatusWorkflow() {
        return idDocStatusWorkflow;
    }

    /**
     * Sets the value of the idDocStatusWorkflow property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdDocStatusWorkflow(Long value) {
        this.idDocStatusWorkflow = value;
    }

    /**
     * Gets the value of the workflowAuthorizationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkflowAuthorizationType() {
        return workflowAuthorizationType;
    }

    /**
     * Sets the value of the workflowAuthorizationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkflowAuthorizationType(String value) {
        this.workflowAuthorizationType = value;
    }

    /**
     * Gets the value of the workflowStatusDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkflowStatusDescription() {
        return workflowStatusDescription;
    }

    /**
     * Sets the value of the workflowStatusDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkflowStatusDescription(String value) {
        this.workflowStatusDescription = value;
    }

}
