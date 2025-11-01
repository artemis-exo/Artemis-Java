package Collections_Framework;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashCodeAndEqualsMethod {
    public static void main(String[] args) {
        HashMap<Students,String>map=new HashMap<>();
        Students s1=new Students("Vedaant",1);
        Students s2=new Students("Madhav",2);
        Students s3=new Students("Siddharth",3);
        Students s4=new Students("Vedaant",1);
        // In object there will generate different hashcode if two entries are same
        map.put(s1,"Engineer");  // hashcode1 - - > index1
        map.put(s2,"Lawyer");     // hashcode2 - - > index2
        map.put(s3,"Doctor");     // hashcode3 - - > index3
        map.put(s4,"Inspector");   // hashcode4 - - > index4

        System.out.println("HashMap Size: " +map.size());
        System.out.println("Value of s1: " +map.get(s1));
        System.out.println("Value of s4: "+map.get(s4));
        // No object so same hashcode for similar entries
        Map<String, Integer> map1=new HashMap<>();
        map1.put("Shubham",90);    // hashcode1 - - > index1
        map1.put("Shalini",94);    // hashcode2 - - > index2
        map1.put("Shubham",97);     // hashcode1 - - > index1 - -> equals() - -> replace
        System.out.println(map1.get("Shubham"));  // Output - -> 97


    }

}
class Students{
    private String name;
    private int id;

    public Students(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id );
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return "id: " + id + ", name: " + name;
    }
}
