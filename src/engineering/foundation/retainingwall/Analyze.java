package engineering.foundation.retainingwall;

import static java.lang.Math.*;

public class Analyze {
    enum ActivateEarthPressureMethod{Coulomb};
    enum PassiveEarthPressureMethod{CaquotKerisel}
    public double fallCheck(CantileverRetainingWall crw){
        //傾覆
        ActivateEarthPressure activateEarthPressure = new ActivateEarthPressure(crw);
        double Pa = activateEarthPressure.getPaF();
        double momentF = crw.getWallTotalHeight() / 3 * Pa * cos(toRadians(crw.getWallWithSf())); // 主動土壓力向左分力
        //抵抗

        double momentR =
                (crw.getBottomBreadth()+crw.getToeBreadth())* Pa * sin(toRadians(crw.getWallWithSf()))
                + (1); // 牆趾覆土 牆身重 主動土壓力向下分力

        return 0;
    }
    public double slideCheck(){return 0;};
    public double breakCheck(){return 0;};
}
