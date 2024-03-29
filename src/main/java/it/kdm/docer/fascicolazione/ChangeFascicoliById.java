
package it.kdm.docer.fascicolazione;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="docNum" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="fascicoliToRemove" type="{http://fascicolazione.docer.kdm.it}ArrayOfKeyValuePair" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="fascicoliToAdd" type="{http://fascicolazione.docer.kdm.it}ArrayOfKeyValuePair" maxOccurs="unbounded" minOccurs="0"/>
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
    "docNum",
    "fascicoliToRemove",
    "fascicoliToAdd"
})
@XmlRootElement(name = "changeFascicoliById")
public class ChangeFascicoliById {

    @XmlElement(nillable = true)
    protected String token;
    protected Long docNum;
    @XmlElement(nillable = true)
    protected List<ArrayOfKeyValuePair> fascicoliToRemove;
    @XmlElement(nillable = true)
    protected List<ArrayOfKeyValuePair> fascicoliToAdd;

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
     * Gets the value of the docNum property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDocNum() {
        return docNum;
    }

    /**
     * Sets the value of the docNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDocNum(Long value) {
        this.docNum = value;
    }

    /**
     * Gets the value of the fascicoliToRemove property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fascicoliToRemove property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFascicoliToRemove().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfKeyValuePair }
     * 
     * 
     */
    public List<ArrayOfKeyValuePair> getFascicoliToRemove() {
        if (fascicoliToRemove == null) {
            fascicoliToRemove = new ArrayList<ArrayOfKeyValuePair>();
        }
        return this.fascicoliToRemove;
    }

    /**
     * Gets the value of the fascicoliToAdd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fascicoliToAdd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFascicoliToAdd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfKeyValuePair }
     * 
     * 
     */
    public List<ArrayOfKeyValuePair> getFascicoliToAdd() {
        if (fascicoliToAdd == null) {
            fascicoliToAdd = new ArrayList<ArrayOfKeyValuePair>();
        }
        return this.fascicoliToAdd;
    }

}
