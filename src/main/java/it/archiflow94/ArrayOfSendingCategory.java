
package it.archiflow94;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfSendingCategory complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfSendingCategory">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SendingCategory" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types}SendingCategory" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSendingCategory", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types", propOrder = {
    "sendingCategory"
})
public class ArrayOfSendingCategory {

    @XmlElement(name = "SendingCategory")
    protected List<SendingCategory> sendingCategory;

    /**
     * Gets the value of the sendingCategory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sendingCategory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSendingCategory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SendingCategory }
     * 
     * 
     */
    public List<SendingCategory> getSendingCategory() {
        if (sendingCategory == null) {
            sendingCategory = new ArrayList<SendingCategory>();
        }
        return this.sendingCategory;
    }

}
