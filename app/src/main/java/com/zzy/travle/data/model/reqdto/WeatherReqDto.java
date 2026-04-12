package com.zzy.travle.data.model.reqdto;

public class WeatherReqDto {
    private String city;
    private String extensions;
    private String key;
    private String output;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getExtensions() {
        return extensions;
    }

    public void setExtensions(String extensions) {
        this.extensions = extensions;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getOutput() {
        return output;
    }

    public void setOutput(String output) {
        this.output = output;
    }

    @Override
    public String toString() {
        return "WeatherReqDto{" +
                "city='" + city + '\'' +
                ", extensions='" + extensions + '\'' +
                ", key='" + key + '\'' +
                ", output='" + output + '\'' +
                '}';
    }
}
