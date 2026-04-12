package com.zzy.travle.data.model.dos;

public class WeatherInfoDO {
    private String city;
    private int currentTemp;
    private int maxTemp;
    private int minTemp;
    private String weatherDesc;
    private String weatherIcon;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getCurrentTemp() {
        return currentTemp;
    }

    public void setCurrentTemp(int currentTemp) {
        this.currentTemp = currentTemp;
    }

    public int getMaxTemp() {
        return maxTemp;
    }

    public void setMaxTemp(int maxTemp) {
        this.maxTemp = maxTemp;
    }

    public int getMinTemp() {
        return minTemp;
    }

    public void setMinTemp(int minTemp) {
        this.minTemp = minTemp;
    }

    public String getWeatherDesc() {
        return weatherDesc;
    }

    public void setWeatherDesc(String weatherDesc) {
        this.weatherDesc = weatherDesc;
    }

    public String getWeatherIcon() {
        return weatherIcon;
    }

    public void setWeatherIcon(String weatherIcon) {
        this.weatherIcon = weatherIcon;
    }

    @Override
    public String toString() {
        return "WeatherInfoDO{" +
                "city='" + city + '\'' +
                ", currentTemp=" + currentTemp +
                ", maxTemp=" + maxTemp +
                ", minTemp=" + minTemp +
                ", weatherDesc='" + weatherDesc + '\'' +
                ", weatherIcon='" + weatherIcon + '\'' +
                '}';
    }
}
