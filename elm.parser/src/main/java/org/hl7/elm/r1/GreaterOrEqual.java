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
 * The GreaterOrEqual operator returns true if the first argument is greater than or equal to the second argument.
 * 
 * For comparisons involving quantities, the dimensions of each quantity must be the same, but not necessarily the unit. For example, units of 'cm' and 'm' are comparable, but units of 'cm2' and 'cm' are not. Attempting to operate on quantities with invalid units will result in a run-time error.
 * 
 * If either argument is null, the result is null.
 * 
 * The GreaterOrEqual operator is defined for the Integer, Decimal, String, DateTime, Time, and Quantity types.
 * 
 * <p>Java class for GreaterOrEqual complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GreaterOrEqual">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:hl7-org:elm:r1}BinaryExpression">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GreaterOrEqual")
public class GreaterOrEqual
    extends BinaryExpression
{


}