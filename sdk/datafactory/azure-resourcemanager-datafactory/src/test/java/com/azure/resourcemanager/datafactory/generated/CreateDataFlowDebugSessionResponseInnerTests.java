// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.fluent.models.CreateDataFlowDebugSessionResponseInner;
import org.junit.jupiter.api.Assertions;

public final class CreateDataFlowDebugSessionResponseInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CreateDataFlowDebugSessionResponseInner model =
            BinaryData
                .fromString("{\"status\":\"zvd\",\"sessionId\":\"zdix\"}")
                .toObject(CreateDataFlowDebugSessionResponseInner.class);
        Assertions.assertEquals("zvd", model.status());
        Assertions.assertEquals("zdix", model.sessionId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CreateDataFlowDebugSessionResponseInner model =
            new CreateDataFlowDebugSessionResponseInner().withStatus("zvd").withSessionId("zdix");
        model = BinaryData.fromObject(model).toObject(CreateDataFlowDebugSessionResponseInner.class);
        Assertions.assertEquals("zvd", model.status());
        Assertions.assertEquals("zdix", model.sessionId());
    }
}
