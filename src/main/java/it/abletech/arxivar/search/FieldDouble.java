
package it.abletech.arxivar.search;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Field_Double complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Field_Double">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.Abletech.it/Arxivar}Field_Int_Base">
 *       &lt;sequence>
 *         &lt;element name="Valore" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Valore2" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Field_Double", propOrder = {
    "valore",
    "valore2"
})
public class FieldDouble
    extends FieldIntBase
{

    @XmlElement(name = "Valore")
    protected double valore;
    @XmlElement(name = "Valore2")
    protected double valore2;

    /**
     * Gets the value of the valore property.
     * 
     */
    public double getValore() {
        return valore;
    }

    /**
     * Sets the value of the valore property.
     * 
     */
    public void setValore(double value) {
        this.valore = value;
    }

    /**
     * Gets the value of the valore2 property.
     * 
     */
    public double getValore2() {
        return valore2;
    }

    /**
     * Sets the value of the valore2 property.
     * 
     */
    public void setValore2(double value) {
        this.valore2 = value;
    }

}
