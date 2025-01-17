// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.models.MabProtectionPolicy;
import com.azure.resourcemanager.recoveryservicesbackup.models.RetentionPolicy;
import com.azure.resourcemanager.recoveryservicesbackup.models.SchedulePolicy;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class MabProtectionPolicyTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        MabProtectionPolicy model =
            BinaryData
                .fromString(
                    "{\"backupManagementType\":\"MAB\",\"schedulePolicy\":{\"schedulePolicyType\":\"SchedulePolicy\"},\"retentionPolicy\":{\"retentionPolicyType\":\"RetentionPolicy\"},\"protectedItemsCount\":1711028317,\"resourceGuardOperationRequests\":[\"kewvnqv\",\"dlguaucmfdjwn\",\"axpunjqikczvv\",\"tacgxmfc\"]}")
                .toObject(MabProtectionPolicy.class);
        Assertions.assertEquals(1711028317, model.protectedItemsCount());
        Assertions.assertEquals("kewvnqv", model.resourceGuardOperationRequests().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        MabProtectionPolicy model =
            new MabProtectionPolicy()
                .withProtectedItemsCount(1711028317)
                .withResourceGuardOperationRequests(
                    Arrays.asList("kewvnqv", "dlguaucmfdjwn", "axpunjqikczvv", "tacgxmfc"))
                .withSchedulePolicy(new SchedulePolicy())
                .withRetentionPolicy(new RetentionPolicy());
        model = BinaryData.fromObject(model).toObject(MabProtectionPolicy.class);
        Assertions.assertEquals(1711028317, model.protectedItemsCount());
        Assertions.assertEquals("kewvnqv", model.resourceGuardOperationRequests().get(0));
    }
}
