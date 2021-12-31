
package it.abletech.arxivar.dati;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Dm_Profile_Insert_For_Module complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Dm_Profile_Insert_For_Module">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.Abletech.it/Arxivar}Dm_Profile_Insert_Base">
 *       &lt;sequence>
 *         &lt;element name="Id_Modello" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Dm_Profile_Insert_For_Module", propOrder = {
    "idModello"
})
public class DmProfileInsertForModule
    extends DmProfileInsertBase
{

    @XmlElement(name = "Id_Modello")
    protected int idModello;

    /**
     * Gets the value of the idModello property.
     * 
     */
    public int getIdModello() {
        return idModello;
    }

    /**
     * Sets the value of the idModello property.
     * 
     */
    public void setIdModello(int value) {
        this.idModello = value;
    }

}
