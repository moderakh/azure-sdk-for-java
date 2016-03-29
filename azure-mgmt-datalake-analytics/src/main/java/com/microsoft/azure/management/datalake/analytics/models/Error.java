/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator 0.16.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.azure.management.datalake.analytics.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Generic resource error information.
 */
public class Error {
    /**
     * Gets or sets the HTTP status code or error code associated with this
     * error.
     */
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String code;

    /**
     * Gets or sets the error message to display.
     */
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String message;

    /**
     * Gets or sets the target of the error.
     */
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String target;

    /**
     * Gets or sets the list of error details.
     */
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private List<ErrorDetails> details;

    /**
     * Gets or sets the inner exceptions or errors, if any.
     */
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private InnerError innerError;

    /**
     * Get the code value.
     *
     * @return the code value
     */
    public String getCode() {
        return this.code;
    }

    /**
     * Get the message value.
     *
     * @return the message value
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * Get the target value.
     *
     * @return the target value
     */
    public String getTarget() {
        return this.target;
    }

    /**
     * Get the details value.
     *
     * @return the details value
     */
    public List<ErrorDetails> getDetails() {
        return this.details;
    }

    /**
     * Get the innerError value.
     *
     * @return the innerError value
     */
    public InnerError getInnerError() {
        return this.innerError;
    }

}
