import java.io.*;

public class Main {
    public static void main(String[] args) {
//        try(InputStreamReader isr = new InputStreamReader(System.in)){
//            System.out.print("Enter some letters: ");
//
//            // the return type of read() is int so it returns the unicode of the char
//            int letters = isr.read();
//            while(isr.ready()){
//                System.out.println((char) letters);
//                letters = isr.read();
//            }
//
//        }catch(IOException e){
//            System.out.println(e.getMessage());
//        }

//        try(FileReader fr = new FileReader("note.txt"))
//        {
//            int letters = fr.read();
//            while(fr.ready()){
//                System.out.println((char)letters);
//                letters = fr.read();
//            }
//            // fr.close() automatically by try catch
//        }catch (IOException e){
//            System.out.println(e.getMessage());
//        }

        try(BufferedReader fr = new BufferedReader(new InputStreamReader(System.in)))
        {
            System.out.println("You typed: " + fr.readLine());
            // fr.close() automatically by try catch
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}