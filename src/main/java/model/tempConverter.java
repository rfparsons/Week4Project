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
public class tempConverter {
	private double fahrenheit;
	private double celsius;
	private double kelvin;
	private double rankine; // kelvin on the fahrenheit scale
	/**
	 * 
	 */
	public tempConverter() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param fahrenheit
	 */
	public tempConverter(double fahrenheit) {
		super();
		this.fahrenheit = fahrenheit;
		
		setTemps(fahrenheit);
	}
	/**
	 * @param fahrenheit the fahrenheit to set
	 */
	public void setFahrenheit(double fahrenheit) {
		this.fahrenheit = fahrenheit;
		
		setTemps(fahrenheit);
	}
	
	/**
	 * @return the celsius
	 */
	public double getCelsius() {
		return celsius;
	}
	/**
	 * @param celsius the celsius to set
	 */
	public void setCelsius(double celsius) {
		this.celsius = celsius;
	}
	/**
	 * @return the kelvin
	 */
	public double getKelvin() {
		return kelvin;
	}
	/**
	 * @param kelvin the kelvin to set
	 */
	public void setKelvin(double kelvin) {
		this.kelvin = kelvin;
	}
	/**
	 * @return the rankine
	 */
	public double getRankine() {
		return rankine;
	}
	/**
	 * @param rankine the rankine to set
	 */
	public void setRankine(double rankine) {
		this.rankine = rankine;
	}
	/**
	 * @return the fahrenheit
	 */
	public double getFahrenheit() {
		return fahrenheit;
	}
	
	public void setTemps(double fahrenheit) {
		double cConv = (fahrenheit - 32) * 5/9;
		double kConv = cConv + 273.15;
		double rConv = fahrenheit + 459.67;
		
		setCelsius(cConv);
		setKelvin(kConv);
		setRankine(rConv);
	}
	@Override
	public String toString() {
		return "tempConverter [fahrenheit=" + fahrenheit + ", celsius=" + celsius + ", kelvin=" + kelvin + ", rankine="
				+ rankine + "]";
	}
	
	
}
