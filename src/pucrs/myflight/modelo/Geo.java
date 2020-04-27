package pucrs.myflight.modelo;

public class Geo {
	private double latitude;
	private double longitude;
	
	public Geo(double latitude, double longitude) {
		this.latitude = latitude;
		this.longitude = longitude;
	}
	
	public double getLatitude() {
		return latitude;
	}
	
	public double getLongitude() {
		return longitude;
	}

	//ex 2
	public static double distancia(Geo geo1, Geo geo2){
	double raioTerra = 6371;
	double lat1 = Math.toRadians(geo1.getLatitude());
	double long1 = Math.toRadians(geo1.getLongitude());
	double lat2 = Math.toRadians(geo2.getLatitude());
	double long2 = Math.toRadians(geo2.getLongitude());
	double distLat = lat2- lat1;
	double distLong = long2 - long1;
	double a = Math.sin(distLat/2) * Math.sin(distLat/2) + Math.cos(lat1) * Math.cos(lat2) * Math.sin(distLong/2) * Math.sin(distLong/2);
	double b = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1-a));
	double distancia = raioTerra * b; //distancia em km
	return distancia;
	}

	public String toString() { return latitude + ":" + longitude + "\n";}
}
