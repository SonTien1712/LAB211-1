/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week1;
import java.util.Scanner;
/**
 *
 * @author PC
 */
public class Test {
    public void main (String []args){
        Scanner scanner=new Scanner (System.in);
        while (true){
            System.out.println("Menu");
            System.out.println("1. Word Counter ");
            System.out.println("2. Linear Search ");
            System.out.println("3. Base Converter ");
            System.out.println("4. Equation Solve");
            System.out.println("5. Exit ");
            System.out.println("Choose an choice: ");
            int choice =scanner.nextInt();
            switch (choice){
                case:1{
                    WordCounter wordCounter =new WordCounter();
                    wordCounter.displayCounter();
                }
                case:2{
                    LinearSearch linearSearch= new LinearSearch();
                    linearSearch.displaySearch();
                }
                case:3{
                    BaseCoverter baseConverter =new BaseConverter();
                    baseConverter.displayConvert();
                }
                case:4{
                    EquationSolver equationSolver=new EqualtionSolver();
                    equationSolver.displaySolver();
                }
                case:5{
                    System.out.println("Exiting...");
                    return;
                }
                default:
                    System.out.println("Invalid choice.Please choose again! ");
            }
        }
    }
        
}
