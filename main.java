
class Event{
  int date;
  String name;
  String month;
  
  void Event(int a, String b, String c){
    a = date;
    b = name;
    c = month;
  }
  
  void displayData(){
    System.out.println(name + " is celebrated on " + date + " " + month + ".");
  }
  
}

