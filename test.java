import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class test{
    public static void main(String[] args){
        System.out.println("hello world");
        try{
            Scanner read= new Scanner(new File("test.txt"));
			while(read.hasNextLine())
				System.out.println(read.nextLine());
			read.close();
        }
        catch(Exception e) {
			System.out.println(e);
		}	
    }
}