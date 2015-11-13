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

/**
 * Represents an established connection between a cloud VPN and a customer gateway.
 * <p>Created by George Reese: 6/26/12 1:29 PM</p>
 * @author George Reese (george.reese@imaginary.com)
 * @since 2012-07
 * @version 2012-07 initial version
 */
@SuppressWarnings("UnusedDeclaration")
public class VpnConnection {
    private String      configurationXml;
    private VpnConnectionState currentState;
    private VpnProtocol protocol;
    private String      providerGatewayId;
    private String      providerVpnId;
    private String      providerVpnConnectionId;

    public VpnConnection() { }
    
    public String getConfigurationXml() {
        return configurationXml;
    }

    public void setConfigurationXml(String configurationXml) {
        this.configurationXml = configurationXml;
    }

    public VpnConnectionState getCurrentState() {
        return currentState;
    }

    public void setCurrentState(VpnConnectionState currentState) {
        this.currentState = currentState;
    }

    public VpnProtocol getProtocol() {
        return protocol;
    }

    public void setProtocol(VpnProtocol protocol) {
        this.protocol = protocol;
    }

    public String getProviderGatewayId() {
        return providerGatewayId;
    }

    public void setProviderGatewayId(String providerGatewayId) {
        this.providerGatewayId = providerGatewayId;
    }

    public String getProviderVpnId() {
        return providerVpnId;
    }

    public void setProviderVpnId(String providerVpnId) {
        this.providerVpnId = providerVpnId;
    }

    public String getProviderVpnConnectionId() {
        return providerVpnConnectionId;
    }

    public void setProviderVpnConnectionId(String vpnConnectionId) {
        this.providerVpnConnectionId = vpnConnectionId;
    }
    
    public String toString() {
        return (providerVpnId + " -> " + providerGatewayId);
    }
}
