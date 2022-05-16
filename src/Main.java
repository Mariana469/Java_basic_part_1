public class Main {
    static void concatinateString() {
        String s1 = "PHP Exercises and";
        String s2 = "Python Exercises";
        String s3 = s1.concat(" ").concat(s2);
        String s4 = s3.replace ("P", "");
        System.out.println(s4);
    }
        public static void main(String[] args) {
            concatinateString();
        }


}
