package com.zzy.travle.data.model.respdto;


import java.util.List;

import java.util.List;

public class WeatherRespDto {
    private String status;
    private String info;
    private String infocode;
    private String count;
    private LifeItem[] lives;          // 实况（保留，不影响）
    private List<Forecast> forecasts;  // 【重点！是数组！】

    // GETTER / SETTER
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getInfocode() {
        return infocode;
    }

    public void setInfocode(String infocode) {
        this.infocode = infocode;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public LifeItem[] getLives() {
        return lives;
    }

    public void setLives(LifeItem[] lives) {
        this.lives = lives;
    }

    public List<Forecast> getForecasts() {
        return forecasts;
    }

    public void setForecasts(List<Forecast> forecasts) {
        this.forecasts = forecasts;
    }

    // ====================== 预报结构（数组里的对象） ======================
    public static class Forecast {
        private String city;
        private String adcode;
        private String province;
        private String reporttime;
        private List<Cast> casts;

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getAdcode() {
            return adcode;
        }

        public void setAdcode(String adcode) {
            this.adcode = adcode;
        }

        public String getProvince() {
            return province;
        }

        public void setProvince(String province) {
            this.province = province;
        }

        public String getReporttime() {
            return reporttime;
        }

        public void setReporttime(String reporttime) {
            this.reporttime = reporttime;
        }

        public List<Cast> getCasts() {
            return casts;
        }

        public void setCasts(List<Cast> casts) {
            this.casts = casts;
        }
    }

    // ====================== 每日天气 ======================
    public static class Cast {
        private String date;
        private String week;
        private String dayweather;
        private String nightweather;
        private String daytemp;
        private String nighttemp;
        private String daywind;
        private String nightwind;
        private String daypower;
        private String nightpower;

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public String getWeek() {
            return week;
        }

        public void setWeek(String week) {
            this.week = week;
        }

        public String getDayweather() {
            return dayweather;
        }

        public void setDayweather(String dayweather) {
            this.dayweather = dayweather;
        }

        public String getNightweather() {
            return nightweather;
        }

        public void setNightweather(String nightweather) {
            this.nightweather = nightweather;
        }

        public String getDaytemp() {
            return daytemp;
        }

        public void setDaytemp(String daytemp) {
            this.daytemp = daytemp;
        }

        public String getNighttemp() {
            return nighttemp;
        }

        public void setNighttemp(String nighttemp) {
            this.nighttemp = nighttemp;
        }

        public String getDaywind() {
            return daywind;
        }

        public void setDaywind(String daywind) {
            this.daywind = daywind;
        }

        public String getNightwind() {
            return nightwind;
        }

        public void setNightwind(String nightwind) {
            this.nightwind = nightwind;
        }

        public String getDaypower() {
            return daypower;
        }

        public void setDaypower(String daypower) {
            this.daypower = daypower;
        }

        public String getNightpower() {
            return nightpower;
        }

        public void setNightpower(String nightpower) {
            this.nightpower = nightpower;
        }
    }

    // ====================== 实况天气（保留不动） ======================
    public static class LifeItem {
        private String province;
        private String city;
        private String adcode;
        private String weather;
        private String temperature;
        private String winddirection;
        private String windpower;
        private String humidity;
        private String reporttime;

        public String getProvince() { return province; }
        public void setProvince(String province) { this.province = province; }
        public String getCity() { return city; }
        public void setCity(String city) { this.city = city; }
        public String getAdcode() { return adcode; }
        public void setAdcode(String adcode) { this.adcode = adcode; }
        public String getWeather() { return weather; }
        public void setWeather(String weather) { this.weather = weather; }
        public String getTemperature() { return temperature; }
        public void setTemperature(String temperature) { this.temperature = temperature; }
        public String getWinddirection() { return winddirection; }
        public void setWinddirection(String winddirection) { this.winddirection = winddirection; }
        public String getWindpower() { return windpower; }
        public void setWindpower(String windpower) { this.windpower = windpower; }
        public String getHumidity() { return humidity; }
        public void setHumidity(String humidity) { this.humidity = humidity; }
        public String getReporttime() { return reporttime; }
        public void setReporttime(String reporttime) { this.reporttime = reporttime; }
    }
}

