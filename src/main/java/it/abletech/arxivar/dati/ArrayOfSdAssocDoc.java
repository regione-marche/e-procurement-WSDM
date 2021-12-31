
package it.abletech.arxivar.dati;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfSd_AssocDoc complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfSd_AssocDoc">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Sd_AssocDoc" type="{http://www.Abletech.it/Arxivar}Sd_AssocDoc" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSd_AssocDoc", propOrder = {
    "sdAssocDoc"
})
public class ArrayOfSdAssocDoc {

    @XmlElement(name = "Sd_AssocDoc", nillable = true)
    protected List<SdAssocDoc> sdAssocDoc;

    /**
     * Gets the value of the sdAssocDoc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sdAssocDoc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSdAssocDoc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SdAssocDoc }
     * 
     * 
     */
    public List<SdAssocDoc> getSdAssocDoc() {
        if (sdAssocDoc == null) {
            sdAssocDoc = new ArrayList<SdAssocDoc>();
        }
        return this.sdAssocDoc;
    }

}
