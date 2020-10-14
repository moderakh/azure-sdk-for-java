/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mediaservices.v2020_05_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.mediaservices.v2020_05_01.implementation.PrivateEndpointConnectionInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.mediaservices.v2020_05_01.implementation.MediaManager;

/**
 * Type representing PrivateEndpointConnection.
 */
public interface PrivateEndpointConnection extends HasInner<PrivateEndpointConnectionInner>, Indexable, Refreshable<PrivateEndpointConnection>, Updatable<PrivateEndpointConnection.Update>, HasManager<MediaManager> {
    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the privateEndpoint value.
     */
    PrivateEndpoint privateEndpoint();

    /**
     * @return the privateLinkServiceConnectionState value.
     */
    PrivateLinkServiceConnectionState privateLinkServiceConnectionState();

    /**
     * @return the provisioningState value.
     */
    PrivateEndpointConnectionProvisioningState provisioningState();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The entirety of the PrivateEndpointConnection definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithMediaservice, DefinitionStages.WithPrivateLinkServiceConnectionState, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of PrivateEndpointConnection definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a PrivateEndpointConnection definition.
         */
        interface Blank extends WithMediaservice {
        }

        /**
         * The stage of the privateendpointconnection definition allowing to specify Mediaservice.
         */
        interface WithMediaservice {
           /**
            * Specifies resourceGroupName, accountName.
            * @param resourceGroupName The name of the resource group within the Azure subscription
            * @param accountName The Media Services account name
            * @return the next definition stage
            */
            WithPrivateLinkServiceConnectionState withExistingMediaservice(String resourceGroupName, String accountName);
        }

        /**
         * The stage of the privateendpointconnection definition allowing to specify PrivateLinkServiceConnectionState.
         */
        interface WithPrivateLinkServiceConnectionState {
           /**
            * Specifies privateLinkServiceConnectionState.
            * @param privateLinkServiceConnectionState A collection of information about the state of the connection between service consumer and provider
            * @return the next definition stage
            */
            WithCreate withPrivateLinkServiceConnectionState(PrivateLinkServiceConnectionState privateLinkServiceConnectionState);
        }

        /**
         * The stage of the privateendpointconnection definition allowing to specify PrivateEndpoint.
         */
        interface WithPrivateEndpoint {
            /**
             * Specifies privateEndpoint.
             * @param privateEndpoint The resource of private end point
             * @return the next definition stage
             */
            WithCreate withPrivateEndpoint(PrivateEndpoint privateEndpoint);
        }

        /**
         * The stage of the privateendpointconnection definition allowing to specify ProvisioningState.
         */
        interface WithProvisioningState {
            /**
             * Specifies provisioningState.
             * @param provisioningState The provisioning state of the private endpoint connection resource. Possible values include: 'Succeeded', 'Creating', 'Deleting', 'Failed'
             * @return the next definition stage
             */
            WithCreate withProvisioningState(PrivateEndpointConnectionProvisioningState provisioningState);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<PrivateEndpointConnection>, DefinitionStages.WithPrivateEndpoint, DefinitionStages.WithProvisioningState {
        }
    }
    /**
     * The template for a PrivateEndpointConnection update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<PrivateEndpointConnection>, UpdateStages.WithPrivateEndpoint, UpdateStages.WithProvisioningState {
    }

    /**
     * Grouping of PrivateEndpointConnection update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the privateendpointconnection update allowing to specify PrivateEndpoint.
         */
        interface WithPrivateEndpoint {
            /**
             * Specifies privateEndpoint.
             * @param privateEndpoint The resource of private end point
             * @return the next update stage
             */
            Update withPrivateEndpoint(PrivateEndpoint privateEndpoint);
        }

        /**
         * The stage of the privateendpointconnection update allowing to specify ProvisioningState.
         */
        interface WithProvisioningState {
            /**
             * Specifies provisioningState.
             * @param provisioningState The provisioning state of the private endpoint connection resource. Possible values include: 'Succeeded', 'Creating', 'Deleting', 'Failed'
             * @return the next update stage
             */
            Update withProvisioningState(PrivateEndpointConnectionProvisioningState provisioningState);
        }

    }
}
