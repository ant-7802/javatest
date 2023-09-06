import java.util.Scanner; 
public class main {
    
    public static void main(String[] args) 
    {
        boolean ended;
        ended = false;
        double input;
        car car = new car();
        for (; ended == false;) {
           Scanner scanner = new Scanner(System.in);
        System.out.println("What do you want to do? \n1. Pick your Car\n2. Drive \n3. Refuel \n4. Get result");
        input = scanner.nextInt();
        if (input == 1) {
            System.out.println("What is the mpg on your car? (Set it around 20-30)");
            input = scanner.nextDouble();
            car.mpg(input);
        }
            else if (input == 2) {
                System.out.println("How far do you want to drive?");
                input = scanner.nextDouble();
                car.drive(input);
            }
                else if (input == 3) {
                    System.out.println("How much gas do you want to add?");
                    input = scanner.nextDouble();
                    car.refuel(input);
                }
                    else if (input == 4) {
                    System.out.println(car.getresult());
            }
        };

};
        
        
        

}

