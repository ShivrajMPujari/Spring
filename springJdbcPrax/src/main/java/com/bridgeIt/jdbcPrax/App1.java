package com.bridgeIt.jdbcPrax;

import java.time.LocalDateTime;
import java.util.Date;

import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.xml.bind.DatatypeConverter;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

public class App1 {

	public static void main(String[] args) {
	
		String token =createJwt("1", "shiv@gmail.com", 120000);
		System.out.println(token);
		parseJwt(token);

	}
	
	public static String createJwt(String id,String subject,long millSec) {
		
	SignatureAlgorithm  signatureAlgorithm = SignatureAlgorithm.HS256;
	long currentTime=System.currentTimeMillis();
	Date now = new Date(currentTime);
	JwtBuilder builder =    Jwts.builder().setId(id)
					.setIssuedAt(now)
					.setSubject(subject)
					.signWith(signatureAlgorithm, "myKey");
	
	millSec=System.currentTimeMillis()+millSec;
	Date exp = new Date(millSec);
	builder.setExpiration(exp);
	return	 builder.compact();			
	}
	
	public static void parseJwt(String jwt) {
		
	Claims claims=	Jwts.parser().setSigningKey("myKey")
					.parseClaimsJws(jwt).getBody();
		
		System.out.println(claims.getId());
		System.out.println(claims.getSubject());
	}
	
	
}
