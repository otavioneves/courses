package br.com.otavio.mvc.mudi;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	private DataSource dataSource;

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
		.authorizeRequests()
		.antMatchers("/home/**")
		.permitAll()
		.anyRequest()
		.authenticated()
		.and()
		.formLogin(form -> form
				.loginPage("/login")
				.defaultSuccessUrl("/usuario/pedido", true)
				.permitAll()
		)
		.logout(logout -> {
			logout.logoutUrl("/logout")
			.logoutSuccessUrl("/home");
		});
//		http
//		.authorizeRequests()
//        .antMatchers("/", "/home").permitAll()
//        .anyRequest().authenticated()
//        .and()
//        .formLogin()
//        .loginPage("/login")
//        .defaultSuccessUrl("/role")
//        .permitAll()
//        .and()
//        .logout()
//        .permitAll();
	}

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {

		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

//		Criacao de login:
//		UserDetails user = User.builder().username("carol").password(encoder.encode("carol")).roles("ADM").build();
//
//		auth.jdbcAuthentication().dataSource(dataSource).passwordEncoder(encoder).withUser(user);
		
		auth.jdbcAuthentication().dataSource(dataSource).passwordEncoder(encoder);

	}

//	@Bean
//	@Override
//	public UserDetailsService userDetailsService() {
//		UserDetails user = User.withDefaultPasswordEncoder().username("ota1234").password("jp1234").roles("ADM").build();
//
//		return new InMemoryUserDetailsManager(user);
//	}

}
