
package PRELIM;

public class MultiArray {
    public static void main(String[] args) {
        int numbers[][] = {
                   {31, 54, 12 }, 
                   {22, 40, 33 },
                   {53, 23, 57 }
        };
        
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                System.out.print(numbers[i][j] + " ");
                
            }
            System.out.println("");
            
        }
    }
    
}

