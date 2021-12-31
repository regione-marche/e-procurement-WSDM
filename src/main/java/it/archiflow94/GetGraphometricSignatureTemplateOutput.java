
package it.archiflow94;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetGraphometricSignatureTemplateOutput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetGraphometricSignatureTemplateOutput">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities}BaseOutput">
 *       &lt;sequence>
 *         &lt;element name="Fct" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetGraphometricSignatureTemplateOutput", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Card.ValueObject", propOrder = {
    "fct"
})
public class GetGraphometricSignatureTemplateOutput
    extends BaseOutput
{

    @XmlElement(name = "Fct", nillable = true)
    protected byte[] fct;

    /**
     * Gets the value of the fct property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getFct() {
        return fct;
    }

    /**
     * Sets the value of the fct property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setFct(byte[] value) {
        this.fct = ((byte[]) value);
    }

}
