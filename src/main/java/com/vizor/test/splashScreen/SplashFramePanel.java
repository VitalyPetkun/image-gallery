package com.vizor.test.splashScreen;

import com.vizor.test.utils.PropertiesManager;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Класс для описнания предстартового окна.
 *
 * @author Petkun V.O.
 * @version 1.1 24/03/2022
 * @see JPanel
 */
public class SplashFramePanel extends JPanel {

    private final int SLEEP_TIME = Integer.parseInt(PropertiesManager.getConfigValue("splashScreenSleepTime"));
    private final String PROJECT_PATH = System.getProperty("user.dir");
    private final String IMAGES_PATH = PropertiesManager.getConfigValue("imagesPath");
    private final String SPLASH_SCREEN = PropertiesManager.getConfigValue("splashScreen");
    private Timer timer;

    /**
     * Конструктор класса, который описывает представление предстартового окна.
     *
     * @param splashFrame предстартовое окно
     */
    public SplashFramePanel(SplashFrame splashFrame) {
        setLayout(new FlowLayout());
        add(new JLabel(new ImageIcon(PROJECT_PATH + "\\" + IMAGES_PATH + "\\" + SPLASH_SCREEN)));

        timer = new Timer(SLEEP_TIME, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                timer.stop();
                splashFrame.dispose();
            }
        });
        timer.start();
    }
}
