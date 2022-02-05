class Main {
  public static void main(String[] args) {
    int[] numbers = new int[4];//{  ,  ,  ,  }
    numbers[0] = 5;//{5,  ,  ,  }
    numbers[1] = 6;//{5, 6,  ,  }
    numbers[2] = 7;//{5, 6, 7,  }
    numbers[3] = 8;//{5, 6, 7, 8}
    numbers[2] = 16;//{5, 6, 16, 8}

    //System.out.print(numbers[0]);
    
    int[] data = {20, 38, 14};//size 3
    //data is of length 3, the greatest index we can use is 2.
    

    //System.out.println(data[20]);

    
    //String[] studentAges = new String[20];
    //System.out.println(studentAges[10]); 
    //System.out.println("Hello world!");

    String[] movieTheaterRow = new String[3];
    movieTheaterRow[0] = "Aastha";
    movieTheaterRow[1] = "Corey";
    movieTheaterRow[2] = "Sai";

    //{"Aastha", "Corey", "Sai"} //Row to Watch Avengers

    //{"", "", ""}
    movieTheaterRow[0] = "Catherine";
    movieTheaterRow[1] = "Rhobbe";
    movieTheaterRow[2] = "Umair";
    

    //{"Catherine", "Rhobbe", "Umair"}//Row to Watch Bee Movie

    String[] names = {"Nick", "Jonny", "Richard"}; //This has a length of there

int arrayLength = names.length;//arrayLength now equals 3

System.out.println("The array length is: " + arrayLength);

Person Nick = new Person("Nick", 20, "Green");
Nick.name



  }
}