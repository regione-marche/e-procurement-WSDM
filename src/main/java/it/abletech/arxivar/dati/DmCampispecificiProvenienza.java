
package it.abletech.arxivar.dati;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Dm_Campispecifici_Provenienza complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Dm_Campispecifici_Provenienza">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.Abletech.it/Arxivar}Base">
 *       &lt;sequence>
 *         &lt;element name="Tabella" type="{http://www.Abletech.it/Arxivar}Dm_Combo_Gruppi_Tabella"/>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Dm_Campispecifici_Provenienza", propOrder = {
    "tabella",
    "id"
})
public class DmCampispecificiProvenienza
    extends Base
{

    @XmlElement(name = "Tabella", required = true)
    protected DmComboGruppiTabella tabella;
    @XmlElement(name = "Id")
    protected String id;

    /**
     * Gets the value of the tabella property.
     * 
     * @return
     *     possible object is
     *     {@link DmComboGruppiTabella }
     *     
     */
    public DmComboGruppiTabella getTabella() {
        return tabella;
    }

    /**
     * Sets the value of the tabella property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmComboGruppiTabella }
     *     
     */
    public void setTabella(DmComboGruppiTabella value) {
        this.tabella = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

}
