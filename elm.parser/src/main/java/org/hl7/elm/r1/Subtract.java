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
 * The Subtract operator performs numeric subtraction of its arguments.
 * 			
 * When subtracting quantities, the dimensions of each quantity must be the same, but not necessarily the unit. For example, units of 'cm' and 'm' can be subtracted, but units of 'cm2' and 'cm' cannot. The unit of the result will be the most granular unit of either input. Attempting to operate on quantities with invalid units will result in a run-time error.
 * 
 * The Subtract operator is defined for the Integer, Decimal, and Quantity types. In addition, a time-valued Quantity can be subtracted from a DateTime or Time using this operator.
 * 
 * For DateTime and Time values, the operator returns the value of the given date/time, decremented by the time-valued quantity, respective variable length periods for calendar years and months.
 * 
 * The operation is performed by converting the time-based quantity to the highest specified granularity in the date/time value (truncating any resulting decimal portion) and then adding it to the date/time value.
 * 
 * If either argument is null, the result is null.
 * 
 * <p>Java class for Subtract complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Subtract">
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
@XmlType(name = "Subtract")
public class Subtract
    extends BinaryExpression
{


}
