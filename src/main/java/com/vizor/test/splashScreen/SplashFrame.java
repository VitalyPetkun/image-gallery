package com.vizor.test.splashScreen;

import com.vizor.test.Main;
import com.vizor.test.utils.PropertiesManager;

import javax.swing.*;
import java.awt.*;

/**
 * Класс для реализации предстартового окна.
 *
 * @author Petkun V.O.
 * @version 1.1 24/03/2022
 * @see JDialog
 */
public class SplashFrame extends JDialog {

    private static final int WIDTH = Integer.parseInt(PropertiesManager.getConfigValue("splashScreenWidth"));
    private static final int HEIGHT = Integer.parseInt(PropertiesManager.getConfigValue("splashScreenHeight"));
    private static final Color BACKGROUND_COLOR = new Color(0, 0, 0);

    private final SplashFramePanel panel;

    /**
     * Конструктор класса, который инициализирует предстартовое окно.
     *
     * @param frame главное окно
     */
    public SplashFrame(Main frame) {
        super(frame, true);
        setUndecorated(true);
        panel = new SplashFramePanel(this);
        panel.setBackground(BACKGROUND_COLOR);
        add(panel);
        setSize(WIDTH, HEIGHT);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
