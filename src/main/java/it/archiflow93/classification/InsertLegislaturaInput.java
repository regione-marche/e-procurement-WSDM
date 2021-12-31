
package it.archiflow93.classification;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InsertLegislaturaInput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InsertLegislaturaInput">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities}BaseInput">
 *       &lt;sequence>
 *         &lt;element name="Legis" type="{http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Fascicoli.ValueObject}Legislatura" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InsertLegislaturaInput", propOrder = {
    "legis"
})
public class InsertLegislaturaInput
    extends BaseInput
{

    @XmlElement(name = "Legis", nillable = true)
    protected Legislatura legis;

    /**
     * Gets the value of the legis property.
     * 
     * @return
     *     possible object is
     *     {@link Legislatura }
     *     
     */
    public Legislatura getLegis() {
        return legis;
    }

    /**
     * Sets the value of the legis property.
     * 
     * @param value
     *     allowed object is
     *     {@link Legislatura }
     *     
     */
    public void setLegis(Legislatura value) {
        this.legis = value;
    }

}
