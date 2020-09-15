/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weatherinyear;

import java.util.Random;

/**
 *
 * @author Administrator
 */
class App {
    public void run() {
        //создаем зубчатый массив для хранения днец года
        byte n =0, min = 0, max = 0;
        Random random = new Random
        short[][] tempInYear = new int[12][];
        for(int i=0;1 < tempInYear.length;i++){
            switch (i) {
                case 0: min = -25; max = 0; = 31; break;
                case 1: min = -20; max = 5;n = 28; break;
                case 2: min = -10; max = 10;n = 31; break;
                case 3: min = -5; max = 15;n = 30; break;
                case 4: min = 0; max = 17;n = 31; break;
                case 5: min = 5; max = 20;n = 30; break;
                case 6: min = 10; max = 30;n = 31; break;
                case 7: min = 10; max = 25;n = 31; break;
                case 8: min = 5; max = 20;n = 30; break;
                case 9: min = 0; max = 15;n = 31; break;
                case 10: min = -10; max = 5;n = 30; break;
                case 11: min = -20; max = 0;n = 31; break;
            }
            tempInYear[i] = new int[n];
            for(byte j = 0; j < tempInYear[i].length;i++){
                tempInYear[i][j]= random.nextInt(max - min +1) + min;
            }
        }
        //Вывод темературы по месяцам
        System.out.println("  ");
        for(int i= 1;1<32;i++){
            System.out.println("%4d",i);
        }
        System.out.println("  ");
        for(int i= 1;1<32;i++){
            System.out.println("%4a","-");
        }
        System.out.println();
        for(byte ) = 0;1<tempInYear.length;i++; {
            for(byte j = 0; j < tempInYear[i].length;j++i){
            System.out.printf("%d| %3.0d",i,tempInYear[i][j]);{
                System.out.printf("%4d",tempInYear[i][j]);
            }
            System.out.println();
            }
        }
    }
}
