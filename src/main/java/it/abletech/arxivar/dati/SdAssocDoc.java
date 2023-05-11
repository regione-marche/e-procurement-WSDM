
package it.abletech.arxivar.dati;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Sd_AssocDoc complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Sd_AssocDoc">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.Abletech.it/Arxivar}Base">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DOCNUMBER" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IDERP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PATHERP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Sd_AssocDoc", propOrder = {
    "id",
    "docnumber",
    "iderp",
    "patherp"
})
public class SdAssocDoc
    extends Base
{

    @XmlElement(name = "ID")
    protected int id;
    @XmlElement(name = "DOCNUMBER")
    protected int docnumber;
    @XmlElement(name = "IDERP")
    protected String iderp;
    @XmlElement(name = "PATHERP")
    protected String patherp;

    /**
     * Gets the value of the id property.
     * 
     */
    public int getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setID(int value) {
        this.id = value;
    }

    /**
     * Gets the value of the docnumber property.
     * 
     */
    public int getDOCNUMBER() {
        return docnumber;
    }

    /**
     * Sets the value of the docnumber property.
     * 
     */
    public void setDOCNUMBER(int value) {
        this.docnumber = value;
    }

    /**
     * Gets the value of the iderp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDERP() {
        return iderp;
    }

    /**
     * Sets the value of the iderp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDERP(String value) {
        this.iderp = value;
    }

    /**
     * Gets the value of the patherp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPATHERP() {
        return patherp;
    }

    /**
     * Sets the value of the patherp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPATHERP(String value) {
        this.patherp = value;
    }

}
