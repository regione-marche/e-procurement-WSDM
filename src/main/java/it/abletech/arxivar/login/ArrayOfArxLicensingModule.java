
package it.abletech.arxivar.login;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfArxLicensingModule complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfArxLicensingModule">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ArxLicensingModule" type="{http://www.Abletech.it/Arxivar}ArxLicensingModule" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfArxLicensingModule", propOrder = {
    "arxLicensingModule"
})
public class ArrayOfArxLicensingModule {

    @XmlElement(name = "ArxLicensingModule")
    protected List<ArxLicensingModule> arxLicensingModule;

    /**
     * Gets the value of the arxLicensingModule property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the arxLicensingModule property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArxLicensingModule().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArxLicensingModule }
     * 
     * 
     */
    public List<ArxLicensingModule> getArxLicensingModule() {
        if (arxLicensingModule == null) {
            arxLicensingModule = new ArrayList<ArxLicensingModule>();
        }
        return this.arxLicensingModule;
    }

}
