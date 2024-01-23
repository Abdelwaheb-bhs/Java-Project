package pack;

public class Datetime extends Date {
    private int hour;
    private int minute;
    private int second;
public Datetime(){
    super();
    this.hour = 0;
    this.minute = 0;
    this.second = 0;
}
public Datetime(int hour,int minute,int second,Date h){
    super.setDay(h.getDay());
    super.setMonth(h.getMonth());
    super.setYear(h.getYear());
    this.hour =hour;
    this.minute = minute;
    this.second = second;
}
public Datetime(int hour,int minute,int second){
    super();
    this.hour =hour;
    this.minute = minute;
    this.second = second;

}
public Datetime(int hour,int minute,int second,int day,int month,int year){
    super(day,month,year);
    this.hour = hour;
    this.minute=minute;
    this.second=second;
}
public int getHour(){
    return this.hour;
}
public int getMinute(){
    return this.minute;
}
public int getSecond(){
    return this.second;
}
public void setHour(int hour){
    this.hour = hour;
}
public void setMinute(int minute){
    this.minute = minute;
    }
public void setSecond(int second){
    this.second = second;
}
public String toString(){
    return super.toString()+hour+":"+minute+":"+second;
}
public void setDatetime(Date d){
    this.setYear(d.getYear());
    this.setMonth(d.getMonth());
    this.setDay(d.getDay());

}
public void affiche(){
    super.affiche();
    System.out.println(hour+":"+minute+":"+second);

}
}