#include<stdio.h>
#include<math.h>

int main()
{int t,v;
 scanf("%d",&t);
  scanf("%d",&v);

 float WCF = 35.74 + (0.6215)*t + ((0.4275*t) - (35.75)) *( pow(v,0.16));
  //fill your code
 printf("%.2f",WCF);
}