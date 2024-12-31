package com.training.basicspringsecuritydemousingdb.security.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import com.training.basicspringsecuritydemousingdb.service.UserDetailsServiceImpl;

@Configuration
public class SecurityConfig {
	@Autowired
	private UserDetailsServiceImpl userDetailsService;
	public final static String[] PUBLIC_REQUEST_MATCHERS = { "/api/auth/**","/swagger-ui/**","/v3/api-docs/**"};

	
    @Bean
    public AuthenticationManager authenticationManager(AuthenticationConfiguration authConfig) throws Exception {
        return authConfig.getAuthenticationManager();
    }
   
    @Bean
	public DaoAuthenticationProvider authenticationProvider() {
		DaoAuthenticationProvider authProvider = new DaoAuthenticationProvider();

		authProvider.setUserDetailsService(userDetailsService);
		authProvider.setPasswordEncoder(passwordEncoder());

		return authProvider;
	}
    
	@Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            // Authorize requests
            .authorizeHttpRequests(authorize -> authorize
            	.requestMatchers("/greet").hasRole("USER")
            	.requestMatchers("/admingreet").hasRole("ADMIN")
            	.requestMatchers(PUBLIC_REQUEST_MATCHERS).permitAll()
               // .anyRequest().authenticated()
            )
            // Enable HTTP Basic Authentication
            .httpBasic(Customizer.withDefaults())
            // Disable CSRF for simplicity (not recommended for production)
            .csrf(csrf -> csrf.disable());

        return http.build();
    }

	/*
	 * @Bean public UserDetailsService userDetailsService(PasswordEncoder
	 * passwordEncoder) { // Define in-memory users InMemoryUserDetailsManager
	 * manager = new InMemoryUserDetailsManager();
	 * manager.createUser(User.withUsername("user")
	 * .password(passwordEncoder.encode("password")) .roles("USER") .build());
	 * manager.createUser(User.withUsername("admin")
	 * .password(passwordEncoder.encode("admin")) .roles("ADMIN") .build()); return
	 * manager; }
	 */
    @Bean
    public PasswordEncoder passwordEncoder() {
        // Use BCrypt password encoder
        return new BCryptPasswordEncoder();
    }
   
    
}

