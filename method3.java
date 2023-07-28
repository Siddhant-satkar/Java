import java.util.*;
class Binomial{


        static int  getBinomial(int n,int r){

                int ans=0;
                int nfact=1;
                for(int i=1;i<=n;i++){

                        nfact=nfact*i;
                }
                int rfact=1;

                for(int i=1;i<=r;i++){

                        rfact=rfact*i;
                }
                int nrfact=1;
                for(int i=1;i<=(n-r);i++){

                        nrfact=nrfact*i;
                }



                return nfact/(rfact*nrfact);
        }
        public static void main(String[] args){

                Scanner sc = new Scanner(System.in);
                System.out.println("Enter value of n:");
                int n=sc.nextInt();

                System.out.println("Enter value of r:");
                int r=sc.nextInt();

                int ans = getBinomial(n,r);

                System.out.println("Answer="+ans);

        }


}
