import java.util.*;
import java.io.*;

import animal.Animal;
import animal.Predator;
import animal.Herbivorous;
import animal.Omnivorous;

public class Main{
	public static void main(String[] args) throws IOException{
		Predator lion = new Predator(1, "lion", 40, 150);
		Predator tiger = new Predator(2, "tiger", 35, 130);
		Herbivorous cow = new Herbivorous(3, "cow", 45, 120);
		Herbivorous goat = new Herbivorous(4, "goat", 20, 75);
		Omnivorous raccoon = new Omnivorous(5, "raccoon", 10, 20);
		Omnivorous bear = new Omnivorous(6, "bear", 90, 200);

		ArrayList<Animal> animals = new ArrayList<Animal>();

		animals.add(lion);
		animals.add(tiger);
		animals.add(cow);
		animals.add(goat);
		animals.add(raccoon);
		animals.add(bear);

		System.out.println("Наш зоопарк: ");
		for (Animal animal : animals)
            System.out.println(animal.getId() + " " + animal.getName() + " " + animal.getClass().getSimpleName() + " количество еды: " + animal.calcFoodAmount());

		Collections.sort(animals);

		System.out.println("1 ______________");

		for (Animal animal : animals)
            System.out.println(animal.getId() + " " + animal.getName() + " " + animal.getClass().getSimpleName() + " количество еды: " + animal.calcFoodAmount());

        System.out.println("2 ______________");

        for(int i=0; i < 5; i++){
        	System.out.println(animals.get(i).getName());
        }

         System.out.println("3 ______________");

        for(int i=animals.size() - 3; i < animals.size(); i++){
        	System.out.println(animals.get(i).getId());
        }

        System.out.println("4/5 ______________");

        StringBuilder sb = new StringBuilder();
		for (Animal s : animals){
    		sb.append(s.getName() + " " + s.getClass().getSimpleName() + " количество еды: " + s.calcFoodAmount());
    		sb.append("\n");
		}
		

		// //создаем файл
		try(FileWriter writer = new FileWriter("result.txt", false)){

            String text = sb.toString();
            writer.write(text);

        }
        catch(IOException ex){
             
            System.out.println(ex.getMessage());
        } 

        System.out.println("файл создан: ");
        //читаем файл
        try(FileReader reader = new FileReader("result.txt"))
        {
           // читаем посимвольно
            int c;
            while((c=reader.read())!=-1){
                 
                System.out.print((char)c);
            } 
        }
        catch(IOException ex){
            ex.printStackTrace();
        }   

    

	}
}