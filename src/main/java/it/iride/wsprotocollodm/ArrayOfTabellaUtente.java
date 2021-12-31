
package it.iride.wsprotocollodm;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfTabellaUtente complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfTabellaUtente">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TabellaUtente" type="{http://tempuri.org/}TabellaUtente" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfTabellaUtente", propOrder = {
    "tabellaUtente"
})
public class ArrayOfTabellaUtente {

    @XmlElement(name = "TabellaUtente")
    protected List<TabellaUtente> tabellaUtente;

    /**
     * Gets the value of the tabellaUtente property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tabellaUtente property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTabellaUtente().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TabellaUtente }
     * 
     * 
     */
    public List<TabellaUtente> getTabellaUtente() {
        if (tabellaUtente == null) {
            tabellaUtente = new ArrayList<TabellaUtente>();
        }
        return this.tabellaUtente;
    }

}
