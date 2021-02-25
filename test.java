import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

public class test{
    public static void main(String[] args){
        System.out.println("hello world");
        try{
            Scanner read= new Scanner(new File("test.txt"));
			while(read.hasNextLine())
				System.out.println(read.nextLine());
			read.close();


            Formatter write= new Formatter(new File("writetest.txt"));
		    write.format("%d\t", 15126);
		    write.format("\n");
		    
			write.close();
        }
        catch(Exception e) {
			System.out.println(e);
		}	

        
    }
}