package shapes;

public class ShapeArray {
/*
 * Main method for the Shape class. Creates an array
 * containing sphere, cylinder, and cone objects.
 * The program then loops through the area and
 * prints the surface area and volume of each shape.
 */
	public static void main(String[] args) {
		// Create Shape Objects
		Sphere sphere = new Sphere(3);
		Cylinder cylinder = new Cylinder(3,5);
		Cone cone = new Cone(3,5);
		
		//Shape Array
		Shape[] arr = {sphere, cylinder, cone};
		
		//Print Array
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i].toString());
		}
	}

}
