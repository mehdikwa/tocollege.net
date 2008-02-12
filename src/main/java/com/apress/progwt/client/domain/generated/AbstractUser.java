/*
 * Copyright 2008 Jeff Dwyer
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.apress.progwt.client.domain.generated;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.apress.progwt.client.domain.Application;
import com.apress.progwt.client.domain.ProcessType;
import com.apress.progwt.client.domain.RatingType;

// Generated Oct 31, 2006 9:16:47 AM by Hibernate Tools 3.1.0.beta5

/**
 * AbstractUser generated by hbm2java
 */
public abstract class AbstractUser implements java.io.Serializable {

    // Fields

    private String email;
    private boolean enabled;
    private long id;
    private int invitations;

    /**
     * don't serialize and pass around the hashed password
     */
    private transient String password;

    private Date dateCreated;

    private List<Application> schoolRankings = new ArrayList<Application>();

    private List<ProcessType> processTypes = new ArrayList<ProcessType>();

    private List<RatingType> ratingTypes = new ArrayList<RatingType>();

    private Map<RatingType, Integer> priorities = new HashMap<RatingType, Integer>();

    private boolean supervisor;

    private String username;
    private String nickname;

    // Constructors

    /** default constructor */
    public AbstractUser() {
    }

    /** full constructor */
    public AbstractUser(String username, String password,
            boolean enabled, boolean supervisor) {
        this.username = username;
        this.password = password;
        this.enabled = enabled;
        this.supervisor = supervisor;
    }

    public boolean equals(Object other) {
        if ((this == other))
            return true;
        if ((other == null))
            return false;
        if (!(other instanceof AbstractUser))
            return false;
        AbstractUser castOther = (AbstractUser) other;

        return ((this.getUsername() == castOther.getUsername()) || (this
                .getUsername() != null
                && castOther.getUsername() != null && this.getUsername()
                .equals(castOther.getUsername())));
    }

    // Property accessors
    public long getId() {
        return this.id;
    }

    public int getInvitations() {
        return invitations;
    }

    public String getPassword() {
        return this.password;
    }

    public String getUsername() {
        return this.username;
    }

    public int hashCode() {
        int result = 17;

        result = 37
                * result
                + (getUsername() == null ? 0 : this.getUsername()
                        .hashCode());

        return result;
    }

    public boolean isEnabled() {
        return this.enabled;
    }

    public boolean isSupervisor() {
        return this.supervisor;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setInvitations(int invitations) {
        this.invitations = invitations;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setSupervisor(boolean supervisor) {
        this.supervisor = supervisor;
    }

    public List<Application> getSchoolRankings() {
        return schoolRankings;
    }

    public void setSchoolRankings(List<Application> schoolRankings) {
        this.schoolRankings = schoolRankings;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public List<ProcessType> getProcessTypes() {
        return processTypes;
    }

    public void setProcessTypes(List<ProcessType> processTypes) {
        this.processTypes = processTypes;
    }

    public List<RatingType> getRatingTypes() {
        return ratingTypes;
    }

    public Map<RatingType, Integer> getPriorities() {
        return priorities;
    }

    public void setPriorities(Map<RatingType, Integer> priorities) {
        this.priorities = priorities;
    }

    public void setRatingTypes(List<RatingType> ratingTypes) {
        this.ratingTypes = ratingTypes;
    }

}
