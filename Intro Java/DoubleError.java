class DoubleError {
     public static void main(String[] args) {
    
          double r = Math.sqrt(2.0);
         
          //You would expect r*r==2
          System.out.println(r*r);
         
          //And this would be true
          System.out.println(r*r == 2);
         
          //But neither is true
         
          //And this is the right way
          final double EPSILON = 1E-14;
         
          //And this *is* true
          System.out.println(Math.abs(r*r - 2.0) < EPSILON);
     }
}