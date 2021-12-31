
package it.infor.JProtocolloGenServices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for datiRicercaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="datiRicercaType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://infor.arezzo.it/jente/jprotocollo/webservices/gen}paginazioneType">
 *       &lt;sequence>
 *         &lt;element name="dataCreazioneDal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataCreazioneAl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataChiusuraDal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataChiusuraAl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "datiRicercaType", propOrder = {
    "dataCreazioneDal",
    "dataCreazioneAl",
    "dataChiusuraDal",
    "dataChiusuraAl"
})
public class DatiRicercaType
    extends PaginazioneType
{

    protected String dataCreazioneDal;
    protected String dataCreazioneAl;
    protected String dataChiusuraDal;
    protected String dataChiusuraAl;

    /**
     * Gets the value of the dataCreazioneDal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataCreazioneDal() {
        return dataCreazioneDal;
    }

    /**
     * Sets the value of the dataCreazioneDal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataCreazioneDal(String value) {
        this.dataCreazioneDal = value;
    }

    /**
     * Gets the value of the dataCreazioneAl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataCreazioneAl() {
        return dataCreazioneAl;
    }

    /**
     * Sets the value of the dataCreazioneAl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataCreazioneAl(String value) {
        this.dataCreazioneAl = value;
    }

    /**
     * Gets the value of the dataChiusuraDal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataChiusuraDal() {
        return dataChiusuraDal;
    }

    /**
     * Sets the value of the dataChiusuraDal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataChiusuraDal(String value) {
        this.dataChiusuraDal = value;
    }

    /**
     * Gets the value of the dataChiusuraAl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataChiusuraAl() {
        return dataChiusuraAl;
    }

    /**
     * Sets the value of the dataChiusuraAl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataChiusuraAl(String value) {
        this.dataChiusuraAl = value;
    }

}
