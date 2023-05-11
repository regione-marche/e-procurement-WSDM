
package org.datacontract.schemas._2004._07.regionemarche_protocollo_common;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfIpaEntry complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfIpaEntry">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IpaEntry" type="{http://schemas.datacontract.org/2004/07/RegioneMarche.Protocollo.Common.Tipi}IpaEntry" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfIpaEntry", propOrder = {
    "ipaEntry"
})
public class ArrayOfIpaEntry {

    @XmlElement(name = "IpaEntry", nillable = true)
    protected List<IpaEntry> ipaEntry;

    /**
     * Gets the value of the ipaEntry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ipaEntry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIpaEntry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IpaEntry }
     * 
     * 
     */
    public List<IpaEntry> getIpaEntry() {
        if (ipaEntry == null) {
            ipaEntry = new ArrayList<IpaEntry>();
        }
        return this.ipaEntry;
    }

}
