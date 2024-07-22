public class car {

    String model;
    int wheels;
     
    public car(String m){
        this.model = m;
        this.wheels = 4;
    }
    
    public void drive(){
        if (this.wheels < 4){
            System.out.println(this.model + " no go vroom");
            return;
        }
        System.out.println(this.model + " go vroom");
    }

    public int getNumWheels(){
        return this.wheels;
    }

    public void driveIntoDitch(int wheelsLost){
        this.wheels = this.wheels -wheelsLost;
    }

    public static void main(String[] args){
        car c1;
        car c2;

        c1 = new car("Civic Type R");
        c2 = new car("Toyota Camry");

        c1.drive();
        c1.driveIntoDitch(2);
        c1.drive();
    }
}