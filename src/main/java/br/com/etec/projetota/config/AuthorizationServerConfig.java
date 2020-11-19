package br.com.etec.projetota.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.oauth2.provider.token.store.JwtAccessTokenConverter;
import org.springframework.security.oauth2.provider.token.store.JwtTokenStore;

@Configuration
@EnableAuthorizationServer
public class AuthorizationServerConfig extends AuthorizationServerConfigurerAdapter {
	
	@Autowired
	private AuthenticationManager authManager;
	
	

	@Override
	public void configure(ClientDetailsServiceConfigurer clientDSC) throws Exception {
		clientDSC.inMemory().withClient("etec").secret("@Etec244").scopes("read", "write")
				.authorizedGrantTypes("password").accessTokenValiditySeconds(1800);
	}
	
	@Override
	public void configure(AuthorizationServerEndpointsConfigurer endPoints) throws Exception {
	  endPoints.tokenStore(tokenStore())
	  .accessTokenConverter(accessTokenConverter())
	  .authenticationManager(authManager);
	}

	@Bean
	public JwtAccessTokenConverter accessTokenConverter() {
		JwtAccessTokenConverter jwtConverter = new JwtAccessTokenConverter();
		jwtConverter.setSigningKey("chaveetec");
		return jwtConverter;
	}

	@Bean
	public TokenStore tokenStore() {
		return new JwtTokenStore(accessTokenConverter());
	}
	
	/*
	 *  localhost:8080/oauth/token  ADICIONAR CLIENTE E PASSWORD NO  
	 *  BODY(xwww.form...)
	 *  client - etec
	 *  username - admin
	 *  password - admin
	 *  grant_type - password
	 *  
	 *  copiar o token
	 *  */
	 

}
