//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.07.02 at 01:47:00 AM IST 
//


package org.hl7.elm.r1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * ChoiceTypeSpecifier defines the possible types of a choice type.
 * 
 * <p>Java class for ChoiceTypeSpecifier complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChoiceTypeSpecifier">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:hl7-org:elm:r1}TypeSpecifier">
 *       &lt;sequence>
 *         &lt;element name="type" type="{urn:hl7-org:elm:r1}TypeSpecifier" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChoiceTypeSpecifier", propOrder = {
    "type"
})
public class ChoiceTypeSpecifier
    extends TypeSpecifier
{

    protected List<TypeSpecifier> type;

    /**
     * Gets the value of the type property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the type property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeSpecifier }
     * 
     * 
     */
    public List<TypeSpecifier> getType() {
        if (type == null) {
            type = new ArrayList<TypeSpecifier>();
        }
        return this.type;
    }

}
