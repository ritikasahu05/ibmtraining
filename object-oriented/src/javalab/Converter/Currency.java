package javalab.Converter;

public class Currency {
 private String sc;
 private String tc;
 private double value;
 private double amount;
 
 public Currency() {
 }
 
 public Currency(double amount, String sc, String tc, double value) {
 this.sc=sc;
 this.tc=tc;
 this.setValue(value);
 }

public double getValue() {
	return value;
}

public void setValue(double value) {
	this.value = value;
}
 
}
