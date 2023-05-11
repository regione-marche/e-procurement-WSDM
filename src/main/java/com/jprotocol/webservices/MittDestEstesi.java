
package com.jprotocol.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for mittDestEstesi complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mittDestEstesi">
 *   &lt;complexContent>
 *     &lt;extension base="{http://WebServices.jprotocol.com/}mittDest">
 *       &lt;sequence>
 *         &lt;element name="mailPEC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipologia" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mittDestEstesi", propOrder = {
    "mailPEC",
    "tipologia"
})
public class MittDestEstesi
    extends MittDest
{

    protected String mailPEC;
    protected int tipologia;

    /**
     * Gets the value of the mailPEC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMailPEC() {
        return mailPEC;
    }

    /**
     * Sets the value of the mailPEC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMailPEC(String value) {
        this.mailPEC = value;
    }

    /**
     * Gets the value of the tipologia property.
     * 
     */
    public int getTipologia() {
        return tipologia;
    }

    /**
     * Sets the value of the tipologia property.
     * 
     */
    public void setTipologia(int value) {
        this.tipologia = value;
    }

}
