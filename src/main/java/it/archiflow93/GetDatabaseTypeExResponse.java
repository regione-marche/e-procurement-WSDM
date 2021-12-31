
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
 *         &lt;element name="GetDatabase_Type_ExResult" type="{http://schemas.datacontract.org/2004/07/SIAV.Common.BaseClass.Types}ResultInfo" minOccurs="0"/>
 *         &lt;element name="eDatabase_Type_Ex" type="{http://schemas.datacontract.org/2004/07/SIAV.Archiflow.Entities.Types}Database_Type_Ex" minOccurs="0"/>
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
    "getDatabaseTypeExResult",
    "eDatabaseTypeEx"
})
@XmlRootElement(name = "GetDatabase_Type_ExResponse")
public class GetDatabaseTypeExResponse {

    @XmlElement(name = "GetDatabase_Type_ExResult")
    protected ResultInfo getDatabaseTypeExResult;
    @XmlElement(name = "eDatabase_Type_Ex")
    protected DatabaseTypeEx eDatabaseTypeEx;

    /**
     * Gets the value of the getDatabaseTypeExResult property.
     * 
     * @return
     *     possible object is
     *     {@link ResultInfo }
     *     
     */
    public ResultInfo getGetDatabaseTypeExResult() {
        return getDatabaseTypeExResult;
    }

    /**
     * Sets the value of the getDatabaseTypeExResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultInfo }
     *     
     */
    public void setGetDatabaseTypeExResult(ResultInfo value) {
        this.getDatabaseTypeExResult = value;
    }

    /**
     * Gets the value of the eDatabaseTypeEx property.
     * 
     * @return
     *     possible object is
     *     {@link DatabaseTypeEx }
     *     
     */
    public DatabaseTypeEx getEDatabaseTypeEx() {
        return eDatabaseTypeEx;
    }

    /**
     * Sets the value of the eDatabaseTypeEx property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatabaseTypeEx }
     *     
     */
    public void setEDatabaseTypeEx(DatabaseTypeEx value) {
        this.eDatabaseTypeEx = value;
    }

}
