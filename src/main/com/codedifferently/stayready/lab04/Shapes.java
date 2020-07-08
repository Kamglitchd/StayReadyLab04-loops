package com.codedifferently.stayready.lab04;


public class Shapes {

    public String triangle(){
        String tri ="";
        for(int i = 0; i <=5; i++) {
            for (int j = 0; j < i; j++) {
                //
                tri+="*";
            }
            tri+="\n";
        }

        return tri;
    }

    public String tableSquare(){
        String table = "";

        for (int number_row = 1; number_row <= 6; number_row++) {
            for (int number_column = 1; number_column <= 6; number_column++)
            {
                int product = number_column * number_row;
                String partial_row = String.format("%5d |", product);

                table = table + "  " + partial_row;

            }
            table = table + "\n";
        }
        return table;
    }

    public String tableSquares(int n){
        String table = "";

        for (int number_row = 1; number_row <= n; number_row++) {
            for (int number_column = 1; number_column <= n; number_column++)
            {
                int product = number_column * number_row;
                String partial_row = String.format("%5d |", product);

                table = table + "  " + partial_row;

            }
            table = table + "\n";
        }
        return table;
    }
}
