package javapractice;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.imageio.ImageIO;

public class ImageConversion {

	public static void main(String[] args) {

		// image conversion from .jpg --> .png /.bmp/.gif

		try {

//			URL url = new URL(
//		"https://images-na.ssl-images-amazon.com/images/G/01/AmazonExports/Fuji/2020/May/Dashboard/Fuji_Dash_PC_1x._SY304_CB431800965_.jpg");
			
	    //read from the filelocal
		File file = new File ("./Images/laptop.jpg");

		//Read the image from the URL 	
		//BufferedImage image = ImageIO.read(url);
		BufferedImage image = ImageIO.read(file);
		//store the image in which format needs to be stored 
		//ImageIO.write(image, "jpg", new File("./Images/laptop.jpg"));
		ImageIO.write(image, "gif", new File("./Images/laptop.gif"));
		ImageIO.write(image, "png", new File("./Images/laptop.png"));
		ImageIO.write(image, "bmp", new File("./Images/laptop.bmp"));
		ImageIO.write(image, "jpeg", new File("./Images/laptop.jpeg"));
		
		System.out.println ("Done successfully ......");

		} catch (MalformedURLException e) {

			e.printStackTrace();

		} catch (IOException e) {

			e.printStackTrace();
		}

	}

}
