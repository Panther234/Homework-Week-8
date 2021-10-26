package homework_week_8.answer_19;

public class Cylinder extends Circle {
    double height;

    Cylinder(double radius, double height) {
        super(radius);

        if(height < 0){
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return getArea() * height;
    }
}
