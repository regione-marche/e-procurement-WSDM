
package it.archiflow96;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfMailDBA complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfMailDBA">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MailDBA" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Mail.ValueObject}MailDBA" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfMailDBA", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Mail.ValueObject", propOrder = {
    "mailDBA"
})
public class ArrayOfMailDBA {

    @XmlElement(name = "MailDBA", nillable = true)
    protected List<MailDBA> mailDBA;

    /**
     * Gets the value of the mailDBA property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mailDBA property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMailDBA().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MailDBA }
     * 
     * 
     */
    public List<MailDBA> getMailDBA() {
        if (mailDBA == null) {
            mailDBA = new ArrayList<MailDBA>();
        }
        return this.mailDBA;
    }

}
