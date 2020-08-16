package _05_vault;

import java.util.Random;

import jdk.nashorn.internal.scripts.JO;

public class Vault {
	Random random = new Random();
	long code = Math.abs(random.nextLong() % 1000000); 
public static void main(String[] args) {
	Vault vault  = new Vault();
	vault.tryCode(100000);
	JamesBond jamesBond = new JamesBond();
	jamesBond.findCode(vault);
}
public boolean tryCode(long guess)  {
	if(guess == code) {
		System.out.println("true");
		return(true);
	}
	return(false);
	}

}

