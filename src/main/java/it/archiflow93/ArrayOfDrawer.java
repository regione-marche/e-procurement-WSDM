
package it.archiflow93;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDrawer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDrawer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Drawer" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Folder.ValueObject}Drawer" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDrawer", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Folder.ValueObject", propOrder = {
    "drawer"
})
public class ArrayOfDrawer {

    @XmlElement(name = "Drawer", nillable = true)
    protected List<Drawer> drawer;

    /**
     * Gets the value of the drawer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the drawer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDrawer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Drawer }
     * 
     * 
     */
    public List<Drawer> getDrawer() {
        if (drawer == null) {
            drawer = new ArrayList<Drawer>();
        }
        return this.drawer;
    }

}
