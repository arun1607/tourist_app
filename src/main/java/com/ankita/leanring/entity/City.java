package com.ankita.leanring.entity;

import javax.persistence.*;

/**
 * Created by amitshrivastava on 14/01/17.
 */
@Entity
public class City {

    @Id
    @GeneratedValue
    private Long cityId;

    private String cityName;

    private String cityCode;

    @ManyToOne
    @JoinColumn(name = "state_id")
    private State state;

    public Long getCityId() {
        return cityId;
    }

    public void setCityId(Long cityId) {
        this.cityId = cityId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "City{" +
                "cityId=" + cityId +
                ", cityName='" + cityName + '\'' +
                ", cityCode='" + cityCode + '\'' +
                ", state=" + state +
                '}';
    }
}
