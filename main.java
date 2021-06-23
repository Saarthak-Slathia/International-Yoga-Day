class Event{
    int date;
    String name;
    String month;
    
    void Event(int a, String b, String c){
      a = date;
      b = name;
      c = month;
    }

    void setData(int x, String y, String z){
        date = x;
        name = y;
        month = z;
    }
    
    void displayData(){
      System.out.println(name + " is celebrated on " + date + " " + month + ".");
    }
    
  }

class main{
    public static void main(String args[]){
        Event yoga = new Event();
        yoga.setData(21, "International Yoga Day", "June");
        yoga.displayData();
    }
}
