
public class VaultCracker {
public static void main(String[] args) {
	int A = 10000000;
	int i = 0;
	int Code = 1 + (int)(Math.random()*A);
	for (i = 0; i < A; i++) {
		System.out.println("Trying "+i);

		if(i == Code){
		System.out.println("Decription Success! Code: "+Code);	
		System.exit(0);
}
}
}
}
