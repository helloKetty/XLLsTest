package test.泛型;

import org.junit.Test;
import test.leetcode.IntegerTest;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class TTest {
    public <String>  String printMsg( String... args){
        for(String t : args){
           System.out.println(t);
        }
        return (String) "1";
    }

    @Test
    public void main(){
        String a;
       String[]list= "1,2,3,4,5".split(",");
        System.out.println (printMsg(list));
        System.out.println( 8>>>1);
    }
    @Test
    public void  invockTest() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method method=IntegerTest.class.getMethod("print");
        IntegerTest integerTest=new IntegerTest();
        integerTest.print();
        method.invoke(integerTest);
    }
    @Test
    public  void ei(){
        int i=3;
        if(i<1){
            System.out.println("<1");
        }else if(i>1){
            System.out.println(">1");
        } else if(i>2){
            System.out.println("2");
        }

    }
}
