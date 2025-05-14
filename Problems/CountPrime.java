public class CountPrime {
    public int countPrimes(int n) {
        
        int primeCount=0;
        int num=2;
        int primeCheckNum=0;
        boolean isPrime=true;

        while(num<n){

            isPrime = true;
            primeCheckNum=2;

            while(primeCheckNum * primeCheckNum <= num ){

                if(num!=primeCheckNum && num % primeCheckNum == 0){
                    isPrime = false;
                    break;
                }

                primeCheckNum ++;

            }

            if (isPrime){
                primeCount++;
            }

            num++;

        }

        return primeCount;
    }
}
