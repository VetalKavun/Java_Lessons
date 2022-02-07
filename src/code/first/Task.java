package first;

public class Task {

    public  double conversationMetersToInches(double meter){

        double inch;
        inch = meter * 39.37;
        return inch;


    }

public void printInches(){
       for(int i = 1;i <= 100;i++){

           System.out.println(i + " in inch " + conversationMetersToInches(i));

           if( i % 10 == 0){
               System.out.println();
           }

       }





};

// for( meter = 1;meter <= 100;meter++){
//
//         inch = meter * 39.37;
//         System.out.println(meter + " in inch " + inch);
//
//         counter++;
//         if(counter == 10){ counter=0;System.out.println(); };}
}


