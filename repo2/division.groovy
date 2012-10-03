String str1;
println "Write the first number (higher one first): ";
str1 = System.console().readLine();
int i = Integer.parseInt(str1);
int y = Integer.parseInt(str1);

String str2;
println "Write the second number: ";
str2 = System.console().readLine();
int j = Integer.parseInt(str2);
n = 0;
int x;
x = 0;
while (i - j >= 0) {
	i = i - j;
	n = n + 1;
}

println y+" divided by "+j+" is "+n+ ", remainder "+i;