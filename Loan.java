//Programmers: Jacob Merioles and Tomas Oh
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class Loan{
  
  //instance variables
  private int ID;
  private double loanAmount;
  private String country;
  private int daysToFund;
  private int numLenders;
  
  //constructor
  public Loan(int ID, double loanAmount, String country, int daysToFund, int numLenders){
    this.ID = ID;
    this.loanAmount = loanAmount;
    this.country = country;
    this.daysToFund = daysToFund;
    this.numLenders = numLenders;
  }
  
  //accessor methods
  public int getID()
  {
    return ID;
  }
  
  public double getLoanAmount()
  {
    return loanAmount;
  }

  public String getCountry()
  {
    return country;
  }
  
  public int getDaysToFund()
  {
    return daysToFund;
  }

  public int getNumLenders()
  {
    return numLenders;
  }
  
  //modifier methods
  public void setID(int initID)
  {
    ID = initID;
  }

  public void setLoanAmount(double initLoanAmount)
  {
    loanAmount = initLoanAmount;
  }

  public void setCountry(String initCountry)
  {
    country = initCountry;
  }

  public void setDaysToFund(int initDaysToFund)
  {
    daysToFund = initDaysToFund;
  }

  public void setNumLenders(int initSetNumLenders)
  {
    numLenders = initSetNumLenders;
  }

  //toString
  public String toString()
  {
    return "ID: " + ID + " loan amount: " + loanAmount + " country: " + country + " days to fund:  " + daysToFund + " num lenders: " + numLenders;
  }
}