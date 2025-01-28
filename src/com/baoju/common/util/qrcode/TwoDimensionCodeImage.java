package com.baoju.common.util.qrcode;

import java.awt.image.BufferedImage;  
import jp.sourceforge.qrcode.data.QRCodeImage;

/**
 * 二维码图片对象
 * @author demi
 *
 */
public class TwoDimensionCodeImage implements QRCodeImage {

	BufferedImage bufImg;  
    
    public TwoDimensionCodeImage(BufferedImage bufImg) {  
        this.bufImg = bufImg;  
    }  
      
    @Override  
    public int getHeight() {  
        return bufImg.getHeight();  
    }  
  
    @Override  
    public int getPixel(int x, int y) {  
        return bufImg.getRGB(x, y);  
    }  
  
    @Override  
    public int getWidth() {  
        return bufImg.getWidth();  
    }  
  
}
