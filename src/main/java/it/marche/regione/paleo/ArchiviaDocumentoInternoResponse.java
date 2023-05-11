
package it.marche.regione.paleo;

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
 *         &lt;element name="ArchiviaDocumentoInternoResult" type="{http://paleo.regione.marche.it/services/}respDocumento" minOccurs="0"/>
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
    "archiviaDocumentoInternoResult"
})
@XmlRootElement(name = "ArchiviaDocumentoInternoResponse")
public class ArchiviaDocumentoInternoResponse {

    @XmlElement(name = "ArchiviaDocumentoInternoResult", nillable = true)
    protected RespDocumento archiviaDocumentoInternoResult;

    /**
     * Gets the value of the archiviaDocumentoInternoResult property.
     * 
     * @return
     *     possible object is
     *     {@link RespDocumento }
     *     
     */
    public RespDocumento getArchiviaDocumentoInternoResult() {
        return archiviaDocumentoInternoResult;
    }

    /**
     * Sets the value of the archiviaDocumentoInternoResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link RespDocumento }
     *     
     */
    public void setArchiviaDocumentoInternoResult(RespDocumento value) {
        this.archiviaDocumentoInternoResult = value;
    }

}
