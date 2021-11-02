/**
* This file is  part of i2txt, and is its main entry point
* 
* Copyright (C) 2015, 2021 James McGrath
* 
* i2txt is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
* 
* i2txt is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
* 
* You should have received a copy of the GNU General Public License
* along with i2txt.  If not, see <https://www.gnu.org/licenses/>.
*/
package main.java;

import java.io.File;
import java.io.FilenameFilter;

import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

/**
 * @author James McGrath
 */
public class Main {

      /**
       * The main entry point for the program
       * 
       * @param args
       */
      public static void main(String[] args) {

            // print liscence info
            System.out.println("i2txt, Copyright (C) 2015, 2021 James McGrath");
            System.out.println("This program comes with ABSOLUTELY NO WARRANTY;");
            System.out.println("This is free software, and you are welcome to");
            System.out.println("redistribute it under certain conditions;");
            System.out.println("See https://www.gnu.org/licenses/gpl-3.0.txt for details;\n");

            // get image files from target folder
            FilenameFilter filter = new FilenameFilter() {
                  public boolean accept(File directory, String name) {
                        if (name.toLowerCase().matches(".*\\.(tif|tiff|jpg|jpeg|bmp|png)$")) {
                              return true;
                        } else {
                              return false;
                        }
                  }
            };
            File[] targets = new File("C:/Users/Admin/Downloads/targets").listFiles(filter);

            //
            if (targets.length == 0) {
                  System.out.println("Error: no image files found!");
                  System.out.println("please copy images to ./targets and re-run!");
            } else {

                  // instantate tesseract, set data oath
                  Tesseract tesseract = new Tesseract();
                  tesseract.setDatapath("D:/Eclipse/libraries/Tess4J/tessdata");

                  for (int i = 0; i < targets.length; i++) {

                        try {

                              // perform ocr on image
                              File image = targets[i];
                              String text = tesseract.doOCR(image);

                              // set output file path
                              String outPath = image.getAbsolutePath() + ".txt";
                              TextFile textfile = new TextFile(outPath);

                              // delete file if it exists
                              if (textfile.exists()) {
                                    textfile.delete();
                              }

                              // print text to file
                              textfile.println(text);
                              textfile.close();

                              // print status
                              String status = String.format("Processed [%d / %d] %s", i + 1, targets.length,
                                          image.getAbsolutePath());
                              System.out.println(status);
                        } catch (TesseractException e) {
                              e.printStackTrace();
                        }
                  }
            }
      }
}