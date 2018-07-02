//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.07.02 at 01:47:00 AM IST 
//


package org.hl7.elm.r1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * Calculates the age in the specified precision of a person born on the given date as of today.
 * 
 * <p>Java class for CalculateAge complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CalculateAge">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:hl7-org:elm:r1}UnaryExpression">
 *       &lt;attribute name="precision" type="{urn:hl7-org:elm:r1}DateTimePrecision" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CalculateAge")
public class CalculateAge
    extends UnaryExpression
{

    @XmlAttribute(name = "precision")
    protected DateTimePrecision precision;

    /**
     * Gets the value of the precision property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimePrecision }
     *     
     */
    public DateTimePrecision getPrecision() {
        return precision;
    }

    /**
     * Sets the value of the precision property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimePrecision }
     *     
     */
    public void setPrecision(DateTimePrecision value) {
        this.precision = value;
    }

}
