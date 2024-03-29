
package it.kdm.docer.fascicolazione;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import it.kdm.docer.sdk.classes.xsd.KeyValuePair;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="token" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fascicoloId" type="{http://classes.sdk.docer.kdm.it/xsd}KeyValuePair" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="aclToAdd" type="{http://classes.sdk.docer.kdm.it/xsd}KeyValuePair" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="aclToRemove" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "token",
    "fascicoloId",
    "aclToAdd",
    "aclToRemove"
})
@XmlRootElement(name = "changeACLFascicolo")
public class ChangeACLFascicolo {

    @XmlElement(nillable = true)
    protected String token;
    @XmlElement(nillable = true)
    protected List<KeyValuePair> fascicoloId;
    @XmlElement(nillable = true)
    protected List<KeyValuePair> aclToAdd;
    @XmlElement(nillable = true)
    protected List<String> aclToRemove;

    /**
     * Gets the value of the token property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToken() {
        return token;
    }

    /**
     * Sets the value of the token property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToken(String value) {
        this.token = value;
    }

    /**
     * Gets the value of the fascicoloId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fascicoloId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFascicoloId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KeyValuePair }
     * 
     * 
     */
    public List<KeyValuePair> getFascicoloId() {
        if (fascicoloId == null) {
            fascicoloId = new ArrayList<KeyValuePair>();
        }
        return this.fascicoloId;
    }

    /**
     * Gets the value of the aclToAdd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the aclToAdd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAclToAdd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KeyValuePair }
     * 
     * 
     */
    public List<KeyValuePair> getAclToAdd() {
        if (aclToAdd == null) {
            aclToAdd = new ArrayList<KeyValuePair>();
        }
        return this.aclToAdd;
    }

    /**
     * Gets the value of the aclToRemove property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the aclToRemove property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAclToRemove().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAclToRemove() {
        if (aclToRemove == null) {
            aclToRemove = new ArrayList<String>();
        }
        return this.aclToRemove;
    }

}
