/**
 * Copyright (C) 2009-2015 Dell, Inc.
 * See annotations for authorship information
 *
 * ====================================================================
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * ====================================================================
 */

package org.dasein.cloud.network;

import org.dasein.cloud.Taggable;

import javax.annotation.Nonnull;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@SuppressWarnings("UnusedDeclaration")
public class VpnGateway implements Taggable {
    private String      bgpAsn;
    private VpnGatewayState currentState;
    private String      description;
    private String      endpoint;
    private String      name;
    private VpnProtocol protocol;
    private String      providerOwnerId;
    private String      providerRegionId;
    private String      providerVpnGatewayId;
    private Map<String,String> tags;
    
    public VpnGateway() { }

    public String getBgpAsn() {
        return bgpAsn;
    }

    public void setBgpAsn(String bgpAsn) {
        this.bgpAsn = bgpAsn;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getEndpoint() {
        return endpoint;
    }

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public VpnProtocol getProtocol() {
        return protocol;
    }

    public void setProtocol(VpnProtocol protocol) {
        this.protocol = protocol;
    }

    public String getProviderOwnerId() {
        return providerOwnerId;
    }

    public void setProviderOwnerId(String providerOwnerId) {
        this.providerOwnerId = providerOwnerId;
    }

    public String getProviderRegionId() {
        return providerRegionId;
    }

    public void setProviderRegionId(String providerRegionId) {
        this.providerRegionId = providerRegionId;
    }

    public String getProviderVpnGatewayId() {
        return providerVpnGatewayId;
    }

    public void setProviderVpnGatewayId(String providerVPNGatewayId) {
        this.providerVpnGatewayId = providerVPNGatewayId;
    }

    public @Nonnull Map<String, String> getTags() {
        return (tags == null ? new HashMap<String, String>() : tags);
    }

    public void setTag(@Nonnull String key, @Nonnull String value) {
        if( tags == null ) {
            tags = new HashMap<String, String>();
        }
        tags.put(key, value);
    }

    public void setTags(Map<String, String> tags) {
        this.tags = tags;
    }
    
    public String toString() {
        return (endpoint + " [" + providerOwnerId + "/" + providerVpnGatewayId + "]");
    }

    public VpnGatewayState getCurrentState() {
        return currentState;
    }

    public void setCurrentState(VpnGatewayState currentState) {
        this.currentState = currentState;
    }
}
