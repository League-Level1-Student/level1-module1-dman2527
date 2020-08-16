package _05_vault;

public class JamesBond {
	public void findCode(Vault vault) {	
	for(int i =0;i<1000000;i++) {
		if(i == vault.code) {
			System.out.println("The code is " +i);
		}
	
	}
	System.out.println(vault.code);
	}
}
