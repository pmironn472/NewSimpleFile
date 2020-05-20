
import java.io.*;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        writeText();

        readText();





    }

    public static void writeText()  {

        int lines = 4;
        try {

            BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter pw = new BufferedWriter(new FileWriter("Orderss.txt"));
            
            String data;

            while(lines != 0 ){
                data = br.readLine();
                pw.write(data + "\n");
                pw.flush();
                lines--;
            }


        }catch (IOException e){
            System.out.println(e.getMessage());
        }

    }


    public static void readText() {
        try {
            File file = new File("Orderss.txt");
                Scanner in = new Scanner(file);
                for (int i = 0; i < 4; i++) {
                    String data = in.nextLine();
                    System.out.println(data);
                }
        }catch (FileNotFoundException e){
            System.out.println("Error, file not found");
        }catch (NoSuchElementException e){
            System.out.println("No data");
        }finally {
            System.out.println();
            System.out.println("Thanks , for using our app");
        }


    }
}
