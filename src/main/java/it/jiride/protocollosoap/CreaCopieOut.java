
package it.jiride.protocollosoap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreaCopieOut complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreaCopieOut">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Messaggio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Errore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IdDocumentoSorgente" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CopieCreate" type="{http://tempuri.org/}ArrayOfCopiaCreata" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreaCopieOut", propOrder = {
    "messaggio",
    "errore",
    "idDocumentoSorgente",
    "copieCreate"
})
public class CreaCopieOut {

    @XmlElement(name = "Messaggio", nillable = true)
    protected String messaggio;
    @XmlElement(name = "Errore", nillable = true)
    protected String errore;
    @XmlElement(name = "IdDocumentoSorgente")
    protected int idDocumentoSorgente;
    @XmlElement(name = "CopieCreate", nillable = true)
    protected ArrayOfCopiaCreata copieCreate;

    /**
     * Gets the value of the messaggio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessaggio() {
        return messaggio;
    }

    /**
     * Sets the value of the messaggio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessaggio(String value) {
        this.messaggio = value;
    }

    /**
     * Gets the value of the errore property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrore() {
        return errore;
    }

    /**
     * Sets the value of the errore property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrore(String value) {
        this.errore = value;
    }

    /**
     * Gets the value of the idDocumentoSorgente property.
     * 
     */
    public int getIdDocumentoSorgente() {
        return idDocumentoSorgente;
    }

    /**
     * Sets the value of the idDocumentoSorgente property.
     * 
     */
    public void setIdDocumentoSorgente(int value) {
        this.idDocumentoSorgente = value;
    }

    /**
     * Gets the value of the copieCreate property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCopiaCreata }
     *     
     */
    public ArrayOfCopiaCreata getCopieCreate() {
        return copieCreate;
    }

    /**
     * Sets the value of the copieCreate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCopiaCreata }
     *     
     */
    public void setCopieCreate(ArrayOfCopiaCreata value) {
        this.copieCreate = value;
    }

}
