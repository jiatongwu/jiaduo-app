package com.wt.jiaduo.utils;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import java.util.Date;

import org.springframework.stereotype.Component;

import java.io.UnsupportedEncodingException;

/**
 * 福彩中心灾备系统token处理工具类
 * @author mingth
 * 2016/10/27
 */
@Component
public class JJWTTokenHandler {
	
	/*
	 * 福彩中心灾备系统token加密密码
	 * （可以随客户设定）
	 */
	private static final String JWT_SECRET = "jwt_secret";
	
	/*
	 * 福彩中心灾备系统token过期时间
	 * 1小时
	 */
	private static final long JWT_TTL_MILLIS = 30*1000;
	
	public static String createJWTToken(String account) throws UnsupportedEncodingException {
		long nowMillis = System.currentTimeMillis();
		Date now = new Date(nowMillis + JWT_TTL_MILLIS);
		String jwt = Jwts.builder()
				.setSubject(account)
				.setExpiration(now)
				.signWith(SignatureAlgorithm.HS256, JWT_SECRET.getBytes("UTF-8"))
				.compact();
		return jwt;
	}
	
	public static boolean isJWTTokenValid(String account, String token) {
		long nowMillis = System.currentTimeMillis();
		Date now = new Date(nowMillis);
		try {
			Claims claims = Jwts.parser()
					.setSigningKey(JWT_SECRET.getBytes("UTF-8"))
					.parseClaimsJws(token)
					.getBody();
			String tokenAccount = claims.getSubject();
			if (null != tokenAccount && tokenAccount.equals(account) 
					&& now.before(claims.getExpiration())) {
				return true;
			} else {
				return false;
			}
		} catch(Exception e) {
			//e.printStackTrace();
			return false;
		}
	}
	
	public static void main(String[] args) throws Exception {
		String token = createJWTToken("wujiatong");
		System.out.println("token=" + token);
		try {
			Thread.sleep(5*1000);
		} catch(InterruptedException ie) {
			ie.printStackTrace();
		}
		System.out.println("isTokenValid=" + isJWTTokenValid("guangdong", token));
	}
}
