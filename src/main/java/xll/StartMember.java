package xll;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * zhengshuai 2018-02-23
 * 启动类
 */
@EnableTransactionManagement(proxyTargetClass = true)
@SpringBootApplication
@ServletComponentScan // 扫描webfilter
public class StartMember {

    public static void main(String []args){
        SpringApplication.run(StartMember.class);
    }


}
