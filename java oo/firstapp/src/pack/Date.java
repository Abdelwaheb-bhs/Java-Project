package pack;

public class Date {
    private int day, month, year;
public Date(){
    day=0;
    month=0;
    year=0;
}
public Date(int day,int month,int year){
    this.day=day;
    this.month=month;
    this.year=year;
}
public int getDay(){
    return day;
}
public int getMonth(){
    return month;
}
public int getYear(){
    return year;
}
public void setDay(int day){
    this.day=day;
}
public String toString(){
    return +day+"/"+month+"/"+year;
}
public void setMonth(int month){
    this.month=month;
}
public void setYear(int year){
    this.year=year;
}
public void affiche(){
    System.out.println(day+"/"+month+"/"+year);
}




}

