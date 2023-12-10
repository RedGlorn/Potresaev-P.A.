class Stomatology {
        private String OrgName;
        private String OrgAddress;
        private String PatSurN;
        private int NoPol;
        private String Date;
        private String DocSurN;
        private String Work;
        private int Sum;

        public Stomatology(String OrgName, String OrgAddress, String PatSurN, int NoPol, String DocSurN,
                           String Date, String Work, int Sum)
        {
            this.OrgName = OrgName;
            this.OrgAddress = OrgAddress;
            this.PatSurN = PatSurN;
            this.NoPol = NoPol;
            this.DocSurN = DocSurN;
            this.Date = Date;
            this.Work = Work;
            this.Sum = Sum;
        }
    //геттеры/сеттеры
        public String getOrgName() {
            return OrgName;
        }
        public void setOrgName(String OrgName){
            this.OrgName = OrgName;
        }
        public String getOrgAddress() {
            return OrgAddress;
        }
        public void setOrgAddress(String OrgAddress){
            this.OrgAddress = OrgAddress;
        }
        public String getPatSurN() {
            return PatSurN;
        }
        public void setPatSurN(String PatSurN){
            this.PatSurN = PatSurN;
        }
        public int getNoPol() {
            return NoPol;
        }
        public void setNoPol(int NoPol){
            this.NoPol = NoPol;
        }
        public String getDocSurN() {
            return DocSurN;
        }
        public void setDocSurN(String DocSurN){
            this.DocSurN = DocSurN;
        }
        public String getDate() {
            return Date;
        }
        public void setDate(String Date){
            this.Date = Date;
        }
        public String getWork() {
            return Work;
        }
        public void setWork (String Work){
            this.Work = Work;
        }
        public int getSum() {
            return Sum;
        }
        public void setSum(int Sum){
            this.Sum = Sum;
        }

        public String toString(){
            return  "Организация: " + getOrgName() + "\nАдрес: " + getOrgAddress() + "\nФамилия пациента: " +
                    getPatSurN() + "\nНомер полиса: " + getNoPol() + "\nФамилия врача: " + getDocSurN() + "\nДата: " + getDate()
                    + "\nОписание работы: " + getWork() + "\nСумма оплаты: " + getSum() ;
        }


public class TestStomatology{
    public static void main(String[] args){
        Stomatology stomat = new Stomatology("Clinic", "Street Seven", "Petrov",
                1347, "Ivanov", "20.05.22", "something", 1300);
        System.out.println(stomat.toString());
    }
}
}

// Определение класса стоматология и её параметров(название, адрес, фамилия пациента, номер полиса пациента,
// дата лечения, фамилия врача, описание работы, сумма услуг)