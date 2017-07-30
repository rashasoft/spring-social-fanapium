package org.springframework.social.fanapium.config.xml;

import org.springframework.social.config.xml.AbstractProviderConfigBeanDefinitionParser;
import org.springframework.social.config.xml.AbstractProviderConfigNamespaceHandler;

public class FanapiumNamespaceHandler extends AbstractProviderConfigNamespaceHandler {
    protected AbstractProviderConfigBeanDefinitionParser getProviderConfigBeanDefinitionParser() {
        return new FanapiumConfigBeanDefinitionParser();
    }
}
