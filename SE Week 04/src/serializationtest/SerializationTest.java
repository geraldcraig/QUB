package serializationtest;
import java.io.*;

public class SerializationTest {

    private static StateOfPlay lastSOP, restoredSOP;
    private static DataSaver dataSaver;

    public static void main(String[] args) {

        lastSOP = new StateOfPlay();
        dataSaver = new DataSaver();
        restoredSOP = null;

        try{
            restoredSOP = getData("myData");
            System.out.println("\nI'm restoring.");
        }
        catch(IOException e){
            System.out.println("\nError (1) reading file " + e);
        }
        catch(ClassNotFoundException e){
            System.out.println("\nError (2) reading file " + e);
        }

        if (restoredSOP != null){
            System.out.println("\n\nRestored State Name: " + restoredSOP.getPlayer());
            System.out.println("Restored Amount: " + restoredSOP.getMoney() + "\n\n");
        }

        lastSOP.setPlayer("fred");
        lastSOP.setMoney(300);

        dataSaver.setSOP(lastSOP);
        dataSaver.setFileName("myData");

        try{
            dataSaver.saveData();
            System.out.println("\nI've saved.");
        }
        catch(IOException e){
            System.out.println("\nError (3) saving file " + e);
        }

        try{
            restoredSOP = getData("myData");
            System.out.println("\nI'm restoring.");
        }
        catch(IOException e){
            System.out.println("\nError (1) reading file " + e);
        }
        catch(ClassNotFoundException e){
            System.out.println("\nError (2) reading file " + e);
        }

        if (restoredSOP != null){
            System.out.println("\n\nRestored State Name: " + restoredSOP.getPlayer());
            System.out.println("Restored Amount: " + restoredSOP.getMoney() + "\n\n");
        }


    }

    private static StateOfPlay getData(String fileName) throws IOException, ClassNotFoundException{
        StateOfPlay stateOfPlay = null;
        FileInputStream f_in = new FileInputStream(fileName);
        ObjectInputStream obj_in = new ObjectInputStream(f_in);
        try{
            Object obj = obj_in.readObject();
            stateOfPlay = (StateOfPlay)obj;
        }
        catch(EOFException e){
        }
        obj_in.close();
        f_in.close();
        return stateOfPlay;
    }


}
