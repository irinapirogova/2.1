import java.util.Scanner;
public class Qqq{
public static int iterativeFab(int n){
int x_1=-1,x_2=0,fab_x=0;
for(int i=0;i<n;i++){
fab_x=x_1+x_2;
x_1=x_2;
x_2=fab_x; 
}
return Math.abs((fab_x));
}

public static void main(String []args){

System.out.print("How many numbers fabinochi calculate: ");
Scanner in = new Scanner(System.in);
int x=in.nextInt();
System.out.print(iterativeFab(x));

} 
}
