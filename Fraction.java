class Fraction {
    private int  x;
    private int y;
  public Fraction(int n, int d){
      x = n;
      y = d;
      
  }
  public void setNumerator(int n){
      x = n;
  }
  public void setDenominator(int d){
      y = d;
  }
  public void displayFraction(){
      System.out.println( x + "/" + y);
  }
  public boolean equals(Fraction other){
      int num1,num2;
      int num3, num4;
      int num5 = 1;
      for(int i=2; i<=Math.min(x,y); i++){
          if (x%i==0 && y%i==0)
              num5 = i;     
      }
      num1 = x/num5;
      num2 = y/num5;
      int otherGcf = 1;
      for(int i = 2; i<= Math.min(other.x, other.y); i++ ){
        if (other.x % i == 0 && other.y % i == 0)
				otherGcf = i;
 
      }
      num3 = other.x / otherGcf;
		num4 = other.y / otherGcf;

		return (num1 == num3 && num2 == num4);
  }
}