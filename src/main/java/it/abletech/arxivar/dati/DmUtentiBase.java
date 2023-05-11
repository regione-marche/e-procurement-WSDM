
package it.abletech.arxivar.dati;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Dm_UtentiBase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Dm_UtentiBase">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.Abletech.it/Arxivar}Base">
 *       &lt;sequence>
 *         &lt;element name="DESCRIPTION_EX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UTENTE" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="GRUPPO" type="{http://www.Abletech.it/Arxivar}Dm_Utenti_Gruppo"/>
 *         &lt;element name="DESCRIPTION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EMAIL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AOO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CATEGORIA" type="{http://www.Abletech.it/Arxivar}Dm_Utenti_Categoria"/>
 *         &lt;element name="STATOUTENTE" type="{http://www.Abletech.it/Arxivar}Dm_Utenti_StatoUtente"/>
 *         &lt;element name="MUSTCHANGEPASSWORD" type="{http://www.Abletech.it/Arxivar}Dm_Utenti_MustChangePassword"/>
 *         &lt;element name="LANG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RESPAOS" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="NOMECOMPLETO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AOOLOCKED" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="WORKINGAOO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CANADDVIRTUALSTAMPS" type="{http://www.Abletech.it/Arxivar}Dm_Stamp_Security"/>
 *         &lt;element name="CANAPPLYSTAMPS" type="{http://www.Abletech.it/Arxivar}Dm_Stamp_Security"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Dm_UtentiBase", propOrder = {
    "descriptionex",
    "utente",
    "gruppo",
    "description",
    "email",
    "aoo",
    "categoria",
    "statoutente",
    "mustchangepassword",
    "lang",
    "respaos",
    "nomecompleto",
    "aoolocked",
    "workingaoo",
    "canaddvirtualstamps",
    "canapplystamps"
})
public class DmUtentiBase
    extends Base
{

    @XmlElement(name = "DESCRIPTION_EX")
    protected String descriptionex;
    @XmlElement(name = "UTENTE")
    protected int utente;
    @XmlElement(name = "GRUPPO", required = true)
    protected DmUtentiGruppo gruppo;
    @XmlElement(name = "DESCRIPTION")
    protected String description;
    @XmlElement(name = "EMAIL")
    protected String email;
    @XmlElement(name = "AOO")
    protected String aoo;
    @XmlElement(name = "CATEGORIA", required = true)
    protected DmUtentiCategoria categoria;
    @XmlElement(name = "STATOUTENTE", required = true)
    protected DmUtentiStatoUtente statoutente;
    @XmlElement(name = "MUSTCHANGEPASSWORD", required = true)
    protected DmUtentiMustChangePassword mustchangepassword;
    @XmlElement(name = "LANG")
    protected String lang;
    @XmlElement(name = "RESPAOS")
    protected boolean respaos;
    @XmlElement(name = "NOMECOMPLETO")
    protected String nomecompleto;
    @XmlElement(name = "AOOLOCKED")
    protected boolean aoolocked;
    @XmlElement(name = "WORKINGAOO")
    protected String workingaoo;
    @XmlElement(name = "CANADDVIRTUALSTAMPS", required = true)
    protected DmStampSecurity canaddvirtualstamps;
    @XmlElement(name = "CANAPPLYSTAMPS", required = true)
    protected DmStampSecurity canapplystamps;

    /**
     * Gets the value of the descriptionex property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDESCRIPTIONEX() {
        return descriptionex;
    }

    /**
     * Sets the value of the descriptionex property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDESCRIPTIONEX(String value) {
        this.descriptionex = value;
    }

    /**
     * Gets the value of the utente property.
     * 
     */
    public int getUTENTE() {
        return utente;
    }

    /**
     * Sets the value of the utente property.
     * 
     */
    public void setUTENTE(int value) {
        this.utente = value;
    }

    /**
     * Gets the value of the gruppo property.
     * 
     * @return
     *     possible object is
     *     {@link DmUtentiGruppo }
     *     
     */
    public DmUtentiGruppo getGRUPPO() {
        return gruppo;
    }

    /**
     * Sets the value of the gruppo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmUtentiGruppo }
     *     
     */
    public void setGRUPPO(DmUtentiGruppo value) {
        this.gruppo = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDESCRIPTION() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDESCRIPTION(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEMAIL() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEMAIL(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the aoo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAOO() {
        return aoo;
    }

    /**
     * Sets the value of the aoo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAOO(String value) {
        this.aoo = value;
    }

    /**
     * Gets the value of the categoria property.
     * 
     * @return
     *     possible object is
     *     {@link DmUtentiCategoria }
     *     
     */
    public DmUtentiCategoria getCATEGORIA() {
        return categoria;
    }

    /**
     * Sets the value of the categoria property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmUtentiCategoria }
     *     
     */
    public void setCATEGORIA(DmUtentiCategoria value) {
        this.categoria = value;
    }

    /**
     * Gets the value of the statoutente property.
     * 
     * @return
     *     possible object is
     *     {@link DmUtentiStatoUtente }
     *     
     */
    public DmUtentiStatoUtente getSTATOUTENTE() {
        return statoutente;
    }

    /**
     * Sets the value of the statoutente property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmUtentiStatoUtente }
     *     
     */
    public void setSTATOUTENTE(DmUtentiStatoUtente value) {
        this.statoutente = value;
    }

    /**
     * Gets the value of the mustchangepassword property.
     * 
     * @return
     *     possible object is
     *     {@link DmUtentiMustChangePassword }
     *     
     */
    public DmUtentiMustChangePassword getMUSTCHANGEPASSWORD() {
        return mustchangepassword;
    }

    /**
     * Sets the value of the mustchangepassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmUtentiMustChangePassword }
     *     
     */
    public void setMUSTCHANGEPASSWORD(DmUtentiMustChangePassword value) {
        this.mustchangepassword = value;
    }

    /**
     * Gets the value of the lang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLANG() {
        return lang;
    }

    /**
     * Sets the value of the lang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLANG(String value) {
        this.lang = value;
    }

    /**
     * Gets the value of the respaos property.
     * 
     */
    public boolean isRESPAOS() {
        return respaos;
    }

    /**
     * Sets the value of the respaos property.
     * 
     */
    public void setRESPAOS(boolean value) {
        this.respaos = value;
    }

    /**
     * Gets the value of the nomecompleto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOMECOMPLETO() {
        return nomecompleto;
    }

    /**
     * Sets the value of the nomecompleto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOMECOMPLETO(String value) {
        this.nomecompleto = value;
    }

    /**
     * Gets the value of the aoolocked property.
     * 
     */
    public boolean isAOOLOCKED() {
        return aoolocked;
    }

    /**
     * Sets the value of the aoolocked property.
     * 
     */
    public void setAOOLOCKED(boolean value) {
        this.aoolocked = value;
    }

    /**
     * Gets the value of the workingaoo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWORKINGAOO() {
        return workingaoo;
    }

    /**
     * Sets the value of the workingaoo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWORKINGAOO(String value) {
        this.workingaoo = value;
    }

    /**
     * Gets the value of the canaddvirtualstamps property.
     * 
     * @return
     *     possible object is
     *     {@link DmStampSecurity }
     *     
     */
    public DmStampSecurity getCANADDVIRTUALSTAMPS() {
        return canaddvirtualstamps;
    }

    /**
     * Sets the value of the canaddvirtualstamps property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmStampSecurity }
     *     
     */
    public void setCANADDVIRTUALSTAMPS(DmStampSecurity value) {
        this.canaddvirtualstamps = value;
    }

    /**
     * Gets the value of the canapplystamps property.
     * 
     * @return
     *     possible object is
     *     {@link DmStampSecurity }
     *     
     */
    public DmStampSecurity getCANAPPLYSTAMPS() {
        return canapplystamps;
    }

    /**
     * Sets the value of the canapplystamps property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmStampSecurity }
     *     
     */
    public void setCANAPPLYSTAMPS(DmStampSecurity value) {
        this.canapplystamps = value;
    }

}
