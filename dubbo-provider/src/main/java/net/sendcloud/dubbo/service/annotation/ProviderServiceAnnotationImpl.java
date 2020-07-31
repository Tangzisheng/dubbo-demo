package net.sendcloud.dubbo.service.annotation;

import com.alibaba.dubbo.config.annotation.Service;

/**
 * @author tangzs
 * @date 2020/7/31
 * @description
 */
@Service(timeout = 5000)
public class ProviderServiceAnnotationImpl implements ProviderServiceAnnotation {

    @Override
    public String SayHelloAnnotation(String word) {
        return word;
    }
}
