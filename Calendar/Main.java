#include<stdio.h>
int main()
{int a,b,c;
 scanf("%d",&a);
  scanf("%d",&b);
if (b%4==0){
switch (a){
  case(1):
  printf("Number of days is 31");
  break;
  case(2):
    printf("Number of days is 29");
  break;
     case(3):
  printf("Number of days is 31");
  break;
} 
}
else printf("Number of days is 28");
  //fill your code
}