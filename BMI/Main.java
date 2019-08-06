#include<stdio.h>
int main()
{float a,b;
 scanf("%f",&a);
  scanf("%f",&b);
 
float c=(a/b);
 c=c/b;
 c=c*10000;
 if (c>=25)
   printf("You are obese. Go to doctor");
 if (c<=24.9 && c>18.5)
   printf("You are normal. Go walking daily and maintain it."); 
 if (c<18.5)
   printf("You are underweight. Have an apple daily.");
  //fill your code
}
  //fill your code
