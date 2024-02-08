package com.example.tmpgpt.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;
import static org.springframework.security.config.Customizer.withDefaults;

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
            .cors(cors -> cors.and()
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
    


}