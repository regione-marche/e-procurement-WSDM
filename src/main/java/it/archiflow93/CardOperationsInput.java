
package it.archiflow93;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardOperationsInput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CardOperationsInput">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities}BaseInput">
 *       &lt;sequence>
 *         &lt;element name="CardId" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/>
 *         &lt;element name="GetAll" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="OperationsFilter" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types}ArrayOfCardOperation" minOccurs="0"/>
 *         &lt;element name="TestSdIXmlIsSigned" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="WorkItemId" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardOperationsInput", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject", propOrder = {
    "cardId",
    "getAll",
    "operationsFilter",
    "testSdIXmlIsSigned",
    "workItemId"
})
public class CardOperationsInput
    extends BaseInput
{

    @XmlElement(name = "CardId")
    protected String cardId;
    @XmlElement(name = "GetAll")
    protected Boolean getAll;
    @XmlElement(name = "OperationsFilter", nillable = true)
    protected ArrayOfCardOperation operationsFilter;
    @XmlElement(name = "TestSdIXmlIsSigned")
    protected Boolean testSdIXmlIsSigned;
    @XmlElement(name = "WorkItemId")
    protected String workItemId;

    /**
     * Gets the value of the cardId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardId() {
        return cardId;
    }

    /**
     * Sets the value of the cardId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardId(String value) {
        this.cardId = value;
    }

    /**
     * Gets the value of the getAll property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGetAll() {
        return getAll;
    }

    /**
     * Sets the value of the getAll property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGetAll(Boolean value) {
        this.getAll = value;
    }

    /**
     * Gets the value of the operationsFilter property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCardOperation }
     *     
     */
    public ArrayOfCardOperation getOperationsFilter() {
        return operationsFilter;
    }

    /**
     * Sets the value of the operationsFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCardOperation }
     *     
     */
    public void setOperationsFilter(ArrayOfCardOperation value) {
        this.operationsFilter = value;
    }

    /**
     * Gets the value of the testSdIXmlIsSigned property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTestSdIXmlIsSigned() {
        return testSdIXmlIsSigned;
    }

    /**
     * Sets the value of the testSdIXmlIsSigned property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTestSdIXmlIsSigned(Boolean value) {
        this.testSdIXmlIsSigned = value;
    }

    /**
     * Gets the value of the workItemId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkItemId() {
        return workItemId;
    }

    /**
     * Sets the value of the workItemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkItemId(String value) {
        this.workItemId = value;
    }

}
