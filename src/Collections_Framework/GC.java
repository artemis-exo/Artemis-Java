package Collections_Framework;

import java.lang.ref.WeakReference;

public class GC {
    public static void main(String[] args) {
        Phone phone =new Phone("Apple","17 Pro Max");  // Strong reference
        System.out.println(phone);
        phone=null;
        System.out.println(phone);
        // Weak Hash Map
        WeakReference<Phone> phoneWeakReference=new WeakReference<>(new Phone("Samsung","S24 Ultra"));
        System.out.println(phoneWeakReference.get());
        System.gc();
        try{
            Thread.sleep(7000);
        } catch(Exception ignored){
        }
        System.out.println(phoneWeakReference.get());
    }
}

class Phone{

    String brand;
    String model;

    public Phone(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
