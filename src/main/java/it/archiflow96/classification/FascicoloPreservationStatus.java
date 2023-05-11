
package it.archiflow96.classification;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for FascicoloPreservationStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FascicoloPreservationStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="DepositId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FascId" type="{http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.Identifier}FascicoloIdentifier" minOccurs="0"/>
 *         &lt;element name="PreservationResult" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Types}PreservationStatus" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FascicoloPreservationStatus", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject", propOrder = {
    "date",
    "depositId",
    "fascId",
    "preservationResult"
})
public class FascicoloPreservationStatus {

    @XmlElement(name = "Date", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar date;
    @XmlElement(name = "DepositId", nillable = true)
    protected String depositId;
    @XmlElement(name = "FascId", nillable = true)
    protected FascicoloIdentifier fascId;
    @XmlElement(name = "PreservationResult")
    protected PreservationStatus preservationResult;

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDate(XMLGregorianCalendar value) {
        this.date = value;
    }

    /**
     * Gets the value of the depositId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepositId() {
        return depositId;
    }

    /**
     * Sets the value of the depositId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepositId(String value) {
        this.depositId = value;
    }

    /**
     * Gets the value of the fascId property.
     * 
     * @return
     *     possible object is
     *     {@link FascicoloIdentifier }
     *     
     */
    public FascicoloIdentifier getFascId() {
        return fascId;
    }

    /**
     * Sets the value of the fascId property.
     * 
     * @param value
     *     allowed object is
     *     {@link FascicoloIdentifier }
     *     
     */
    public void setFascId(FascicoloIdentifier value) {
        this.fascId = value;
    }

    /**
     * Gets the value of the preservationResult property.
     * 
     * @return
     *     possible object is
     *     {@link PreservationStatus }
     *     
     */
    public PreservationStatus getPreservationResult() {
        return preservationResult;
    }

    /**
     * Sets the value of the preservationResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link PreservationStatus }
     *     
     */
    public void setPreservationResult(PreservationStatus value) {
        this.preservationResult = value;
    }

}
