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

package org.dasein.cloud.compute;

/**
 * <p>
 * The various possible states in which a server can exist. Implementors should do their best to
 * map cloud-specific states to these states.
 * </p>
 * @author George Reese @ enstratius (http://www.enstratius.com)
 */
public enum VmState {
    /**
     * The server is in an error state, and unlikely to be operational.
     */
    ERROR,
    /**
     * The server is paused with its CPU not scheduled to run, but it is still in operational memory.
     */
    PAUSED,
    /**
     * The virtual machine is in the process of being paused.
     */
    PAUSING,
    /**
     * The virtual machine is in a transitional state between known states, generally from {@link #STOPPED} to {@link #RUNNING}.
     */
    PENDING,
    /**
     * The server is fully operational as far as we know.
     */
    RUNNING,
    /**
     * The server is currently in the middle of a reboot and should be operational shortly.
     */
    REBOOTING,
    /**
     * The virtual machine is currently in a stopped state with no current state information stored anywhere.
     */
    STOPPED,
    /**
     * The server is currently being stopped.
     */
    STOPPING,
    /**
     * The virtual machine is currently suspended to disk and otherwise non-operational.
     */
    SUSPENDED,
    /**
     * The virtual machine is in the process of being suspended to disk.
     */
    SUSPENDING,
    /**
     * The server has been terminated and is thus entirely useless and all state information is lost.
     */
    TERMINATED
}
