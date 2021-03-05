# Unit-7-Mini-project---Part-2

Lab Name: Computing Statistics with Kiva Data

Credit: 

Thanks to the creators of/contributors to the Foundations of Python Programming book (Brad Miller, Paul Resnick, Lauren Murphy, Jeffrey Elkner, Peter Wentworth, Allen B. Downey, Chris)

Lab description:

ArrayLists:

This lab focuses on experimenting with the ArrayList data structure and features a brief review of basic object-oriented programming.

Previously, you have used arrays to store and manipulate collections of primitives and objects. However, Java arrays can only represent collections of a fixed size. This is an unfortunate limitation as the programmer often does not know how many items will be added in advance.

Many programming languages, including Java, provide programmers with data structures that are resizable as well as random access and contiguous. In Java, this data structure is ArrayList. ArrayList internally maintains an array of data that is resized to accommodate additional elements. ArrayList also allows the programmer to add/remove items at arbitrary indices and even find the index of a particular item.

Kiva:

Kiva is an international nonprofit, founded in 2005 and based in San Francisco, with a mission to connect people through lending to alleviate poverty. We celebrate and support people looking to create a better future for themselves, their families, and their communities. By lending as little as $25 on Kiva, anyone can help a borrower start or grow a business, go to school, access clean energy or realize their potential. For some, it’s a matter of survival, for others it’s the fuel for a life-long ambition. We will use some Kiva data that contains some data that we will use to practice some basic descriptive statistics that are commonly used in data science.

Part 2: ComputingStatistics Class

Open the ComputingStatistics.java file
The instance variable, initialization constructor, and first method have been completed
Continue answering the questions posed below
Each method should use the method header provided
After each method, uncomment the line of code in ComputingStatisticsRunner.java and test your method

Level 1 Questions:

What is the total amount of money loaned?
public double totalAmount()
What is the average loan amount?
public double avgLoan()
What is the largest loan?
public double largestLoan()
Remember you can use Integer.MIN_VALUE
What is the smallest loan?
public double smallestLoan()
Remember you can use Integer.MAX_VALUE
What country got the largest loan?
public String largestLoanCountry()
What country got the smallest loan?
public String smallestLoanCountry()

Level 2 Questions:

What is the average number of days needed to fund a loan?
public double avgDaysToFund()
What was the largest loan made to people in Kenya?
public double largestLoanKenya()
Remember you can use Integer.MIN_VALUE
What is the average amount of loans made to people in the Philippines?
public double avgLoanPhilippines()
In which country was the loan granted that took the longest to fund?
public String longestToFundCountry()
Does El Salvador or Kenya have more loans funded?
public String mostLoansFunded()

Level 3 Questions:

For our final few questions, we are interested in exploring the distribution of the data. To do this we need to introduce a few more statistical concepts including variance and standard deviation.

Variance looks at a single variable and measures how far the set of numbers are spread out from their average value. However, it is a bit hard to interpret because the units are squared so it is not on the same scale as our original numbers. This is why most of the time we use the standard deviation, which is just the square root of the variance. A large standard deviation tells us that our data is quite spread out while a small standard deviation tells us that most of our data is pretty close to the mean.



Do not let the fancy math get you down, the variance is the sum of the squared values of each value minus the average for that value divided by the number of values. This website has a good explanation of variance and standard deviation. 

What is the variance of the money loaned?
public double variance()
What is the standard deviation of the money loaned?
public double standardDeviation()
The Empirical Rule or 68-95-99.7% Rule reminds us that 68% of the population falls within 1 standard deviation. Does this hold for our data?
public boolean empiricalRule()

Sample output (kiva_loans_small):

Total amount: 1.0778625E7
Average loan amount: 866.8670580665917
Largest loan amount: 12925.0
Smallest loan amount: 50.0
The country with the largest loan amount: India
The country with smallest loan amount: Philippines
Average days to fund loan request: 11.461476596429145
The largest loan funded in Kenya: 5875.0
Average loan amount in the Philippines: 325.30146425495263
The country with the longest to fund loan: Kenya
Variance: 1075599.4194342843
Standard deviation: 1037.1110931015464
Empirical rule (yes/no): true
