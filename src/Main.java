import engineering.foundation.retainingwall.ActivateEarthPressure;
import engineering.foundation.retainingwall.CantileverRetainingWall;

public class Main {
    public static void main(String[] args) {
        CantileverRetainingWall cantileverRetainingWall = new CantileverRetainingWall(
                6.7,  1.5, 0.5,
             0.7,  0.5,  0.7,
         2.6,  4,  0.2,
         40,  30,  18,
         10, 12);
        System.out.println(cantileverRetainingWall.getCrossSectionalArea());
    }
}