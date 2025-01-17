// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Provisioning state. */
public enum MSDeployProvisioningState {
    /** Enum value accepted. */
    ACCEPTED("accepted"),

    /** Enum value running. */
    RUNNING("running"),

    /** Enum value succeeded. */
    SUCCEEDED("succeeded"),

    /** Enum value failed. */
    FAILED("failed"),

    /** Enum value canceled. */
    CANCELED("canceled");

    /** The actual serialized value for a MSDeployProvisioningState instance. */
    private final String value;

    MSDeployProvisioningState(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a MSDeployProvisioningState instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed MSDeployProvisioningState object, or null if unable to parse.
     */
    @JsonCreator
    public static MSDeployProvisioningState fromString(String value) {
        if (value == null) {
            return null;
        }
        MSDeployProvisioningState[] items = MSDeployProvisioningState.values();
        for (MSDeployProvisioningState item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    /** {@inheritDoc} */
    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
