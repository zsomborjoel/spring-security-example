package com.spring.security.example.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;
import org.springframework.security.oauth2.provider.token.TokenEnhancerChain;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.oauth2.provider.token.store.JwtAccessTokenConverter;


@Configuration
@EnableAuthorizationServer
public class AuthorizationServerConfig extends AuthorizationServerConfigurerAdapter { // Switch off auto-configuration and use the custom configuration
    
    @Value("${security.jwt.client-id")
    private String clientId; // Client authorized

    @Value("${security.jwt.client-secret}")
    private String clientSecret; // Client password

    @Value("${security.jwt.grant-type}")
    private String grantType; // Grant type password

    @Value("${security.jwt.scope-read}")
    private String scopeRead; // Access level

    @Value("${security.jwt.scope-write}")
    private String scopeWrite = "write"; // Access level

    @Value("${security.jwt.scope-write}")
    private String resourceIds; // Here and at resource server

    @Autowired
    private TokenStore tokenStore; // In Memory Token Store

    @Autowired
    private JwtAccessTokenConverter accessTokenConverter; // Access Token decoder

    @Autowired
    private AuthenticationManager authenticationManager; // Configuration helper

    @Autowired
    private PasswordEncoder passwordEncoder;
    /**
     * 
     * Configure Authorization
     */
    @Override
    public void configure(ClientDetailsServiceConfigurer configurer) throws Exception { 
        configurer.inMemory() // sessions stored in memory
                    .withClient(clientId) 
                    .secret(passwordEncoder.encode(clientSecret))
                    .authorizedGrantTypes(grantType)
                    .scopes(scopeRead, scopeWrite)
                    .resourceIds(resourceIds);
    }

    @Override
    public void configure(AuthorizationServerEndpointsConfigurer endpoint) throws Exception {
        TokenEnhancerChain enhancerChain = new TokenEnhancerChain(); // Enables multiple types of claims
        enhancerChain.setTokenEnhancers(Arrays.asList(accessTokenConverter)); //  Loops over its delegate enhancers
        endpoint.tokenStore(tokenStore) // Configure the properties and enhanced functionality
                .accessTokenConverter(accessTokenConverter)
                .tokenEnhancer(enhancerChain)
                .authenticationManager(authenticationManager);
    }
}