
package it.abletech.arxivar.search;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Join_Dm_LinguaCampi complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Join_Dm_LinguaCampi">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.Abletech.it/Arxivar}Join_Abstract">
 *       &lt;sequence>
 *         &lt;element name="NomeCampo" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="CodiceLingua" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="Valore" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Join_Dm_LinguaCampi", propOrder = {
    "nomeCampo",
    "codiceLingua",
    "valore"
})
public class JoinDmLinguaCampi
    extends JoinAbstract
{

    @XmlElement(name = "NomeCampo")
    protected FieldString nomeCampo;
    @XmlElement(name = "CodiceLingua")
    protected FieldString codiceLingua;
    @XmlElement(name = "Valore")
    protected FieldString valore;

    /**
     * Gets the value of the nomeCampo property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getNomeCampo() {
        return nomeCampo;
    }

    /**
     * Sets the value of the nomeCampo property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setNomeCampo(FieldString value) {
        this.nomeCampo = value;
    }

    /**
     * Gets the value of the codiceLingua property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getCodiceLingua() {
        return codiceLingua;
    }

    /**
     * Sets the value of the codiceLingua property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setCodiceLingua(FieldString value) {
        this.codiceLingua = value;
    }

    /**
     * Gets the value of the valore property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getValore() {
        return valore;
    }

    /**
     * Sets the value of the valore property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setValore(FieldString value) {
        this.valore = value;
    }

}
