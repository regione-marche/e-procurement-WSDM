
package it.abletech.arxivar.dati;

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
 *         &lt;element name="Dm_TipiDocumento_GetDataByCodiceResult" type="{http://www.Abletech.it/Arxivar}Dm_TipiDocumento" minOccurs="0"/>
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
    "dmTipiDocumentoGetDataByCodiceResult"
})
@XmlRootElement(name = "Dm_TipiDocumento_GetDataByCodiceResponse")
public class DmTipiDocumentoGetDataByCodiceResponse {

    @XmlElement(name = "Dm_TipiDocumento_GetDataByCodiceResult")
    protected DmTipiDocumento dmTipiDocumentoGetDataByCodiceResult;

    /**
     * Gets the value of the dmTipiDocumentoGetDataByCodiceResult property.
     * 
     * @return
     *     possible object is
     *     {@link DmTipiDocumento }
     *     
     */
    public DmTipiDocumento getDmTipiDocumentoGetDataByCodiceResult() {
        return dmTipiDocumentoGetDataByCodiceResult;
    }

    /**
     * Sets the value of the dmTipiDocumentoGetDataByCodiceResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmTipiDocumento }
     *     
     */
    public void setDmTipiDocumentoGetDataByCodiceResult(DmTipiDocumento value) {
        this.dmTipiDocumentoGetDataByCodiceResult = value;
    }

}
