About
	i2txt is a simple utility that performs optical-character recognition (OCR) on scanned documents and images.

Features
	Support for jpg, tif, png, bmp, and gif image formats

Dependencies
	JDK 11+
	i2txt is dependent on Tess4J, which requires Microsoft Visual C++ 2019 x86 and x64 Runtimes

Files/Folders
	/tessdata: 	the folder that contains Tess4j language data. Do not delete or modify.
	/targets: 	the folder that contains the images you want to perform OCR on.
	/i2txt.jar: the i2txt jar file, with bundled dependencies. Do not delete.
	/run.cmd: 	the run script. Run this script to execute the program. Feel free to modify as needed.

Usage
	1. 	Copy scanned pictures of documents and images into the /targets folder.
	2. 	Execute the script 'run.cmd' by clicking on it.
	3.	Output will be saved in the /targets folder, as a text file with the same name of the image
	
	Example:	scanned_doc1.png will be saved as scanned_doc1.png.txt 
	
	Note: 		i2txt will perform OCR on all images in the /targets folder. Prior to execution, remove images 
				you do not want to perform OCR on.
				
Liscences/Copyright
	i2txt is Copyright (C) 2015, 2021 James McGrath and Liscenced under the 
	terms of the GNU General Public License, Version 3. A full copy of this 
	liscence can be found at https://www.gnu.org/licenses/gpl-3.0.txt
	
	Tess4j is Copyright @ 2012 Quan Nguyen and Licensed under the 
	Apache License, Version 2.0. A full copy of this liscence can be found
	at http://www.apache.org/licenses/LICENSE-2.0