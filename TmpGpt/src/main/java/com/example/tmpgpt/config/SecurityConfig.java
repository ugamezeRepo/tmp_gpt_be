package com.example.tmpgpt.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.reactive.CorsConfigurationSource;
import org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource;
import java.util.Arrays;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity)
        throws Exception {
        // whiteList
        String[] whiteList = {
            "/", "css/**", "js/**", "img/**", "/api/**", "api/**"
        };

        return httpSecurity
            .cors(cors -> cors.disable()
            ).csrf(csrf -> csrf.disable()
            ).headers(headers -> headers.frameOptions(options -> options.disable())
            ).sessionManagement(sm -> sm.sessionCreationPolicy(SessionCreationPolicy.STATELESS)
            ).authorizeHttpRequests(config -> config
                    .requestMatchers(whiteList).permitAll()
                    .anyRequest().permitAll()
            ).exceptionHandling(config -> config
                    .accessDeniedPage("/user/denied")
            ).build();
    }
    
    @Bean
    CorsConfigurationSource corsConfigurationSource() {
        CorsConfiguration configuration = new CorsConfiguration();
        configuration.setAllowedOrigins(Arrays.asList("*"));
        configuration.setAllowedMethods(Arrays.asList("*"));
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", configuration);
        return source;
    }
    


}