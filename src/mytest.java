import java.io.*;
import java.lang.reflect.Array;
import java.net.URL;
import java.nio.file.FileAlreadyExistsException;
import java.util.ArrayList;
import java.util.Arrays;

public class mytest implements demo, demo1{
    String[] a = {"11", "2", "3"};
    String[] b = {"1", "2", "3"};
/*    String[] C= new String[10];

    ArrayList<String> c = new ArrayList<String>();*/
    int add = 0;

    public void load() {
     /*   c.add(a[0]);
        for (int i = 0; i < a.length; i++) {
            if (add >= 10) {
                break;
            }
            try {
                a[i] = a[i].concat(a[i + 1]);
                c.add(a[i]);
            } catch (Exception e) {
                String a1 = a[0];
                a[i] += a1;
                c.add(a[i]);

             *//*   if(a[0].toCharArray().length>=10||a[1].toCharArray().length>=10||a[2].toCharArray().length>=10){
                    break;
                }*//*


            }
            add++;
        }*/


    }

    @Override
    public void show() throws IOException /*throws IOException*/ {
        File file = new File("C:\\Users\\Administrator\\Desktop\\aaa.txt");
        InputStreamReader input = new InputStreamReader(new FileInputStream(file));
        BufferedReader bf = new BufferedReader(input);
        ArrayList<String> arrayList=new ArrayList<>();
        String str;
        while ((str = bf.readLine()) != null) {
            arrayList.add(str);
        }
        bf.close();
        input.close();
        

    }

}
