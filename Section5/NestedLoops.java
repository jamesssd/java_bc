package Section5;

public class NestedLoops {
    public static void main(String[] args) {
        for(int i = 0; i<3; i++){
            System.out.println("run: " + i);

            for(int j = 0; i<3; i++){
                System.out.println("inner loop: "  + j);
            }
        }
    }
}
