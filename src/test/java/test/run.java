//package test;
//
//import org.junit.Test;
//
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Map;
//import java.util.stream.Collectors;
//
//
///*@RunWith(SpringRunner.class)
//@SpringBootTest
//@AutoConfigureMockMvc*/
//public class run {
//
//
//    @Test
//    public void r() {
//        List<Person> javaProgrammers = new ArrayList<Person>() {
//            {
//                add(new Person("Elsdon", "1", "Java programmer", "male", 43, 2000));
//                add(new Person("Elsdon", "1", "Java programmer", "female", 23, 1500));
//                add(new Person("Elsdon", "Jaycob", "Java programmer", "male", 33, 1800));
//                add(new Person("Elsdon", "Jaycob", "Java programmer", "female", 32, 1600));
//                add(new Person("Elsdon", "Jaycob", "Java programmer", "male", 22, 1200));
//                add(new Person("Maude", "2", "Java programmer", "female", 27, 1900));
//                add(new Person("Maude", "2", "Java programmer", "male", 30, 2300));
//                add(new Person("Maude", "Jaimie", "Java programmer", "female", 35, 1700));
//                add(new Person("Maude", "Jaimie", "Java programmer", "male", 33, 2000));
//                add(new Person("Maude", "Jaimie", "Java programmer", "female", 34, 1300));
//            }
//        };
//
//        List<Person> phpProgrammers = new ArrayList<Person>() {
//            {
//                add(new Person("Jarrod", "Pace", "PHP programmer", "male", 34, 1550));
//                add(new Person("Clarette", "Cicely", "PHP programmer", "female", 23, 1200));
//                add(new Person("Victor", "Channing", "PHP programmer", "male", 32, 1600));
//                add(new Person("Tori", "Sheryl", "PHP programmer", "female", 21, 1000));
//                add(new Person("Osborne", "Shad", "PHP programmer", "male", 32, 1100));
//                add(new Person("Rosalind", "Layla", "PHP programmer", "female", 25, 1300));
//                add(new Person("Fraser", "Hewie", "PHP programmer", "male", 36, 1100));
//                add(new Person("Quinn", "Tamara", "PHP programmer", "female", 21, 1000));
//                add(new Person("Alvin", "Lance", "PHP programmer", "male", 38, 1600));
//                add(new Person("Evonne", "Shari", "PHP programmer", "female", 40, 1800));
//            }
//        };
//        List a = javaProgrammers.stream().map(p -> p.getFirstName()).collect(Collectors.toList());
//        // a.forEach(j->System.out.println(j));
//        List<Person> p1 = javaProgrammers.stream().filter(p -> p.getAge() > 30).collect(Collectors.toList());
//        //  p1.forEach(j->System.out.println(j.getFirstName()+" 1"));
//        //avaProgrammers.forEach(j->System.out.println(j.getFirstName()));
//
//        Map<String, Person> m = javaProgrammers.stream().collect(Collectors.toMap(Person::getFirstName, Person -> Person));
//        m.forEach((k, v) -> System.out.println(v.getFirstName()));
//        javaProgrammers.stream().collect(Collectors.groupingBy(j -> j.getFirstName()));
//        Map<String, Map<String, List<Person>>> z = javaProgrammers.stream().collect(Collectors.groupingBy(t -> t.getFirstName(), Collectors.groupingBy(r -> r.getLastName())));
//        z.forEach((k, v) -> {
//            v.forEach((k1, v1) -> {
//                v1.forEach(v2 -> System.out.println(v2.getFirstName() + v2.getLastName()));
//            });
//        });
//
//
//    }
//
//    @Test
//    public void q() {
//        A a = null;
//        A b = a;
//        System.out.println(b);
//    }
//
//}
//
