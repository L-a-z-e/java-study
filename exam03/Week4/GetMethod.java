package exam03.Week4;

public class GetMethod {
    

  //  public <T> void print(T[] item){
        
  //      }
  //  }

    public static <T> void print(T[] item){
        for (int i = 0 ; i < item.length ; i++){
            System.out.println(item[i]);

    }
}

    public static <T extends String> void firstStringPrint(T item){
        if (item.length()>0){
            System.out.println(item.charAt(0));
        }

    }
}
