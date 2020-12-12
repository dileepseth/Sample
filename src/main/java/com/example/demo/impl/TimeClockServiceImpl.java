package com.example.demo.impl;

import com.example.demo.face.*;
import org.springframework.stereotype.Service;

@Service
public class TimeClockServiceImpl implements TimeClockService {
    public int getAngle(String time){
        String splitTime[] = time.split(":");
        int hour =Integer.valueOf(splitTime[0]);
        int min = Integer.valueOf(splitTime[1]);
        int hourPosition = (hour * 360) / 12 + (min * 360) / (12 * 60);
        int minutePosition = (min * 360) / (60);
        int angle = Math.abs(hourPosition - minutePosition);

        if (angle > 180) {
            angle = 360 - angle;
        }

        return angle;
    }
}
