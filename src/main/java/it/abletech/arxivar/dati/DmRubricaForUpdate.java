
package it.abletech.arxivar.dati;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Dm_Rubrica_ForUpdate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Dm_Rubrica_ForUpdate">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.Abletech.it/Arxivar}Dm_Rubrica_Base">
 *       &lt;sequence>
 *         &lt;element name="SYSTEM_ID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Dm_Rubrica_ForUpdate", propOrder = {
    "systemid"
})
public class DmRubricaForUpdate
    extends DmRubricaBase
{

    @XmlElement(name = "SYSTEM_ID")
    protected int systemid;

    /**
     * Gets the value of the systemid property.
     * 
     */
    public int getSYSTEMID() {
        return systemid;
    }

    /**
     * Sets the value of the systemid property.
     * 
     */
    public void setSYSTEMID(int value) {
        this.systemid = value;
    }

}
