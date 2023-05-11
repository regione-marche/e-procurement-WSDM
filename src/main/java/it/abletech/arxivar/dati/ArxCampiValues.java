
package it.abletech.arxivar.dati;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Arx_CampiValues complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Arx_CampiValues">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.Abletech.it/Arxivar}Base">
 *       &lt;sequence>
 *         &lt;element name="Campo_Chiave" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Campo_Select" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NomeCampo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Associazioni" type="{http://www.Abletech.it/Arxivar}ArrayOfArx_KeyValue" minOccurs="0"/>
 *         &lt;element name="Classe" type="{http://www.Abletech.it/Arxivar}Dm_Campi_Classe"/>
 *         &lt;element name="Provenienza" type="{http://www.Abletech.it/Arxivar}Dm_Campispecifici_Provenienza" minOccurs="0"/>
 *         &lt;element name="arxDataSource" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Arx_CampiValues", propOrder = {
    "campoChiave",
    "campoSelect",
    "nomeCampo",
    "associazioni",
    "classe",
    "provenienza",
    "arxDataSource"
})
public class ArxCampiValues
    extends Base
{

    @XmlElement(name = "Campo_Chiave")
    protected String campoChiave;
    @XmlElement(name = "Campo_Select")
    protected String campoSelect;
    @XmlElement(name = "NomeCampo")
    protected String nomeCampo;
    @XmlElement(name = "Associazioni")
    protected ArrayOfArxKeyValue associazioni;
    @XmlElement(name = "Classe", required = true)
    protected DmCampiClasse classe;
    @XmlElement(name = "Provenienza")
    protected DmCampispecificiProvenienza provenienza;
    protected String arxDataSource;

    /**
     * Gets the value of the campoChiave property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCampoChiave() {
        return campoChiave;
    }

    /**
     * Sets the value of the campoChiave property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCampoChiave(String value) {
        this.campoChiave = value;
    }

    /**
     * Gets the value of the campoSelect property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCampoSelect() {
        return campoSelect;
    }

    /**
     * Sets the value of the campoSelect property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCampoSelect(String value) {
        this.campoSelect = value;
    }

    /**
     * Gets the value of the nomeCampo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeCampo() {
        return nomeCampo;
    }

    /**
     * Sets the value of the nomeCampo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeCampo(String value) {
        this.nomeCampo = value;
    }

    /**
     * Gets the value of the associazioni property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfArxKeyValue }
     *     
     */
    public ArrayOfArxKeyValue getAssociazioni() {
        return associazioni;
    }

    /**
     * Sets the value of the associazioni property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfArxKeyValue }
     *     
     */
    public void setAssociazioni(ArrayOfArxKeyValue value) {
        this.associazioni = value;
    }

    /**
     * Gets the value of the classe property.
     * 
     * @return
     *     possible object is
     *     {@link DmCampiClasse }
     *     
     */
    public DmCampiClasse getClasse() {
        return classe;
    }

    /**
     * Sets the value of the classe property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmCampiClasse }
     *     
     */
    public void setClasse(DmCampiClasse value) {
        this.classe = value;
    }

    /**
     * Gets the value of the provenienza property.
     * 
     * @return
     *     possible object is
     *     {@link DmCampispecificiProvenienza }
     *     
     */
    public DmCampispecificiProvenienza getProvenienza() {
        return provenienza;
    }

    /**
     * Sets the value of the provenienza property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmCampispecificiProvenienza }
     *     
     */
    public void setProvenienza(DmCampispecificiProvenienza value) {
        this.provenienza = value;
    }

    /**
     * Gets the value of the arxDataSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArxDataSource() {
        return arxDataSource;
    }

    /**
     * Sets the value of the arxDataSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArxDataSource(String value) {
        this.arxDataSource = value;
    }

}
