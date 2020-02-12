package test;

import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;

public class A {
    @Test
    public  void ei(){
        List <StatisticScanQRCodeMonth>monthRecordList=new ArrayList();
        monthRecordList.add(new StatisticScanQRCodeMonth("10"));
        monthRecordList.add(new StatisticScanQRCodeMonth("5"));
        monthRecordList.add(new StatisticScanQRCodeMonth("6"));
        monthRecordList.add(new StatisticScanQRCodeMonth("7"));
        monthRecordList.add(new StatisticScanQRCodeMonth("8"));
        monthRecordList.add(new StatisticScanQRCodeMonth("9"));
        //List <StatisticScanQRCodeMonth>list= monthRecordList.stream().sorted().collect(Collectors.toList());
        Collections.sort(monthRecordList, (l, r) -> {
            return Integer.parseInt(r.getMonth())-Integer.parseInt(l.getMonth());
        });
        //monthRecordList.stream().sorted()
        System.out.println(monthRecordList);

    }
}
