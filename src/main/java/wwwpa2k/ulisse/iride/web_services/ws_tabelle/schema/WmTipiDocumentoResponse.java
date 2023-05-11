
package wwwpa2k.ulisse.iride.web_services.ws_tabelle.schema;

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
 *         &lt;element name="wm_tipiDocumentoResult" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "wmTipiDocumentoResult"
})
@XmlRootElement(name = "wm_tipiDocumentoResponse")
public class WmTipiDocumentoResponse {

    @XmlElement(name = "wm_tipiDocumentoResult", required = true)
    protected String wmTipiDocumentoResult;

    /**
     * Gets the value of the wmTipiDocumentoResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWmTipiDocumentoResult() {
        return wmTipiDocumentoResult;
    }

    /**
     * Sets the value of the wmTipiDocumentoResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWmTipiDocumentoResult(String value) {
        this.wmTipiDocumentoResult = value;
    }

}
