/**
* This file is  part of i2txt, and contains constants
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
package i2txt;

public class Constants {

    // banner displayed at program start
    public static final String LISCENCE_BANNER = "========================= i2txt =========================\nCopyright (C) 2015, 2021 James McGrath\nThis program comes with ABSOLUTELY NO WARRANTY.\nThis is free software, and you are welcome to\nredistribute it under certain conditions.\nSee https://www.gnu.org/licenses/gpl-3.0.txt for details.\n=========================================================";
    // regex string used to filter out image files from a directory
    public static final String VALID_EXTENSIONS = ".*\\.(tif|tiff|jpg|jpeg|bmp|png)$";

    // error displayed when there are no images in the targets folder
    public static final String ERROR_TARGETS = "Error: no image files found!\nplease copy images to ./targets and re-run!";
}
