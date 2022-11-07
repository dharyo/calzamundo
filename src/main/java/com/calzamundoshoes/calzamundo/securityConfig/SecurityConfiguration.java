/*
 * package com.calzamundoshoes.calzamundo.securityConfig;
 * 
 * import org.springframework.beans.factory.annotation.*;
 * import org.springframework.context.annotation.*;
 * import
 * org.springframework.security.authentication.dao.DaoAuthenticationProvider;
 * import
 * org.springframework.security.config.annotation.authentication.builders.
 * AuthenticationManagerBuilder;
 * import org.springframework.security.config.annotation.web.*;
 * import
 * org.springframework.security.config.annotation.web.builders.HttpSecurity;
 * import com.calzamundoshoes.calzamundo.service.*;
 * 
 * import org.springframework.security.config.annotation.web.configuration.
 * EnableWebSecurity;
 * import org.springframework.security.config.annotation.web.configuration.
 * WebSecurityConfigurerAdapter;
 * import org.springframework.security.crypto.password.PasswordEncoder;
 * import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
 * 
 * @Configuration
 * 
 * @EnableWebSecurity
 * public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
 * 
 * @Autowired
 * private UserService userService;
 * 
 * @Bean
 * public DaoAuthenticationProvider authenticationProvider() {
 * DaoAuthenticationProvider auth = new DaoAuthenticationProvider();
 * auth.setUserDetailsService(userService);
 * // auth.setPasswordEncoder(passwordEncoder());
 * return auth;
 * }
 * 
 * @Override
 * protected void configure(AuthenticationManagerBuilder auth) throws Exception
 * {
 * auth.authenticationProvider(authenticationProvider());
 * }
 * 
 * @Override
 * protected void configure(HttpSecurity http) throws Exception {
 * http.authorizeRequests().antMatchers(
 * "/js/**",
 * "/css/**",
 * "/html/**",
 * "/img/**")
 * .permitAll()
 * .anyRequest()
 * .authenticated()
 * .and()
 * .formLogin()
 * .loginPage("/login")
 * .permitAll()
 * .and()
 * .logout()
 * .invalidateHttpSession(true)
 * .clearAuthentication(true)
 * .logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
 * .logoutSuccessUrl("/login?logout")
 * .permitAll();
 * }
 * 
 * }
 */