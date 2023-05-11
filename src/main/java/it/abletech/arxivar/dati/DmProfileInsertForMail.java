
package it.abletech.arxivar.dati;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Dm_Profile_Insert_For_Mail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Dm_Profile_Insert_For_Mail">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.Abletech.it/Arxivar}Dm_Profile_ForInsert">
 *       &lt;sequence>
 *         &lt;element name="DmMsgId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Dm_Profile_Insert_For_Mail", propOrder = {
    "dmMsgId"
})
public class DmProfileInsertForMail
    extends DmProfileForInsert
{

    @XmlElement(name = "DmMsgId", required = true, type = Integer.class, nillable = true)
    protected Integer dmMsgId;

    /**
     * Gets the value of the dmMsgId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDmMsgId() {
        return dmMsgId;
    }

    /**
     * Sets the value of the dmMsgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDmMsgId(Integer value) {
        this.dmMsgId = value;
    }

}
