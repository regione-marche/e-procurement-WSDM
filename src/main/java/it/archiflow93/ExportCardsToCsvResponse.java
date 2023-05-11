
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
 *         &lt;element name="ExportCardsToCsvResult" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject}ExportCardsToCsvOutput" minOccurs="0"/>
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
    "exportCardsToCsvResult"
})
@XmlRootElement(name = "ExportCardsToCsvResponse")
public class ExportCardsToCsvResponse {

    @XmlElement(name = "ExportCardsToCsvResult", nillable = true)
    protected ExportCardsToCsvOutput exportCardsToCsvResult;

    /**
     * Gets the value of the exportCardsToCsvResult property.
     * 
     * @return
     *     possible object is
     *     {@link ExportCardsToCsvOutput }
     *     
     */
    public ExportCardsToCsvOutput getExportCardsToCsvResult() {
        return exportCardsToCsvResult;
    }

    /**
     * Sets the value of the exportCardsToCsvResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportCardsToCsvOutput }
     *     
     */
    public void setExportCardsToCsvResult(ExportCardsToCsvOutput value) {
        this.exportCardsToCsvResult = value;
    }

}
