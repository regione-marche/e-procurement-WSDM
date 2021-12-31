
package it.abletech.arxivar.search;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Field_String_LinguaCampi complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Field_String_LinguaCampi">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.Abletech.it/Arxivar}Field_String">
 *       &lt;sequence>
 *         &lt;element name="NomeCampoChiave" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Field_String_LinguaCampi", propOrder = {
    "nomeCampoChiave"
})
public class FieldStringLinguaCampi
    extends FieldString
{

    @XmlElement(name = "NomeCampoChiave")
    protected String nomeCampoChiave;

    /**
     * Gets the value of the nomeCampoChiave property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeCampoChiave() {
        return nomeCampoChiave;
    }

    /**
     * Sets the value of the nomeCampoChiave property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeCampoChiave(String value) {
        this.nomeCampoChiave = value;
    }

}
