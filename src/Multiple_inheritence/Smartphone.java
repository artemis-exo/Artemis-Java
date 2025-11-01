package Multiple_inheritence;

public class Smartphone implements Camera, Music_player, phone {

    @Override
    public void takePhoto() {
        System.out.println("Taking photo with smartphone");
    }

    @Override
    public void takeVid() {
        System.out.println("Taking videos with smartphone");
    }

    @Override
    public void playMusic() {
        System.out.println("Playing music on smartphone");
    }

    @Override
    public void stopMusic() {
        System.out.println(("Stopping music on smartphone"));
    }


    @Override
    public void makeCall(String number) {
        System.out.println("Calling "+ number +"from smartphone ");
    }

    @Override
    public void endCall() {
        System.out.println("Ending the call ");
    }
}
