
package it.archiflow96;

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
 *         &lt;element name="sessionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="modelTypeFilter" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types}ModelTypeFilter" minOccurs="0"/>
 *         &lt;element name="modelName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nPageNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="nPageSize" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="bGetIndexes" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
    "sessionId",
    "modelTypeFilter",
    "modelName",
    "nPageNumber",
    "nPageSize",
    "bGetIndexes"
})
@XmlRootElement(name = "RetrieveCardsFromSearchModel2")
public class RetrieveCardsFromSearchModel2 {

    @XmlElement(nillable = true)
    protected String sessionId;
    protected ModelTypeFilter modelTypeFilter;
    @XmlElement(nillable = true)
    protected String modelName;
    protected Integer nPageNumber;
    protected Integer nPageSize;
    protected Boolean bGetIndexes;

    /**
     * Gets the value of the sessionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionId() {
        return sessionId;
    }

    /**
     * Sets the value of the sessionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionId(String value) {
        this.sessionId = value;
    }

    /**
     * Gets the value of the modelTypeFilter property.
     * 
     * @return
     *     possible object is
     *     {@link ModelTypeFilter }
     *     
     */
    public ModelTypeFilter getModelTypeFilter() {
        return modelTypeFilter;
    }

    /**
     * Sets the value of the modelTypeFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModelTypeFilter }
     *     
     */
    public void setModelTypeFilter(ModelTypeFilter value) {
        this.modelTypeFilter = value;
    }

    /**
     * Gets the value of the modelName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModelName() {
        return modelName;
    }

    /**
     * Sets the value of the modelName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModelName(String value) {
        this.modelName = value;
    }

    /**
     * Gets the value of the nPageNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNPageNumber() {
        return nPageNumber;
    }

    /**
     * Sets the value of the nPageNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNPageNumber(Integer value) {
        this.nPageNumber = value;
    }

    /**
     * Gets the value of the nPageSize property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNPageSize() {
        return nPageSize;
    }

    /**
     * Sets the value of the nPageSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNPageSize(Integer value) {
        this.nPageSize = value;
    }

    /**
     * Gets the value of the bGetIndexes property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBGetIndexes() {
        return bGetIndexes;
    }

    /**
     * Sets the value of the bGetIndexes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBGetIndexes(Boolean value) {
        this.bGetIndexes = value;
    }

}
