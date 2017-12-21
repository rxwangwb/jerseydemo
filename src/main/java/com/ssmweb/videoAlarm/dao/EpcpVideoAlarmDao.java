package com.ssmweb.videoAlarm.dao;


import com.ssmweb.videoAlarm.pojo.EpcpVideoAlarm;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EpcpVideoAlarmDao {
    List<EpcpVideoAlarm> selectEpcpVideoAlarms();
}