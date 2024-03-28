public class ex7 {
    public static void main(String[] args) {
        System.out.println(BMI(62,1.73));
    }
    public static double BMI(double weight, double height){
        return weight/(height * height);
    }
}
