//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.07.02 at 01:47:00 AM IST 
//


package org.hl7.elm.r1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The Round operator returns the nearest integer to its argument. The semantics of round are defined as a traditional round, meaning that a decimal value of 0.5 or higher will round to 1.
 * 
 * If the argument is null, the result is null.
 * 
 * Precision determines the decimal place at which the rounding will occur. If precision is not specified or null, 0 is assumed.
 * 
 * <p>Java class for Round complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Round">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:hl7-org:elm:r1}Expression">
 *       &lt;sequence>
 *         &lt;element name="operand" type="{urn:hl7-org:elm:r1}Expression"/>
 *         &lt;element name="precision" type="{urn:hl7-org:elm:r1}Expression" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Round", propOrder = {
    "operand",
    "precision"
})
public class Round
    extends Expression
{

    @XmlElement(required = true)
    protected Expression operand;
    protected Expression precision;

    /**
     * Gets the value of the operand property.
     * 
     * @return
     *     possible object is
     *     {@link Expression }
     *     
     */
    public Expression getOperand() {
        return operand;
    }

    /**
     * Sets the value of the operand property.
     * 
     * @param value
     *     allowed object is
     *     {@link Expression }
     *     
     */
    public void setOperand(Expression value) {
        this.operand = value;
    }

    /**
     * Gets the value of the precision property.
     * 
     * @return
     *     possible object is
     *     {@link Expression }
     *     
     */
    public Expression getPrecision() {
        return precision;
    }

    /**
     * Sets the value of the precision property.
     * 
     * @param value
     *     allowed object is
     *     {@link Expression }
     *     
     */
    public void setPrecision(Expression value) {
        this.precision = value;
    }

}
