package com.spring.security.example.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.token.ResourceServerTokenServices;

@Configuration
@EnableResourceServer
public class ResourceServerConfig extends ResourceServerConfigurerAdapter {
    
    @Autowired
    private ResourceServerTokenServices tokenServices;

    @Value("&{security.jwt.resource-ids}") 
    private String resourceIds;  // Resource authorized
    
    @Override
    public void configure(ResourceServerSecurityConfigurer resources) throws Exception {
        resources.resourceId(resourceIds).tokenServices(tokenServices);
    }

    /**
     * 
     * HttpSecurity for all http requests
     */
    @Override
    public void configure(HttpSecurity http) throws Exception {
        http.requestMatchers() // HttpSecurity to only be invoked when matching
            .and()
            .authorizeRequests()
            .antMatchers("/").permitAll() // Endpoints
            .antMatchers("/security/v1/**").authenticated(); // Set the OAuth2 request filter order to three in properties (based on hardcoded values)
    }
}