/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mediaservices.v2020_05_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Describes a transcription track in the output of a live event, generated
 * using speech-to-text transcription. This property is reserved for future
 * use, any value set on this property will be ignored.
 */
public class LiveEventOutputTranscriptionTrack {
    /**
     * The output track name. This property is reserved for future use, any
     * value set on this property will be ignored.
     */
    @JsonProperty(value = "trackName", required = true)
    private String trackName;

    /**
     * Get the output track name. This property is reserved for future use, any value set on this property will be ignored.
     *
     * @return the trackName value
     */
    public String trackName() {
        return this.trackName;
    }

    /**
     * Set the output track name. This property is reserved for future use, any value set on this property will be ignored.
     *
     * @param trackName the trackName value to set
     * @return the LiveEventOutputTranscriptionTrack object itself.
     */
    public LiveEventOutputTranscriptionTrack withTrackName(String trackName) {
        this.trackName = trackName;
        return this;
    }

}
