
package it.abletech.arxivar.search;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Join_Dm_Dati_Ente complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Join_Dm_Dati_Ente">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.Abletech.it/Arxivar}Join_Abstract">
 *       &lt;sequence>
 *         &lt;element name="Protocollo" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="DataProt" type="{http://www.Abletech.it/Arxivar}Field_DateTime" minOccurs="0"/>
 *         &lt;element name="Ufficio" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="Persona" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="Spedizione" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="VsRif" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Join_Dm_Dati_Ente", propOrder = {
    "protocollo",
    "dataProt",
    "ufficio",
    "persona",
    "spedizione",
    "vsRif"
})
public class JoinDmDatiEnte
    extends JoinAbstract
{

    @XmlElement(name = "Protocollo")
    protected FieldString protocollo;
    @XmlElement(name = "DataProt")
    protected FieldDateTime dataProt;
    @XmlElement(name = "Ufficio")
    protected FieldString ufficio;
    @XmlElement(name = "Persona")
    protected FieldString persona;
    @XmlElement(name = "Spedizione")
    protected FieldString spedizione;
    @XmlElement(name = "VsRif")
    protected FieldString vsRif;

    /**
     * Gets the value of the protocollo property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getProtocollo() {
        return protocollo;
    }

    /**
     * Sets the value of the protocollo property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setProtocollo(FieldString value) {
        this.protocollo = value;
    }

    /**
     * Gets the value of the dataProt property.
     * 
     * @return
     *     possible object is
     *     {@link FieldDateTime }
     *     
     */
    public FieldDateTime getDataProt() {
        return dataProt;
    }

    /**
     * Sets the value of the dataProt property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDateTime }
     *     
     */
    public void setDataProt(FieldDateTime value) {
        this.dataProt = value;
    }

    /**
     * Gets the value of the ufficio property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getUfficio() {
        return ufficio;
    }

    /**
     * Sets the value of the ufficio property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setUfficio(FieldString value) {
        this.ufficio = value;
    }

    /**
     * Gets the value of the persona property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getPersona() {
        return persona;
    }

    /**
     * Sets the value of the persona property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setPersona(FieldString value) {
        this.persona = value;
    }

    /**
     * Gets the value of the spedizione property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getSpedizione() {
        return spedizione;
    }

    /**
     * Sets the value of the spedizione property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setSpedizione(FieldString value) {
        this.spedizione = value;
    }

    /**
     * Gets the value of the vsRif property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getVsRif() {
        return vsRif;
    }

    /**
     * Sets the value of the vsRif property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setVsRif(FieldString value) {
        this.vsRif = value;
    }

}
