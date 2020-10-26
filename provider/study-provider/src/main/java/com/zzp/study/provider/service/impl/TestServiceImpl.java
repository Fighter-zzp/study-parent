package com.zzp.study.provider.service.impl;

import com.zzp.study.provider.service.TestService;
import org.springframework.stereotype.Service;

/**
 *
 * <p>
 *  //TODO
 *  TestServiceImpl.java
 * </p>
 * @version v0.0.1
 * @author 佐斯特勒
 * @date 2020/10/26 23:53
 * @see  com.zzp.study.provider.service.impl
 **/
@Service
public class TestServiceImpl implements TestService {
    @Override
    public String printMsg() {
        var sb = new StringBuilder();
        sb.append("<h1>").append("幻界战线 & BEYOND").append("</h1>");
        sb.append("<Strong>").append("简介").append("</Strong>");
        sb.append("<span>").append("曾经被称为纽约的城市，仅仅一晚便消失无踪。\n" +
                "出现在那里的城市“赫尔沙雷姆兹·罗特”。在浓雾的另一侧展开，连结“异世界”与现世的这一地区，变化成了各怀心思的人们所跋扈的“地球上最危险的城市”。\n" +
                "为了保护这座混沌之城的均衡，持续着不为人知的活动的人们。\n" +
                "以使用布雷格利德流血斗术的强硬绅士克劳斯·V·莱因赫兹为首领，面带伤疤的克劳斯的左膀右臂史蒂芬，银发不良扎普·伦弗洛与半人半鱼的齐德，不可视的人狼钱·皇与独眼的淑女K·K。以及拥有“诸神的义眼”的青年雷欧……。\n" +
                "当骚动发生之时，秘密结社·莱布拉必定会现身。\n" +
                "响彻小巷子里的狂乱与邪恶的怪物们。深爱的深渊与不断重复的灾变。不会结束的家常便饭现在再次开幕。\n" +
                "并且，去往更加遥远的Beyond……").append("</span>");
        sb.append("</br>");
        var length = sb.length();
        for (var i =0;i<length;i++){
            sb.append("<i>").append("*").append("</i>");
        }
        return sb.toString();
    }
}
