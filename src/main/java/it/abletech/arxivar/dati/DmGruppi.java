
package it.abletech.arxivar.dati;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Dm_Gruppi complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Dm_Gruppi">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.Abletech.it/Arxivar}Base">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="GRUPPO" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="MEMBRO" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Dm_Gruppi", propOrder = {
    "id",
    "gruppo",
    "membro"
})
public class DmGruppi
    extends Base
{

    @XmlElement(name = "ID")
    protected int id;
    @XmlElement(name = "GRUPPO")
    protected int gruppo;
    @XmlElement(name = "MEMBRO")
    protected int membro;

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
     * Gets the value of the gruppo property.
     * 
     */
    public int getGRUPPO() {
        return gruppo;
    }

    /**
     * Sets the value of the gruppo property.
     * 
     */
    public void setGRUPPO(int value) {
        this.gruppo = value;
    }

    /**
     * Gets the value of the membro property.
     * 
     */
    public int getMEMBRO() {
        return membro;
    }

    /**
     * Sets the value of the membro property.
     * 
     */
    public void setMEMBRO(int value) {
        this.membro = value;
    }

}
