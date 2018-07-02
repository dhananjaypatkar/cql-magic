//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.07.02 at 01:47:00 AM IST 
//


package org.hl7.elm.r1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * The ToTime operator converts the value of its argument to a Time value. The operator expects the string to be formatted using ISO-8601 time representation: 
 * 
 * Thh:mm:ss.fff(+|-)hh:mm
 * 
 * In addition, the string must be interpretable as a valid time-of-day value.
 * 
 * If the input string is not formatted correctly, or does not represent a valid time-of-day value, a run-time error is thrown.
 * 
 * As with time-of-day literals, time-of-day values may be specified to any precision. If no timezone is supplied, the timezone of the evaluation request timestamp is assumed.
 * 
 * If the argument is null, the result is null.
 * 
 * <p>Java class for ToTime complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ToTime">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:hl7-org:elm:r1}UnaryExpression">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ToTime")
public class ToTime
    extends UnaryExpression
{


}
