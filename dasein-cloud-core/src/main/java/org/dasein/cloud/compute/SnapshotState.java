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

public enum SnapshotState {
    /**
     * The snapshot has been request and is in process.
     */
    PENDING, 
    /**
     * The snapshot is ready for use.
     */
    AVAILABLE,
    /**
     * The snapshot has been deleted.
     */
    DELETED,
    /**
     * The snapshot is in an error state.
     */
    ERROR;
}
