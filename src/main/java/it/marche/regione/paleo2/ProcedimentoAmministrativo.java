
package it.marche.regione.paleo2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProcedimentoAmministrativo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProcedimentoAmministrativo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Denominazione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Fasi" type="{http://paleo.regione.marche.it/services2/}ArrayOfFaseProcedimentoA" minOccurs="0"/>
 *         &lt;element name="Materia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RUP" type="{http://paleo.regione.marche.it/services2/}OperatorePaleo" minOccurs="0"/>
 *         &lt;element name="UriCatalogo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProcedimentoAmministrativo", propOrder = {
    "denominazione",
    "fasi",
    "materia",
    "rup",
    "uriCatalogo"
})
public class ProcedimentoAmministrativo {

    @XmlElement(name = "Denominazione", nillable = true)
    protected String denominazione;
    @XmlElement(name = "Fasi", nillable = true)
    protected ArrayOfFaseProcedimentoA fasi;
    @XmlElement(name = "Materia", nillable = true)
    protected String materia;
    @XmlElement(name = "RUP", nillable = true)
    protected OperatorePaleo rup;
    @XmlElement(name = "UriCatalogo", nillable = true)
    protected String uriCatalogo;

    /**
     * Gets the value of the denominazione property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDenominazione() {
        return denominazione;
    }

    /**
     * Sets the value of the denominazione property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDenominazione(String value) {
        this.denominazione = value;
    }

    /**
     * Gets the value of the fasi property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFaseProcedimentoA }
     *     
     */
    public ArrayOfFaseProcedimentoA getFasi() {
        return fasi;
    }

    /**
     * Sets the value of the fasi property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFaseProcedimentoA }
     *     
     */
    public void setFasi(ArrayOfFaseProcedimentoA value) {
        this.fasi = value;
    }

    /**
     * Gets the value of the materia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMateria() {
        return materia;
    }

    /**
     * Sets the value of the materia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMateria(String value) {
        this.materia = value;
    }

    /**
     * Gets the value of the rup property.
     * 
     * @return
     *     possible object is
     *     {@link OperatorePaleo }
     *     
     */
    public OperatorePaleo getRUP() {
        return rup;
    }

    /**
     * Sets the value of the rup property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperatorePaleo }
     *     
     */
    public void setRUP(OperatorePaleo value) {
        this.rup = value;
    }

    /**
     * Gets the value of the uriCatalogo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUriCatalogo() {
        return uriCatalogo;
    }

    /**
     * Sets the value of the uriCatalogo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUriCatalogo(String value) {
        this.uriCatalogo = value;
    }

}
