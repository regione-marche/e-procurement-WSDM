
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
 *         &lt;element name="wm_classificheResult" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "wmClassificheResult"
})
@XmlRootElement(name = "wm_classificheResponse")
public class WmClassificheResponse {

    @XmlElement(name = "wm_classificheResult", required = true)
    protected String wmClassificheResult;

    /**
     * Gets the value of the wmClassificheResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWmClassificheResult() {
        return wmClassificheResult;
    }

    /**
     * Sets the value of the wmClassificheResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWmClassificheResult(String value) {
        this.wmClassificheResult = value;
    }

}
