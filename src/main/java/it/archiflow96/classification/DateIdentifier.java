
package it.archiflow96.classification;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for DateIdentifier complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DateIdentifier">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.ValueObject}BaseIdentifier">
 *       &lt;sequence>
 *         &lt;element name="DateVal" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DateIdentifier", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.ValueObject", propOrder = {
    "dateVal"
})
public class DateIdentifier
    extends BaseIdentifier
{

    @XmlElement(name = "DateVal")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateVal;

    /**
     * Gets the value of the dateVal property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateVal() {
        return dateVal;
    }

    /**
     * Sets the value of the dateVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateVal(XMLGregorianCalendar value) {
        this.dateVal = value;
    }

}
