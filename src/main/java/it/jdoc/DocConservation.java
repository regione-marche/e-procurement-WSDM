
package it.jdoc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for DocConservation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DocConservation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ConservationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="IsConserved" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocConservation", namespace = "http://schemas.datacontract.org/2004/07/WS_Operazioni", propOrder = {
    "conservationDate",
    "isConserved"
})
public class DocConservation {

    @XmlElement(name = "ConservationDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar conservationDate;
    @XmlElement(name = "IsConserved")
    protected Boolean isConserved;

    /**
     * Gets the value of the conservationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getConservationDate() {
        return conservationDate;
    }

    /**
     * Sets the value of the conservationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setConservationDate(XMLGregorianCalendar value) {
        this.conservationDate = value;
    }

    /**
     * Gets the value of the isConserved property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsConserved() {
        return isConserved;
    }

    /**
     * Sets the value of the isConserved property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsConserved(Boolean value) {
        this.isConserved = value;
    }

}
