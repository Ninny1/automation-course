package com.JFrame;

import org.junit.internal.TextListener;
import org.junit.runner.JUnitCore;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class jframeEx {
    static JLabel label1 = new JLabel();
    static JLabel label2 = new JLabel();
    static JLabel label3 = new JLabel();


    public static void main(String[] args) {
        JFrame frame=new JFrame("First Jframe exercise");

        frame.setSize(300,400);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        label1.setBounds(90, 105, 210, 110);//(x,y,w,h)
        frame.add(label1);

        label2.setBounds(90, 180, 210, 110);//(x,y,w,h)
        frame.add(label2);

        label3.setBounds(60, 255, 210, 110);//(x,y,w,h)
        frame.add(label3);

        JButton btn1 = new JButton("Test 1");
        btn1.setBounds(100,100,120, 40);
        frame.add(btn1);

        JButton btn2 = new JButton("Test 2");
        btn2.setBounds(100,175,120, 40);
        frame.add(btn2);

        JButton btn3 = new JButton("Test 3");
        btn3.setBounds(100,250,120, 40);
        frame.add(btn3);

        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                try {
                    JUnitCore junit = new JUnitCore();
                    junit.addListener(new TextListener(System.out));
                    junit.run(junitClass1.class);
                } catch (Exception e) {
                    label1.setText("Test 1 failed");
                }
            }
        });

        btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                try {
                    JUnitCore junit = new JUnitCore();
                    junit.addListener(new TextListener(System.out));
                    junit.run(junitClass2.class);
                } catch (Exception e) {
                    label2.setText("Test 2 failed");
                }
            }
        });

        btn3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                try {
                    junit_class3.main(null);
                } catch (Exception e) {
                    label3.setText("Test 1 failed");
                }
            }
        });
    }
}
