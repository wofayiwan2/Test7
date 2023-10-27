package cn.com.webxml;


import cn.com.webxml.Weather;

import java.util.Scanner;

/**
 *测试类
 * @author 韩卓远
 * 202131044119
 * 西柚天气预测系统
 *
 */
public class Test {
    public static void main(String[] args) {
        Weather weather=new Weather();
        Scanner scanner=new Scanner(System.in);
        String city=scanner.nextLine();
        weather.getWeather(city);
    }
}