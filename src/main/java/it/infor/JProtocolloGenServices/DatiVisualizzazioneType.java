
package it.infor.JProtocolloGenServices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for datiVisualizzazioneType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="datiVisualizzazioneType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://infor.arezzo.it/jente/jprotocollo/webservices/gen}paginazioneType">
 *       &lt;sequence>
 *         &lt;element name="soloProtocolli" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="dataAllegatoDal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataAllegatoAl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "datiVisualizzazioneType", propOrder = {
    "soloProtocolli",
    "dataAllegatoDal",
    "dataAllegatoAl"
})
public class DatiVisualizzazioneType
    extends PaginazioneType
{

    protected Boolean soloProtocolli;
    protected String dataAllegatoDal;
    protected String dataAllegatoAl;

    /**
     * Gets the value of the soloProtocolli property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSoloProtocolli() {
        return soloProtocolli;
    }

    /**
     * Sets the value of the soloProtocolli property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSoloProtocolli(Boolean value) {
        this.soloProtocolli = value;
    }

    /**
     * Gets the value of the dataAllegatoDal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataAllegatoDal() {
        return dataAllegatoDal;
    }

    /**
     * Sets the value of the dataAllegatoDal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataAllegatoDal(String value) {
        this.dataAllegatoDal = value;
    }

    /**
     * Gets the value of the dataAllegatoAl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataAllegatoAl() {
        return dataAllegatoAl;
    }

    /**
     * Sets the value of the dataAllegatoAl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataAllegatoAl(String value) {
        this.dataAllegatoAl = value;
    }

}
