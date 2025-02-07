class prgm2{
    public static void main(String args[]){
        int debit=0;
        int []a={700,1500,600,1200,400};
        for(int i=1; i<a.length;i++)
        {
            if(a[i]<a[i-1])
            {
                debit++;
            }
        }
        System.out.println("debit count is: " + debit);

    }
}