/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mediaservices.v2020_05_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonSubTypes;

/**
 * Represents input files for a Job.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@odata\\.type", defaultImpl = JobInputClip.class)
@JsonTypeName("#Microsoft.Media.JobInputClip")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "#Microsoft.Media.JobInputAsset", value = JobInputAsset.class),
    @JsonSubTypes.Type(name = "#Microsoft.Media.JobInputHttp", value = JobInputHttp.class)
})
public class JobInputClip extends JobInput {
    /**
     * List of files. Required for JobInputHttp. Maximum of 4000 characters
     * each.
     */
    @JsonProperty(value = "files")
    private List<String> files;

    /**
     * Defines a point on the timeline of the input media at which processing
     * will start. Defaults to the beginning of the input media.
     */
    @JsonProperty(value = "start")
    private ClipTime start;

    /**
     * Defines a point on the timeline of the input media at which processing
     * will end. Defaults to the end of the input media.
     */
    @JsonProperty(value = "end")
    private ClipTime end;

    /**
     * A label that is assigned to a JobInputClip, that is used to satisfy a
     * reference used in the Transform. For example, a Transform can be
     * authored so as to take an image file with the label 'xyz' and apply it
     * as an overlay onto the input video before it is encoded. When submitting
     * a Job, exactly one of the JobInputs should be the image file, and it
     * should have the label 'xyz'.
     */
    @JsonProperty(value = "label")
    private String label;

    /**
     * Get list of files. Required for JobInputHttp. Maximum of 4000 characters each.
     *
     * @return the files value
     */
    public List<String> files() {
        return this.files;
    }

    /**
     * Set list of files. Required for JobInputHttp. Maximum of 4000 characters each.
     *
     * @param files the files value to set
     * @return the JobInputClip object itself.
     */
    public JobInputClip withFiles(List<String> files) {
        this.files = files;
        return this;
    }

    /**
     * Get defines a point on the timeline of the input media at which processing will start. Defaults to the beginning of the input media.
     *
     * @return the start value
     */
    public ClipTime start() {
        return this.start;
    }

    /**
     * Set defines a point on the timeline of the input media at which processing will start. Defaults to the beginning of the input media.
     *
     * @param start the start value to set
     * @return the JobInputClip object itself.
     */
    public JobInputClip withStart(ClipTime start) {
        this.start = start;
        return this;
    }

    /**
     * Get defines a point on the timeline of the input media at which processing will end. Defaults to the end of the input media.
     *
     * @return the end value
     */
    public ClipTime end() {
        return this.end;
    }

    /**
     * Set defines a point on the timeline of the input media at which processing will end. Defaults to the end of the input media.
     *
     * @param end the end value to set
     * @return the JobInputClip object itself.
     */
    public JobInputClip withEnd(ClipTime end) {
        this.end = end;
        return this;
    }

    /**
     * Get a label that is assigned to a JobInputClip, that is used to satisfy a reference used in the Transform. For example, a Transform can be authored so as to take an image file with the label 'xyz' and apply it as an overlay onto the input video before it is encoded. When submitting a Job, exactly one of the JobInputs should be the image file, and it should have the label 'xyz'.
     *
     * @return the label value
     */
    public String label() {
        return this.label;
    }

    /**
     * Set a label that is assigned to a JobInputClip, that is used to satisfy a reference used in the Transform. For example, a Transform can be authored so as to take an image file with the label 'xyz' and apply it as an overlay onto the input video before it is encoded. When submitting a Job, exactly one of the JobInputs should be the image file, and it should have the label 'xyz'.
     *
     * @param label the label value to set
     * @return the JobInputClip object itself.
     */
    public JobInputClip withLabel(String label) {
        this.label = label;
        return this;
    }

}
