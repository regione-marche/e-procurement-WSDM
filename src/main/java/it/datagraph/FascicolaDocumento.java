
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
 *         &lt;element name="FascDest" type="{http://tempuri.org/}FascicoloNet" minOccurs="0"/>
 *         &lt;element ref="{}DescDoc" minOccurs="0"/>
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
    "fascDest",
    "descDoc",
    "strDST"
})
@XmlRootElement(name = "FascicolaDocumento")
public class FascicolaDocumento {

    @XmlElement(name = "FascDest")
    protected FascicoloNet fascDest;
    @XmlElement(name = "DescDoc", namespace = "")
    protected Documento descDoc;
    protected String strDST;

    /**
     * Gets the value of the fascDest property.
     * 
     * @return
     *     possible object is
     *     {@link FascicoloNet }
     *     
     */
    public FascicoloNet getFascDest() {
        return fascDest;
    }

    /**
     * Sets the value of the fascDest property.
     * 
     * @param value
     *     allowed object is
     *     {@link FascicoloNet }
     *     
     */
    public void setFascDest(FascicoloNet value) {
        this.fascDest = value;
    }

    /**
     * Gets the value of the descDoc property.
     * 
     * @return
     *     possible object is
     *     {@link Documento }
     *     
     */
    public Documento getDescDoc() {
        return descDoc;
    }

    /**
     * Sets the value of the descDoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Documento }
     *     
     */
    public void setDescDoc(Documento value) {
        this.descDoc = value;
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
