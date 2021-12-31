
package it.abletech.arxivar.dati;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Aggiuntivo_Matrix complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Aggiuntivo_Matrix">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.Abletech.it/Arxivar}Aggiuntivo_Base">
 *       &lt;sequence>
 *         &lt;element name="Valore" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Aggiuntivo_Matrix", propOrder = {
    "valore"
})
public class AggiuntivoMatrix
    extends AggiuntivoBase
{

    @XmlElement(name = "Valore")
    protected byte[] valore;

    /**
     * Gets the value of the valore property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getValore() {
        return valore;
    }

    /**
     * Sets the value of the valore property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setValore(byte[] value) {
        this.valore = ((byte[]) value);
    }

}
