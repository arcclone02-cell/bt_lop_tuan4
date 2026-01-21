    public class Rectangle {
        private double length;
        private double width;

        public Rectangle() {
            this.length = 1;
            this.width = 1;
        }
        public Rectangle(double length, double width) {
            this.length;
            this.width ;
        }
        public void setLength(double length) {
            this.length = length;
        }
        public void setWidth(double width) {
            this.width = width;
        }
        public double getLength() {
            return this.length;
        }
        public double getWidth() {
            return this.width;
        }
        public double getArea() {
            return this.length * this.width;
        }
        public String toString() {
            return "Rectangle[length=" + this.length + ", width=" + this.width + "]";
        }
    }
