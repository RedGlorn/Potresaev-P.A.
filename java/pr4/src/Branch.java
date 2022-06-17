public class Branch extends  Stomatology{
        private String BrName;
        private int Floor;
        private String FIOM;

        public Branch(String Name, String Adress, String City, int NumOfDocs, String BrName, int Floor, String FIOM){
            super(Name,Adress,City,NumOfDocs);
            this.BrName = BrName;
            this.Floor = Floor;
            this.FIOM = FIOM;

        }

    public void setBrName(String BrName) {this.BrName= BrName;}
    public String getBrName() {return BrName;}

    public void setFloor(int Floor) {this.Floor = Floor;}
    public int getFloor() {return Floor;}

    public void setFIOM(String FIOM) {this.FIOM = FIOM;}
    public String getFIOM() {return FIOM;}


    public String toString() {
            return  "\u001B[33m\nОтделение\u001B[0m "+"\nНазвание отделения: " + BrName + "\nЭтаж: " + Floor +"\nФИО заведующего: " + FIOM;
    }
}
