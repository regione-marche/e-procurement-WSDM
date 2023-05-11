
package it.abletech.arxivar.search;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Field_DateTime complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Field_DateTime">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.Abletech.it/Arxivar}Field_Int_Base">
 *       &lt;sequence>
 *         &lt;element name="Valore" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Valore2" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Field_DateTime", propOrder = {
    "valore",
    "valore2"
})
public class FieldDateTime
    extends FieldIntBase
{

    @XmlElement(name = "Valore", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar valore;
    @XmlElement(name = "Valore2", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar valore2;

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

    /**
     * Gets the value of the valore2 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValore2() {
        return valore2;
    }

    /**
     * Sets the value of the valore2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValore2(XMLGregorianCalendar value) {
        this.valore2 = value;
    }

}
