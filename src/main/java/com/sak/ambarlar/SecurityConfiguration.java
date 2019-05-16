package com.sak.ambarlar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.sak.ambarlar.servicesImpl.MyUserDetailsService;


@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

	@Autowired
	private GirisControlConfig successHandler;
	
	@Autowired
	private MyUserDetailsService userDetailsService;

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder());;
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
		.antMatchers("/**/favicon.ico","/css/**","/","/js/**"
					,"/images/**","/webjars/**","/*","/user/*","/form/*","/add/*").permitAll()
		.antMatchers("/login").permitAll()
		.antMatchers("/useryenikayit").permitAll()
		.antMatchers("/musteri/**").hasAnyAuthority("ROLE_PERSONEL","ROLE_MUSTERI","ROLE_PATRON")
		.antMatchers("/patron/**").hasAnyAuthority("ROLE_PERSONEL","ROLE_PATRON")
		.antMatchers("/personel/**").hasAnyAuthority("ROLE_PERSONEL","ROLE_PATRON")
		.anyRequest().authenticated()
		.and()
		.csrf().disable()
		.formLogin().loginPage("/login")
		.failureUrl("/login?error=true")
		.successHandler(successHandler)
		.and()
		.logout().logoutSuccessUrl("/login?logout=true")
		.deleteCookies("remember-me")
		.and()
		.rememberMe().tokenValiditySeconds(180); 
		
	}

	@Bean
	public PasswordEncoder passwordEncoder(){
		PasswordEncoder encoder = new BCryptPasswordEncoder();
		return encoder;
	}
}
