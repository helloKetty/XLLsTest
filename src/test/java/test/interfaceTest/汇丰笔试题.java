package test.interfaceTest;

import org.junit.Test;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class 汇丰笔试题 {
    @Test
    public void race() {
        // System.out.println(15*2+16F*200/60);
        System.out.println(56F * 60 / 200);
       /*
       A 40m/min,B 60m/min;
       200米休息时间2min,
       在追上之前的一个两百米，时差接近但是大于2min,A跑200米4min,B跑两百米3.333分钟
       时差大于0.777就无法在AB都跑的时候追上；
       所以B只会在A等待的时候追上。所以B在跑了整数个200米追上；
       B超过八百米追上：B休息了八分钟，
       A等待时间0-2分钟;
       B少跑了6-8分钟；
       等式20t=800+40*x;t为B的跑步时间总和；x为A多跑的时间,x值域6-8，取8；
       * */
        Float runTime = (800F + 320) / 20;//B除去休息时间收的真实跑步时间；
        Float fRace = (runTime * 60 / 200);//跑了多少个两百米；
        int race = fRace.intValue();//x时间取了最大值；所以需要向上取整；race=16;
        double allTime = (race - 1) * 2 + race * 200F / 60;//总时间等于休息时间，加上跑步时间；
        System.out.println(String.format("%.2f", allTime));
    }
}

