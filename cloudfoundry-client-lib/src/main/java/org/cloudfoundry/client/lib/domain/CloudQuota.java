/*
 * Copyright 2009-2014 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.cloudfoundry.client.lib.domain;

/**
 * 
 * @author Harry Zhang
 *
 */
public class CloudQuota extends CloudEntity {

    private boolean non_basic_services_allowed = false;

    public CloudQuota(Meta meta, String name,
            boolean non_basic_services_allowed, int total_services,
            int total_routes, long memory_limit) {
        super(meta, name);
        this.non_basic_services_allowed = non_basic_services_allowed;

    }
    public boolean isNon_basic_services_allowed() {
        return non_basic_services_allowed;
    }

}