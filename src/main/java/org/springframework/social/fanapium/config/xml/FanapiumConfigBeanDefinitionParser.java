package org.springframework.social.fanapium.config.xml;

import org.springframework.social.config.xml.AbstractProviderConfigBeanDefinitionParser;
import org.springframework.social.fanapium.config.support.FanapiumApiHelper;
import org.springframework.social.fanapium.connect.FanapiumConnectionFactory;

public class FanapiumConfigBeanDefinitionParser extends AbstractProviderConfigBeanDefinitionParser {
    protected FanapiumConfigBeanDefinitionParser() {
        super(FanapiumConnectionFactory.class, FanapiumApiHelper.class);
    }
}
