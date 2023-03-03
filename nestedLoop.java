
public class nestedLoop{
    public static void main(String[] args) {



         for (int i =1; i<= 5; i++) {
            
            //System.out.println(i); // if I delete line 15, and add this line, it works for some reason. I dont know why
            for(int j=1; j<=i; j++){
                System.out.print(j);
              

            }
            System.out.println();
        }

        System.out.println();
        


        /* 
         * 1 1 1 1 1
         * 2 2 2 2
         * 3 3 3
         * 4 4
         * 5
        */
         for(int i = 5; i>= 1 ; i-- ) {
            
            
            for(int j = 1; j<=i; j++){
                System.out.print(j +" ");
            }
            System.out.println();

        } 

        System.out.println();
        

/*
 * 5 5 5 5 5
 * 4 4 4 4
 * 3 3 3
 * 2 2
 * 1
 */

 for (int i = 5; i >= 1; i--){
    for(int j = 0; j <i; j++) {
        System.out.print(i);
    }
    System.out.println();
 }
 System.out.println();


/*
 * 1 1 1 1 1
 * 2 2 2 2
 * 3 3 3
 * 4 4
 * 5
 */

for(int i =1; i <=5; i++){
for(int j = 5; j>=i; j--) {
    System.out.print(i);
}
System.out.println();

}

    }
}


