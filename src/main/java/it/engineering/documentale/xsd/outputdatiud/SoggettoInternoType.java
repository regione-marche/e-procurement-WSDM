//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.06.01 at 11:53:11 AM CEST 
//


package it.engineering.documentale.xsd.outputdatiud;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Rappresenta un soggetto interno all'AOO che pu� essere: una UO, un utente, una scrivania virtuale (che rappresenta l'utente non come persona, ma nella funzione che svolge presso una certa UO), un gruppo (di utenti o UO o scrivanie virtuali) o un ruolo amministrativo (es: Dirigente, Direttore Generale ecc). Quando si assegna ad un gruppo o un ruolo il sistema assegna a tutti gli utenti, UO e scrivanie del gruppo o aventi il ruolo
 * 
 * <p>Java class for SoggettoInternoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SoggettoInternoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="UO" type="{}UOType"/>
 *         &lt;element name="Utente" type="{}UserType"/>
 *         &lt;element name="ScrivaniaVirtuale" type="{}ScrivaniaVirtualeType"/>
 *         &lt;element name="Gruppo" type="{}OggDiTabDiSistemaType"/>
 *         &lt;element name="RuoloAmmContestualizzato" type="{}RuoloAmmContestualizzatoType"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SoggettoInternoType", propOrder = {
    "uo",
    "utente",
    "scrivaniaVirtuale",
    "gruppo",
    "ruoloAmmContestualizzato"
})
@XmlSeeAlso({
    AssegnazioneInternaType.class,
    SoggettoInternoEstesoType.class
})
public class SoggettoInternoType {

    @XmlElement(name = "UO")
    protected UOType uo;
    @XmlElement(name = "Utente")
    protected UserType utente;
    @XmlElement(name = "ScrivaniaVirtuale")
    protected ScrivaniaVirtualeType scrivaniaVirtuale;
    @XmlElement(name = "Gruppo")
    protected OggDiTabDiSistemaType gruppo;
    @XmlElement(name = "RuoloAmmContestualizzato")
    protected RuoloAmmContestualizzatoType ruoloAmmContestualizzato;

    /**
     * Gets the value of the uo property.
     * 
     * @return
     *     possible object is
     *     {@link UOType }
     *     
     */
    public UOType getUO() {
        return uo;
    }

    /**
     * Sets the value of the uo property.
     * 
     * @param value
     *     allowed object is
     *     {@link UOType }
     *     
     */
    public void setUO(UOType value) {
        this.uo = value;
    }

    /**
     * Gets the value of the utente property.
     * 
     * @return
     *     possible object is
     *     {@link UserType }
     *     
     */
    public UserType getUtente() {
        return utente;
    }

    /**
     * Sets the value of the utente property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserType }
     *     
     */
    public void setUtente(UserType value) {
        this.utente = value;
    }

    /**
     * Gets the value of the scrivaniaVirtuale property.
     * 
     * @return
     *     possible object is
     *     {@link ScrivaniaVirtualeType }
     *     
     */
    public ScrivaniaVirtualeType getScrivaniaVirtuale() {
        return scrivaniaVirtuale;
    }

    /**
     * Sets the value of the scrivaniaVirtuale property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScrivaniaVirtualeType }
     *     
     */
    public void setScrivaniaVirtuale(ScrivaniaVirtualeType value) {
        this.scrivaniaVirtuale = value;
    }

    /**
     * Gets the value of the gruppo property.
     * 
     * @return
     *     possible object is
     *     {@link OggDiTabDiSistemaType }
     *     
     */
    public OggDiTabDiSistemaType getGruppo() {
        return gruppo;
    }

    /**
     * Sets the value of the gruppo property.
     * 
     * @param value
     *     allowed object is
     *     {@link OggDiTabDiSistemaType }
     *     
     */
    public void setGruppo(OggDiTabDiSistemaType value) {
        this.gruppo = value;
    }

    /**
     * Gets the value of the ruoloAmmContestualizzato property.
     * 
     * @return
     *     possible object is
     *     {@link RuoloAmmContestualizzatoType }
     *     
     */
    public RuoloAmmContestualizzatoType getRuoloAmmContestualizzato() {
        return ruoloAmmContestualizzato;
    }

    /**
     * Sets the value of the ruoloAmmContestualizzato property.
     * 
     * @param value
     *     allowed object is
     *     {@link RuoloAmmContestualizzatoType }
     *     
     */
    public void setRuoloAmmContestualizzato(RuoloAmmContestualizzatoType value) {
        this.ruoloAmmContestualizzato = value;
    }

}