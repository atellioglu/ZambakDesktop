package util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by abdullaht on 13.10.2017.
 */
public class Util {
    private static Util instance;
    public static Util get(){
        if(instance == null)
            instance = new Util();
        return instance;
    }
    private Util(){

    }
    public List<String> getCountryList(){
        List<String> list = new ArrayList<String>();
        File countryFile = null;
        BufferedReader reader = null;
        try{
            countryFile = new File(getClass().getClassLoader().getResource("countries.txt").toURI());
            reader = new BufferedReader(new FileReader(countryFile));
            String str;
            while((str = reader.readLine())!=null){
                list.add(str);
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }finally {
            if(reader!=null){
                try{
                    reader.close();
                }catch (Exception ex){
                    ex.printStackTrace();
                }
            }
        }
        return list;
    }


}
