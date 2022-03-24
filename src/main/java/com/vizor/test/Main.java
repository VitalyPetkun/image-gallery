package com.vizor.test;

import com.vizor.test.splashScreen.SplashFrame;
import com.vizor.test.utils.PropertiesManager;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import java.awt.Dimension;

/**
 * Класс описывающий главное окно.
 *
 * @author Petkun V.O.
 * @version 1.1 24/03/2022
 * @see JFrame
 */
public class Main extends JFrame {

    private static final int WIDTH = Integer.parseInt(PropertiesManager.getConfigValue("mainWidth"));
    private static final int HEIGHT = Integer.parseInt(PropertiesManager.getConfigValue("mainHeight"));

    public void run() {
        Main frame = new Main();
        new SplashFrame(frame);
        frame.setTitle("DT Developer Test");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setMinimumSize(new Dimension(WIDTH, HEIGHT));
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Main()::run);
    }
}
