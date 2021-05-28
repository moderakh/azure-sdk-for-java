// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The RecoveryPointMoveReadinessInfo model. */
@Fluent
public final class RecoveryPointMoveReadinessInfo {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(RecoveryPointMoveReadinessInfo.class);

    /*
     * The isReadyForMove property.
     */
    @JsonProperty(value = "isReadyForMove")
    private Boolean isReadyForMove;

    /*
     * The additionalInfo property.
     */
    @JsonProperty(value = "additionalInfo")
    private String additionalInfo;

    /**
     * Get the isReadyForMove property: The isReadyForMove property.
     *
     * @return the isReadyForMove value.
     */
    public Boolean isReadyForMove() {
        return this.isReadyForMove;
    }

    /**
     * Set the isReadyForMove property: The isReadyForMove property.
     *
     * @param isReadyForMove the isReadyForMove value to set.
     * @return the RecoveryPointMoveReadinessInfo object itself.
     */
    public RecoveryPointMoveReadinessInfo withIsReadyForMove(Boolean isReadyForMove) {
        this.isReadyForMove = isReadyForMove;
        return this;
    }

    /**
     * Get the additionalInfo property: The additionalInfo property.
     *
     * @return the additionalInfo value.
     */
    public String additionalInfo() {
        return this.additionalInfo;
    }

    /**
     * Set the additionalInfo property: The additionalInfo property.
     *
     * @param additionalInfo the additionalInfo value to set.
     * @return the RecoveryPointMoveReadinessInfo object itself.
     */
    public RecoveryPointMoveReadinessInfo withAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
