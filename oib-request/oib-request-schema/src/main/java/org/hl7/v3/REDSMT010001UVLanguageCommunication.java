//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.11.25 at 09:30:05 AM MST 
//


package org.hl7.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for REDS_MT010001UV.LanguageCommunication complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="REDS_MT010001UV.LanguageCommunication">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="languageCode" type="{}CD.Lite" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "REDS_MT010001UV.LanguageCommunication", propOrder = {
    "languageCode"
})
public class REDSMT010001UVLanguageCommunication {

    @XmlElement(required = true)
    protected CDLite languageCode;

    /**
     * Gets the value of the languageCode property.
     * 
     * @return
     *     possible object is
     *     {@link CDLite }
     *     
     */
    public CDLite getLanguageCode() {
        return languageCode;
    }

    /**
     * Sets the value of the languageCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CDLite }
     *     
     */
    public void setLanguageCode(CDLite value) {
        this.languageCode = value;
    }

}