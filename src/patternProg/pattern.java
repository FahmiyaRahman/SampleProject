package patternProg;

public class pattern {
	public static void main(String[] args) {
		
	
int n=5,a=2;
for (int i =1,p=0; i <=n; i++,p+=a) {
	for (int j = 1; j<=i; j++) {
		System.out.print(p);
	}
	System.out.println();
}

for (int i =1 ; i <=5; i++) {
	for (int j = 1; j <=i; j++) {
		if(i%2==0) {
			System.out.print("b");
	}
		else
		{
			System.out.print("a");
		}
}
System.out.println();
}
}
}