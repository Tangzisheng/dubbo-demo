package net.sendcloud.dubbo;

import net.sendcloud.dubbo.configuration.DubboConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;

/**
 * @author tangzs
 * @date 2020/7/31
 * @description
 */
public class DubboAnnotatiom {

    public static void main(String[] args) throws IOException {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DubboConfiguration.class);
        context.start();
        System.in.read();
    }
}
