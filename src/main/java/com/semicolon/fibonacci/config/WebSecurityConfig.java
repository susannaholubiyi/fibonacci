//package com.semicolon.fibonacci.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
////import org.springframework.security.config.annotation.web.builders.HttpSecurity;
////import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
////import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;
////import org.springframework.security.web.SecurityFilterChain;
////import org.springframework.security.web.firewall.HttpFirewall;
////import org.springframework.security.web.firewall.StrictHttpFirewall;
//
//import static org.springframework.security.config.Customizer.withDefaults;
//
//@Configuration
//@EnableWebSecurity
//public class WebSecurityConfig {
//
//    @Bean
//    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//        http
//                .authorizeHttpRequests(authorize -> authorize
//                        .requestMatchers("/swagger-ui/**", "/v3/api-docs/**").permitAll()  // Allow access to Swagger UI
//                        .anyRequest().authenticated()  // Protect all other endpoints
//                )
//                .httpBasic(withDefaults());
//        return http.build();
//    }
//
//    @Bean
//    public HttpFirewall allowSemicolonHttpFirewall() {
//        StrictHttpFirewall firewall = new StrictHttpFirewall();
//        firewall.setAllowSemicolon(true);
//        return firewall;
//    }
//
//    @Bean
//    public WebSecurityCustomizer webSecurityCustomizer() {
//        return (web) -> web.httpFirewall(allowSemicolonHttpFirewall());
//    }
//}
//
