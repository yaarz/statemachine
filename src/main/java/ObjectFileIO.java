import java.io.*;

public class ObjectFileIO {


    public static void writeObjectToFile(Object s,String filePath)  {
        try {
            FileOutputStream fileOut = new FileOutputStream(filePath);
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(s);
            objectOut.close();
        }catch (Exception e){
            System.out.println(e);
        }
    }

    public static Object readObjectFromFile(String filePath)  {
        Object obj =null;
        try {
            FileInputStream fi = new FileInputStream(new File(filePath));
            ObjectInputStream oi = new ObjectInputStream(fi);
            obj = oi.readObject();
            oi.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        return obj;
    }

}
