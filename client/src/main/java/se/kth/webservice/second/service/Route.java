
package se.kth.webservice.second.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for route complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="route">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="airline" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="airlineId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="codeshare" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="destinationAirport" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="destinationAirportId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="equipment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="sourceAirport" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sourceAirportId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="stops" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "route", propOrder = {
    "airline",
    "airlineId",
    "codeshare",
    "destinationAirport",
    "destinationAirportId",
    "equipment",
    "id",
    "sourceAirport",
    "sourceAirportId",
    "stops"
})
public class Route {

    protected String airline;
    protected int airlineId;
    protected String codeshare;
    protected String destinationAirport;
    protected int destinationAirportId;
    protected String equipment;
    protected int id;
    protected String sourceAirport;
    protected int sourceAirportId;
    protected int stops;

    /**
     * Gets the value of the airline property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirline() {
        return airline;
    }

    /**
     * Sets the value of the airline property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirline(String value) {
        this.airline = value;
    }

    /**
     * Gets the value of the airlineId property.
     * 
     */
    public int getAirlineId() {
        return airlineId;
    }

    /**
     * Sets the value of the airlineId property.
     * 
     */
    public void setAirlineId(int value) {
        this.airlineId = value;
    }

    /**
     * Gets the value of the codeshare property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeshare() {
        return codeshare;
    }

    /**
     * Sets the value of the codeshare property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeshare(String value) {
        this.codeshare = value;
    }

    /**
     * Gets the value of the destinationAirport property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationAirport() {
        return destinationAirport;
    }

    /**
     * Sets the value of the destinationAirport property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationAirport(String value) {
        this.destinationAirport = value;
    }

    /**
     * Gets the value of the destinationAirportId property.
     * 
     */
    public int getDestinationAirportId() {
        return destinationAirportId;
    }

    /**
     * Sets the value of the destinationAirportId property.
     * 
     */
    public void setDestinationAirportId(int value) {
        this.destinationAirportId = value;
    }

    /**
     * Gets the value of the equipment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEquipment() {
        return equipment;
    }

    /**
     * Sets the value of the equipment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEquipment(String value) {
        this.equipment = value;
    }

    /**
     * Gets the value of the id property.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Gets the value of the sourceAirport property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceAirport() {
        return sourceAirport;
    }

    /**
     * Sets the value of the sourceAirport property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceAirport(String value) {
        this.sourceAirport = value;
    }

    /**
     * Gets the value of the sourceAirportId property.
     * 
     */
    public int getSourceAirportId() {
        return sourceAirportId;
    }

    /**
     * Sets the value of the sourceAirportId property.
     * 
     */
    public void setSourceAirportId(int value) {
        this.sourceAirportId = value;
    }

    /**
     * Gets the value of the stops property.
     * 
     */
    public int getStops() {
        return stops;
    }

    /**
     * Sets the value of the stops property.
     * 
     */
    public void setStops(int value) {
        this.stops = value;
    }

}
