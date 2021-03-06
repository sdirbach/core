/*
 * Copyright 2013 Red Hat Inc. and/or its affiliates and other contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,  
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.switchyard.runtime.event;

import java.util.EventObject;

import org.switchyard.Exchange;

/**
 * Fired when an exchange is containing the request is being dispatched for processing. 
 * For InOnly and InOut exchanges, this event fires before
 * the in message has been processed.  
 */
public class ExchangeInitiatedEvent extends EventObject {   
    /**
     * Exchange property name used to timestamp the initiation of a dispatched exchange.
     */
    public static final String EXCHANGE_INITIATED_TIME = "org.switchyard.exchangeInitiatedNS";
    private static final long serialVersionUID = 1L;
    
    /**
     * Create a new ExchangeInitiatedEvent.
     * @param exchange the exchange to be initiated
     */
    public ExchangeInitiatedEvent(Exchange exchange) {
        super(exchange);
    }

    /**
     * Gets the initiated exchange.
     * @return the initiated exchange
     */
    public Exchange getExchange() {
        return (Exchange)getSource();
    }
}
