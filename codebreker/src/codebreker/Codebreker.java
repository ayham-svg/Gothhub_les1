package codebreker;

import java.lang.Math;
import java.util.Random;
import java.util.Scanner;

public class Codebreker {
    private static Random random = new Random();
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int[] kleuren = new int[9];
        
        kleuren[0] = 1;
        
        // 1 is rood
        kleuren[1] = 2;
        
        // 2 is geel
        kleuren[2] = 3;
        
        // 3 is groen
        kleuren[3] = 4;
        
        // 4 is paars
        kleuren[4] = 5;
        
        // 5 is oranje
        kleuren[5] = 6;
        
        // 6 is blauw
        kleuren[6] = 7;
        
        // 7 is zwart
        kleuren[7] = 8;
        
        // 8 is wit
        kleuren[8] = 9;
        
        // 9 is fout
        int[] secratecode = new int[4];
        
        secratecode[0] = kleuren[random.nextInt(6)];
        secratecode[1] = kleuren[random.nextInt(6)];
        secratecode[2] = kleuren[random.nextInt(6)];
        secratecode[3] = kleuren[random.nextInt(6)];
        int[] codekraker = new int[4];
        int[] codemaker = new int[4];
        int ronde;
        
        for (ronde = 0; ronde <= 10; ronde++) {
            codekraker[0] = input.nextInt();
            codekraker[1] = input.nextInt();
            codekraker[2] = input.nextInt();
            codekraker[3] = input.nextInt();
            if (codekraker[0] == secratecode[0]) {
                codemaker[0] = kleuren[7];
                System.out.println(codemaker[0]);
            } else {
                if (codekraker[0] == secratecode[1]) {
                    codemaker[0] = kleuren[8];
                    System.out.println(codemaker[0]);
                } else {
                    if (codekraker[0] == secratecode[2]) {
                        codemaker[0] = kleuren[8];
                        System.out.println(codemaker[0]);
                    } else {
                        if (codekraker[0] == secratecode[3]) {
                            codemaker[0] = kleuren[8];
                            System.out.println(codemaker[0]);
                        } else {
                            System.out.println(".");
                        }
                    }
                }
            }
            if (codekraker[1] == secratecode[1]) {
                codemaker[1] = kleuren[7];
                System.out.println(codemaker[1]);
            } else {
                if (codekraker[1] == secratecode[0]) {
                    codemaker[1] = kleuren[8];
                    System.out.println(codemaker[1]);
                } else {
                    if (codekraker[1] == secratecode[2]) {
                        codemaker[1] = kleuren[8];
                        System.out.println(codemaker[1]);
                    } else {
                        if (codekraker[1] == secratecode[3]) {
                            codemaker[1] = kleuren[8];
                            System.out.println(codemaker[1]);
                        } else {
                            System.out.println(".");
                        }
                    }
                }
            }
            if (codekraker[2] == secratecode[2]) {
                codemaker[2] = kleuren[7];
                System.out.println(codemaker[2]);
            } else {
                if (codekraker[2] == secratecode[0]) {
                    codemaker[2] = kleuren[8];
                    System.out.println(codemaker[2]);
                } else {
                    if (codekraker[2] == secratecode[1]) {
                        codemaker[2] = kleuren[8];
                        System.out.println(codemaker[2]);
                    } else {
                        if (codekraker[2] == secratecode[3]) {
                            codemaker[2] = kleuren[8];
                            System.out.println(codemaker[2]);
                        } else {
                            System.out.println(".");
                        }
                    }
                }
            }
            if (codekraker[3] == secratecode[3]) {
                codemaker[3] = kleuren[7];
                System.out.println(codemaker[3]);
            } else {
                if (codekraker[3] == secratecode[0]) {
                    codemaker[3] = kleuren[8];
                    System.out.println(codemaker[3]);
                } else {
                    if (codekraker[3] == secratecode[1]) {
                        codemaker[3] = kleuren[8];
                        System.out.println(codemaker[3]);
                    } else {
                        if (codekraker[3] == secratecode[2]) {
                            codemaker[3] = kleuren[8];
                            System.out.println(codemaker[3]);
                        } else {
                            System.out.println(".");
                        }
                    }
                }
            }
            if (codemaker[0] == kleuren[7]) {
                if (codemaker[1] == kleuren[7]) {
                    if (codemaker[2] == kleuren[7]) {
                        if (codemaker[3] == kleuren[7]) {
                            ronde = 11;
                            System.out.println("gewonnen");
                        }
                    }
                }
            }
        }
    }
}
