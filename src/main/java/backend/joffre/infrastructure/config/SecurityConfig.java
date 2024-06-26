package backend.joffre.infrastructure.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.HeadersConfigurer.FrameOptionsConfig;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;
import static org.springframework.security.config.Customizer.withDefaults;

import org.springframework.boot.autoconfigure.security.oauth2.resource.servlet.OAuth2ResourceServerAutoConfiguration;




@Configuration
public class SecurityConfig {

	@Bean
	SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		http.authorizeHttpRequests((authHttp) -> authHttp
				.requestMatchers(HttpMethod.GET,"/authorized").permitAll()
				.requestMatchers(HttpMethod.GET,"/h2-ui/**").permitAll().anyRequest().authenticated()
				.requestMatchers(HttpMethod.GET, "/list").hasAnyAuthority("SCOPE_read","SCOPE_write")
				.requestMatchers(HttpMethod.POST, "/create").hasAuthority("SCOPE_write")
				.anyRequest().authenticated())
				.csrf(csrf ->csrf.disable())
				.sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
				.oauth2Login(login -> login.loginPage("/oauth2/authorization/client-app"))
				.oauth2Client(withDefaults())
				.oauth2ResourceServer(resourceServer -> resourceServer.jwt(withDefaults()));
		http.csrf(csrf -> csrf
	            .ignoringRequestMatchers( "/h2-ui")
	            .disable());
		http.headers(headers -> headers.frameOptions(FrameOptionsConfig::disable));
				return http.build();				
				
	}
	
}
