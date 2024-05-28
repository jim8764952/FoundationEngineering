package engineering.foundation.retainingwall;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import lombok.Getter;

import java.util.Vector;

import static java.lang.Math.abs;

@Getter
public class CantileverRetainingWall implements RetainingWall,Backfill {
    //擋土牆尺寸
    private double wallTotalHeight; // (m)
    private double toeSoilHeight; // (m)
    private double plateSlopeHeight; // (m)
    private double plateEndpointHeight; // (m)
    private double wallTopBreath; // (m)
    private double toeBreadth; // (m)
    private double bottomBreadth; // (m)
    private double heelBreath; // (m)
    private double plateTotalBreath; // (m)
    private double wallFrontSlope;
    //回填土性質
    private double cb; // (tf/m2)
    private double fb; // (deg.)
    private double wb; // (tf/m3)
    private double surfaceSlope; // (deg.)
    private double wallWithSf; // (deg.)
    //切面幾何
    private Vector<Double> pointX = new Vector<>();
    private Vector<Double> pointY = new Vector<>();
    public CantileverRetainingWall(){}

    public CantileverRetainingWall(
            double wallTotalHeight, double toeSoilHeight, double plateSlopeHeight,
            double plateEndpointHeight, double wallTopBreath, double toeBreadth,
            double heelBreath, double plateTotalBreath, double wallFrontSlope,
            double cb, double fb, double wb,
            double surfaceSlope,double wallWithSf)
    {
        this.wallTotalHeight = wallTotalHeight;
        this.toeSoilHeight = toeSoilHeight;
        this.plateSlopeHeight = plateSlopeHeight;
        this.plateEndpointHeight = plateEndpointHeight;
        this.wallTopBreath = wallTopBreath;
        this.toeBreadth = toeBreadth;
        this.bottomBreadth = plateTotalBreath - toeBreadth - heelBreath;
        this.heelBreath = heelBreath;
        this.plateTotalBreath = plateTotalBreath;
        this.wallFrontSlope = wallFrontSlope;
        this.cb = cb;
        this.fb = fb;
        this.wb = wb;
        this.surfaceSlope = surfaceSlope;
        this.wallWithSf = wallWithSf;

        pointX.add(0.);
        pointX.add(0.);
        pointX.add(toeBreadth);
        pointX.add(toeBreadth+bottomBreadth-toeBreadth);
        pointX.add(toeBreadth+bottomBreadth);
        pointX.add(toeBreadth+bottomBreadth);
        pointX.add(plateTotalBreath);
        pointX.add(plateTotalBreath);
        pointX.add(0.);

        pointY.add(0.);
        pointY.add(plateEndpointHeight);
        pointY.add(plateSlopeHeight+plateEndpointHeight);
        pointY.add(wallTotalHeight);
        pointY.add(wallTotalHeight);
        pointY.add(plateSlopeHeight+plateEndpointHeight);
        pointY.add(plateEndpointHeight);
        pointY.add(0.);
        pointY.add(0.);
    }
    double cross(double ax, double ay, double bx, double by){
        return ax * by - ay * bx;
    }
    public double getCrossSectionalArea(){
        double area = 0;

        System.out.println(getPointX());
        System.out.println(getPointY());

        for (int i=0;i < getPointX().size()-1;i++){
            area += cross(getPointX().get(i),getPointY().get(i),getPointX().get(i+1),getPointY().get(i+1));
        }

        return abs(area)/2;
    }
    public double getWallMoment;
    public double getWallCentroid(){
        return 0;
    }
}
