package Static;
// Singleton Design
public class School {
    private  static School welz =new School();

    private School(){   // so that school has only one instance

    }
    public static School getVedaant(){
        return welz;
    }
}
