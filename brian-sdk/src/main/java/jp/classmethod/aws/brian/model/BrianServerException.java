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
package jp.classmethod.aws.brian.model;

/**
 * Thrown to indicate that any errors occurred in the service while processing the request.
 * 
 * @author daisuke
 * @since 1.0
 */
@SuppressWarnings("serial")
public class BrianServerException extends BrianException {
	
	/**
	 * Constructs a new exception with no detail message.
	 * 
	 * @author daisuke
	 * @since 1.0
	 */
	public BrianServerException() {
		super();
	}
	
	/**
	 * Constructs a new exception with the specified detail message and cause.
	 *
	 * @param message the detail message.
	 * @param cause the cause
	 * @since 1.0
	 */
	public BrianServerException(String message, Throwable cause) {
		super(message, cause);
	}
	
	/**
	 * Constructs a new exception with with the specified detail message.
	 * 
	 * @param message the detail message.
	 * @since 1.0
	 */
	public BrianServerException(String message) {
		super(message);
	}
	
	/**
	 * Constructs a new exception with the specified cause.
	 *
	 * @param  cause the cause
	 * @since 1.0
	 */
	public BrianServerException(Throwable cause) {
		super(cause);
	}
}
