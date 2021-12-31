
package it.jdoc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InputGetIdDoc complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InputGetIdDoc">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/WS_Operazioni}InputParameter">
 *       &lt;sequence>
 *         &lt;element name="Iddoc" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ImageNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InputGetIdDoc", namespace = "http://schemas.datacontract.org/2004/07/WS_Operazioni", propOrder = {
    "iddoc",
    "imageNumber"
})
public class InputGetIdDoc
    extends InputParameter
{

    @XmlElement(name = "Iddoc")
    protected Long iddoc;
    @XmlElement(name = "ImageNumber")
    protected Integer imageNumber;

    /**
     * Gets the value of the iddoc property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIddoc() {
        return iddoc;
    }

    /**
     * Sets the value of the iddoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIddoc(Long value) {
        this.iddoc = value;
    }

    /**
     * Gets the value of the imageNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getImageNumber() {
        return imageNumber;
    }

    /**
     * Sets the value of the imageNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setImageNumber(Integer value) {
        this.imageNumber = value;
    }

}
