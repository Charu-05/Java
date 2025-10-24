public class Basic{
    public static void main(String[] args){
        int age=25;
        double salary=55000.7523456789123;
        char grade='A';
        boolean isEmployed=true;
        String name="Charumathi";
        float price=9.8767543257899f;
        int count=28999;
        byte level=125;
        long population=6000000000000000L;

        int[] numbers={10,20,30,40,50};

        
    

        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
        System.out.println("Salary:"+salary);
        System.out.println("Grade:"+grade);
        System.out.println("Employed:"+isEmployed);
        System.out.println("Price:"+price);
        System.out.println("Count:"+count);
        System.out.println("Level:"+level);
        System.out.println("Population:"+population);
        System.out.println("First element:"+numbers[0]);
        System.out.println("Last element:"+numbers[4]);
        System.out.println("All element:");
        for(int i=0;i<numbers.length;i++){
            System.out.println(numbers[i]);
        }


    }
}