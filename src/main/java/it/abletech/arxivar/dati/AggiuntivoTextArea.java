
package it.abletech.arxivar.dati;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Aggiuntivo_TextArea complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Aggiuntivo_TextArea">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.Abletech.it/Arxivar}Aggiuntivo_String">
 *       &lt;sequence>
 *         &lt;element name="NumRows" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="TextFormat" type="{http://www.Abletech.it/Arxivar}Aggiuntivo_TextArea_TextFormat"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Aggiuntivo_TextArea", propOrder = {
    "numRows",
    "textFormat"
})
public class AggiuntivoTextArea
    extends AggiuntivoString
{

    @XmlElement(name = "NumRows")
    protected int numRows;
    @XmlElement(name = "TextFormat", required = true)
    protected AggiuntivoTextAreaTextFormat textFormat;

    /**
     * Gets the value of the numRows property.
     * 
     */
    public int getNumRows() {
        return numRows;
    }

    /**
     * Sets the value of the numRows property.
     * 
     */
    public void setNumRows(int value) {
        this.numRows = value;
    }

    /**
     * Gets the value of the textFormat property.
     * 
     * @return
     *     possible object is
     *     {@link AggiuntivoTextAreaTextFormat }
     *     
     */
    public AggiuntivoTextAreaTextFormat getTextFormat() {
        return textFormat;
    }

    /**
     * Sets the value of the textFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link AggiuntivoTextAreaTextFormat }
     *     
     */
    public void setTextFormat(AggiuntivoTextAreaTextFormat value) {
        this.textFormat = value;
    }

}
