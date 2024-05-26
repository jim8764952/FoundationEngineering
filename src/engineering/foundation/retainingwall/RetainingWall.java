package engineering.foundation.retainingwall;

public interface RetainingWall {
    enum style {
        Cantilever,
    };
    double wallTotalHeight = 0;
    double toeSoilHeight = 0;
    double plateSlopeHeight = 0;
    double plateEndpointHeight = 0;
    double wallTopBreath = 0;
    double toeBreadth = 0;
    double heelBreath = 0;
    double plateTotalBreath = 0;
    double wallFrontSlope = 0;
}
