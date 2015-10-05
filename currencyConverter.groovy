# Initial comments
print "If I give you £1, how many Euro will you give me? ";
double euroOverPoundRatio = Double.parseDouble(System.console().readLine());
print "If I give you 1€, how many Pounds Sterling will you give me? ";
double poundOverEuroRatio = Double.parseDouble(System.console().readLine());
println "OK, now I have enough information.";
boolean finished = false;
while (!finished) {
    println "";
    println "What would you like to do?";
    println "   1 - Exchange Pounds Sterling into Euro";
    println "   2 - Exchange Euro into Pounds Sterling";
    println "   0 - Exit the program";
    println "";
    print   "> ";
    int choice = Integer.parseInt(System.console().readLine());
    switch (choice) {
    case 1:
	  print "How many pounds would you like to convert? ";
	  double pounds = Double.parseDouble(System.console().readLine());
	  double euro   = pounds * euroOverPoundRatio;
	  println "£" + pounds + " will give you " + euro + "€";
	  break;
    case 2: 
	  print "How many euro would you like to convert? ";
	  double euro   = Double.parseDouble(System.console().readLine());
	  double pounds = euro * poundOverEuroRatio;
	  println euro + "€ will give you £" + pounds;
	  break;
    case 0: 
	  finished = true;
	  break;
    default: 
	  println "Sorry, that is not a valid option";
    }	  
}
println "Exiting the program";
println "-------------------"