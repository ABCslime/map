package com.Map_gen;

import java.awt.*;

import java.awt.geom.Rectangle2D;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.swing.*;

import static java.awt.Color.*;
import static jdk.nashorn.internal.objects.NativeString.charAt;

public class mainDraw extends JComponent {

    public String seed = "1";

    public static String seed1;
    private String seed11;

    public String has(String a) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance( "SHA-256" );


        // Change this to UTF-16 if needed
        md.update( a.getBytes( StandardCharsets.UTF_8 ) );
        byte[] digest = md.digest();

        String hex = String.format( "%064x", new BigInteger( 1, digest ) );
        System.out.println( hex );

        

       
        return hex;

    }
    private static int hex(String hex) {
        return Integer.parseInt(hex, 16);
    }
    
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;


        try {
             seed1 = has(seed);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        char ch = seed1.charAt(0);

        if (ch == '0' ^ ch=='3' ^ ch=='6' ^ ch=='9' ^ ch=='c' ^ ch=='f'){
            g2.setColor(GREEN);
        }
        if (ch == '1' ^ ch=='4' ^ ch=='7' ^ ch=='a' ^ ch=='d' ^ ch=='e'){
            g2.setColor(BLUE);
        }
        if (ch == '2' ^ ch=='5' ^ ch=='8' ^ ch=='b' ^ ch=='e'){
            g2.setColor(YELLOW);
        }

        g2.fill(new Rectangle2D.Double(298, 298, 4, 4));
        for (int i = 1; i <= 100; i = i+2) {

            /* if (seed1.charAt(i)=='0' ^ seed1.charAt(i)=='1'){
                char c = seed1.charAt(i+1);

                if (c == '0' ^ c=='3' ^ c=='6' ^ c=='9' ^ ch=='c' ^ ch=='f'){
                    g2.setColor(GREEN);
                }
                if (c == '1' ^ c=='4' ^ ch=='7' ^ c=='a' ^ c=='d' ^ c=='e'){
                    g2.setColor(BLUE);
                }
                if (c == '2' ^ c=='5' ^ c=='8' ^ c=='b' ^ c=='e') {
                    g2.setColor(YELLOW);
                }



            } */
        }



        }


    }






