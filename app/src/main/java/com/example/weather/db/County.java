package com.example.weather.db;

import org.litepal.crud.DataSupport;

//LitePal中的每-一个实体类都是必须要继承自DataSupport类的。
//countyName记录县的名字，weatherId记录县所对应的天气id, cityId 记录当前县所属市的id值。
public class County extends DataSupport {

    private int id;

    private String countyName;

    private String weatherId;

    private int cityId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

}

