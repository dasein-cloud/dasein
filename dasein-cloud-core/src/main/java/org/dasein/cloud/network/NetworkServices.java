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

import javax.annotation.Nullable;

public interface NetworkServices {
    public @Nullable DNSSupport getDnsSupport();
    
    public @Nullable FirewallSupport getFirewallSupport();
    
    public @Nullable IpAddressSupport getIpAddressSupport();
    
    public @Nullable LoadBalancerSupport getLoadBalancerSupport();

    public @Nullable NetworkFirewallSupport getNetworkFirewallSupport();

    public @Nullable VLANSupport getVlanSupport();
    
    public @Nullable VpnSupport getVpnSupport();
    
    public boolean hasDnsSupport();
    
    public boolean hasFirewallSupport();
    
    public boolean hasIpAddressSupport();
    
    public boolean hasLoadBalancerSupport();

    public boolean hasNetworkFirewallSupport();

    public boolean hasVlanSupport();
    
    public boolean hasVpnSupport();
}
