package org.springframework.social.fanapium.config.xml;

import org.springframework.social.config.xml.AbstractProviderConfigBeanDefinitionParser;
import org.springframework.social.fanapium.config.support.FanapiumApiHelper;
import org.springframework.social.fanapium.connect.FanapiumConnectionFactory;
import org.springframework.social.fanapium.security.FanapiumAuthenticationService;
import org.springframework.social.security.provider.SocialAuthenticationService;

public class FanapiumConfigBeanDefinitionParser extends AbstractProviderConfigBeanDefinitionParser {
    protected FanapiumConfigBeanDefinitionParser() {
        super(FanapiumConnectionFactory.class, FanapiumApiHelper.class);
    }

    @Override
    protected Class<? extends SocialAuthenticationService<?>> getAuthenticationServiceClass() {
        return FanapiumAuthenticationService.class;
    }
}
