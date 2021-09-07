import sun.plugin.javascript.navig.Array;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;


public class Main {
    public static void main(String[] args) throws IOException {
        /*        Stringcomp stringcomp = new Stringcomp();
        Arrays.sort(array,stringcomp);
        System.out.println(String.join(",",array));*/
        //ArrayList<String> arrays = new ArrayList<String>();
//        String[] array=new String[]{"a","b","c","d"};
//
//        StringBuilder stringBuilder=new StringBuilder();
//        for(int i=0;i<array.length;i++) {
//            array[i]=stringBuilder.append(array[i]).toString();
//
//        }
//        System.out.println(String.join("",array));
        mytest mytest2=new mytest();
        mytest2.load();
        mytest2.show();
    }




}

/*
class Stringcomp implements Comparator<String>{

    @Override
    public int compare(String o1, String o2) {
        System.out.println("+++++++++++"+o1+","+o2);
        return o2.compareTo(o1);
    }

}*/
