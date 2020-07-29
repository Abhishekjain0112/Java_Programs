/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kyvose.function;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;

/**
 *
 * @author Abhishek
 */
public class KeyPairGenerationCode {
    
     public static void main(String args[]) throws Exception{
      //Creating KeyPair generator object
      KeyPairGenerator keyPairGen = KeyPairGenerator.getInstance("DSA");
      
      //Initializing the KeyPairGenerator
      keyPairGen.initialize(2048);
      
      //Generating the pair of keys
      KeyPair pair = keyPairGen.generateKeyPair();
      
      //Getting the private key from the key pair
      PrivateKey privKey = pair.getPrivate();   
      
      //Getting the public key from the key pair
      PublicKey publicKey = pair.getPublic(); 
      System.out.println("Keys generated");
         System.out.println("public key : "+publicKey);
         System.out.println("private key : "+privKey.toString());
   }
    
}
