/*
 * Fanapium Core API
 * Fanapium B2B2C services

 */


package org.springframework.social.fanapium.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ProductAllocationSrv
 */

public class ProductAllocation {
    @JsonProperty("id")
    private Long id = null;

    @JsonProperty("owner")
    private Product owner = null;

    @JsonProperty("allocated")
    private Product allocated = null;

    @JsonProperty("description")
    private String description = null;

    @JsonProperty("startDate")
    private Long startDate = null;

    @JsonProperty("endDate")
    private Long endDate = null;

    @JsonProperty("confirmed")
    private Boolean confirmed = null;

    @JsonProperty("finished")
    private Boolean finished = null;

    @JsonProperty("requester")
    private User requester = null;

    @JsonProperty("confirmer")
    private User confirmer = null;

    @JsonProperty("deallocator")
    private User deallocator = null;

    @JsonProperty("allocator")
    private Boolean allocator = null;

    public ProductAllocation id(Long id) {
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

    public ProductAllocation owner(Product owner) {
        this.owner = owner;
        return this;
    }

    /**
     * Get owner
     *
     * @return owner
     **/

    public Product getOwner() {
        return owner;
    }

    public void setOwner(Product owner) {
        this.owner = owner;
    }

    public ProductAllocation allocated(Product allocated) {
        this.allocated = allocated;
        return this;
    }

    /**
     * Get allocated
     *
     * @return allocated
     **/

    public Product getAllocated() {
        return allocated;
    }

    public void setAllocated(Product allocated) {
        this.allocated = allocated;
    }

    public ProductAllocation description(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get description
     *
     * @return description
     **/

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ProductAllocation startDate(Long startDate) {
        this.startDate = startDate;
        return this;
    }

    /**
     * Get startDate
     *
     * @return startDate
     **/

    public Long getStartDate() {
        return startDate;
    }

    public void setStartDate(Long startDate) {
        this.startDate = startDate;
    }

    public ProductAllocation endDate(Long endDate) {
        this.endDate = endDate;
        return this;
    }

    /**
     * Get endDate
     *
     * @return endDate
     **/

    public Long getEndDate() {
        return endDate;
    }

    public void setEndDate(Long endDate) {
        this.endDate = endDate;
    }

    public ProductAllocation confirmed(Boolean confirmed) {
        this.confirmed = confirmed;
        return this;
    }

    /**
     * Get confirmed
     *
     * @return confirmed
     **/

    public Boolean isConfirmed() {
        return confirmed;
    }

    public void setConfirmed(Boolean confirmed) {
        this.confirmed = confirmed;
    }

    public ProductAllocation finished(Boolean finished) {
        this.finished = finished;
        return this;
    }

    /**
     * Get finished
     *
     * @return finished
     **/

    public Boolean isFinished() {
        return finished;
    }

    public void setFinished(Boolean finished) {
        this.finished = finished;
    }

    public ProductAllocation requester(User requester) {
        this.requester = requester;
        return this;
    }

    /**
     * Get requester
     *
     * @return requester
     **/

    public User getRequester() {
        return requester;
    }

    public void setRequester(User requester) {
        this.requester = requester;
    }

    public ProductAllocation confirmer(User confirmer) {
        this.confirmer = confirmer;
        return this;
    }

    /**
     * Get confirmer
     *
     * @return confirmer
     **/

    public User getConfirmer() {
        return confirmer;
    }

    public void setConfirmer(User confirmer) {
        this.confirmer = confirmer;
    }

    public ProductAllocation deallocator(User deallocator) {
        this.deallocator = deallocator;
        return this;
    }

    /**
     * Get deallocator
     *
     * @return deallocator
     **/

    public User getDeallocator() {
        return deallocator;
    }

    public void setDeallocator(User deallocator) {
        this.deallocator = deallocator;
    }

    public ProductAllocation allocator(Boolean allocator) {
        this.allocator = allocator;
        return this;
    }

    /**
     * Get allocator
     *
     * @return allocator
     **/

    public Boolean isAllocator() {
        return allocator;
    }

    public void setAllocator(Boolean allocator) {
        this.allocator = allocator;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ProductAllocation productAllocation = (ProductAllocation) o;
        return Objects.equals(this.id, productAllocation.id) &&
                Objects.equals(this.owner, productAllocation.owner) &&
                Objects.equals(this.allocated, productAllocation.allocated) &&
                Objects.equals(this.description, productAllocation.description) &&
                Objects.equals(this.startDate, productAllocation.startDate) &&
                Objects.equals(this.endDate, productAllocation.endDate) &&
                Objects.equals(this.confirmed, productAllocation.confirmed) &&
                Objects.equals(this.finished, productAllocation.finished) &&
                Objects.equals(this.requester, productAllocation.requester) &&
                Objects.equals(this.confirmer, productAllocation.confirmer) &&
                Objects.equals(this.deallocator, productAllocation.deallocator) &&
                Objects.equals(this.allocator, productAllocation.allocator);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, owner, allocated, description, startDate, endDate, confirmed, finished, requester, confirmer, deallocator, allocator);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProductAllocationSrv {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
        sb.append("    allocated: ").append(toIndentedString(allocated)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
        sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
        sb.append("    confirmed: ").append(toIndentedString(confirmed)).append("\n");
        sb.append("    finished: ").append(toIndentedString(finished)).append("\n");
        sb.append("    requester: ").append(toIndentedString(requester)).append("\n");
        sb.append("    confirmer: ").append(toIndentedString(confirmer)).append("\n");
        sb.append("    deallocator: ").append(toIndentedString(deallocator)).append("\n");
        sb.append("    allocator: ").append(toIndentedString(allocator)).append("\n");
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

