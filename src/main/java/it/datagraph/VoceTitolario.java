
package it.datagraph;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VoceTitolario complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VoceTitolario">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Titolo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Classe" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Sottoclasse" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Descrizione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VoceTitolario", propOrder = {
    "titolo",
    "classe",
    "sottoclasse",
    "descrizione"
})
public class VoceTitolario {

    @XmlElement(name = "Titolo")
    protected int titolo;
    @XmlElement(name = "Classe")
    protected int classe;
    @XmlElement(name = "Sottoclasse")
    protected int sottoclasse;
    @XmlElement(name = "Descrizione")
    protected String descrizione;

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
     * Gets the value of the sottoclasse property.
     * 
     */
    public int getSottoclasse() {
        return sottoclasse;
    }

    /**
     * Sets the value of the sottoclasse property.
     * 
     */
    public void setSottoclasse(int value) {
        this.sottoclasse = value;
    }

    /**
     * Gets the value of the descrizione property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescrizione() {
        return descrizione;
    }

    /**
     * Sets the value of the descrizione property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescrizione(String value) {
        this.descrizione = value;
    }

}
