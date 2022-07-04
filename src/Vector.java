public class Vector {
    private double x, y, z;

    Vector() {
        this.x = 0;
        this.y = 0;
        this.z = 0;
        System.out.println("Vector \"0;0;0\" created successfully!");
    }

    Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
        System.out.println("Vector \"" + x + ";" + y + ";" + z + "\" created successfully!");
    }

    public double length() {
        return Math.sqrt((x*x) + (y*y) + (z*z));
    }

    public double scalar(Vector vec) {
        return ((x*vec.x) + (y*vec.y) + (z*vec.z));
    }

    public Vector vecComp(Vector vec) {
        return new Vector(
                (y*vec.z)-(z*vec.y),
                (z*vec.x)-(x*vec.z),
                (x*vec.y)-(y*vec.x)
        );
    }

    public double vecAngle(Vector vec) {
        return ((scalar(vec))/(length()*vec.length()));
    }

    public Vector subtract(Vector vec){
        return new Vector(
                x -vec.x,
                y-vec.y,
                z-vec.z
        );

    }

    public Vector add(Vector vec){
        return new Vector(
                x +vec.x,
                y+vec.y,
                z+vec.z
        );
    }

    public static Vector[] generate(int N){

        Vector[]vectors = new Vector[N];
        for (int i = 0; i < N; i++){
            vectors[i] = new Vector(Math.random(),Math.random(),Math.random());
        }
        return vectors;
    }

    @Override
    public String toString() {
        return "Vector {" +
                "x= " + x +
                "y= " + y +
                "z= " + z +
                '}';
    }
}
