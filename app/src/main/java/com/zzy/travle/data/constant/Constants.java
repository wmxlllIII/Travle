package com.zzy.travle.data.constant;

public class Constants {
    public static final String BASE_URL = "http://139.199.70.159:8099";
    /**
     * 沈阳市
     * adcode 210100
     * citycode 024
     *
     * "https://restapi.amap.com/v3/weather/weatherInfo?city=024&extensions=all&output=JSON&key=d03bfdcfca5af8073f7d641502391ab4"
     *
     *
     * {
     *     "status": "1",
     *     "count": "1",
     *     "info": "OK",
     *     "infocode": "10000",
     *     "lives": [
     *         {
     *             "province": "辽宁",
     *             "city": "沈阳市",
     *             "adcode": "210100",
     *             "weather": "多云",
     *             "temperature": "18",
     *             "winddirection": "北",
     *             "windpower": "≤3",
     *             "humidity": "25",
     *             "reporttime": "2026-04-12 18:31:56",
     *             "temperature_float": "18.0",
     *             "humidity_float": "25.0"
     *         }
     *     ]
     * }
     */
    public static final String AMAP_BASE_URL = "https://restapi.amap.com/";
    public static final String AMAP_WEATHER_KEY = "d03bfdcfca5af8073f7d641502391ab4";
    public static final String SHENYANG_CITY_CODE = "210100";
}
