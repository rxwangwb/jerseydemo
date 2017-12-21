package com.ssmweb.videoAlarm.service.impl;

import com.ssmweb.videoAlarm.dao.EpcpVideoAlarmDao;
import com.ssmweb.videoAlarm.pojo.EpcpVideoAlarm;
import com.ssmweb.videoAlarm.service.EpcpVideoAlarmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EpcpVideoAlarmServiceImpl implements EpcpVideoAlarmService {
    @Autowired
    private EpcpVideoAlarmDao videoAlarmDao;
    public List<EpcpVideoAlarm> selectEpcpVideoAlarms() {
        return videoAlarmDao.selectEpcpVideoAlarms();
    }
}
