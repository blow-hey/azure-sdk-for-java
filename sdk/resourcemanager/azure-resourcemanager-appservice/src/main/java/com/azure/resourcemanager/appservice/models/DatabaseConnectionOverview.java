// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Static Site Database Connection overview. */
@Immutable
public final class DatabaseConnectionOverview {
    /*
     * The resource id of the database.
     */
    @JsonProperty(value = "resourceId", access = JsonProperty.Access.WRITE_ONLY)
    private String resourceId;

    /*
     * If present, the identity is used in conjunction with connection string to connect to the database. Use of the
     * system-assigned managed identity is indicated with the string 'SystemAssigned', while use of a user-assigned
     * managed identity is indicated with the resource id of the managed identity resource.
     */
    @JsonProperty(value = "connectionIdentity", access = JsonProperty.Access.WRITE_ONLY)
    private String connectionIdentity;

    /*
     * The region of the database resource.
     */
    @JsonProperty(value = "region", access = JsonProperty.Access.WRITE_ONLY)
    private String region;

    /*
     * A list of configuration files associated with this database connection.
     */
    @JsonProperty(value = "configurationFiles", access = JsonProperty.Access.WRITE_ONLY)
    private List<StaticSiteDatabaseConnectionConfigurationFileOverview> configurationFiles;

    /*
     * If present, the name of this database connection resource.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /** Creates an instance of DatabaseConnectionOverview class. */
    public DatabaseConnectionOverview() {
    }

    /**
     * Get the resourceId property: The resource id of the database.
     *
     * @return the resourceId value.
     */
    public String resourceId() {
        return this.resourceId;
    }

    /**
     * Get the connectionIdentity property: If present, the identity is used in conjunction with connection string to
     * connect to the database. Use of the system-assigned managed identity is indicated with the string
     * 'SystemAssigned', while use of a user-assigned managed identity is indicated with the resource id of the managed
     * identity resource.
     *
     * @return the connectionIdentity value.
     */
    public String connectionIdentity() {
        return this.connectionIdentity;
    }

    /**
     * Get the region property: The region of the database resource.
     *
     * @return the region value.
     */
    public String region() {
        return this.region;
    }

    /**
     * Get the configurationFiles property: A list of configuration files associated with this database connection.
     *
     * @return the configurationFiles value.
     */
    public List<StaticSiteDatabaseConnectionConfigurationFileOverview> configurationFiles() {
        return this.configurationFiles;
    }

    /**
     * Get the name property: If present, the name of this database connection resource.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (configurationFiles() != null) {
            configurationFiles().forEach(e -> e.validate());
        }
    }
}
