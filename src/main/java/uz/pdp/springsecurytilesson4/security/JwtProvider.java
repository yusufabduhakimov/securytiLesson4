package uz.pdp.springsecurytilesson4.security;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import java.util.Date;

public class JwtProvider {
    static long expireTime = 36_000_000;
    static String kalitSuz = "BuTkenMafiSoziHechkimBilmasin123";

    public  String generationToken(String username) {
        Date expireDate = new Date(System.currentTimeMillis() + expireTime);
        String token=Jwts
                .builder()
                .setSubject(username)
                .setIssuedAt(new Date())
                .setExpiration(expireDate)
                .signWith(SignatureAlgorithm.HS512, kalitSuz)
                .compact();

        return token;

    }

//    public static void main(String[] args) {
//        String token = generationToken("userLogin");
//        System.out.println(token);
//    }
}
