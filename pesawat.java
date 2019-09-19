/**
 * @(#)pesawat.java
 *
 *
 * @author
 * @version 1.00 2019/9/19
 */

import java.util.Scanner;
public class pesawat {

    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
    		int nomor;
    		char garuda;
    		char batik;
    		char lion;

    		System.out.print("Masukkan Nomor Pesawat : ");
    		nomor = input.nextInt();

    		if(nomor==1){
    			System.out.println("Nomor yang anda masukkan adalah garuda");
    		}
    		else

    			if (nomor==2){
    				System.out.println("Nomor yang anda masukkan adalah batik");
    			}
    			else

    				if(nomor==3){
    					System.out.println("Nomor yang anda masukkan adalah lion");
    				}
    				else
    					System.out.println("Maaf anda salah memasukan nomor pesawat");


    }


}