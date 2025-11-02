package com.sudha.design.lld.caffeine.beverage;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    public MyFrame(String title) {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300, 300);
        this.setVisible(true);
    }

    public void paint(Graphics graphics) {
        super.paint(graphics);
        graphics.draw3DRect(100, 100, 50, 50, false);
    }

    public static void main() {
        MyFrame myFrame = new MyFrame("Head First Design Patterns");
    }
}
