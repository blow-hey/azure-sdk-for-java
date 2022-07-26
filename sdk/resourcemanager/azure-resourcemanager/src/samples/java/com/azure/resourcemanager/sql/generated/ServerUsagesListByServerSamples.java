// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated;

import com.azure.core.util.Context;

/** Samples for ServerUsages ListByServer. */
public final class ServerUsagesListByServerSamples {
    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/stable/2014-04-01/examples/ServerUsageMetricsList.json
     */
    /**
     * Sample code: List servers usages.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void listServersUsages(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .sqlServers()
            .manager()
            .serviceClient()
            .getServerUsages()
            .listByServer("sqlcrudtest-6730", "sqlcrudtest-9007", Context.NONE);
    }
}