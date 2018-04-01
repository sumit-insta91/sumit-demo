package xyz;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
@Configurable
public class MyConfigu  extends WebSecurityConfigurerAdapter{

	/*@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception{
		auth.inMemoryAuthentication().withUser("sumit").password("playJava").roles("USER");
	}*/
	
	
	@Override
	protected void configure(HttpSecurity httpSecurity) throws Exception {
		httpSecurity.authorizeRequests().anyRequest().permitAll().and().httpBasic();
//		httpSecurity.authorizeRequests().anyRequest().fullyAuthenticated();
		httpSecurity.csrf().disable();
	}
}
