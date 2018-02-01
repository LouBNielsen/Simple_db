import java.util.*;
import java.io.*;

public class HelloDocker {

 public static void main(String[] args) {

   System.out.println("Hello Docker");

   HashMap<String,String> hm = new HashMap<String,String>();
	hm.put("1","A");
	hm.put("2","B");
	hm.put("3","C");

   System.out.println(hm);

   HelloDocker writeTo = new HelloDocker();
   writeTo.writeToFile(hm);
   System.out.println("File has been created and written to...");

   HelloDocker readFrom = new HelloDocker();
   readFrom.readFromFile();
   System.out.println("File has been readed...");

 }


 public void writeToFile(HashMap<String,String> map){
    
    try {
    
    	File toWrite = new File("fileToReadAndWrite");

    	FileOutputStream fos = new FileOutputStream(toWrite); 
     	ObjectOutputStream oos = new ObjectOutputStream(fos);

     	oos.writeObject(map);
     	oos.close();
     	fos.close();

    } catch (IOException ex) { ex.printStackTrace(); }
 }

 public void readFromFile() {

   try {

        File toRead = new File("fileToReadAndWrite");

        FileInputStream fis = new FileInputStream(toRead);
        ObjectInputStream ois = new ObjectInputStream(fis);

        HashMap<String,String> mapInFile = (HashMap<String,String>)ois.readObject();

        ois.close();
        fis.close();

        //print all data in map
        for(Map.Entry<String,String> m :mapInFile.entrySet()){
            System.out.println(m.getKey() + " : " + m.getValue());
        }

    } catch (Exception e) { e.printStackTrace(); }
 }

}
