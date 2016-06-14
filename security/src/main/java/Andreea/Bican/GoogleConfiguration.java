package Andreea.Bican;

import org.springframework.boot.autoconfigure.security.oauth2.resource.ResourceServerProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.client.resource.OAuth2ProtectedResourceDetails;
import org.springframework.security.oauth2.client.token.grant.code.AuthorizationCodeResourceDetails;

/**
 * Created by grossb on 6/13/16.
 */
@Configuration
public class GoogleConfiguration
{
    @Bean
    @ConfigurationProperties("google.client")
    OAuth2ProtectedResourceDetails google(){ return new AuthorizationCodeResourceDetails(); }

    @Bean
    @ConfigurationProperties("google.resource")
    ResourceServerProperties googleResource(){ return new ResourceServerProperties(); }


}
