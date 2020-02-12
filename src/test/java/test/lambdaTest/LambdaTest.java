package test.lambdaTest;

import org.junit.Test;
import org.springframework.beans.BeanUtils;
import test.Person;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LambdaTest {

   @Test
    public    void te(){
       List<String> list = Arrays.asList("10","8","6","7");
       list.sort(  (String o1, String o2)-> {
           Integer i1 = Integer.parseInt(o1);//order表示文件名列表，在方法体外引入
           Integer i2 = Integer.parseInt(o2);
           return i1.compareTo(i2);
       });
       list.stream().sorted(Comparator.comparing(Integer::new));
       List<Person> males=new ArrayList<Person>();
       for(Integer i=0;i<12;i++) {
           Person person = new Person("aa", "zz", "工程师", "男", i.toString(), 2000);
           males.add(person);
       }
       List <Person> l=males.stream().sorted(Comparator.comparing((Person p)->Integer.parseInt(p.getAge())).reversed()).collect(Collectors.toList());
       System.out.println(males);
       Integer in=new Integer("10");

   }
   @Test
    public  void tt(){

       Stream<String> stream1 = Stream.of("tom.Li","lucy.Liu");
//flatMap方法把stream1中的每一个字符串都用[.]分割成了俩个字符串
//最后返回了一个包含4个字符串的stream2
     List l1= stream1.map(s->Stream.of(s.split("[.]"))).collect(Collectors.toList());
       //List l1=stream1.map(s -> s.split("[.]")).collect(Collectors.toList());
      l1.forEach(System.out::println);
   }

    @Test
    public  void stramTest(){
       List l1=Arrays.asList("a","b","c");
        List l2= (List)l1.stream().filter(s->s.equals("a")).collect(Collectors.toList());
         System.out.println("hello");
        System.out.println("hello");
    }


}
