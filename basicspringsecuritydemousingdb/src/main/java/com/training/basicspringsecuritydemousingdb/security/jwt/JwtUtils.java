package com.training.basicspringsecuritydemousingdb.security.jwt;


import java.security.Key;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;

import com.training.basicspringsecuritydemousingdb.service.UserDetailsImpl;

import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.MalformedJwtException;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.UnsupportedJwtException;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;

@Component
public class JwtUtils {
  private static final Logger logger = LoggerFactory.getLogger(JwtUtils.class);

  @Value("${jwtSecret}")
  private String jwtSecret;

  @Value("${jwtExpirationMs}")
  private int jwtExpirationMs;

  public String generateJwtToken(Authentication authentication) {

    UserDetailsImpl userPrincipal = (UserDetailsImpl) authentication.getPrincipal();

    return Jwts.builder().setSubject((userPrincipal.getUsername()))
    		.setIssuedAt(new Date())
        .setExpiration(new Date((new Date()).getTime() + jwtExpirationMs))
        .signWith(getSignInKey(),SignatureAlgorithm.HS512)
        .compact(); 
  }

  public String getUserNameFromJwtToken(String token) {
   //0.9.0// return Jwts.parser().setSigningKey(getSignInKey()).parseClaimsJws(token).getBody().getSubject();
	//0.11.5  //return Jwts.parserBuilder().setSigningKey(getSignInKey()).build().parseClaimsJws(token).getBody().getSubject();
	  return Jwts.parserBuilder().setSigningKey(getSignInKey()).build().parseClaimsJws(token).getBody().getSubject();
  }

  public boolean validateJwtToken(String authToken) {
    try {
      //Jwts.parser().setSigningKey(getSignInKey()).parseClaimsJws(authToken);
    	Jwts.parserBuilder().setSigningKey(getSignInKey()).build().parseClaimsJws(authToken);
    	return true;
	}catch (MalformedJwtException e) {
      logger.error("Invalid JWT token: {}", e.getMessage());
    } catch (ExpiredJwtException e) {
      logger.error("JWT token is expired: {}", e.getMessage());
    } catch (UnsupportedJwtException e) {
      logger.error("JWT token is unsupported: {}", e.getMessage());
    } catch (IllegalArgumentException e) {
      logger.error("JWT claims string is empty: {}", e.getMessage());
    }

    return false;
  }
  
  private Key getSignInKey() {
	    byte[] keyBytes = Decoders.BASE64.decode(jwtSecret);
	    return Keys.hmacShaKeyFor(keyBytes);
	  }
}