/*
 * JBoss, Home of Professional Open Source
 * Copyright 2013, Red Hat, Inc. and/or its affiliates, and individual
 * contributors by the @authors tag. See the copyright.txt in the
 * distribution for a full listing of individual contributors.
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
package org.switchyard.quickstarts.transform.dozer;

public class OrderAck {

    private String _orderId;
    private boolean _accepted;
    private String _statusDescription;

    public String getOrderId() {
        return _orderId;
    }

    public boolean isAccepted() {
        return _accepted;
    }

    public String getStatusDescription() {
        return _statusDescription;
    }

    public void setOrderId(String orderId) {
        _orderId = orderId;
    }

    public void setStatusDescription(String status) {
        _statusDescription = status;
    }

    public void setAccepted(boolean accepted) {
        _accepted = accepted;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrderAck)) {
            return false;
        }

        OrderAck orderAck = (OrderAck) obj;
        return (orderAck.isAccepted() == isAccepted())
            && (orderAck.getStatusDescription().equals(getStatusDescription())
            && (orderAck.getOrderId().equals(getOrderId())));
    }
}
