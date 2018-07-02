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
 * The Current expression returns the value of the object currently in scope. For example, within a ForEach expression, this returns the current element being considered in the iteration.
 * 			
 * It is an error to invoke the Current operator outside the context of a scoped operation.
 * 
 * <p>Java class for Current complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Current">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:hl7-org:elm:r1}Expression">
 *       &lt;attribute name="scope" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Current")
public class Current
    extends Expression
{

    @XmlAttribute(name = "scope")
    protected String scope;

    /**
     * Gets the value of the scope property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScope() {
        return scope;
    }

    /**
     * Sets the value of the scope property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScope(String value) {
        this.scope = value;
    }

}
