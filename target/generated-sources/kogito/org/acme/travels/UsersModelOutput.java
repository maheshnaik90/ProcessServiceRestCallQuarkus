/*
 * Copyright 2019 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.acme.travels;

import java.util.Map;
import java.util.HashMap;

@org.kie.kogito.codegen.Generated(value = "kogito-codegen", reference = "users", name = "Users", hidden = true)
public class UsersModelOutput implements org.kie.kogito.Model {

    private String id;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return this.id;
    }

    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> params = new HashMap();
        params.put("traveller", this.traveller);
        params.put("username", this.username);
        return params;
    }

    @Override
    public void fromMap(Map<String, Object> params) {
        fromMap(null, params);
    }

    @Override
    public void update(Map<String, Object> params) {
        fromMap(getId(), params);
    }

    public void fromMap(String id, Map<String, Object> params) {
        this.id = id;
        this.traveller = (org.acme.travels.User) params.get("traveller");
        this.username = (java.lang.String) params.get("username");
    }

    @org.kie.kogito.codegen.VariableInfo(tags = "")
    @com.fasterxml.jackson.annotation.JsonProperty(value = "traveller")
    @javax.validation.Valid()
    private org.acme.travels.User traveller;

    public org.acme.travels.User getTraveller() {
        return traveller;
    }

    public void setTraveller(org.acme.travels.User traveller) {
        this.traveller = traveller;
    }

    @org.kie.kogito.codegen.VariableInfo(tags = "")
    @com.fasterxml.jackson.annotation.JsonProperty(value = "username")
    @javax.validation.Valid()
    private java.lang.String username;

    public java.lang.String getUsername() {
        return username;
    }

    public void setUsername(java.lang.String username) {
        this.username = username;
    }
}
