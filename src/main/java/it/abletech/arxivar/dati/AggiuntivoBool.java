
package it.abletech.arxivar.dati;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Aggiuntivo_Bool complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Aggiuntivo_Bool">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.Abletech.it/Arxivar}Aggiuntivo_Base">
 *       &lt;sequence>
 *         &lt;element name="Valore" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Aggiuntivo_Bool", propOrder = {
    "valore"
})
public class AggiuntivoBool
    extends AggiuntivoBase
{

    @XmlElement(name = "Valore")
    protected boolean valore;

    /**
     * Gets the value of the valore property.
     * 
     */
    public boolean isValore() {
        return valore;
    }

    /**
     * Sets the value of the valore property.
     * 
     */
    public void setValore(boolean value) {
        this.valore = value;
    }

}
