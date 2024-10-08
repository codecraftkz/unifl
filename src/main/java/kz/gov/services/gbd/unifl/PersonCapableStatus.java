//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.08.22 at 02:59:23 PM ALMT 
//


package kz.gov.services.gbd.unifl;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Сведения о дееспособности. Также содержит сведения о осуждении по статьям 192, 216, 217
 *                 УК
 *             
 * 
 * <p>Java class for PersonCapableStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PersonCapableStatus"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="capableStatus" type="{http://dictionaries.persistence.interactive.nat}CapableStatus"/&gt;
 *         &lt;element name="capableDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="capableEndDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="capableNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="court" type="{http://dictionaries.persistence.interactive.nat}Court"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonCapableStatus", namespace = "http://person.persistence.interactive.nat", propOrder = {
    "capableStatus",
    "capableDate",
    "capableEndDate",
    "capableNumber",
    "court"
})
public class PersonCapableStatus {

    @XmlElement(required = true)
    protected CapableStatus capableStatus;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar capableDate;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar capableEndDate;
    @XmlElement(required = true)
    protected String capableNumber;
    @XmlElement(required = true)
    protected Court court;

    /**
     * Gets the value of the capableStatus property.
     * 
     * @return
     *     possible object is
     *     {@link CapableStatus }
     *     
     */
    public CapableStatus getCapableStatus() {
        return capableStatus;
    }

    /**
     * Sets the value of the capableStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link CapableStatus }
     *     
     */
    public void setCapableStatus(CapableStatus value) {
        this.capableStatus = value;
    }

    /**
     * Gets the value of the capableDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCapableDate() {
        return capableDate;
    }

    /**
     * Sets the value of the capableDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCapableDate(XMLGregorianCalendar value) {
        this.capableDate = value;
    }

    /**
     * Gets the value of the capableEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCapableEndDate() {
        return capableEndDate;
    }

    /**
     * Sets the value of the capableEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCapableEndDate(XMLGregorianCalendar value) {
        this.capableEndDate = value;
    }

    /**
     * Gets the value of the capableNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCapableNumber() {
        return capableNumber;
    }

    /**
     * Sets the value of the capableNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCapableNumber(String value) {
        this.capableNumber = value;
    }

    /**
     * Gets the value of the court property.
     * 
     * @return
     *     possible object is
     *     {@link Court }
     *     
     */
    public Court getCourt() {
        return court;
    }

    /**
     * Sets the value of the court property.
     * 
     * @param value
     *     allowed object is
     *     {@link Court }
     *     
     */
    public void setCourt(Court value) {
        this.court = value;
    }

}
