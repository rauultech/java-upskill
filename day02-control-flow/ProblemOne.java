public class ProblemOne {
    int age = 30;

    public void checkAge() {
        if(age >= 18) {
            System.out.println("Adult");
        } else {
            System.out.println("Minor");
        }
    }

    static public void main(String[] args) {
        ProblemOne obj = new ProblemOne();
        obj.checkAge();
    }
}
