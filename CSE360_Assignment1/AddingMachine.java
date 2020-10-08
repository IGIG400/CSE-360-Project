/*
 * Name: Isaiah Graham
 * Assignment: Assignment 2
 * Date: 10/7/20
 */
package cse360assignment02;
/*
 * This describes the class of the adding machine 
 */
public class AddingMachine {
  private int total;
  private String history;
 /*
  * This is the AddigMachine constructor that sets its total to 0
  */
  public AddingMachine () {
    total = 0;  // not needed - included for clarity
    history = "0";
  }
  /*
   * This method gets the total 
   */
  public int getTotal () {
    return total;
  }
  /*
   * This is a public method that adds the integer passed in as value to the total
   */
  public void add (int value) {
	  total  = total + value;
	  history = history + " + " + value;
	  
  }
/*
 * This is a public method that subtracts the integer represented by the value from the total
 */
  public void subtract (int value) {
  total = total - value;
  history = history + " - " + value;
  } 
/*
 * (non-Javadoc)
 * @see java.lang.Object#toString()
 * 
 * The toString is returns a string representation of an object
 */
 
  public String toString () {
    return history;
  }
/*
 * This method will reset the history to 0
 */
  public void clear() {
	  history = "0 ";
  }
}