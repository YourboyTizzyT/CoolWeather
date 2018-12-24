package com.msi.coolweather.gson.air;

/**
 * Created by MSI on 18/12/23.
 */

/**
 *  AQI城市实况
 */
public class AirNowCity {
    public String pub_time;           //	数据发布时间,格式yyyy-MM-dd HH:mm	2017-03-20 12:30
    public String aqi;           //	空气质量指数，AQI和PM25的关系	74
    public String main;           //	主要污染物	pm25
    public String qlty;           //	空气质量，取值范围:优，良，轻度污染，中度污染，重度污染，严重污染，查看计算方式	良
    public String pm10;           //	pm10	78
    public String pm25;           //	pm25	66
    public String no2;           //	二氧化氮	40
    public String so2;           //	二氧化硫	30
    public String co;           //	一氧化碳	33
    public String o3;           //	臭氧	20
}
