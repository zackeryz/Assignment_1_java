/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.asssignment_1;

/**
 *
 * @author s0552089
 */
import java.util.Scanner;
public class ASSSIGNMENT_1 {
    public static void main(String[] args) {
       char loop = 'Y'; 
        do{
        int[][] myboard = {{0,1,2,3,4,5,6,7},{0,1,2,3,4,5,6,7},{0,1,2,3,4,5,6,7},{0,1,2,3,4,5,6,7},{0,1,2,3,4,5,6,7},{0,1,2,3,4,5,6,7},{0,1,2,3,4,5,6,7},{0,1,2,3,4,5,6,7}}; 
         
        System.out.println("Imagine a board of 64 squares,8x8");
        empty(myboard);
         int win;
         int i = 0;
         do{
         if(i == 2){i = i - 2;}
         i = i + 1;
             turn(myboard, i);
            win = check(myboard);
            display(myboard);
         }while(win == 0);
         System.out.println("Do you want to play again? (Y/N)");
         Scanner input = new Scanner(System.in);
         loop = input.next().charAt(1);
          }while(loop == 'Y');
    }
    static void turn(int board[][],int i){
        Scanner input = new Scanner(System.in);
         int x = 0 ;
         int y = 0;
         char full = 'n';
         do{
             do{
                 
          System.out.println("Player " +i+ " Enter a number from 0-7 for the x axis");
          x = input.nextInt() - 1;
          if(x >= 8||x < 0){System.out.println("That number is out of range.\n");}
          }while(x >= 8|| x < 0);
             do{
           System.out.println("Player " +i+" Enter a number from 0-7  for the y axis");
          y = input.nextInt() - cxz1;
          if(y >= 8||y < 0){System.out.println("That number is out of range.\n");}
          }while(y >= 8 || y < 0);
          if(board[x][y]== 1 || board[x][y]== 2 || board[x][y]== 3 )
          {System.out.println( board[x][y] + " is alrady in that spot, Try again! ");}
          else{
              full = 'y';
          }
         }while(full == 'n');
         
          if(i==1){
          board[x][y]= 1;
          }
          if(i==2){
          board[x][y]= 2;
          }
          if(i==3){
          board[x][y]= 3;
          }
    }
    
    static int check(int board[][]){
        int win = 0;
                
        for(int i = 0;i <= 4; i++)
        {
            for(int j = 0;j <=2; j++)
            {
            if(board[j][i] == 1 || board[j][i] == 3 || board[j][i] == 2){
                if(board[j][i] == board[j+1][i]){
                    if(board[j][i] == board[j+2][i]){
                        if(board[j][i] == board[j+3][i]){
                            win = board[j][i];
                            System.out.println("winner = " + board[j][i]); } } }
                if(board[j][i] == board[j][i+1]){
                    if(board[j][i] == board[j][i+2]){
                        if(board[j][i] == board[j][i+3]){
                            win = board[j][i];
                            System.out.println("winner = " + board[j][i]); } } } 
            if(board[j][i] == board[j+1][i+1]){
                    if(board[j][i] == board[j+2][i+2]){
                        if(board[j][i] == board[j+3][i+3]){
                            win = board[j][i];
                            System.out.println("winner = " + board[j][i]); } } } }}
            
            for(int j = 3;j <=4; j++)
            {
            {
            if(board[j][i] == 1 || board[j][i] == 3 || board[j][i] == 2){
                if(board[j][i] == board[j+1][i]){
                    if(board[j][i] == board[j+2][i]){
                        if(board[j][i] == board[j+3][i]){
                            win = board[j][i];
                            System.out.println("winner = " + board[j][i]); } } }
                if(board[j][i] == board[j][i+1]){
                    if(board[j][i] == board[j][i+2]){
                        if(board[j][i] == board[j][i+3]){
                            win = board[j][i];
                            System.out.println("winner = " + board[j][i]); } } } 
                if(board[j][i] == board[j+1][i+1]){
                    if(board[j][i] == board[j+2][i+2]){
                        if(board[j][i] == board[j+3][i+3]){
                            win = board[j][i];
                            System.out.println("winner = " + board[j][i]); } } } 
                 if(board[j][i] == board[j-1][i+1]){
                    if(board[j][i] == board[j-2][i+2]){
                        if(board[j][i] == board[j-3][i+3]){
                            win = board[j][i];
                            System.out.println("winner = " + board[j][i]); } } } }}}
            
            for(int j = 5;j <=7; j++)
            {
            {
            if(board[j][i] == 1 || board[j][i] == 3 || board[j][i] == 2){
               if(board[j][i] == board[j-1][i+1]){
                    if(board[j][i] == board[j-2][i+2]){
                        if(board[j][i] == board[j-3][i+3]){
                            win = board[j][i];
                            System.out.println("winner = " + board[j][i]); } } }  
                if(board[j][i] == board[j][i+1]){
                    if(board[j][i] == board[j][i+2]){
                        if(board[j][i] == board[j][i+3]){
                            win = board[j][i];
                            System.out.println("winner = " + board[j][i]); } } } }}
            }
        }
        for(int i = 0;i <= 7; i++)
        {
            for(int j = 0;j <=4; j++)
            {
            if(board[j][i] == 1 || board[j][i] == 3 || board[j][i] == 2){
                if(board[j][i] == board[j+1][i]){
                    if(board[j][i] == board[j+2][i]){
                        if(board[j][i] == board[j+3][i]){
                            win = board[j][i];
                            System.out.println("winner = " + board[j][i]); } } }}}
        }
        return win;
    }
   

static void empty(int board[][]){
    for(int i = 0;i <= 7; i++){
        
            for(int j = 0;j <=7; j++){
            board[j][i] = 0;
            }}
}
   static void display(int board[][]){
       String line = "";
    for(int i = 0;i <= 7; i++){
      
            for(int j = 0;j <=7; j++){
            line = line + Integer.toString(board[i][j]);
            
            }
            System.out.println(line);
            line = "";
    }
    
   }}
