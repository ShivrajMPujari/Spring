package com.bridgeIt.jdbcPrax;

import org.springframework.security.crypto.bcrypt.BCrypt;

public class App 
{
    public static void main( String[] args )
    {    	
    	
    String pass=BCrypt.hashpw("122", BCrypt.gensalt());
    System.out.println(pass);
    boolean res=BCrypt.checkpw("122", "$2a$10$C9QNO7Nnt5crNXrWF2/4QOarAscK1ZMExTGMHsZ076SG185/hCiFi");
    System.out.println(res);
    
   
    
    }
}
