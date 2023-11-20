public class Date {
    private int[] dateSetUp = new int[3];

    public Date(int day, int month, int year){
        this.dateSetUp[0] = day;
        this.dateSetUp[1] = month;
        this.dateSetUp[2] = year;
    }

    public int getDay(){return this.dateSetUp[0];}

    public int getMonth(){return this.dateSetUp[1];}

    public int getYear(){return this.dateSetUp[2];}

    public String toString(){return this.dateSetUp[1] + "/" + this.dateSetUp[0] + "/" + this.dateSetUp[2];}

    public int compareTo(Date other){
        if(this.dateSetUp[2]-other.dateSetUp[2]!=0)
            return this.dateSetUp[2]-other.dateSetUp[2];
        if(this.dateSetUp[1]-other.dateSetUp[1]!=0)
            return this.dateSetUp[1]-other.dateSetUp[1];
        return this.dateSetUp[0]-other.dateSetUp[0];
    }
}
 