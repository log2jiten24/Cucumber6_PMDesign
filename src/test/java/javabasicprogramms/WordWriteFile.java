package javabasicprogramms;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

public class WordWriteFile {

	public static void main(String[] args) throws Exception {
	
		  // Step 1: Creating blank document
        XWPFDocument document = new XWPFDocument();
  
        // Step 2: Getting path of current working directory
        // to create the pdf file in the same directory
        String path = System.getProperty("user.dir");
        System.out.println ("FilePath :" + path);
        
        path += "\\src\\test\\resources\\WordFile\\FormattedWord.docx";
  
        // Step 3: Creating a file object with the path
        // specified
        FileOutputStream out
            = new FileOutputStream(new File(path));
  
        // Step 4: Create paragraph
        // using createParagrapth() method
        XWPFParagraph paragraph
            = document.createParagraph();
  
        // Step 5: Formatting lines
  
        // Line 1
        // Creating object for line 1
        XWPFRun line1 = paragraph.createRun();
  
        // Formating line1 by setting  bold
        line1.setBold(true);
        line1.setText("Formatted with Bold");
        line1.addBreak();
  
        // Line 2
        // Creating object for line 2
        XWPFRun line2 = paragraph.createRun();
  
        // Formating line1 by setting italic
        line2.setText("Formatted with Italics");
        line2.setItalic(true);
        line2.addBreak();
  
        // Line 3
        // Creating object for line 3
        XWPFRun line3 = paragraph.createRun();
  
        // Formatting line3 by setting
        // color & font size
        line3.setColor("73fc03");
        line3.setFontSize(20);
        line3.setText(" Formatted with Color");
  
        // Step 6: Saving changes to document
        document.write(out);
  
        // Step 7: Closing the connections
        out.close();
        document.close();
  
        // Print message after program has compiled
        // successfully show casing formatting text in file
        // successfully.
        System.out.println(
            "Word Document with Formatted Text created successfully!");
    }
		

	}





