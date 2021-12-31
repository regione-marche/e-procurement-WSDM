
package it.archiflow96.email;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfMailBox complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfMailBox">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MailBox" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.MailBox.ValueObject}MailBox" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfMailBox", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.MailBox.ValueObject", propOrder = {
    "mailBox"
})
public class ArrayOfMailBox {

    @XmlElement(name = "MailBox", nillable = true)
    protected List<MailBox> mailBox;

    /**
     * Gets the value of the mailBox property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mailBox property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMailBox().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MailBox }
     * 
     * 
     */
    public List<MailBox> getMailBox() {
        if (mailBox == null) {
            mailBox = new ArrayList<MailBox>();
        }
        return this.mailBox;
    }

}
