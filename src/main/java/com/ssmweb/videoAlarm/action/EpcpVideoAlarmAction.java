package com.ssmweb.videoAlarm.action;

import com.ssmweb.videoAlarm.pojo.EpcpVideoAlarm;
import com.ssmweb.videoAlarm.service.EpcpVideoAlarmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class EpcpVideoAlarmAction {
    @Autowired
    private EpcpVideoAlarmService videoAlarmService;

    public String selectEpcpVideoAlarms() {
        System.out.println("selectEpcpVideoAlarms" + "++++++++++++++");
        List<EpcpVideoAlarm> videoAlarmList = videoAlarmService.selectEpcpVideoAlarms();
        System.out.println(videoAlarmList.size());
        return "SUCCESS";
    }
}
