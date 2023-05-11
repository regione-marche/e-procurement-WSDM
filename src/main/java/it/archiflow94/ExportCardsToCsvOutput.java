
package it.archiflow94;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExportCardsToCsvOutput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExportCardsToCsvOutput">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities}BaseOutput">
 *       &lt;sequence>
 *         &lt;element name="CsvBytes" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExportCardsToCsvOutput", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject", propOrder = {
    "csvBytes"
})
public class ExportCardsToCsvOutput
    extends BaseOutput
{

    @XmlElement(name = "CsvBytes", nillable = true)
    protected byte[] csvBytes;

    /**
     * Gets the value of the csvBytes property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getCsvBytes() {
        return csvBytes;
    }

    /**
     * Sets the value of the csvBytes property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setCsvBytes(byte[] value) {
        this.csvBytes = ((byte[]) value);
    }

}
