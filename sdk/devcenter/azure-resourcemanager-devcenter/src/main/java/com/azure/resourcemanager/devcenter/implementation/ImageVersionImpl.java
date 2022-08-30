// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.implementation;

import com.azure.core.management.SystemData;
import com.azure.resourcemanager.devcenter.fluent.models.ImageVersionInner;
import com.azure.resourcemanager.devcenter.models.ImageVersion;
import java.time.OffsetDateTime;

public final class ImageVersionImpl implements ImageVersion {
    private ImageVersionInner innerObject;

    private final com.azure.resourcemanager.devcenter.DevCenterManager serviceManager;

    ImageVersionImpl(
        ImageVersionInner innerObject, com.azure.resourcemanager.devcenter.DevCenterManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public String namePropertiesName() {
        return this.innerModel().namePropertiesName();
    }

    public OffsetDateTime publishedDate() {
        return this.innerModel().publishedDate();
    }

    public Boolean excludeFromLatest() {
        return this.innerModel().excludeFromLatest();
    }

    public Integer osDiskImageSizeInGb() {
        return this.innerModel().osDiskImageSizeInGb();
    }

    public String provisioningState() {
        return this.innerModel().provisioningState();
    }

    public ImageVersionInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.devcenter.DevCenterManager manager() {
        return this.serviceManager;
    }
}