// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagecache.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Storage Target space allocation properties. */
@Fluent
public final class StorageTargetSpaceAllocation {
    /*
     * Name of the storage target.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * The percentage of cache space allocated for this storage target
     */
    @JsonProperty(value = "allocationPercentage")
    private Integer allocationPercentage;

    /**
     * Get the name property: Name of the storage target.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Name of the storage target.
     *
     * @param name the name value to set.
     * @return the StorageTargetSpaceAllocation object itself.
     */
    public StorageTargetSpaceAllocation withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the allocationPercentage property: The percentage of cache space allocated for this storage target.
     *
     * @return the allocationPercentage value.
     */
    public Integer allocationPercentage() {
        return this.allocationPercentage;
    }

    /**
     * Set the allocationPercentage property: The percentage of cache space allocated for this storage target.
     *
     * @param allocationPercentage the allocationPercentage value to set.
     * @return the StorageTargetSpaceAllocation object itself.
     */
    public StorageTargetSpaceAllocation withAllocationPercentage(Integer allocationPercentage) {
        this.allocationPercentage = allocationPercentage;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}