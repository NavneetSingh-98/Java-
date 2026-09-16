package FirstBlockChain;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.time.LocalDateTime;

public class Block {
    String data;
    String previousHash;
    String hash;
    LocalDateTime timestamp;

    Block (String data, String previousHash){
        this.data = data;
        this.previousHash = previousHash;
        this.timestamp = LocalDateTime.now();
        this.hash = calculateHash();
    }
    String calculateHash(){
        try{
            String input  = data + previousHash + timestamp;
            MessageDigest digest = MessageDigest.getInstance(("SHA-256"));
            byte[] bytes = digest.digest(input.getBytes(StandardCharsets.UTF_8));
            StringBuilder hex = new StringBuilder();
            for(byte b : bytes){
                hex.append(String.format("%02x", b));
            }
            return hex.toString();
        } catch (Exception e){
            throw new RuntimeException(e);
        }
    }
 
}
