// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.alertsmanagement.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Properties of the alert modification item. */
@Fluent
public final class AlertModificationProperties {
    /*
     * Unique Id of the alert for which the history is being retrieved
     */
    @JsonProperty(value = "alertId", access = JsonProperty.Access.WRITE_ONLY)
    private String alertId;

    /*
     * Modification details
     */
    @JsonProperty(value = "modifications")
    private List<AlertModificationItem> modifications;

    /**
     * Get the alertId property: Unique Id of the alert for which the history is being retrieved.
     *
     * @return the alertId value.
     */
    public String alertId() {
        return this.alertId;
    }

    /**
     * Get the modifications property: Modification details.
     *
     * @return the modifications value.
     */
    public List<AlertModificationItem> modifications() {
        return this.modifications;
    }

    /**
     * Set the modifications property: Modification details.
     *
     * @param modifications the modifications value to set.
     * @return the AlertModificationProperties object itself.
     */
    public AlertModificationProperties withModifications(List<AlertModificationItem> modifications) {
        this.modifications = modifications;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (modifications() != null) {
            modifications().forEach(e -> e.validate());
        }
    }
}