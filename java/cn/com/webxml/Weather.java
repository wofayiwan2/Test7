package cn.com.webxml;


import java.util.List;

import cn.com.webxml.ArrayOfString;
import cn.com.webxml.WeatherWS;
import cn.com.webxml.WeatherWSSoap;

public class Weather {

    /**
     * 获取城市信息
     *
     * @param cityname    城市名
     *
     */
    public void getWeather(String cityname) {
        // 创建实例化对象
        WeatherWS weatherWS = new WeatherWS();
        // 通过实例化对象创建接口
        WeatherWSSoap weatherWSSoap = weatherWS.getWeatherWSSoap();
        // 通过接口传入城市名获取天气信息
        ArrayOfString weather = weatherWSSoap.getWeather(cityname, null);
        if (weather != null) {
            // 将获取到的信息转成集合然后遍历
            List<String> weathers = weather.getString();
            weathers.forEach(s -> System.out.println(s));
        }

    }


}
