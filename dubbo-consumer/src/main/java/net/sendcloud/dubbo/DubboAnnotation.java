package net.sendcloud.dubbo;

import net.sendcloud.dubbo.Annotation.ConsumerAnnotationService;
import net.sendcloud.dubbo.configuration.ConsumerConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;

/**
 * @author tangzs
 * @date 2020/7/31
 * @description
 */
public class DubboAnnotation {
    public static void main( String[] args ) throws IOException {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConsumerConfiguration.class);
        context.start(); // 启动
        ConsumerAnnotationService consumerAnnotationService = context.getBean(ConsumerAnnotationService.class);
        // 调用方法
        String hello = consumerAnnotationService.doSayHello("annotation");
        // 输出结果
        System.out.println("result: " + hello);

    }
}
