
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
 *         &lt;element name="IDDoc" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="FascDest" type="{http://tempuri.org/}FascicoloNet" minOccurs="0"/>
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
    "idDoc",
    "fascDest",
    "strDST"
})
@XmlRootElement(name = "ModificaFascicoloDocumento")
public class ModificaFascicoloDocumento {

    @XmlElement(name = "IDDoc")
    protected int idDoc;
    @XmlElement(name = "FascDest")
    protected FascicoloNet fascDest;
    protected String strDST;

    /**
     * Gets the value of the idDoc property.
     * 
     */
    public int getIDDoc() {
        return idDoc;
    }

    /**
     * Sets the value of the idDoc property.
     * 
     */
    public void setIDDoc(int value) {
        this.idDoc = value;
    }

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
