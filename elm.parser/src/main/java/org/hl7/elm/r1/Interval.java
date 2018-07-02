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
 * The Interval selector defines an interval value. An interval must be defined using a point type that supports comparison, as well as Successor and Predecessor operations, and Minimum and Maximum Value operations.
 * 			
 * The low and high bounds of the interval may each be defined as open or closed. Following standard terminology usage in interval mathematics, an open interval is defined to exclude the specified point, whereas a closed interval includes the point. The default is closed, indicating an inclusive interval.
 * 
 * The low and high elements are both optional. If the low element is not specified, the low bound of the resulting interval is null. If the high element is not specified, the high bound of the resulting interval is null.
 * 
 * The static type of the low bound determines the type of the interval, and the high bound must be of the same type.
 * 
 * If the low bound of the interval is null and open, the low bound of the interval is interpreted as unknown, and computations involving the low boundary will result in null.
 * 
 * If the low bound of the interval is null and closed, the interval is interpreted to start at the minimum value of the point type, and computations involving the low boundary will be performed with that value.
 * 
 * If the high bound of the interval is null and open, the high bound of the interval is unknown, and computations involving the high boundary will result in null. 
 * 
 * If the high bound of the interval is null and closed, the interval is interpreted to end at the maximum value of the point type, and computations involving the high boundary will be performed with that interpretation.
 * 
 * <p>Java class for Interval complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Interval">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:hl7-org:elm:r1}Expression">
 *       &lt;sequence>
 *         &lt;element name="low" type="{urn:hl7-org:elm:r1}Expression" minOccurs="0"/>
 *         &lt;element name="lowClosedExpression" type="{urn:hl7-org:elm:r1}Expression" minOccurs="0"/>
 *         &lt;element name="high" type="{urn:hl7-org:elm:r1}Expression" minOccurs="0"/>
 *         &lt;element name="highClosedExpression" type="{urn:hl7-org:elm:r1}Expression" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="lowClosed" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *       &lt;attribute name="highClosed" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Interval", propOrder = {
    "low",
    "lowClosedExpression",
    "high",
    "highClosedExpression"
})
public class Interval
    extends Expression
{

    protected Expression low;
    protected Expression lowClosedExpression;
    protected Expression high;
    protected Expression highClosedExpression;
    @XmlAttribute(name = "lowClosed")
    protected Boolean lowClosed;
    @XmlAttribute(name = "highClosed")
    protected Boolean highClosed;

    /**
     * Gets the value of the low property.
     * 
     * @return
     *     possible object is
     *     {@link Expression }
     *     
     */
    public Expression getLow() {
        return low;
    }

    /**
     * Sets the value of the low property.
     * 
     * @param value
     *     allowed object is
     *     {@link Expression }
     *     
     */
    public void setLow(Expression value) {
        this.low = value;
    }

    /**
     * Gets the value of the lowClosedExpression property.
     * 
     * @return
     *     possible object is
     *     {@link Expression }
     *     
     */
    public Expression getLowClosedExpression() {
        return lowClosedExpression;
    }

    /**
     * Sets the value of the lowClosedExpression property.
     * 
     * @param value
     *     allowed object is
     *     {@link Expression }
     *     
     */
    public void setLowClosedExpression(Expression value) {
        this.lowClosedExpression = value;
    }

    /**
     * Gets the value of the high property.
     * 
     * @return
     *     possible object is
     *     {@link Expression }
     *     
     */
    public Expression getHigh() {
        return high;
    }

    /**
     * Sets the value of the high property.
     * 
     * @param value
     *     allowed object is
     *     {@link Expression }
     *     
     */
    public void setHigh(Expression value) {
        this.high = value;
    }

    /**
     * Gets the value of the highClosedExpression property.
     * 
     * @return
     *     possible object is
     *     {@link Expression }
     *     
     */
    public Expression getHighClosedExpression() {
        return highClosedExpression;
    }

    /**
     * Sets the value of the highClosedExpression property.
     * 
     * @param value
     *     allowed object is
     *     {@link Expression }
     *     
     */
    public void setHighClosedExpression(Expression value) {
        this.highClosedExpression = value;
    }

    /**
     * Gets the value of the lowClosed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isLowClosed() {
        if (lowClosed == null) {
            return true;
        } else {
            return lowClosed;
        }
    }

    /**
     * Sets the value of the lowClosed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLowClosed(Boolean value) {
        this.lowClosed = value;
    }

    /**
     * Gets the value of the highClosed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isHighClosed() {
        if (highClosed == null) {
            return true;
        } else {
            return highClosed;
        }
    }

    /**
     * Sets the value of the highClosed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHighClosed(Boolean value) {
        this.highClosed = value;
    }

}