package net.sendcloud.dubbo.service.impl;

import net.sendcloud.dubbo.service.ProviderService;

/**
 * @author tangzs
 * @date 2020/7/30
 * @description
 */
public class ProviderServiceImpl implements ProviderService {

    @Override
    public String sayHello(String word) {
        return word;
    }
}
