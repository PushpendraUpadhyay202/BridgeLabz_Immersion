// Write a Program to compute the volume of Earth in km^3 and miles^3
public class ComputeVolumeOfEarth {
    public static void main(String[] args) {
        double radiusKm = 6378.0;
        double pi = Math.PI;

        double volumeKm3 = (4.0 / 3.0) * pi * Math.pow(radiusKm, 3);

        double conversionFactor = 0.239913;
        double volumeMiles3 = volumeKm3 * conversionFactor;

        System.out.printf("The volume of Earth in cubic kilometers is %.2f and cubic miles is %.2f%n", volumeKm3, volumeMiles3);
    }
}