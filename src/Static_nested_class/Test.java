package Static_nested_class;

public class Test {
    public static void main(String[] args) {
        Computer comp=new Computer("ASUS","TUF","LINUX");
        comp.getOs().displayInfo();
        Computer.USB usb=new Computer.USB("TYPE-C");
        Computer.USB usb1=new Computer.USB("TYPE-D");
        usb.displayInfo();
        usb1.displayInfo();





    }
}
