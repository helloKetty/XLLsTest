package test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import xll.StartMember;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.LongAdder;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = StartMember.class)
public class CountdownlatchTest {
    @Test
    public  void countdownmain() {
        {
            ExecutorService executorService = Executors.newCachedThreadPool();
            LongAdder adder=new LongAdder();
            for (int i=0;i<10;i++) {
                executorService.execute(new Runnable() {
                    @Override
                    public void run() {
                        try {
                          System.out.println("hello");
                        } catch (Exception e) {
                        }
                    }
                });
            }
        }
    }
}
