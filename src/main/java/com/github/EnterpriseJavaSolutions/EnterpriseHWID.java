package com.github.EnterpriseJavaSolutions;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

public class EnterpriseHWID {
    public static String getHWID() {
        String info = System.getProperty("os.name")
                + System.getProperty("os.arch") +
                System.getProperty("os.version") +
                System.getProperty("user.name") +
                System.getenv("PROCESSOR_IDENTIFIER") +
                System.getenv("PROCESSOR_ARCHITECTURE") +
                System.getenv("PROCESSOR_ARCHITEW6432") +
                System.getenv("NUMBER_OF_PROCESSORS");

        MessageDigest sha512;
        try {
            sha512 = MessageDigest.getInstance("SHA-512");
        } catch (NoSuchAlgorithmException e) {
            System.exit(1337);
            return null;
        }

        // We use base64 because otherwise it would look like the alien language of �$%&/()=. Idc if its longer timmy
        Base64.Encoder base64 = Base64.getEncoder();
        byte[] hashed = base64.encode(sha512.digest(info.getBytes()));

        return new String(hashed);
    }
}
