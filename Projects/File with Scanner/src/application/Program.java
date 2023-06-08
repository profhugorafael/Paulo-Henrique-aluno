package application;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Aluno;

public class Program {

    public static List <Aluno> turma = new ArrayList<>();
    public static void main(String[] args) throws Exception {
        
      File path = null;
      Scanner input = null; 
      int count = 1;
      
      try {
            path = new File("C:\\temp\\javapaulo\\teste.csv");
            input = new Scanner(path);
            while(input.hasNextLine()){
                
              String[] data = input.nextLine().split(",");

              turma.add( new Aluno( data[0],
                                    Integer.parseInt(data[1]),
                                    data[2],
                                    Long.parseLong( data[3])) 
                                     );

            }
        } catch(IOException e1 ){
          System.err.println("Deu erro pra abrir!");
          e1.printStackTrace();
        } catch( NullPointerException e2 ){
          System.err.println("Deu erro pra abrir!");
          e2.printStackTrace();
        }finally{
          input.close();
          turma.forEach( System.out::println );
        }

    }
}
