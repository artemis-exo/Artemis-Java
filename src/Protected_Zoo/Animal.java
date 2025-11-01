package Protected_Zoo;

public class Animal {
    private String name;

    protected String sound;

    public Animal(String name,String sound){
        this.name=name;
        this.sound=sound;
    }

    public void makeSound(){
        System.out.println((name+"Make a Sound: "+sound));
    }

    protected void changeSound(String newsound){
        this.sound=newsound;
    }
}
