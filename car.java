public class car {
    int color;
    boolean auto;
    String engine;
    double mileage;
    int gas;
    double mpg;
    double tanksize;
    double tank;
    void definetanksize(double mpgdefined, double tanksize) {
        mpg = mpgdefined;
        this.tanksize = tanksize * mpg;
    }

    boolean drive(double distance) {
        if (distance / mpg > gas) {
            return false;
        };
        mileage += distance;
        gas -= 6.38 * (distance / mpg);
        return true;
    }
    boolean refuel(double amount) {
        if (amount + gas > 100) {
            return false;
        }
        gas += amount;
        return true;
    }
    String getresult() {
        return "Your car has driven " + mileage + " miles and has " + gas + "% of gas left";
    }
}
