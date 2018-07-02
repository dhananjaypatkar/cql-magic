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
 * The If operator evaluates a condition, and returns the then argument if the condition evaluates to true; if the condition evaluates to false or null, the result of the else argument is returned. The static type of the then argument determines the result type of the conditional, and the else argument must be of that same type.
 * 
 * <p>Java class for If complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="If">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:hl7-org:elm:r1}Expression">
 *       &lt;sequence>
 *         &lt;element name="condition" type="{urn:hl7-org:elm:r1}Expression"/>
 *         &lt;element name="then" type="{urn:hl7-org:elm:r1}Expression"/>
 *         &lt;element name="else" type="{urn:hl7-org:elm:r1}Expression"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "If", propOrder = {
    "condition",
    "then",
    "_else"
})
public class If
    extends Expression
{

    @XmlElement(required = true)
    protected Expression condition;
    @XmlElement(required = true)
    protected Expression then;
    @XmlElement(name = "else", required = true)
    protected Expression _else;

    /**
     * Gets the value of the condition property.
     * 
     * @return
     *     possible object is
     *     {@link Expression }
     *     
     */
    public Expression getCondition() {
        return condition;
    }

    /**
     * Sets the value of the condition property.
     * 
     * @param value
     *     allowed object is
     *     {@link Expression }
     *     
     */
    public void setCondition(Expression value) {
        this.condition = value;
    }

    /**
     * Gets the value of the then property.
     * 
     * @return
     *     possible object is
     *     {@link Expression }
     *     
     */
    public Expression getThen() {
        return then;
    }

    /**
     * Sets the value of the then property.
     * 
     * @param value
     *     allowed object is
     *     {@link Expression }
     *     
     */
    public void setThen(Expression value) {
        this.then = value;
    }

    /**
     * Gets the value of the else property.
     * 
     * @return
     *     possible object is
     *     {@link Expression }
     *     
     */
    public Expression getElse() {
        return _else;
    }

    /**
     * Sets the value of the else property.
     * 
     * @param value
     *     allowed object is
     *     {@link Expression }
     *     
     */
    public void setElse(Expression value) {
        this._else = value;
    }

}