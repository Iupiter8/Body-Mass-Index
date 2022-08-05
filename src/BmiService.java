public class BmiService {
    public double calculate (int mass, double h){
        double result = mass / (h * h);
        return result;
    }
}
