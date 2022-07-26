// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.appservice.models.SiteSealRequest;

/** Samples for AppServiceCertificateOrders RetrieveSiteSeal. */
public final class AppServiceCertificateOrdersRetrieveSiteSealSamples {
    /*
     * x-ms-original-file: specification/web/resource-manager/Microsoft.CertificateRegistration/stable/2022-03-01/examples/RetrieveSiteSeal.json
     */
    /**
     * Sample code: Retrieve Site Seal.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void retrieveSiteSeal(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .webApps()
            .manager()
            .serviceClient()
            .getAppServiceCertificateOrders()
            .retrieveSiteSealWithResponse(
                "testrg123",
                "SampleCertOrder",
                new SiteSealRequest().withLightTheme(true).withLocale("en-us"),
                Context.NONE);
    }
}