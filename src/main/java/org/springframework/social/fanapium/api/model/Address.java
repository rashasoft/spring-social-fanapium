/*
 * Fanapium Core API
 * Fanapium B2B2C services
 */


package org.springframework.social.fanapium.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * AddressSrv
 */
public class Address {
    @JsonProperty("id")
    private Long id = null;

    @JsonProperty("state")
    private String state = null;

    @JsonProperty("city")
    private String city = null;

    @JsonProperty("postalcode")
    private String postalcode = null;

    @JsonProperty("address")
    private String address = null;

    @JsonProperty("phoneNumber")
    private String phoneNumber = null;

    @JsonProperty("latitude")
    private Double latitude = null;

    @JsonProperty("longitude")
    private Double longitude = null;

    @JsonProperty("simpleAddress")
    private String simpleAddress = null;

    public Address id(Long id) {
        this.id = id;
        return this;
    }

    /**
     * Get id
     *
     * @return id
     **/

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Address state(String state) {
        this.state = state;
        return this;
    }

    /**
     * Get state
     *
     * @return state
     **/

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Address city(String city) {
        this.city = city;
        return this;
    }

    /**
     * Get city
     *
     * @return city
     **/

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Address postalcode(String postalcode) {
        this.postalcode = postalcode;
        return this;
    }

    /**
     * Get postalcode
     *
     * @return postalcode
     **/

    public String getPostalcode() {
        return postalcode;
    }

    public void setPostalcode(String postalcode) {
        this.postalcode = postalcode;
    }

    public Address address(String address) {
        this.address = address;
        return this;
    }

    /**
     * Get address
     *
     * @return address
     **/

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Address phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    /**
     * Get phoneNumber
     *
     * @return phoneNumber
     **/

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Address latitude(Double latitude) {
        this.latitude = latitude;
        return this;
    }

    /**
     * Get latitude
     *
     * @return latitude
     **/

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Address longitude(Double longitude) {
        this.longitude = longitude;
        return this;
    }

    /**
     * Get longitude
     *
     * @return longitude
     **/

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Address simpleAddress(String simpleAddress) {
        this.simpleAddress = simpleAddress;
        return this;
    }

    /**
     * Get simpleAddress
     *
     * @return simpleAddress
     **/

    public String getSimpleAddress() {
        return simpleAddress;
    }

    public void setSimpleAddress(String simpleAddress) {
        this.simpleAddress = simpleAddress;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Address address = (Address) o;
        return Objects.equals(this.id, address.id) &&
                Objects.equals(this.state, address.state) &&
                Objects.equals(this.city, address.city) &&
                Objects.equals(this.postalcode, address.postalcode) &&
                Objects.equals(this.address, address.address) &&
                Objects.equals(this.phoneNumber, address.phoneNumber) &&
                Objects.equals(this.latitude, address.latitude) &&
                Objects.equals(this.longitude, address.longitude) &&
                Objects.equals(this.simpleAddress, address.simpleAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, state, city, postalcode, address, phoneNumber, latitude, longitude, simpleAddress);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Address {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    city: ").append(toIndentedString(city)).append("\n");
        sb.append("    postalcode: ").append(toIndentedString(postalcode)).append("\n");
        sb.append("    address: ").append(toIndentedString(address)).append("\n");
        sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
        sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
        sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
        sb.append("    simpleAddress: ").append(toIndentedString(simpleAddress)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}

