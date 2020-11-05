package com.albion;

import java.awt.image.BufferedImage;
import java.nio.Buffer;

public class ImageComparer {
    public void compareImages(BufferedImage image1, BufferedImage image2) {
        if(image1.getHeight() > image2.getHeight() && image1.getWidth() > image2.getWidth()){
            processImages(image1, image2);
        } else if(image2.getHeight() > image1.getHeight() && image2.getWidth() > image1.getWidth()) {
            processImages(image2, image1);
        }
    }


    private void processImages(BufferedImage largeImage, BufferedImage smallImage){

    }
}
