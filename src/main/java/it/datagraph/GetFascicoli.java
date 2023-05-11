
package it.datagraph;

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
 *         &lt;element name="FiltroUO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FiltroTitolario" type="{http://tempuri.org/}VoceTitolario" minOccurs="0"/>
 *         &lt;element name="strDST" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "filtroUO",
    "filtroTitolario",
    "strDST"
})
@XmlRootElement(name = "GetFascicoli")
public class GetFascicoli {

    @XmlElement(name = "FiltroUO")
    protected String filtroUO;
    @XmlElement(name = "FiltroTitolario")
    protected VoceTitolario filtroTitolario;
    protected String strDST;

    /**
     * Gets the value of the filtroUO property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFiltroUO() {
        return filtroUO;
    }

    /**
     * Sets the value of the filtroUO property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFiltroUO(String value) {
        this.filtroUO = value;
    }

    /**
     * Gets the value of the filtroTitolario property.
     * 
     * @return
     *     possible object is
     *     {@link VoceTitolario }
     *     
     */
    public VoceTitolario getFiltroTitolario() {
        return filtroTitolario;
    }

    /**
     * Sets the value of the filtroTitolario property.
     * 
     * @param value
     *     allowed object is
     *     {@link VoceTitolario }
     *     
     */
    public void setFiltroTitolario(VoceTitolario value) {
        this.filtroTitolario = value;
    }

    /**
     * Gets the value of the strDST property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrDST() {
        return strDST;
    }

    /**
     * Sets the value of the strDST property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrDST(String value) {
        this.strDST = value;
    }

}
