//Programmers: Jacob Merioles and Tomas Oh
import java.util.ArrayList;

public class ComputingStatistics {
   /**
   * The ArrayList containing all of the loan data.
   */
   private ArrayList<Loan> data;
   
   /**
    * Creates a new ComputingStatistics object with an empty ArrayList 
    */
   public ComputingStatistics() {
      data = new ArrayList<Loan>();
   }
   
   /**
    * Creates a new ComputingStatistics object with the data passed in
    */
   public ComputingStatistics(ArrayList<Loan> d) {
      data = d;
   }
   
   /**
    * Calclates the total amount funded from all of the loans in the file.
    * @return the total loan amount.
    */
    //What is the total amount of money loaned?
    public double totalAmount() {
      double amount = 0.0;
      for(int i = 0; i < data.size(); i++) {
         amount = amount + data.get(i).getLoanAmount();
      }
      return amount;
    }

    //What is the average loan amount?
    public double avgLoan(){
      double result = 0.0;
      int count = 0;
      for (int i = 0; i < data.size(); i++){
        count++;
        result += data.get(i).getLoanAmount();
      }
      result /= count;
      return result;
    }

    //What is the largest loan?
    public double largestLoan(){
      double x = data.get(0).getLoanAmount();
      for(int i = 1; i < data.size(); i++)
        if(data.get(i).getLoanAmount() > x)
          x = data.get(i).getLoanAmount();
      return x;
    }

    //Remember you can use Integer.MIN_VALUE
    //What is the smallest loan?
    public double smallestLoan(){
      double x = Integer.MAX_VALUE;
      for (int i = 0; i < data.size(); i++)
        if (data.get(i).getLoanAmount() < x)
          x = data.get(i).getLoanAmount();
      return x;
    }

    //Remember you can use Integer.MAX_VALUE. What country got the largest loan?
    public String largestLoanCountry(){
      double x = Integer.MIN_VALUE;
      for (int i = 0; i < data.size(); i++)
        if (data.get(i).getLoanAmount() > x)
          x = data.get(i).getLoanAmount();
      for (int i = 0; i < data.size(); i++)
        if (x == data.get(i).getLoanAmount())
          return data.get(i).getCountry();
      return "";
    }
    
    //What country got the smallest loan?
    public String smallestLoanCountry(){
      double x = Integer.MAX_VALUE;
      for (int i = 0; i < data.size(); i++)
        if (data.get(i).getLoanAmount() < x)
          x = data.get(i).getLoanAmount();
      for (int i = 0; i < data.size(); i++)
        if (x == data.get(i).getLoanAmount())
          return data.get(i).getCountry();
      return "";
      }
    
    //What is the average number of days needed to fund a loan?
    public double avgDaysToFund(){
      double x = 0;
      for(int i = 0; i < data.size(); i++)
        x += data.get(i).getDaysToFund();
      x = x/data.size();
      return x;
    }

    //What was the largest loan made to people in Kenya?
    public double largestLoanKenya(){
      ArrayList<Loan> kenya = new ArrayList<Loan>();
      for (int i = 0; i < data.size(); i++)
        if (data.get(i).getCountry().equals("Kenya"))
          kenya.add(data.get(i));
      double result = Integer.MIN_VALUE;
      for (int i = 0; i < kenya.size(); i++)
        if (kenya.get(i).getLoanAmount() > result)
          result = kenya.get(i).getLoanAmount();
      return result;
    }

    //What is the average amount of loans made to people in the Philippines?
    public double avgLoanPhilippines(){
      double total = 0.0;
      int count = 0;
      for(int i = 0; i < data.size(); i++)
        if(data.get(i).getCountry().equals("Philippines")){
          total += data.get(i).getLoanAmount();
          count += 1;
        }
      return total/count;
    }

    //In which country was the loan granted that took the longest to fund?
    public String longestToFundCountry(){
      ArrayList<Loan> countries = new ArrayList<Loan>();
      int result = Integer.MIN_VALUE;
      for (int i = 0; i < data.size(); i++)
        if (data.get(i).getDaysToFund() > result){
          result = data.get(i).getDaysToFund();
        }
      for (int i = 0; i < data.size(); i++)
        if (data.get(i).getDaysToFund() == result)
          return data.get(i).getCountry();
      return "";
    }
    //What is the variance of the money loaned?
    public double variance(){
      double x = 0.0;
      for(int i = 0; i < data.size(); i++)
      {
        double temp = data.get(i).getLoanAmount() - this.avgLoan();
        temp = temp * temp;
        x += temp;
      }
      return x/data.size();
    }
    //What is the standard deviation of the money loaned?
    public double standardDeviation(){
      double x = Math.sqrt(this.variance());
      return x;
    }
    
    //The Empirical Rule or 68-95-99.7% Rule reminds us that 68% of the population falls within 1 standard deviation. Does this hold for our data?
    public boolean empiricalRule(){
      double count = 0.0;
      double low = this.avgLoan() - this.standardDeviation();
      double high = this.avgLoan() + this.standardDeviation();
      for(int i = 0; i < data.size(); i++){
        if(this.avgLoan() > low && this.avgLoan() < high){
          count++;
        }

      }
      
      return count >= 0.68 * data.size();
    }


}