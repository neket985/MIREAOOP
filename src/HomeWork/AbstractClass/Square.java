package homework.AbstractClass;


 class Square extends Rectangle{
     public Square() {
     }

     public Square(double side) {
     }

     public Square(double side,boolean filled, String color ) {
         super(filled,color, side,side);
     }

     public double getSide() {
         return width;
     }

     public void setSide(double width) {
         this.width = width;
     }
     @Override
     public String toString() {
         return super.toString();
     }

     @Override
     public void setWidth(double width) {
         super.setWidth(width);
     }

     @Override
     public void setLength(double length) {
         super.setLength(length);
     }
 }

