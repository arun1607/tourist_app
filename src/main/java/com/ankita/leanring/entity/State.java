package com.ankita.leanring.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.io.Serializable;
import java.util.List;

/**
 * Created by amitshrivastava on 14/01/17.
 */
@Entity
public class State implements Serializable{

    @Id
    @GeneratedValue
    private Long stateId;

    private String stateName;

    private String stateCode;

    @OneToMany(mappedBy = "state")
    private List<City> cityList;

    public Long getStateId() {
        return stateId;
    }

    public void setStateId(Long stateId) {
        this.stateId = stateId;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public String getStateCode() {
        return stateCode;
    }

    public void setStateCode(String stateCode) {
        this.stateCode = stateCode;
    }

    @Override
    public String toString() {
        return "State{" +
                "stateId=" + stateId +
                ", stateName='" + stateName + '\'' +
                ", stateCode='" + stateCode + '\'' +
                '}';
    }
}
