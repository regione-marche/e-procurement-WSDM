
package it.abletech.arxivar.search;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Join_Dm_Allegati_Doc complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Join_Dm_Allegati_Doc">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.Abletech.it/Arxivar}Join_Abstract">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="Revisione" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="NomeFile" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="PathFile" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="NomeOriginale" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="Device" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="EtichettaCd" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="Commento" type="{http://www.Abletech.it/Arxivar}Field_String" minOccurs="0"/>
 *         &lt;element name="DataImport" type="{http://www.Abletech.it/Arxivar}Field_DateTime" minOccurs="0"/>
 *         &lt;element name="Utente" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="Blocco" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="CopiaConforme" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *         &lt;element name="CheckSend" type="{http://www.Abletech.it/Arxivar}Field_Int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Join_Dm_Allegati_Doc", propOrder = {
    "id",
    "revisione",
    "nomeFile",
    "pathFile",
    "nomeOriginale",
    "device",
    "etichettaCd",
    "commento",
    "dataImport",
    "utente",
    "blocco",
    "copiaConforme",
    "checkSend"
})
public class JoinDmAllegatiDoc
    extends JoinAbstract
{

    @XmlElement(name = "Id")
    protected FieldInt id;
    @XmlElement(name = "Revisione")
    protected FieldInt revisione;
    @XmlElement(name = "NomeFile")
    protected FieldString nomeFile;
    @XmlElement(name = "PathFile")
    protected FieldString pathFile;
    @XmlElement(name = "NomeOriginale")
    protected FieldString nomeOriginale;
    @XmlElement(name = "Device")
    protected FieldString device;
    @XmlElement(name = "EtichettaCd")
    protected FieldString etichettaCd;
    @XmlElement(name = "Commento")
    protected FieldString commento;
    @XmlElement(name = "DataImport")
    protected FieldDateTime dataImport;
    @XmlElement(name = "Utente")
    protected FieldInt utente;
    @XmlElement(name = "Blocco")
    protected FieldInt blocco;
    @XmlElement(name = "CopiaConforme")
    protected FieldInt copiaConforme;
    @XmlElement(name = "CheckSend")
    protected FieldInt checkSend;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setId(FieldInt value) {
        this.id = value;
    }

    /**
     * Gets the value of the revisione property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getRevisione() {
        return revisione;
    }

    /**
     * Sets the value of the revisione property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setRevisione(FieldInt value) {
        this.revisione = value;
    }

    /**
     * Gets the value of the nomeFile property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getNomeFile() {
        return nomeFile;
    }

    /**
     * Sets the value of the nomeFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setNomeFile(FieldString value) {
        this.nomeFile = value;
    }

    /**
     * Gets the value of the pathFile property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getPathFile() {
        return pathFile;
    }

    /**
     * Sets the value of the pathFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setPathFile(FieldString value) {
        this.pathFile = value;
    }

    /**
     * Gets the value of the nomeOriginale property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getNomeOriginale() {
        return nomeOriginale;
    }

    /**
     * Sets the value of the nomeOriginale property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setNomeOriginale(FieldString value) {
        this.nomeOriginale = value;
    }

    /**
     * Gets the value of the device property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getDevice() {
        return device;
    }

    /**
     * Sets the value of the device property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setDevice(FieldString value) {
        this.device = value;
    }

    /**
     * Gets the value of the etichettaCd property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getEtichettaCd() {
        return etichettaCd;
    }

    /**
     * Sets the value of the etichettaCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setEtichettaCd(FieldString value) {
        this.etichettaCd = value;
    }

    /**
     * Gets the value of the commento property.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getCommento() {
        return commento;
    }

    /**
     * Sets the value of the commento property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setCommento(FieldString value) {
        this.commento = value;
    }

    /**
     * Gets the value of the dataImport property.
     * 
     * @return
     *     possible object is
     *     {@link FieldDateTime }
     *     
     */
    public FieldDateTime getDataImport() {
        return dataImport;
    }

    /**
     * Sets the value of the dataImport property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDateTime }
     *     
     */
    public void setDataImport(FieldDateTime value) {
        this.dataImport = value;
    }

    /**
     * Gets the value of the utente property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getUtente() {
        return utente;
    }

    /**
     * Sets the value of the utente property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setUtente(FieldInt value) {
        this.utente = value;
    }

    /**
     * Gets the value of the blocco property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getBlocco() {
        return blocco;
    }

    /**
     * Sets the value of the blocco property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setBlocco(FieldInt value) {
        this.blocco = value;
    }

    /**
     * Gets the value of the copiaConforme property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getCopiaConforme() {
        return copiaConforme;
    }

    /**
     * Sets the value of the copiaConforme property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setCopiaConforme(FieldInt value) {
        this.copiaConforme = value;
    }

    /**
     * Gets the value of the checkSend property.
     * 
     * @return
     *     possible object is
     *     {@link FieldInt }
     *     
     */
    public FieldInt getCheckSend() {
        return checkSend;
    }

    /**
     * Sets the value of the checkSend property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInt }
     *     
     */
    public void setCheckSend(FieldInt value) {
        this.checkSend = value;
    }

}
