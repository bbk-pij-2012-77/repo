String x
int a = 0;
boolean finished = false;
while (!finished) {
	println "Enter a positive number (when done finish with -1):";
	String s = System.console().readLine();
	int b = Integer.parseInt(s);
	if (b != -1) {
		if (b > a) {
			a = b;
			x = "yes";
		} else {
			x = "no";
			a = 99999999999;
		}
	} else {
		finished = true;
	}
}
println "Answer is: ";
print x