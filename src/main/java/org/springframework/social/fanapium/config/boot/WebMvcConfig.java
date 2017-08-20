package org.springframework.social.fanapium.config.boot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.social.connect.UsersConnectionRepository;
import org.springframework.social.connect.web.thymeleaf.SpringSocialDialect;
import org.springframework.social.fanapium.config.user.UserInterceptor;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.thymeleaf.spring4.SpringTemplateEngine;
import org.thymeleaf.spring4.view.ThymeleafViewResolver;
import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver;
import org.thymeleaf.templateresolver.TemplateResolver;

import javax.inject.Inject;

/**
 * @author hosseini <smh.hosseiny@gmail.com>
 * @since 8/20/17.
 */
@Configuration
@EnableWebMvc
public class WebMvcConfig extends WebMvcConfigurerAdapter {


    @Inject
    private UsersConnectionRepository usersConnectionRepository;

    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new UserInterceptor(usersConnectionRepository));
    }

    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/signin");
        registry.addViewController("/signout");
    }

    @Bean
    public ViewResolver viewResolver(SpringTemplateEngine templateEngine) {
        ThymeleafViewResolver viewResolver = new ThymeleafViewResolver();
        viewResolver.setTemplateEngine(templateEngine);
        return viewResolver;
    }

    @Bean
    public SpringTemplateEngine templateEngine(TemplateResolver templateResolver) {
        SpringTemplateEngine templateEngine = new SpringTemplateEngine();
        templateEngine.setTemplateResolver(templateResolver);
        templateEngine.addDialect(new SpringSocialDialect());
        return templateEngine;
    }

    @Bean
    public TemplateResolver templateResolver() {
        TemplateResolver templateResolver = new ClassLoaderTemplateResolver();
        templateResolver.setPrefix("/views/");
        templateResolver.setSuffix(".html");
        templateResolver.setTemplateMode("HTML5");
        return templateResolver;
    }


}
