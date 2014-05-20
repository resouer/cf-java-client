/*
 * Copyright 2014-2017 the original author or authors.
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

    private boolean nonBasicServicesAllowed = false;
    private int totalServices;
    private int totalRoutes;
    private long memoryLimit;

    public CloudQuota(Meta meta, String name, boolean nonBasicServicesAllowed,
            int totalServices, int totalRoutes, long memoryLimit) {
        super(meta, name);
        this.totalServices=totalServices;
        this.totalRoutes=totalRoutes;
        this.memoryLimit=memoryLimit;
        this.nonBasicServicesAllowed = nonBasicServicesAllowed;

    }
    /**
     * Default value :"memory_limit":0,"total_routes":0,"total_services":0,"non_basic_services_allowed":false
     * 
     * @param meta
     * @param name
     */
    public CloudQuota(Meta meta, String name){
    	super(meta, name);
    }

	public int getTotalServices() {
		return totalServices;
	}

	public void setTotalServices(int totalServices) {
		this.totalServices = totalServices;
	}

	public int getTotalRoutes() {
		return totalRoutes;
	}

	public void setTotalRoutes(int totalRoutes) {
		this.totalRoutes = totalRoutes;
	}

	public long getMemoryLimit() {
		return memoryLimit;
	}

	public void setMemoryLimit(long memoryLimit) {
		this.memoryLimit = memoryLimit;
	}

	public void setNonBasicServicesAllowed(boolean nonBasicServicesAllowed) {
		this.nonBasicServicesAllowed = nonBasicServicesAllowed;
	}
	
	 public boolean isNonBasicServicesAllowed() {
	        return nonBasicServicesAllowed;
	    }
    

}
