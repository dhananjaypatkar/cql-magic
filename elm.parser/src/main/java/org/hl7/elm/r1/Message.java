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
 * The Message operator is used to support errors, warnings, messages, and tracing in an ELM evaluation environment.
 * 
 * The operator is defined to return the input source.
 * 
 * If the severity is Error, the operator is expected to raise a run-time error and return the message to the calling environment. This is the only severity that stops processing. All other severities continue evaluation of the expression.
 * 
 * If the severity is Trace, the operator is expected to make the message available to a tracing mechanism such as a debug log in the calling environment.
 * 
 * If the severity is Warning, the operator is expected to provide the message as a warning to the calling environment.
 * 
 * If the severity is Message, the operator is expected to provide the message as information to the calling environment.
 * 
 * <p>Java class for Message complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Message">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:hl7-org:elm:r1}Expression">
 *       &lt;sequence>
 *         &lt;element name="source" type="{urn:hl7-org:elm:r1}Expression"/>
 *         &lt;element name="condition" type="{urn:hl7-org:elm:r1}Expression" minOccurs="0"/>
 *         &lt;element name="code" type="{urn:hl7-org:elm:r1}Expression" minOccurs="0"/>
 *         &lt;element name="severity" type="{urn:hl7-org:elm:r1}Expression" minOccurs="0"/>
 *         &lt;element name="message" type="{urn:hl7-org:elm:r1}Expression" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Message", propOrder = {
    "source",
    "condition",
    "code",
    "severity",
    "message"
})
public class Message
    extends Expression
{

    @XmlElement(required = true)
    protected Expression source;
    protected Expression condition;
    protected Expression code;
    protected Expression severity;
    protected Expression message;

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link Expression }
     *     
     */
    public Expression getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link Expression }
     *     
     */
    public void setSource(Expression value) {
        this.source = value;
    }

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
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link Expression }
     *     
     */
    public Expression getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link Expression }
     *     
     */
    public void setCode(Expression value) {
        this.code = value;
    }

    /**
     * Gets the value of the severity property.
     * 
     * @return
     *     possible object is
     *     {@link Expression }
     *     
     */
    public Expression getSeverity() {
        return severity;
    }

    /**
     * Sets the value of the severity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Expression }
     *     
     */
    public void setSeverity(Expression value) {
        this.severity = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link Expression }
     *     
     */
    public Expression getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link Expression }
     *     
     */
    public void setMessage(Expression value) {
        this.message = value;
    }

}
