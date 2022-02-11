/**
 * @author Bobby - rfparsons
 * CIS175 - Spring 2022
 * Feb 10, 2022
 */
package model;

/**
 * @author Bobby
 *
 */
public class lengthConverter {
	private double inches;
	private double feet;
	private double yards;
	private double centimeters;
	/**
	 * 
	 */
	public lengthConverter() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param inches
	 */
	public lengthConverter(double inches) {
		super();
		this.inches = inches;
		
		setLengths(inches);
	}
	/**
	 * @return the inches
	 */
	public double getInches() {
		return inches;
	}
	/**
	 * @param inches the inches to set
	 */
	public void setInches(double inches) {
		this.inches = inches;
		setLengths(inches);
	}
	/**
	 * @return the feet
	 */
	public double getFeet() {
		return feet;
	}
	/**
	 * @param feet the feet to set
	 */
	public void setFeet(double feet) {
		this.feet = feet;
	}
	/**
	 * @return the yards
	 */
	public double getYards() {
		return yards;
	}
	/**
	 * @param yards the yards to set
	 */
	public void setYards(double yards) {
		this.yards = yards;
	}
	/**
	 * @return the centimeters
	 */
	public double getCentimeters() {
		return centimeters;
	}
	/**
	 * @param centimeters the centimeters to set
	 */
	public void setCentimeters(double centimeters) {
		this.centimeters = centimeters;
	}
	
	public void setLengths(double inches) {
		double ftConv = inches / 12;
		double ydConv = inches / 36;
		double cmConv = inches * 2.54;
		
		setFeet(ftConv);
		setYards(ydConv);
		setCentimeters(cmConv);
	}
}
