
package it.abletech.arxivar.dati;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="sessionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="aoo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipiDocumento" type="{http://www.Abletech.it/Arxivar}ArrayOfInt" minOccurs="0"/>
 *         &lt;element name="statoAttivo" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="orderBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "sessionId",
    "aoo",
    "tipiDocumento",
    "statoAttivo",
    "orderBy"
})
@XmlRootElement(name = "Dm_CampiSpecifici_GetData")
public class DmCampiSpecificiGetData {

    protected String sessionId;
    protected String aoo;
    protected ArrayOfInt tipiDocumento;
    protected boolean statoAttivo;
    protected String orderBy;

    /**
     * Gets the value of the sessionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionId() {
        return sessionId;
    }

    /**
     * Sets the value of the sessionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionId(String value) {
        this.sessionId = value;
    }

    /**
     * Gets the value of the aoo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAoo() {
        return aoo;
    }

    /**
     * Sets the value of the aoo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAoo(String value) {
        this.aoo = value;
    }

    /**
     * Gets the value of the tipiDocumento property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInt }
     *     
     */
    public ArrayOfInt getTipiDocumento() {
        return tipiDocumento;
    }

    /**
     * Sets the value of the tipiDocumento property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInt }
     *     
     */
    public void setTipiDocumento(ArrayOfInt value) {
        this.tipiDocumento = value;
    }

    /**
     * Gets the value of the statoAttivo property.
     * 
     */
    public boolean isStatoAttivo() {
        return statoAttivo;
    }

    /**
     * Sets the value of the statoAttivo property.
     * 
     */
    public void setStatoAttivo(boolean value) {
        this.statoAttivo = value;
    }

    /**
     * Gets the value of the orderBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderBy() {
        return orderBy;
    }

    /**
     * Sets the value of the orderBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderBy(String value) {
        this.orderBy = value;
    }

}
