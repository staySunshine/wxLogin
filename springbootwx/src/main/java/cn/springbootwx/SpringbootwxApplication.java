package cn.springbootwx;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("cn.springbootwx.mapper") //设置mapper接口的扫描包
@SpringBootApplication
public class SpringbootwxApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootwxApplication.class, args);
    }

}
