
package it.abletech.arxivar.dati;

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
 *         &lt;element name="Dm_Tabelle_Stato_GetData_By_DmTipidocumentoSystemIdResult" type="{http://www.Abletech.it/Arxivar}ArrayOfDm_Tabelle" minOccurs="0"/>
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
    "dmTabelleStatoGetDataByDmTipidocumentoSystemIdResult"
})
@XmlRootElement(name = "Dm_Tabelle_Stato_GetData_By_DmTipidocumentoSystemIdResponse")
public class DmTabelleStatoGetDataByDmTipidocumentoSystemIdResponse {

    @XmlElement(name = "Dm_Tabelle_Stato_GetData_By_DmTipidocumentoSystemIdResult")
    protected ArrayOfDmTabelle dmTabelleStatoGetDataByDmTipidocumentoSystemIdResult;

    /**
     * Gets the value of the dmTabelleStatoGetDataByDmTipidocumentoSystemIdResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDmTabelle }
     *     
     */
    public ArrayOfDmTabelle getDmTabelleStatoGetDataByDmTipidocumentoSystemIdResult() {
        return dmTabelleStatoGetDataByDmTipidocumentoSystemIdResult;
    }

    /**
     * Sets the value of the dmTabelleStatoGetDataByDmTipidocumentoSystemIdResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDmTabelle }
     *     
     */
    public void setDmTabelleStatoGetDataByDmTipidocumentoSystemIdResult(ArrayOfDmTabelle value) {
        this.dmTabelleStatoGetDataByDmTipidocumentoSystemIdResult = value;
    }

}
