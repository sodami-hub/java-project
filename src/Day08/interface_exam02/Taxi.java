package Day08.interface_exam02;

public class Taxi implements Vehicle{
    @Override
    public void run() {
        System.out.println("택시가 달린다.");
    }
}
