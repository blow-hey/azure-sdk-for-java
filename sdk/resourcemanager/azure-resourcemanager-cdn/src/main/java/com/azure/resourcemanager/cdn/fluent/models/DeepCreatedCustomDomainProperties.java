// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Properties of the custom domain created on the CDN endpoint. */
@Fluent
public final class DeepCreatedCustomDomainProperties {
    /*
     * The host name of the custom domain. Must be a domain name.
     */
    @JsonProperty(value = "hostName", required = true)
    private String hostname;

    /*
     * Special validation or data may be required when delivering CDN to some regions due to local compliance reasons.
     * E.g. ICP license number of a custom domain is required to deliver content in China.
     */
    @JsonProperty(value = "validationData")
    private String validationData;

    /**
     * Get the hostname property: The host name of the custom domain. Must be a domain name.
     *
     * @return the hostname value.
     */
    public String hostname() {
        return this.hostname;
    }

    /**
     * Set the hostname property: The host name of the custom domain. Must be a domain name.
     *
     * @param hostname the hostname value to set.
     * @return the DeepCreatedCustomDomainProperties object itself.
     */
    public DeepCreatedCustomDomainProperties withHostname(String hostname) {
        this.hostname = hostname;
        return this;
    }

    /**
     * Get the validationData property: Special validation or data may be required when delivering CDN to some regions
     * due to local compliance reasons. E.g. ICP license number of a custom domain is required to deliver content in
     * China.
     *
     * @return the validationData value.
     */
    public String validationData() {
        return this.validationData;
    }

    /**
     * Set the validationData property: Special validation or data may be required when delivering CDN to some regions
     * due to local compliance reasons. E.g. ICP license number of a custom domain is required to deliver content in
     * China.
     *
     * @param validationData the validationData value to set.
     * @return the DeepCreatedCustomDomainProperties object itself.
     */
    public DeepCreatedCustomDomainProperties withValidationData(String validationData) {
        this.validationData = validationData;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (hostname() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property hostname in model DeepCreatedCustomDomainProperties"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(DeepCreatedCustomDomainProperties.class);
}