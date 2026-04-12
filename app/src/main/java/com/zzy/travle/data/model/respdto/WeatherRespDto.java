package com.zzy.travle.data.model.respdto;


public class WeatherRespDto {
    private String status;
    private String info;
    private String infocode;
    private String count;
    private LifeItem[] lives;

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

    @Override
    public String toString() {
        return "AmapWeatherRespDto{" +
                "status='" + status + '\'' +
                ", info='" + info + '\'' +
                ", infocode='" + infocode + '\'' +
                ", count='" + count + '\'' +
                ", lives=" + (lives != null ? lives.length : 0) +
                '}';
    }

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

        public String getProvince() {
            return province;
        }

        public void setProvince(String province) {
            this.province = province;
        }

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

        public String getWeather() {
            return weather;
        }

        public void setWeather(String weather) {
            this.weather = weather;
        }

        public String getTemperature() {
            return temperature;
        }

        public void setTemperature(String temperature) {
            this.temperature = temperature;
        }

        public String getWinddirection() {
            return winddirection;
        }

        public void setWinddirection(String winddirection) {
            this.winddirection = winddirection;
        }

        public String getWindpower() {
            return windpower;
        }

        public void setWindpower(String windpower) {
            this.windpower = windpower;
        }

        public String getHumidity() {
            return humidity;
        }

        public void setHumidity(String humidity) {
            this.humidity = humidity;
        }

        public String getReporttime() {
            return reporttime;
        }

        public void setReporttime(String reporttime) {
            this.reporttime = reporttime;
        }

        @Override
        public String toString() {
            return "LifeItem{" +
                    "province='" + province + '\'' +
                    ", city='" + city + '\'' +
                    ", adcode='" + adcode + '\'' +
                    ", weather='" + weather + '\'' +
                    ", temperature='" + temperature + '\'' +
                    ", winddirection='" + winddirection + '\'' +
                    ", windpower='" + windpower + '\'' +
                    ", humidity='" + humidity + '\'' +
                    ", reporttime='" + reporttime + '\'' +
                    '}';
        }
    }
}

