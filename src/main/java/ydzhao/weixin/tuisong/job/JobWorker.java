package ydzhao.weixin.tuisong.job;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import ydzhao.weixin.tuisong.util.Pusher;

/**
 *@ClassName JobWorker
 *@Description TODO
 *@Author ydzhao
 *@Date 2022/8/2 16:00
 */
@Component
public class JobWorker {
    //要推送的用户openid
    private static String openId1 = "oFpOC6nddOwDOmoqhhw6x0Ggaj3M";
    private static String openId2 = "oFpOC6heSYYtdktByIggk0I8mKco";

    @Scheduled(cron = "0 25 20 * * ?")
    public void goodMorning(){
        Pusher.push(openId1);
        Pusher.push(openId2);
    }

}
