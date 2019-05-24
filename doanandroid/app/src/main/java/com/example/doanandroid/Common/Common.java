package com.example.doanandroid.Common;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Common {
    public static String API_KEY="b63c071b32c4c4448c80735b56605b97";
    public static String API_LINK="https://api.openweathermap.org/data/2.5/weather";

    public static String apiRequest(String lat, String lng){
        StringBuilder sb =new StringBuilder(API_LINK);
        sb.append(String.format("?lat=%s&lon=%s&APPID=%s&units-metric",lat,lng,API_KEY));
        return sb.toString();
    }

    public static String unixTimeStaptoDataTime(double unixTimeStamp) {
        DateFormat dateFormat = new SimpleDateFormat("HH:mm");
        Date date =new Date();
        date.setTime((long)unixTimeStamp*100);
        return dateFormat.format(date);

    }

    public static String getImage(String icon){
        return String.format("http://openwathermap.org/img/w/%s.png",icon);

    }
    public static String GetDateNow(){
        DateFormat dateFormat = new SimpleDateFormat("dd MM yyyy HH:mm");
        Date date = new Date();
        return dateFormat.format(date);
    }

}

