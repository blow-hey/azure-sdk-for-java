// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.loganalytics.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.loganalytics.fluent.models.LogAnalyticsQueryPackInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Describes the list of Log Analytics QueryPack resources. */
@Fluent
public final class LogAnalyticsQueryPackListResult {
    /*
     * List of Log Analytics QueryPack definitions.
     */
    @JsonProperty(value = "value", required = true)
    private List<LogAnalyticsQueryPackInner> value;

    /*
     * The URI to get the next set of Log Analytics QueryPack definitions if
     * too many QueryPacks where returned in the result set.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: List of Log Analytics QueryPack definitions.
     *
     * @return the value value.
     */
    public List<LogAnalyticsQueryPackInner> value() {
        return this.value;
    }

    /**
     * Set the value property: List of Log Analytics QueryPack definitions.
     *
     * @param value the value value to set.
     * @return the LogAnalyticsQueryPackListResult object itself.
     */
    public LogAnalyticsQueryPackListResult withValue(List<LogAnalyticsQueryPackInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URI to get the next set of Log Analytics QueryPack definitions if too many
     * QueryPacks where returned in the result set.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The URI to get the next set of Log Analytics QueryPack definitions if too many
     * QueryPacks where returned in the result set.
     *
     * @param nextLink the nextLink value to set.
     * @return the LogAnalyticsQueryPackListResult object itself.
     */
    public LogAnalyticsQueryPackListResult withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property value in model LogAnalyticsQueryPackListResult"));
        } else {
            value().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(LogAnalyticsQueryPackListResult.class);
}