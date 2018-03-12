package com.Map_gen;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.DigestException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.swing.*;


public class Main extends JFrame implements KeyListener {
    static private mainDraw draw;
    public Main() {
        this.draw = new mainDraw();
        addKeyListener((KeyListener) this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
        JLabel jLabel = new JLabel("3");


    }
    public void keyPressed(KeyEvent e) {

    }

    public void keyReleased(KeyEvent e) {

    }

    public void keyTyped(KeyEvent e) {
        System.out.println("keyTyped");
    }


    public static void main(String[] args) throws DigestException, NoSuchAlgorithmException {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                Main frame = new Main();
                frame.setTitle("Map");
                frame.setResizable(false);
                frame.setSize(600, 600);
                frame.setMinimumSize(new Dimension(600, 600));
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.getContentPane().add(frame.draw);
                frame.pack();
                frame.setVisible(true);



            }

        });






    }





}