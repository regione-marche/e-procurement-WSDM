
package it.datagraph;

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
 *         &lt;element name="TestInvioSegnalazioniResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "testInvioSegnalazioniResult"
})
@XmlRootElement(name = "TestInvioSegnalazioniResponse")
public class TestInvioSegnalazioniResponse {

    @XmlElement(name = "TestInvioSegnalazioniResult")
    protected boolean testInvioSegnalazioniResult;

    /**
     * Gets the value of the testInvioSegnalazioniResult property.
     * 
     */
    public boolean isTestInvioSegnalazioniResult() {
        return testInvioSegnalazioniResult;
    }

    /**
     * Sets the value of the testInvioSegnalazioniResult property.
     * 
     */
    public void setTestInvioSegnalazioniResult(boolean value) {
        this.testInvioSegnalazioniResult = value;
    }

}
