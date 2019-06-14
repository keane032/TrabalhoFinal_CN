package br.com.ufc.TrabalhoFinal_CN.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter{


	
	@Override
	protected void configure(HttpSecurity http) throws Exception{
		http.csrf().disable().authorizeRequests()
		.antMatchers(HttpMethod.GET, "/refeicao/listar").permitAll()
		.antMatchers(HttpMethod.GET, "/alimentos/atualizar/{id}").hasRole("ADMIN")
		.antMatchers(HttpMethod.GET, "/alimentos/excluir/{id}").hasRole("ADMIN")
		.antMatchers(HttpMethod.POST, "/alimentos/salvar").hasRole("ADMIN")
		
		.antMatchers(HttpMethod.GET, "/refeicao/atualizar/{id}").hasRole("ADMIN")
		.antMatchers(HttpMethod.GET, "/refeicao/excluir/{id}").hasRole("ADMIN")
		.antMatchers(HttpMethod.POST, "/refeicao/salvar").hasRole("ADMIN")
		
		
		
		.antMatchers(HttpMethod.POST, "/cadastrarEvento").hasRole("ADMIN")
		.anyRequest().authenticated()
		.and().logout().logoutRequestMatcher(new AntPathRequestMatcher("/logout"));
	}
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception{
		auth.inMemoryAuthentication().withUser("Admin").password("12345").roles("ADMIN");
		
		
	}

	@Override
	public void configure(WebSecurity web) throws Exception{
		web.ignoring().antMatchers("/materialize/**", "/style/**");
	}
}