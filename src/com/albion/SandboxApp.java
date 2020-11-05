package com.albion;

import com.albion.config.WindowEnv;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class SandboxApp {

    public static void main(String[] args) {
        try {
            Runtime runTime = Runtime.getRuntime();
            String executablePath = WindowEnv.GAME_PATH;
            // It saves screenshot to desired path
            String path = WindowEnv.IMAGE_PATH + "test.jpg";
            Process process = runTime.exec(executablePath);

            Thread.sleep(8000L);
            Robot r = new Robot();
            Rectangle capture = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
            BufferedImage Image = r.createScreenCapture(capture);
            Image = Image.getSubimage(450,245, 1024,608);
            ImageIO.write(Image, "jpg", new File(path));
            Image = Image.getSubimage(450,645, 500,300);
            ImageIO.write(Image, "jpg", new File(path));
            MouseAction.click(620, 775);
            Thread.sleep(30000L);
            MouseAction.click(1920/2, 1080/2);
            process.destroy();

        } catch (IOException | InterruptedException | AWTException e) {
            e.printStackTrace();
        }
    }
}
