
package it.archiflow93;

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
 *         &lt;element name="GetDatabase_TypeResult" type="{http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.Types}ResultInfo" minOccurs="0"/>
 *         &lt;element name="eDatabase_Type" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types}Database_Type" minOccurs="0"/>
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
    "getDatabaseTypeResult",
    "eDatabaseType"
})
@XmlRootElement(name = "GetDatabase_TypeResponse")
public class GetDatabaseTypeResponse {

    @XmlElement(name = "GetDatabase_TypeResult")
    protected ResultInfo getDatabaseTypeResult;
    @XmlElement(name = "eDatabase_Type")
    protected DatabaseType eDatabaseType;

    /**
     * Gets the value of the getDatabaseTypeResult property.
     * 
     * @return
     *     possible object is
     *     {@link ResultInfo }
     *     
     */
    public ResultInfo getGetDatabaseTypeResult() {
        return getDatabaseTypeResult;
    }

    /**
     * Sets the value of the getDatabaseTypeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultInfo }
     *     
     */
    public void setGetDatabaseTypeResult(ResultInfo value) {
        this.getDatabaseTypeResult = value;
    }

    /**
     * Gets the value of the eDatabaseType property.
     * 
     * @return
     *     possible object is
     *     {@link DatabaseType }
     *     
     */
    public DatabaseType getEDatabaseType() {
        return eDatabaseType;
    }

    /**
     * Sets the value of the eDatabaseType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatabaseType }
     *     
     */
    public void setEDatabaseType(DatabaseType value) {
        this.eDatabaseType = value;
    }

}
