#include<stdio.h>
int main()
{int a,b;
 float c;
 scanf("%d",&a);
 if (a<=200)
   printf("Rs.%d\n",a/2);
  if (a<=400 && a>200){
     c =a*0.65;
    c=ceil(c);
   printf("Rs.%.0f",(c+100));
  }
  //fill your code
}