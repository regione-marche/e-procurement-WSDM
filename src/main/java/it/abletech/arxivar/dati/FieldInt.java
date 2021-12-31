
package it.abletech.arxivar.dati;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Field_Int complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Field_Int">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.Abletech.it/Arxivar}Field_Int_Base">
 *       &lt;sequence>
 *         &lt;element name="Valore" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Valore2" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Field_Int", propOrder = {
    "valore",
    "valore2"
})
@XmlSeeAlso({
    FieldNrGiorni.class,
    FieldDmRelazioniFromTo.class
})
public class FieldInt
    extends FieldIntBase
{

    @XmlElement(name = "Valore")
    protected int valore;
    @XmlElement(name = "Valore2")
    protected int valore2;

    /**
     * Gets the value of the valore property.
     * 
     */
    public int getValore() {
        return valore;
    }

    /**
     * Sets the value of the valore property.
     * 
     */
    public void setValore(int value) {
        this.valore = value;
    }

    /**
     * Gets the value of the valore2 property.
     * 
     */
    public int getValore2() {
        return valore2;
    }

    /**
     * Sets the value of the valore2 property.
     * 
     */
    public void setValore2(int value) {
        this.valore2 = value;
    }

}
