
package it.archiflow96;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardsOperationsInput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CardsOperationsInput">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities}BaseInput">
 *       &lt;sequence>
 *         &lt;element name="CardsIdentifiers" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject}ArrayOfCardOperationsIdentifiers" minOccurs="0"/>
 *         &lt;element name="GetAll" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="GetDetails" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="OperationsFilter" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types}ArrayOfCardOperation" minOccurs="0"/>
 *         &lt;element name="TestSdIXmlIsSigned" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardsOperationsInput", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject", propOrder = {
    "cardsIdentifiers",
    "getAll",
    "getDetails",
    "operationsFilter",
    "testSdIXmlIsSigned"
})
public class CardsOperationsInput
    extends BaseInput
{

    @XmlElement(name = "CardsIdentifiers", nillable = true)
    protected ArrayOfCardOperationsIdentifiers cardsIdentifiers;
    @XmlElement(name = "GetAll")
    protected Boolean getAll;
    @XmlElement(name = "GetDetails")
    protected Boolean getDetails;
    @XmlElement(name = "OperationsFilter", nillable = true)
    protected ArrayOfCardOperation operationsFilter;
    @XmlElement(name = "TestSdIXmlIsSigned")
    protected Boolean testSdIXmlIsSigned;

    /**
     * Gets the value of the cardsIdentifiers property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCardOperationsIdentifiers }
     *     
     */
    public ArrayOfCardOperationsIdentifiers getCardsIdentifiers() {
        return cardsIdentifiers;
    }

    /**
     * Sets the value of the cardsIdentifiers property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCardOperationsIdentifiers }
     *     
     */
    public void setCardsIdentifiers(ArrayOfCardOperationsIdentifiers value) {
        this.cardsIdentifiers = value;
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
     * Gets the value of the getDetails property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGetDetails() {
        return getDetails;
    }

    /**
     * Sets the value of the getDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGetDetails(Boolean value) {
        this.getDetails = value;
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

}
