package com.ssmweb.videoAlarm.service;


import com.ssmweb.videoAlarm.pojo.EpcpVideoAlarm;

import java.util.List;

public interface EpcpVideoAlarmService {
    List<EpcpVideoAlarm> selectEpcpVideoAlarms();
}
