package demo1;

public class Conversion {
	
	public static void toBinary(int decimal) {
		//int[] binary= new int[40];
		String binar="";
		//int index=0;
		while(decimal>0) {
			//binary[index++]=decimal%2;
			binar+=decimal%2;
			decimal=decimal/2;
		}
		//for(int i=index-1; i>=0; i--) {
			//System.out.print(binary[i]);
		for(int i=binar.length()-1; i>=0; i--) {
			System.out.print(binar.charAt(i));
		}
		System.out.println();
	}
	
	public static void toOctal(int decimal) {
		int[] octal = new int[30];
		int index=0;
		while(decimal>0) {
			octal[index++]=decimal%8;
			decimal=decimal/8;
		}
		for(int i=index-1; i>=0; i--) {
		System.out.print(octal[i]);
	    }
		System.out.println();
	}
	
	public static void tohexatecimal(int decimal) {
		int[] hexadecimal = new int[40];
		int index=0;
		while(decimal>0) {
			hexadecimal[index++]=decimal%16;
			decimal=decimal/16;
		}
		for(int i=index-1; i>=0; i--) {
			System.out.print(hexadecimal[i]);
		}
		System.out.println();
	}
	
	
	public static int toDecimal( int binary) {
		int decimal=0;
		int i=0;
		while(binary>0) {
			int temp=binary%10;
			//System.out.println(temp);
			decimal+=temp*Math.pow(2,i);
			binary= binary/10;
			i++;
		}
		return decimal;
	}
	
	public static void binarytoOctal(int binary) {
		int decimalnum=0;
		int i=0;
		while(binary>0) {
			decimalnum+= (binary%10)*Math.pow(2, i);
			binary/=10;
			i++;
		}
		
		int[] octalnum = new int[40];
		int index=0;
		while(decimalnum>0) {
			octalnum[index++]=decimalnum%8;
			decimalnum/=8;
		}
		for(int j=index-1; j>=0; j--) {
			System.out.print(octalnum[j]);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		System.out.println("desimal to binary of 24 is ");
		toBinary(24);
        //System.out.println("decimal to octal of 24 is ");
        //toOctal(24);
        //System.out.println("decimal to hexadecimal of 24 is");
        //tohexatecimal(24);
        
        //System.out.println("binary to desimal of 1010 is "+ toDecimal(1010));
       // System.out.println("binary to octal of 1010 is ");
       // binarytoOctal(1010);
        //----------------------------------------------------------------------------
        //System.out.println("binary to hexadecimal of 1010 is "+ tohexadecimal("1010"));
        
        //System.out.println("octa to decimal of 30");
        //System.out.println("octa to binary of ");
        //System.out.println("octa to hexa");
        
        //System.out.println("hexa to decimal");
        //System.out.println("hexa to binary");
        //System.out.println("hexa to octa");
        
	}

}
