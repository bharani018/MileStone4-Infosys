//array

import java.util.*;

class Array{

public static void main(String args[]){

int x[] = new int[5];

Scanner a1 = new Scanner(System.in);
for (int i =0;i<5;i++){
x[i]=a1.nextInt();
}

for (int i =0;i<5;i++){
System.out.print(" "+x[i]);
}
}
}


