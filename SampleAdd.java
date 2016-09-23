class SampleAdd{

public static void main(String args[]){

if(args.length == 2){

Integer a = Integer.parse(args[0]);
Integer b = Integer.parse(args[1]);
Integer c = a+b;
System.out.println("Sum of the value is:- "+c);

}else{
System.out.println("Enter Only two values");

}

System.exit(0);


}


}