
package serializationtest;
import java.io.*;

public class DataSaver{
    
    
    String fName;
    StateOfPlay sop;

    public void setSOP(StateOfPlay sopToSet){
        sop = sopToSet;
    }

   public void setFileName(String fileNameToSet){
        fName = fileNameToSet;
   }



    public void saveData() throws IOException{
        FileOutputStream f_out = new FileOutputStream(fName);
        ObjectOutputStream obj_out = new ObjectOutputStream(f_out);
        obj_out.writeObject(sop);
        obj_out.close();
        f_out.close();
    }

}
