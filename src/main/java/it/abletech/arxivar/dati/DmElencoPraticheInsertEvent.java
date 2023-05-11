
package it.abletech.arxivar.dati;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Dm_ElencoPratiche_Insert_Event complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Dm_ElencoPratiche_Insert_Event">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.Abletech.it/Arxivar}Base">
 *       &lt;sequence>
 *         &lt;element name="DOCTYPE" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DMUTENTIUTENTE" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ACTION" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DMSECURITYDOCEXPLOSION" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Dm_ElencoPratiche_Insert_Event", propOrder = {
    "doctype",
    "dmutentiutente",
    "action",
    "dmsecuritydocexplosion"
})
public class DmElencoPraticheInsertEvent
    extends Base
{

    @XmlElement(name = "DOCTYPE")
    protected int doctype;
    @XmlElement(name = "DMUTENTIUTENTE")
    protected int dmutentiutente;
    @XmlElement(name = "ACTION")
    protected int action;
    @XmlElement(name = "DMSECURITYDOCEXPLOSION")
    protected int dmsecuritydocexplosion;

    /**
     * Gets the value of the doctype property.
     * 
     */
    public int getDOCTYPE() {
        return doctype;
    }

    /**
     * Sets the value of the doctype property.
     * 
     */
    public void setDOCTYPE(int value) {
        this.doctype = value;
    }

    /**
     * Gets the value of the dmutentiutente property.
     * 
     */
    public int getDMUTENTIUTENTE() {
        return dmutentiutente;
    }

    /**
     * Sets the value of the dmutentiutente property.
     * 
     */
    public void setDMUTENTIUTENTE(int value) {
        this.dmutentiutente = value;
    }

    /**
     * Gets the value of the action property.
     * 
     */
    public int getACTION() {
        return action;
    }

    /**
     * Sets the value of the action property.
     * 
     */
    public void setACTION(int value) {
        this.action = value;
    }

    /**
     * Gets the value of the dmsecuritydocexplosion property.
     * 
     */
    public int getDMSECURITYDOCEXPLOSION() {
        return dmsecuritydocexplosion;
    }

    /**
     * Sets the value of the dmsecuritydocexplosion property.
     * 
     */
    public void setDMSECURITYDOCEXPLOSION(int value) {
        this.dmsecuritydocexplosion = value;
    }

}
