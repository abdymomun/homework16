public class Triangle extends Shapes{
private double longg;
private double right;

        public Triangle(double longg, double right) {
                this.longg = longg;
                this.right = right;
        }

        @Override
        public double findArea() {
         return longg * right / 2;
        }

}
