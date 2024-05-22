package engineering.foundation.retainingwall;

import static java.lang.Math.tan;
import static java.lang.Math.toRadians;

public class StaticEarthPressure {
    /**
     * 計算單位面積靜止土壓力
     */
    public double getUnitAreaPa(){
        if (Sc > 0){
            pointPD = pointPD - 2*Sc/Sw * tan(toRadians(45+wallWithSf/2));
            if (pointPD <= 0){
                pointPD = 0;
            }
        }
        return CoulombActivateEarthPressureInNormalCond()*Sw*pointPD;
    }
    /**
     * 計算靜止土壓力合力（tf/m）
     */
    public double getPaF(){
        if (Sc > 0){
            wallH = wallH - 2*Sc/Sw * tan(toRadians(45+wallWithSf/2));
            if (wallH <= 0){
                System.out.println("H<=0 應考慮長期效應所造成之土壓力");
            }
        }
        return 0.5*CoulombActivateEarthPressureInNormalCond()*Sw*wallH;
    }
}
