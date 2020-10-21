package Pizza;

class Pizza {

	  String toppings;
	  int diameter;
	  double price;

	  public void setToppings(String t) {

	    toppings = t;

	  }

	  public void setDiameter(int d) {

	    diameter = d;

	  }

	  public void setPrice(double p) {

	    price = p;

	  }

	  public String getToppings() {

	    return toppings;

	  }

	  public int getDiameter() {

	    return diameter;

	  }

	  public double getPrice() {

	    return price;

	  }
	  
	  public void setPizzaValue(double p) {
		  
		  if(p >= 14) {
			  
			  price = 15.99;
			  
		  } else if(p <= 10) {
			  
			  price = 10.99;
			  
		  } else if(p <= 12) {
			  
			  price = 13.99;
			  
		  }
		  
	  }

	}