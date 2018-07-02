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
 * The DateTime operator constructs a date/time value from the given components.
 * 			
 * At least one component other than timezoneOffset must be specified, and no component may be specified at a precision below an unspecified precision. For example, hour may be null, but if it is, minute, second, and millisecond must all be null as well.
 * 
 * If timezoneOffset is not specified, it is defaulted to the timezone offset of the evaluation request.
 * 
 * <p>Java class for DateTime complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DateTime">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:hl7-org:elm:r1}Expression">
 *       &lt;sequence>
 *         &lt;element name="year" type="{urn:hl7-org:elm:r1}Expression"/>
 *         &lt;element name="month" type="{urn:hl7-org:elm:r1}Expression" minOccurs="0"/>
 *         &lt;element name="day" type="{urn:hl7-org:elm:r1}Expression" minOccurs="0"/>
 *         &lt;element name="hour" type="{urn:hl7-org:elm:r1}Expression" minOccurs="0"/>
 *         &lt;element name="minute" type="{urn:hl7-org:elm:r1}Expression" minOccurs="0"/>
 *         &lt;element name="second" type="{urn:hl7-org:elm:r1}Expression" minOccurs="0"/>
 *         &lt;element name="millisecond" type="{urn:hl7-org:elm:r1}Expression" minOccurs="0"/>
 *         &lt;element name="timezoneOffset" type="{urn:hl7-org:elm:r1}Expression" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DateTime", propOrder = {
    "year",
    "month",
    "day",
    "hour",
    "minute",
    "second",
    "millisecond",
    "timezoneOffset"
})
public class DateTime
    extends Expression
{

    @XmlElement(required = true)
    protected Expression year;
    protected Expression month;
    protected Expression day;
    protected Expression hour;
    protected Expression minute;
    protected Expression second;
    protected Expression millisecond;
    protected Expression timezoneOffset;

    /**
     * Gets the value of the year property.
     * 
     * @return
     *     possible object is
     *     {@link Expression }
     *     
     */
    public Expression getYear() {
        return year;
    }

    /**
     * Sets the value of the year property.
     * 
     * @param value
     *     allowed object is
     *     {@link Expression }
     *     
     */
    public void setYear(Expression value) {
        this.year = value;
    }

    /**
     * Gets the value of the month property.
     * 
     * @return
     *     possible object is
     *     {@link Expression }
     *     
     */
    public Expression getMonth() {
        return month;
    }

    /**
     * Sets the value of the month property.
     * 
     * @param value
     *     allowed object is
     *     {@link Expression }
     *     
     */
    public void setMonth(Expression value) {
        this.month = value;
    }

    /**
     * Gets the value of the day property.
     * 
     * @return
     *     possible object is
     *     {@link Expression }
     *     
     */
    public Expression getDay() {
        return day;
    }

    /**
     * Sets the value of the day property.
     * 
     * @param value
     *     allowed object is
     *     {@link Expression }
     *     
     */
    public void setDay(Expression value) {
        this.day = value;
    }

    /**
     * Gets the value of the hour property.
     * 
     * @return
     *     possible object is
     *     {@link Expression }
     *     
     */
    public Expression getHour() {
        return hour;
    }

    /**
     * Sets the value of the hour property.
     * 
     * @param value
     *     allowed object is
     *     {@link Expression }
     *     
     */
    public void setHour(Expression value) {
        this.hour = value;
    }

    /**
     * Gets the value of the minute property.
     * 
     * @return
     *     possible object is
     *     {@link Expression }
     *     
     */
    public Expression getMinute() {
        return minute;
    }

    /**
     * Sets the value of the minute property.
     * 
     * @param value
     *     allowed object is
     *     {@link Expression }
     *     
     */
    public void setMinute(Expression value) {
        this.minute = value;
    }

    /**
     * Gets the value of the second property.
     * 
     * @return
     *     possible object is
     *     {@link Expression }
     *     
     */
    public Expression getSecond() {
        return second;
    }

    /**
     * Sets the value of the second property.
     * 
     * @param value
     *     allowed object is
     *     {@link Expression }
     *     
     */
    public void setSecond(Expression value) {
        this.second = value;
    }

    /**
     * Gets the value of the millisecond property.
     * 
     * @return
     *     possible object is
     *     {@link Expression }
     *     
     */
    public Expression getMillisecond() {
        return millisecond;
    }

    /**
     * Sets the value of the millisecond property.
     * 
     * @param value
     *     allowed object is
     *     {@link Expression }
     *     
     */
    public void setMillisecond(Expression value) {
        this.millisecond = value;
    }

    /**
     * Gets the value of the timezoneOffset property.
     * 
     * @return
     *     possible object is
     *     {@link Expression }
     *     
     */
    public Expression getTimezoneOffset() {
        return timezoneOffset;
    }

    /**
     * Sets the value of the timezoneOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link Expression }
     *     
     */
    public void setTimezoneOffset(Expression value) {
        this.timezoneOffset = value;
    }

}
