
package it.abletech.arxivar.dati;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Aggiuntivo_DateTime complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Aggiuntivo_DateTime">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.Abletech.it/Arxivar}Aggiuntivo_Base">
 *       &lt;sequence>
 *         &lt;element name="Valore" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Aggiuntivo_DateTime", propOrder = {
    "valore"
})
public class AggiuntivoDateTime
    extends AggiuntivoBase
{

    @XmlElement(name = "Valore", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar valore;

    /**
     * Gets the value of the valore property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValore() {
        return valore;
    }

    /**
     * Sets the value of the valore property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValore(XMLGregorianCalendar value) {
        this.valore = value;
    }

}
