public class MatrixTranspose{  

    public static void main(String args[]){  
    //creating a matrix  
    int original[][]={{1,2,3},{4,5,6},{7,8,9}};    
      
    System.out.println("Printing Matrix without transpose:");  
    for(int i=0;i<3;i++){    
    for(int j=0;j<3;j++){    
    System.out.print(original[i][j]+" ");    
    }    
    System.out.println();//new line    
    }    
    System.out.println("Printing Matrix After Transpose:");  
    for(int i=0;i<3;i++){    
    for(int j=0;j<3;j++){    
    
    System.out.print(original[j][i]+" ");    
    }    
    System.out.println();//new line    
    }    
    }}     