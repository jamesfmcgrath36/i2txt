/**
* This file is part of i2txt. It represents a text file, with additional 
* code that makes printing text to file much easier.
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
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/**
 * A class to provide methods to easily print text to a file
 * 
 * @author James McGrath
 */
public class TextFile extends File {
	
    // 
	private PrintWriter printer;
    
    /**
     * Constructor that initializes printer
     * @param path
     */
	public TextFile(String path) {	
        super(path);
		try {
			OutputStream os = new FileOutputStream(path);
			OutputStreamWriter osw = new OutputStreamWriter(os, "UTF-8");
			this.printer = new PrintWriter(osw, true);
		} catch (IOException e) {
            e.printStackTrace();
        }
	}

    /**
     * Print text to the file
     * @param text  the text to print
     */
	public void println(String text) {
		this.printer.println(text);
	}

    /**
     * Close the printer
     */
	public void close() {
		this.printer.close();
	}
}