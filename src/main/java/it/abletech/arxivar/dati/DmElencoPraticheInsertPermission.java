
package it.abletech.arxivar.dati;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Dm_ElencoPratiche_Insert_Permission complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Dm_ElencoPratiche_Insert_Permission">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.Abletech.it/Arxivar}Base">
 *       &lt;sequence>
 *         &lt;element name="DMUTENTIUTENTE" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PERMISSION" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Dm_ElencoPratiche_Insert_Permission", propOrder = {
    "dmutentiutente",
    "permission"
})
public class DmElencoPraticheInsertPermission
    extends Base
{

    @XmlElement(name = "DMUTENTIUTENTE")
    protected int dmutentiutente;
    @XmlElement(name = "PERMISSION")
    protected int permission;

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
     * Gets the value of the permission property.
     * 
     */
    public int getPERMISSION() {
        return permission;
    }

    /**
     * Sets the value of the permission property.
     * 
     */
    public void setPERMISSION(int value) {
        this.permission = value;
    }

}
