
package it.archiflow96;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfCardOperationNotAllowedInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCardOperationNotAllowedInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CardOperationNotAllowedInfo" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Types}CardOperationNotAllowedInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCardOperationNotAllowedInfo", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Types", propOrder = {
    "cardOperationNotAllowedInfo"
})
public class ArrayOfCardOperationNotAllowedInfo {

    @XmlElement(name = "CardOperationNotAllowedInfo", nillable = true)
    protected List<CardOperationNotAllowedInfo> cardOperationNotAllowedInfo;

    /**
     * Gets the value of the cardOperationNotAllowedInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cardOperationNotAllowedInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCardOperationNotAllowedInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CardOperationNotAllowedInfo }
     * 
     * 
     */
    public List<CardOperationNotAllowedInfo> getCardOperationNotAllowedInfo() {
        if (cardOperationNotAllowedInfo == null) {
            cardOperationNotAllowedInfo = new ArrayList<CardOperationNotAllowedInfo>();
        }
        return this.cardOperationNotAllowedInfo;
    }

}
