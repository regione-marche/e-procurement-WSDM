
package org.datacontract.schemas._2004._07.siav_classification_entities;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EntityQueryType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EntityQueryType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NULL"/>
 *     &lt;enumeration value="SIMPLE_READ"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EntityQueryType", namespace = "http://schemas.datacontract.org/2004/07/SIAV.Classification.Entities.Types")
@XmlEnum
public enum EntityQueryType {

    NULL,
    SIMPLE_READ;

    public String value() {
        return name();
    }

    public static EntityQueryType fromValue(String v) {
        return valueOf(v);
    }

}
