package Armstrong_no;

public class Armstrong_number {
	public static void main(String[] args) {
                                                                                      // a = n % 10 brief steps 
              int n =153;   int a = 0;  int ans = 0 ;                                  // 153 % 10= 15.3 a = 3
                                                                                    //ans = ans + [(3*3*3)= 27]
                 int temp =n;      
                                                                                            //15 % 10 = 1.5   a=5
                 while (n>0) {                                                              // ans = 27+[(5*5*5)= 125] 
                                                                                       // 1/10 = 0.1  a=1
                  a=n%10;                                                                   // ans = 27+125[(1*1*1)=1]
                                                                                     // ans = 27+125+1=153 
               ans = ans +(a*a*a);

               n = n/10;
                } 
          
              
             if (temp==ans) {
              System.out.println("its an Armstrong number  "+ans);
            }
         else {
                 System.out.println("its not an amstrong number "+ans); 
         }                 
            
          }
		}



	


       






