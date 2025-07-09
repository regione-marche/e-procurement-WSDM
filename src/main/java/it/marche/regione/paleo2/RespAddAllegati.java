
package it.marche.regione.paleo2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for respAddAllegati complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="respAddAllegati">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Allegati" type="{http://paleo.regione.marche.it/services2/}ArrayOfAllegatoInfo" minOccurs="0"/>
 *         &lt;element name="DocNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SegnaturaProtocollo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "respAddAllegati", propOrder = {
    "allegati",
    "docNumber",
    "segnaturaProtocollo"
})
public class RespAddAllegati {

    @XmlElement(name = "Allegati", nillable = true)
    protected ArrayOfAllegatoInfo allegati;
    @XmlElement(name = "DocNumber")
    protected Integer docNumber;
    @XmlElement(name = "SegnaturaProtocollo", nillable = true)
    protected String segnaturaProtocollo;

    /**
     * Gets the value of the allegati property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAllegatoInfo }
     *     
     */
    public ArrayOfAllegatoInfo getAllegati() {
        return allegati;
    }

    /**
     * Sets the value of the allegati property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAllegatoInfo }
     *     
     */
    public void setAllegati(ArrayOfAllegatoInfo value) {
        this.allegati = value;
    }

    /**
     * Gets the value of the docNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDocNumber() {
        return docNumber;
    }

    /**
     * Sets the value of the docNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDocNumber(Integer value) {
        this.docNumber = value;
    }

    /**
     * Gets the value of the segnaturaProtocollo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegnaturaProtocollo() {
        return segnaturaProtocollo;
    }

    /**
     * Sets the value of the segnaturaProtocollo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegnaturaProtocollo(String value) {
        this.segnaturaProtocollo = value;
    }

}
