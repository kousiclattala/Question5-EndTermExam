package main;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
class ToughQuestion2 {
            public static void main(String[] args) throws NumberFormatException, IOException {
                        Integer bread;
                        Integer butter;
                        Integer jam;
                        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                        Calories cal=new Calories();
                        System.out.println("1.Bread only\n2.Bread+Jam\n3.Bread+Jam+Butter");
                        System.out.println("Enter the choice");
                        Integer choice = Integer.parseInt(br.readLine());
                        switch(choice)
                        {
                        case 1 : System.out.println("Enter the number of Slice of bread");
                        	bread = Integer.parseInt(br.readLine());
                        	//call the function which calculate the calories for only bread
                        	double cal1 = cal.calculateCalories(bread);
                        	double energy1 = cal1 * 4.1868;
                        	System.out.printf("%.3f",energy1);
                        	System.out.print(" kJ of energy generated from "+cal1+" calories");
                        	break;
                        case 2 : System.out.println("Enter the number of Slice of bread");
                        	bread = Integer.parseInt(br.readLine());
                        	System.out.println("Enter the number teaspoon of Jam");
                        	jam = Integer.parseInt(br.readLine());
                        	//call the function which calculate the calories for only bread & jam
                        	double cal2 = cal.calculateCalories(bread,jam);
                        	double energy2 = cal2 * 4.1868;
                        	System.out.printf("%.3f",energy2);
                        	System.out.print(" kJ of energy generated from "+cal2+" calories");
                        	break;
                        case 3 : System.out.println("Enter the number of Slice of bread");
                        	bread = Integer.parseInt(br.readLine());
                        	System.out.println("Enter the number teaspoon of Jam");
                        	jam = Integer.parseInt(br.readLine());
                        	System.out.println("Enter the number teaspoon of Butter");
                        	butter = Integer.parseInt(br.readLine());
                        	//call the function which calculate the calories for  bread,jam & butter
                        	double cal3 = cal.calculateCalories(bread,jam,butter);
                        	double energy3 = cal3 * 4.1868;
                        	System.out.printf("%.3f"+energy3);
                        	System.out.print(" kJ of energy generated from "+cal3+" calories");
                        	break;
                        }
                        //System.out.printf("%.3f",ca.calculateEnergy());
                        //System.out.println(" kJ of energy generated from "+ca.returnCalories()+" calories");
            }

//			private static int cal.calculateCalories(Integer bread) {
//				// TODO Auto-generated method stub
//				return 0;
//			}
}
class Calories {
            
            int calculateCalories(int bread) {
            //you have to overload this function for three parameters refer the question
            	int calories = bread * 74;
            	return calories;
            }
            int calculateCalories(int bread,int jam) {
                //you have to overload this function for three parameters refer the question
            	int calories = (bread * 74) + (jam * 26);
            	return calories;
                }
            int calculateCalories(int bread,int jam,int butter) {
                //you have to overload this function for three parameters refer the question
            	int calories = (bread * 74) + (jam * 26) + (butter * 102);
            	return calories;
                }
                
            
            
}