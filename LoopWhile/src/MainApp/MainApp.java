package MainApp;

public class MainApp {
public static void main(String[]args) {
	// TODO Auto-generated method stub
int i=0;
int tong=0;
do {
i++;
if(i % 3==0)
	break;
if(i % 5==0)
break;

tong+=1;
}while(true);
System.out.println("tong="+tong);
System.out.println("i="+i);
}

   }
