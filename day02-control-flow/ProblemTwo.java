public class ProblemTwo {

    public void log() {
        for(int i = 0; i<=10; i++) {
            if(i == 5) {
                break;
            }
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        ProblemTwo obj = new ProblemTwo();
        obj.log();
    }
}
