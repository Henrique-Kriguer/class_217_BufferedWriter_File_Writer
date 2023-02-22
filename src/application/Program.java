package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program {
    public static void main(String[] args) {

        String[] lines = new String[] { "Henrique Kriguer", "Mechanical Engineer", "Java Developer since 2022"} ;

        String path = "C:\\development\\Nelio_Java\\17-Files\\Class_217_BufferedWriter_File_Writer\\out.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {

            for (String line : lines){
                bw.write(line);
                bw.newLine();
            }
        } catch(IOException e){
            e.printStackTrace();
        }
    }
}
