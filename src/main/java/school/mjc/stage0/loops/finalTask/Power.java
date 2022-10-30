package school.mjc.stage0.loops.finalTask;

public class Power {
    public void printPower(int numberToPrint, int power) {
            
        int mul = numberToPrint;
        for (int i = 1; i <= power; i++) {
            numberToPrint *= mul;
        }
        System.out.println(numberToPrint / mul);
    }

    public static void main(String[] args) {
        new Power().printPower(10, 3);
    }
}
