package com.zzy.travle.data.model.vo;

public class WeatherVO {
    private String city;
    private int currentTemp;
    private int maxTemp;
    private int minTemp;
    private String weatherDesc;
    private String weatherIcon;

    public WeatherVO(String city, int currentTemp, int maxTemp, int minTemp, String weatherDesc, String weatherIcon) {
        this.city = city;
        this.currentTemp = currentTemp;
        this.maxTemp = maxTemp;
        this.minTemp = minTemp;
        this.weatherDesc = weatherDesc;
        this.weatherIcon = weatherIcon;
    }

    public String getCity() {
        return city;
    }

    public int getCurrentTemp() {
        return currentTemp;
    }

    public int getMaxTemp() {
        return maxTemp;
    }

    public int getMinTemp() {
        return minTemp;
    }

    public String getWeatherDesc() {
        return weatherDesc;
    }

    public String getWeatherIcon() {
        return weatherIcon;
    }

    @Override
    public String toString() {
        return "WeatherVO{" +
                "city='" + city + '\'' +
                ", currentTemp=" + currentTemp +
                ", maxTemp=" + maxTemp +
                ", minTemp=" + minTemp +
                ", weatherDesc='" + weatherDesc + '\'' +
                ", weatherIcon='" + weatherIcon + '\'' +
                '}';
    }
}
