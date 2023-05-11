
package it.iride.wsatti;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeterminaIn complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeterminaIn">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Oggetto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OggettoBilingue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Trattamento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Proponente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Dirigente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DataDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Classifica" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DaPubblicare" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Utente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Ruolo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Allegati" type="{http://tempuri.org/}ArrayOfAllegatoIn" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeterminaIn", propOrder = {
    "oggetto",
    "oggettoBilingue",
    "trattamento",
    "proponente",
    "dirigente",
    "dataDocumento",
    "classifica",
    "daPubblicare",
    "utente",
    "ruolo",
    "allegati"
})
public class DeterminaIn {

    @XmlElement(name = "Oggetto")
    protected String oggetto;
    @XmlElement(name = "OggettoBilingue")
    protected String oggettoBilingue;
    @XmlElement(name = "Trattamento")
    protected String trattamento;
    @XmlElement(name = "Proponente")
    protected String proponente;
    @XmlElement(name = "Dirigente")
    protected String dirigente;
    @XmlElement(name = "DataDocumento")
    protected String dataDocumento;
    @XmlElement(name = "Classifica")
    protected String classifica;
    @XmlElement(name = "DaPubblicare")
    protected String daPubblicare;
    @XmlElement(name = "Utente")
    protected String utente;
    @XmlElement(name = "Ruolo")
    protected String ruolo;
    @XmlElement(name = "Allegati")
    protected ArrayOfAllegatoIn allegati;

    /**
     * Gets the value of the oggetto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOggetto() {
        return oggetto;
    }

    /**
     * Sets the value of the oggetto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOggetto(String value) {
        this.oggetto = value;
    }

    /**
     * Gets the value of the oggettoBilingue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOggettoBilingue() {
        return oggettoBilingue;
    }

    /**
     * Sets the value of the oggettoBilingue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOggettoBilingue(String value) {
        this.oggettoBilingue = value;
    }

    /**
     * Gets the value of the trattamento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrattamento() {
        return trattamento;
    }

    /**
     * Sets the value of the trattamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrattamento(String value) {
        this.trattamento = value;
    }

    /**
     * Gets the value of the proponente property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProponente() {
        return proponente;
    }

    /**
     * Sets the value of the proponente property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProponente(String value) {
        this.proponente = value;
    }

    /**
     * Gets the value of the dirigente property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirigente() {
        return dirigente;
    }

    /**
     * Sets the value of the dirigente property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirigente(String value) {
        this.dirigente = value;
    }

    /**
     * Gets the value of the dataDocumento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataDocumento() {
        return dataDocumento;
    }

    /**
     * Sets the value of the dataDocumento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataDocumento(String value) {
        this.dataDocumento = value;
    }

    /**
     * Gets the value of the classifica property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassifica() {
        return classifica;
    }

    /**
     * Sets the value of the classifica property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassifica(String value) {
        this.classifica = value;
    }

    /**
     * Gets the value of the daPubblicare property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDaPubblicare() {
        return daPubblicare;
    }

    /**
     * Sets the value of the daPubblicare property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDaPubblicare(String value) {
        this.daPubblicare = value;
    }

    /**
     * Gets the value of the utente property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUtente() {
        return utente;
    }

    /**
     * Sets the value of the utente property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUtente(String value) {
        this.utente = value;
    }

    /**
     * Gets the value of the ruolo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRuolo() {
        return ruolo;
    }

    /**
     * Sets the value of the ruolo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRuolo(String value) {
        this.ruolo = value;
    }

    /**
     * Gets the value of the allegati property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAllegatoIn }
     *     
     */
    public ArrayOfAllegatoIn getAllegati() {
        return allegati;
    }

    /**
     * Sets the value of the allegati property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAllegatoIn }
     *     
     */
    public void setAllegati(ArrayOfAllegatoIn value) {
        this.allegati = value;
    }

}
