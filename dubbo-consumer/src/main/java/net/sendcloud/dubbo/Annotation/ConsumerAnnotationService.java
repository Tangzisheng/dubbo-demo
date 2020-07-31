package net.sendcloud.dubbo.Annotation;

import com.alibaba.dubbo.config.annotation.Reference;
import net.sendcloud.dubbo.service.annotation.ProviderServiceAnnotation;
import org.springframework.stereotype.Component;

/**
 * @author tangzs
 * @date 2020/7/31
 * @description
 */
@Component("annotatedConsumer")
public class ConsumerAnnotationService {

    @Reference
    private ProviderServiceAnnotation providerServiceAnnotation;

    public String doSayHello(String name) {
        return providerServiceAnnotation.SayHelloAnnotation(name);
    }
}
