// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.batch.models.EndpointAccessDefaultAction;
import com.azure.resourcemanager.batch.models.EndpointAccessProfile;
import com.azure.resourcemanager.batch.models.IpRule;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class EndpointAccessProfileTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        EndpointAccessProfile model =
            BinaryData
                .fromString(
                    "{\"defaultAction\":\"Allow\",\"ipRules\":[{\"value\":\"eupewnwreitjz\"},{\"value\":\"flusarhmof\"},{\"value\":\"qhsmyurkdtml\"}]}")
                .toObject(EndpointAccessProfile.class);
        Assertions.assertEquals(EndpointAccessDefaultAction.ALLOW, model.defaultAction());
        Assertions.assertEquals("eupewnwreitjz", model.ipRules().get(0).value());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        EndpointAccessProfile model =
            new EndpointAccessProfile()
                .withDefaultAction(EndpointAccessDefaultAction.ALLOW)
                .withIpRules(
                    Arrays
                        .asList(
                            new IpRule().withValue("eupewnwreitjz"),
                            new IpRule().withValue("flusarhmof"),
                            new IpRule().withValue("qhsmyurkdtml")));
        model = BinaryData.fromObject(model).toObject(EndpointAccessProfile.class);
        Assertions.assertEquals(EndpointAccessDefaultAction.ALLOW, model.defaultAction());
        Assertions.assertEquals("eupewnwreitjz", model.ipRules().get(0).value());
    }
}
