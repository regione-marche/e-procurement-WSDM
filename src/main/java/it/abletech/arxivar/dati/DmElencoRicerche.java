
package it.abletech.arxivar.dati;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Dm_Elenco_Ricerche complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Dm_Elenco_Ricerche">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.Abletech.it/Arxivar}Base">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NOMERICERCA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UTENTE" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="T1" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="T2" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="T3" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CAMPISELECT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CAMPIEDIT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CAMPIORDER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MODOPEN" type="{http://www.Abletech.it/Arxivar}Dm_Elenco_Ricerche_ModOpen"/>
 *         &lt;element name="FORMOPEN" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Dm_Elenco_Ricerche", propOrder = {
    "id",
    "nomericerca",
    "utente",
    "t1",
    "t2",
    "t3",
    "campiselect",
    "campiedit",
    "campiorder",
    "modopen",
    "formopen"
})
public class DmElencoRicerche
    extends Base
{

    @XmlElement(name = "ID")
    protected String id;
    @XmlElement(name = "NOMERICERCA")
    protected String nomericerca;
    @XmlElement(name = "UTENTE")
    protected int utente;
    @XmlElement(name = "T1")
    protected int t1;
    @XmlElement(name = "T2")
    protected int t2;
    @XmlElement(name = "T3")
    protected int t3;
    @XmlElement(name = "CAMPISELECT")
    protected String campiselect;
    @XmlElement(name = "CAMPIEDIT")
    protected String campiedit;
    @XmlElement(name = "CAMPIORDER")
    protected String campiorder;
    @XmlElement(name = "MODOPEN", required = true)
    protected DmElencoRicercheModOpen modopen;
    @XmlElement(name = "FORMOPEN")
    protected boolean formopen;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
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
    public void setID(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the nomericerca property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOMERICERCA() {
        return nomericerca;
    }

    /**
     * Sets the value of the nomericerca property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOMERICERCA(String value) {
        this.nomericerca = value;
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
     * Gets the value of the t1 property.
     * 
     */
    public int getT1() {
        return t1;
    }

    /**
     * Sets the value of the t1 property.
     * 
     */
    public void setT1(int value) {
        this.t1 = value;
    }

    /**
     * Gets the value of the t2 property.
     * 
     */
    public int getT2() {
        return t2;
    }

    /**
     * Sets the value of the t2 property.
     * 
     */
    public void setT2(int value) {
        this.t2 = value;
    }

    /**
     * Gets the value of the t3 property.
     * 
     */
    public int getT3() {
        return t3;
    }

    /**
     * Sets the value of the t3 property.
     * 
     */
    public void setT3(int value) {
        this.t3 = value;
    }

    /**
     * Gets the value of the campiselect property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCAMPISELECT() {
        return campiselect;
    }

    /**
     * Sets the value of the campiselect property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCAMPISELECT(String value) {
        this.campiselect = value;
    }

    /**
     * Gets the value of the campiedit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCAMPIEDIT() {
        return campiedit;
    }

    /**
     * Sets the value of the campiedit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCAMPIEDIT(String value) {
        this.campiedit = value;
    }

    /**
     * Gets the value of the campiorder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCAMPIORDER() {
        return campiorder;
    }

    /**
     * Sets the value of the campiorder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCAMPIORDER(String value) {
        this.campiorder = value;
    }

    /**
     * Gets the value of the modopen property.
     * 
     * @return
     *     possible object is
     *     {@link DmElencoRicercheModOpen }
     *     
     */
    public DmElencoRicercheModOpen getMODOPEN() {
        return modopen;
    }

    /**
     * Sets the value of the modopen property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmElencoRicercheModOpen }
     *     
     */
    public void setMODOPEN(DmElencoRicercheModOpen value) {
        this.modopen = value;
    }

    /**
     * Gets the value of the formopen property.
     * 
     */
    public boolean isFORMOPEN() {
        return formopen;
    }

    /**
     * Sets the value of the formopen property.
     * 
     */
    public void setFORMOPEN(boolean value) {
        this.formopen = value;
    }

}
