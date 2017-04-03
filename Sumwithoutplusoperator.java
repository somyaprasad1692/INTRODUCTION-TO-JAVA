package Assignment;

public class Sumwithoutplusoperator {
static int add(int a,int b){
	if(b!=0){
	  //int carry=a&b;  
	  //a=a^b; //sum of two numbers
	  //b=carry << 1; 
	  //return add(a,b);
		int carry=(a&b)<<1;
		int sum=a^b;
		return add(sum,carry);
	}
	return a;
}

public static void main(String[] args) {
System.out.println("sum of number : "+add(7,3));
}
}
