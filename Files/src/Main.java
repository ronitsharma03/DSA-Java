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

//        try(BufferedReader fr = new BufferedReader(new InputStreamReader(System.in)))
//        {
//            System.out.println("You typed: " + fr.readLine());
//            // fr.close() automatically by try catch
//        }catch (IOException e){
//            System.out.println(e.getMessage());
//        }


//        // creates new filw
//        try
//        {
//           File fo = new File("new-file.txt");
//           fo.createNewFile();
//        }catch (IOException e){
//            System.out.println(e.getMessage());
//        }

        // write in the file
//        try
//        {
//            FileWriter fw = new FileWriter("new-file.txt");
//            fw.write("सर्वधर्मान्परित्यज्य मामेकं शरणं व्रज। अहं त्वा सर्वपापेभ्यो मोक्षयिष्यामि मा शुचः।।");
//            fw.close();
//        }catch (IOException e){
//            System.out.println(e.getMessage());
//        }

        // Reading from the file
        try(BufferedReader fr = new BufferedReader(new FileReader("new-file.txt")))
        {
//            int letters = fr.read();
//            while(fr.ready()){
//                System.out.println((char)letters);
//                letters = fr.read();
//            }
            while(fr.ready()){
            System.out.println(fr.readLine());
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }


            File fo = new File("note.txt");
            if (fo.delete()){
                System.out.println("Deleted " + fo.getName());
            }


    }
}