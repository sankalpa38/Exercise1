/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week2.softwarefundamentals.exercise1;
import java.util.Scanner;
import java.util.Random;

/**Modifier: Sankalpa Paudel Student Number: 991378123
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author dancye 
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
           
            Random random = new Random();
            int randomValue=random.nextInt(magicHand.length);
            String randomSuit=(Card.SUITS[random.nextInt(Card.SUITS.length)]);
            
            
            //c.setValue(insert call to random number generator here)
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])

            
        }
        
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
        Scanner input=new Scanner(System.in);
        
        int[] card= new int[7];
        for(int i = 0; i< 7; i++){                                                                                                                                                                                                                           
        System.out.print("Please enter the card of your choice Card Value and Suit " + 1 + ":");
        card[i] = input.nextInt();
        }
        
       
        
        
        
        
    }
    
}
