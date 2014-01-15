/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package farmacia.Metodos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author montano
 */

    public class RandomFile extends ArrayList<String> {
// Read a file as a single string:
        public static String read(String fileName) {

            StringBuilder sb = new StringBuilder();

            try { 
                try (BufferedReader in = new BufferedReader(new FileReader( new File(fileName).getAbsoluteFile()))) {

           String s;


            while((s = in.readLine()) != null) {
            sb.append(s);
            sb.append("\n");
            }
            }
            } catch(IOException e) {
            throw new RuntimeException(e);
            }
            return sb.toString();
        }
        // Write a single file in one method call:
        public static void write(String fileName, String text) {

            try {
            try (PrintWriter out = new PrintWriter(
                    new File(fileName).getAbsoluteFile())) {
            out.print(text);
            }
            } catch(FileNotFoundException e) {
            throw new RuntimeException(e);
            }
            }
        // Read a file, split by any regular expression:
        public RandomFile(String fileName, String splitter) {

            super(Arrays.asList(read(fileName).split(splitter)));
            // Regular expression split() often leaves an empty
            // String at the first position:
            if(get(0).equals("")) remove(0);
        }
        // Normally read by lines:
        public RandomFile(String fileName) {

            this(fileName, "\n");
            }

        public void write(String fileName) {

            try {
            try (PrintWriter out = new PrintWriter(
                    new File(fileName).getAbsoluteFile())) {
            for(String item : this)
            out.println(item);
            }
            } catch(FileNotFoundException e) {
            throw new RuntimeException(e);
            }
        }
}

