
package it.abletech.arxivar.search;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Join_Dm_Testo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Join_Dm_Testo">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.Abletech.it/Arxivar}Join_Abstract">
 *       &lt;sequence>
 *         &lt;element name="Testo" type="{http://www.Abletech.it/Arxivar}Field_Full_Text" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Join_Dm_Testo", propOrder = {
    "testo"
})
public class JoinDmTesto
    extends JoinAbstract
{

    @XmlElement(name = "Testo")
    protected FieldFullText testo;

    /**
     * Gets the value of the testo property.
     * 
     * @return
     *     possible object is
     *     {@link FieldFullText }
     *     
     */
    public FieldFullText getTesto() {
        return testo;
    }

    /**
     * Sets the value of the testo property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldFullText }
     *     
     */
    public void setTesto(FieldFullText value) {
        this.testo = value;
    }

}
