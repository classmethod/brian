/*
 * Copyright 2013-2014 Classmethod, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package jp.classmethod.aws.brian;

import java.util.List;
import java.util.Optional;

import jp.classmethod.aws.brian.model.BrianClientException;
import jp.classmethod.aws.brian.model.BrianServerException;
import jp.classmethod.aws.brian.model.BrianTrigger;
import jp.classmethod.aws.brian.model.CreateTriggerResult;
import jp.classmethod.aws.brian.model.TriggerKey;
import jp.classmethod.aws.brian.model.UpdateTriggerResult;

/**
 * Provides an interface for accessing the Brian service.
 * 
 * @author daisuke
 * @since 1.0
 */
public interface Brian {
	
	/**
	 * Check availability of the Brian service.
	 * 
	 * @return {@code true} if the Brian service is available, {@code false} otherwise
	 */
	boolean isAvailable();
	
	/**
	 * Returns a list of trigger group names.
	 * 
	 * @return list of trigger group names
	 * @throws BrianClientException If any errors are encountered in the client while making the request or handling the response.
	 * @throws BrianServerException If any errors occurred in the service while processing the request.
	 */
	List<String> listTriggerGroups() throws BrianClientException, BrianServerException;
	
	/**
	 * Returns a list of trigger names in the group.
	 * 
	 * @param group group name
	 * @return list of trigger names
	 * @throws BrianClientException If any errors are encountered in the client while making the request or handling the response.
	 * @throws BrianServerException If any errors occurred in the service while processing the request.
	 */
	List<String> listTriggers(String group) throws BrianClientException, BrianServerException;
	
	/**
	 * Create trigger.
	 * 
	 * @param trigger trigger to create
	 * @return the result of create trigger action
	 * @throws BrianClientException conflict - already exist same name trigger
	 * @throws BrianClientException If any errors are encountered in the client while making the request or handling the response.
	 * @throws BrianServerException If any errors occurred in the service while processing the request.
	 */
	CreateTriggerResult createTrigger(BrianTrigger trigger) throws BrianClientException, BrianServerException;
	
	/**
	 * Update existing trigger.
	 * 
	 * @param trigger trigger to update
	 * @return the result of update trigger action
	 * @throws BrianClientException not found - trigger to update not found
	 * @throws BrianClientException If any errors are encountered in the client while making the request or handling the response.
	 * @throws BrianServerException If any errors occurred in the service while processing the request.
	 */
	UpdateTriggerResult updateTrigger(BrianTrigger trigger) throws BrianClientException, BrianServerException;
	
	/**
	 * Describe existing trigger.
	 * 
	 * @param key trigger key to describe
	 * @return the trigger
	 * @throws BrianClientException not found - trigger to update not found
	 * @throws BrianClientException If any errors are encountered in the client while making the request or handling the response.
	 * @throws BrianServerException If any errors occurred in the service while processing the request.
	 */
	Optional<BrianTrigger> describeTrigger(TriggerKey key) throws BrianClientException, BrianServerException;
	
	/**
	 * Delete trigger.
	 * 
	 * @param key treigger key to delete
	 * @throws BrianClientException not found - trigger to update not found
	 * @throws BrianClientException If any errors are encountered in the client while making the request or handling the response.
	 * @throws BrianServerException If any errors occurred in the service while processing the request.
	 */
	void deleteTrigger(TriggerKey key) throws BrianClientException, BrianServerException;
	
	/**
	 * Force fire trigger.
	 * 
	 * @param key trigger key to force fire
	 * @throws BrianClientException not found - trigger to update not found
	 * @throws BrianClientException If any errors are encountered in the client while making the request or handling the response.
	 * @throws BrianServerException If any errors occurred in the service while processing the request.
	 */
	void forceFireTrigger(TriggerKey key) throws BrianClientException, BrianServerException;
	
}
