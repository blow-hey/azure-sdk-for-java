// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.formrecognizer.documentanalysis.administration.models;

import com.azure.ai.formrecognizer.documentanalysis.implementation.util.DocumentModelComposeOperationDetailsHelper;
import com.azure.core.annotation.Immutable;

/** Get Operation response object. */
@Immutable
public final class DocumentModelComposeOperationDetails extends OperationDetails {
    /*
     * Operation result upon success.
     */
    private DocumentModelDetails result;

    /**
     * Get the result property: Operation result upon success.
     *
     * @return the result value.
     */
    public DocumentModelDetails getResult() {
        return this.result;
    }

    /**
     * Set the result property: Operation result upon success.
     *
     * @param result the result value to set.
     */
    private void setResult(DocumentModelDetails result) {
        this.result = result;
    }

    static {
        DocumentModelComposeOperationDetailsHelper.setAccessor(
            new DocumentModelComposeOperationDetailsHelper.DocumentModelComposeOperationDetailsAccessor() {
                public void setResult(DocumentModelComposeOperationDetails operationDetails,
                                      DocumentModelDetails result) {
                    operationDetails.setResult(result);
                }
            });
    }
}