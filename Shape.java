package shapes;

/*
 * Abstract Shape class is used as a template to create
 * Sphere, Cylinder, and Cone classes. Each class contains
 * surface area, volume, and toString methods.
 */

//Abstract Shape Class
public abstract class Shape {
	public abstract double surface_area();
	public abstract double volume();
}

//Sphere Class
class Sphere extends Shape {
	private double radius;
	
	public Sphere(double radius) {
		this.radius = radius;
	}
	
	public double surface_area() {
		double area = 4 * Math.PI * radius * radius;
		return area;
	}
	
	public double volume() {
		double volume = (surface_area() * radius) / 3;
		return volume;
	}
	
	@Override
	public String toString() {
		return "Sphere:\nSurface Area: " + surface_area() + "\nVolume: " + volume() + "\n";
		}
}

//Cylinder Class
class Cylinder extends Shape {
	private double radius;
	private double height;
	
	public Cylinder(double radius, double height) {
		this.radius = radius;
		this.height = height;
	}
	
	public double surface_area() {
		double area = (2 * Math.PI * radius * height) +(2 * Math.PI * radius * radius);
		return area;
	}
	
	public double volume() {
		double volume = Math.PI * radius * radius * height;
		return volume;
	}
	
	@Override
	public String toString() {
		return "Cylinder:\nSurface Area: " + surface_area() + "\nVolume: " + volume() + "\n";
		}
}

//Cone Class
class Cone extends Shape {
	private double radius;
	private double height;
	
	public Cone(double radius, double height) {
		this.radius = radius;
		this.height = height;
	}
	
	public double surface_area() {
		double area = Math.PI * radius * (radius + Math.sqrt(height * height + radius * radius));
		return area;
	}
	
	public double volume() {
		double volume = (Math.PI * radius * radius * height) / 3;
		return volume;
	}
	
	@Override
	public String toString() {
		return "Cone:\nSurface Area: " + surface_area() + "\nVolume: " + volume() + "\n";
		}
}


