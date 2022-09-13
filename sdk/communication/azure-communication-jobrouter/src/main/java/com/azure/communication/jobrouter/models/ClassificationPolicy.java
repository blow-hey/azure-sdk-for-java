// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.jobrouter.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** A container for the rules that govern how jobs are classified. */
@Fluent
public final class ClassificationPolicy {
    /*
     * Unique identifier of this policy.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /*
     * Friendly name of this policy.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * The fallback queue to select if the queue selector doesn't find a match.
     */
    @JsonProperty(value = "fallbackQueueId")
    private String fallbackQueueId;

    /*
     * The queue selectors to resolve a queue for a given job.
     */
    @JsonProperty(value = "queueSelectors")
    private List<QueueSelectorAttachment> queueSelectors;

    /*
     * A rule of one of the following types:
     *
     * StaticRule:  A rule providing static rules that always return the same
     * result, regardless of input.
     * DirectMapRule:  A rule that return the same labels as the input labels.
     * ExpressionRule: A rule providing inline expression rules.
     * AzureFunctionRule: A rule providing a binding to an HTTP Triggered Azure
     * Function.
     */
    @JsonProperty(value = "prioritizationRule")
    private RouterRule prioritizationRule;

    /*
     * The worker label selectors to attach to a given job.
     */
    @JsonProperty(value = "workerSelectors")
    private List<WorkerSelectorAttachment> workerSelectors;

    /**
     * Get the id property: Unique identifier of this policy.
     *
     * @return the id value.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Get the name property: Friendly name of this policy.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: Friendly name of this policy.
     *
     * @param name the name value to set.
     * @return the ClassificationPolicy object itself.
     */
    public ClassificationPolicy setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the fallbackQueueId property: The fallback queue to select if the queue selector doesn't find a match.
     *
     * @return the fallbackQueueId value.
     */
    public String getFallbackQueueId() {
        return this.fallbackQueueId;
    }

    /**
     * Set the fallbackQueueId property: The fallback queue to select if the queue selector doesn't find a match.
     *
     * @param fallbackQueueId the fallbackQueueId value to set.
     * @return the ClassificationPolicy object itself.
     */
    public ClassificationPolicy setFallbackQueueId(String fallbackQueueId) {
        this.fallbackQueueId = fallbackQueueId;
        return this;
    }

    /**
     * Get the queueSelectors property: The queue selectors to resolve a queue for a given job.
     *
     * @return the queueSelectors value.
     */
    public List<QueueSelectorAttachment> getQueueSelectors() {
        return this.queueSelectors;
    }

    /**
     * Set the queueSelectors property: The queue selectors to resolve a queue for a given job.
     *
     * @param queueSelectors the queueSelectors value to set.
     * @return the ClassificationPolicy object itself.
     */
    public ClassificationPolicy setQueueSelectors(List<QueueSelectorAttachment> queueSelectors) {
        this.queueSelectors = queueSelectors;
        return this;
    }

    /**
     * Get the prioritizationRule property: A rule of one of the following types:
     *
     * <p>StaticRule: A rule providing static rules that always return the same result, regardless of input.
     * DirectMapRule: A rule that return the same labels as the input labels. ExpressionRule: A rule providing inline
     * expression rules. AzureFunctionRule: A rule providing a binding to an HTTP Triggered Azure Function.
     *
     * @return the prioritizationRule value.
     */
    public RouterRule getPrioritizationRule() {
        return this.prioritizationRule;
    }

    /**
     * Set the prioritizationRule property: A rule of one of the following types:
     *
     * <p>StaticRule: A rule providing static rules that always return the same result, regardless of input.
     * DirectMapRule: A rule that return the same labels as the input labels. ExpressionRule: A rule providing inline
     * expression rules. AzureFunctionRule: A rule providing a binding to an HTTP Triggered Azure Function.
     *
     * @param prioritizationRule the prioritizationRule value to set.
     * @return the ClassificationPolicy object itself.
     */
    public ClassificationPolicy setPrioritizationRule(RouterRule prioritizationRule) {
        this.prioritizationRule = prioritizationRule;
        return this;
    }

    /**
     * Get the workerSelectors property: The worker label selectors to attach to a given job.
     *
     * @return the workerSelectors value.
     */
    public List<WorkerSelectorAttachment> getWorkerSelectors() {
        return this.workerSelectors;
    }

    /**
     * Set the workerSelectors property: The worker label selectors to attach to a given job.
     *
     * @param workerSelectors the workerSelectors value to set.
     * @return the ClassificationPolicy object itself.
     */
    public ClassificationPolicy setWorkerSelectors(List<WorkerSelectorAttachment> workerSelectors) {
        this.workerSelectors = workerSelectors;
        return this;
    }
}