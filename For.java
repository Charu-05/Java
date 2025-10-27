

public class For {
    public static void main(String[] args) {

     int [][]num={{1,2,3,4},{5,6,7}};
     for (int i=0;i<num.length;i++){
        String some="";
       for(int j=0;j<num[i].length;j++){
        some+=num[i][j];
        
       }
       System.out.println(some);
     }
    
    }

}
