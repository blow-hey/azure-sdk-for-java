// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.callautomation.implementation.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for RecognitionTypeInternal. */
public final class RecognitionTypeInternal extends ExpandableStringEnum<RecognitionTypeInternal> {
    /** Static value dtmf for RecognitionTypeInternal. */
    public static final RecognitionTypeInternal DTMF = fromString("dtmf");

    /**
     * Creates or finds a RecognitionTypeInternal from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding RecognitionTypeInternal.
     */
    @JsonCreator
    public static RecognitionTypeInternal fromString(String name) {
        return fromString(name, RecognitionTypeInternal.class);
    }

    /** @return known RecognitionTypeInternal values. */
    public static Collection<RecognitionTypeInternal> values() {
        return values(RecognitionTypeInternal.class);
    }
}