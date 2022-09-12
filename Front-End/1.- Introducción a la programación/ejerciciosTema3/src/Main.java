public class Main {

    public static void main(String[] args) {
        double resultant;
        resultant = summaryNumerous(10,25.5,3);
        System.out.println(resultant);

        Car myCar = new Car();
        myCar.addDoors();
        System.out.println("My car has " + myCar.doors + " door(s).");
    }

    public static double summaryNumerous(double a, double b, double c){
        return a + b + c;
    }
}

class Car{
    public int doors = 4;

    public void addDoors(){
        this.doors++;
    }

}