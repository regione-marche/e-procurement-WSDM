
package it.archiflow93;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MainDocumentToPDFResult" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject}MainDocumentToPDFOutput" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "mainDocumentToPDFResult"
})
@XmlRootElement(name = "MainDocumentToPDFResponse")
public class MainDocumentToPDFResponse {

    @XmlElement(name = "MainDocumentToPDFResult", nillable = true)
    protected MainDocumentToPDFOutput mainDocumentToPDFResult;

    /**
     * Gets the value of the mainDocumentToPDFResult property.
     * 
     * @return
     *     possible object is
     *     {@link MainDocumentToPDFOutput }
     *     
     */
    public MainDocumentToPDFOutput getMainDocumentToPDFResult() {
        return mainDocumentToPDFResult;
    }

    /**
     * Sets the value of the mainDocumentToPDFResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link MainDocumentToPDFOutput }
     *     
     */
    public void setMainDocumentToPDFResult(MainDocumentToPDFOutput value) {
        this.mainDocumentToPDFResult = value;
    }

}
