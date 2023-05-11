
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
 *         &lt;element name="Titolo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Classe" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "titolo",
    "classe",
    "strDST"
})
@XmlRootElement(name = "GetVociTitolario")
public class GetVociTitolario {

    @XmlElement(name = "Titolo")
    protected int titolo;
    @XmlElement(name = "Classe")
    protected int classe;
    protected String strDST;

    /**
     * Gets the value of the titolo property.
     * 
     */
    public int getTitolo() {
        return titolo;
    }

    /**
     * Sets the value of the titolo property.
     * 
     */
    public void setTitolo(int value) {
        this.titolo = value;
    }

    /**
     * Gets the value of the classe property.
     * 
     */
    public int getClasse() {
        return classe;
    }

    /**
     * Sets the value of the classe property.
     * 
     */
    public void setClasse(int value) {
        this.classe = value;
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
