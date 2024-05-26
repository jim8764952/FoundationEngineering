package engineering.foundation.retainingwall;

public class ImpRetainingWall implements RetainingWall,Backfill {
    //擋土牆尺寸
    double wallTotalHeight = 0; // (m)
    double toeSoilHeight = 0; // (m)
    double plateSlopeHeight = 0; // (m)
    double plateEndpointHeight = 0; // (m)
    double wallTopBreath = 0; // (m)
    double toeBreadth = 0; // (m)
    double heelBreath = 0; // (m)
    double plateTotalBreath = 0; // (m)
    double wallFrontSlope = 0;
    //回填土性質
    double cb = 0; // (tf/m2)
    double fb = 0; // (deg.)
    double wb = 0; // (tf/m3)
    double surfaceSlope = 0; // (deg.)

    public ImpRetainingWall(double wallTotalHeight, double toeSoilHeight, double plateSlopeHeight, double plateEndpointHeight, double wallTopBreath, double toeBreadth, double heelBreath, double plateTotalBreath, double wallFrontSlope, double cb, double fb, double wb, double surfaceSlope) {
        this.wallTotalHeight = wallTotalHeight;
        this.toeSoilHeight = toeSoilHeight;
        this.plateSlopeHeight = plateSlopeHeight;
        this.plateEndpointHeight = plateEndpointHeight;
        this.wallTopBreath = wallTopBreath;
        this.toeBreadth = toeBreadth;
        this.heelBreath = heelBreath;
        this.plateTotalBreath = plateTotalBreath;
        this.wallFrontSlope = wallFrontSlope;
        this.cb = cb;
        this.fb = fb;
        this.wb = wb;
        this.surfaceSlope = surfaceSlope;
    }

}
