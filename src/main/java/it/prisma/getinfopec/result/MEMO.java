//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.02.22 at 04:44:13 PM CET 
//


package it.prisma.getinfopec.result;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID_DOCUMENTO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DATA_SPEDIZIONE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DESTINATARI" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element ref="{}FILE_ALLEGATI" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "iddocumento",
    "dataspedizione",
    "destinatari",
    "fileallegati"
})
@XmlRootElement(name = "MEMO")
public class MEMO {

    @XmlElement(name = "ID_DOCUMENTO", required = true)
    protected String iddocumento;
    @XmlElement(name = "DATA_SPEDIZIONE", required = true)
    protected String dataspedizione;
    @XmlElement(name = "DESTINATARI", required = true)
    protected String destinatari;
    @XmlElement(name = "FILE_ALLEGATI")
    protected FILEALLEGATI fileallegati;

    /**
     * Gets the value of the iddocumento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDDOCUMENTO() {
        return iddocumento;
    }

    /**
     * Sets the value of the iddocumento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDDOCUMENTO(String value) {
        this.iddocumento = value;
    }

    /**
     * Gets the value of the dataspedizione property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDATASPEDIZIONE() {
        return dataspedizione;
    }

    /**
     * Sets the value of the dataspedizione property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDATASPEDIZIONE(String value) {
        this.dataspedizione = value;
    }

    /**
     * Gets the value of the destinatari property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDESTINATARI() {
        return destinatari;
    }

    /**
     * Sets the value of the destinatari property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDESTINATARI(String value) {
        this.destinatari = value;
    }

    /**
     * Collezione di file allegati ai messaggi inviati 
     * 
     * @return
     *     possible object is
     *     {@link FILEALLEGATI }
     *     
     */
    public FILEALLEGATI getFILEALLEGATI() {
        return fileallegati;
    }

    /**
     * Sets the value of the fileallegati property.
     * 
     * @param value
     *     allowed object is
     *     {@link FILEALLEGATI }
     *     
     */
    public void setFILEALLEGATI(FILEALLEGATI value) {
        this.fileallegati = value;
    }

}
