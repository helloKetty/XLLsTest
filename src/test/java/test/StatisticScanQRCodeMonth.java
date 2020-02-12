package test;

import org.springframework.beans.factory.annotation.Autowired;

public class StatisticScanQRCodeMonth /*implements Comparable <StatisticScanQRCodeMonth>*/ {
    String month;

    public StatisticScanQRCodeMonth(String month) {
        this.month=month;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    @Override
    public String toString() {
        return
              month;
    }



//    @Override
//    public int compareTo(StatisticScanQRCodeMonth o) {
//        return Integer.valueOf(this.month)-Integer.valueOf(o.getMonth());
//    }
}
