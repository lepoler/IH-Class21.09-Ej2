import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

    //Ejercicio 2: Create a program who reads the file called oscar_age_female.csv who have this columns
        // Index, Year, Age, Name, Movie in format csv read it print it in a new file called result.txt in the following format.


        File pelis = new File("oscar_age.csv");
        Scanner pelisReader = new Scanner(pelis);
        FileWriter writer = new FileWriter ("result.txt", false);

        pelisReader.nextLine();//Esto hace que nos saltemos la primera linea que es el indice.
        while (pelisReader.hasNextLine()) {
            String[] words = pelisReader.nextLine().split(",");
            String name = words[3];
            String year = words [1];
            String age = words [2];
            String movie = words [4];
            String separator = "=======";
            writer.write("Name: " + name + "\n");
            writer.write("Year: " + year + "\n");
            writer.write("Age: " + age + "\n");
            writer.write("Movie: " + movie + "\n");
            writer.write("Separator: " + separator + "\n");


           // System.out.println(pelisReader.nextLine());
        }

        pelisReader.close();
        writer.close();





    }
}