package engineering.foundation.retainingwall;

import static java.lang.Math.*;

public class CoulombEarthPressure {
    private double unitAreaPa; //單位面積主動土壓力（tf/m^2）
    private double PaF; //主動土壓力合力（tf/m）
    private double Sw; //土壤單位重(tf/m^3）
    private double Sc; //土壤凝聚力（tf/m^2）
    private double wallH; //牆之垂直高度（m）
    private double pointPD; //牆頂地表面至欲求土壓力點之垂直深度（ｍ）
    private double Sf; //牆背土壤之內摩擦角（度）
    private double wallWithSf; //牆背面與土壤間之摩擦角（度）
    private double backSDeg; //牆背地表面與水平面之交角（度）
    private double backDeg; //牆背面與垂直面交角（度），以逆時針方向為正，順時針方向為負

    /**
     * 計算Coulomb 主動土壓力係數
     * V : Vertical
     * P : Pressure
     * D : Depth
     * W : Weight
     * F : Force
     * A : Activate
     * C : Cohesion
     * @return double Ka
     */
    public double CoulombActivateEarthPressureInNormalCond(){
        double KaNumerator = pow(cos(toRadians(Sf-backDeg)),2);
        double KaDenominatorLeft = pow(cos(toRadians(backDeg)),2)*cos(toRadians(backDeg+wallWithSf));
        double KaDenominatorRight = pow(1+sqrt((sin(toRadians(Sf+wallWithSf))*sin(toRadians(Sf-backSDeg)))/(cos(toRadians(wallWithSf+backDeg))*cos(toRadians(backDeg-backSDeg)))),2);

        return KaNumerator/(KaDenominatorLeft*KaDenominatorRight);
    }

}
