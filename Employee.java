public class Employee {
        String name;
        int hireYear;
        int salary;
        int workHours;

        public Employee(String name, int hireYear, int salary, int workHours){
            this.name = name;
            this.hireYear = hireYear;
            this.salary = salary;
            this.workHours = workHours;
        }
        public double tax(){ // Maaşa uygulanan vergiyi hesaplar.

            if (this.salary < 100) {
                return 0;
            }else {
                return this.salary * 0.03;
            }
        }
        public int bonus(){ //Fazladan çalışıldığında alınacak parayı hesaplar.

            if (workHours >= 40) {
               return workHours * 30 ;
            }
            return 0;
        }
        public double raiseSalary(){ // Çalıştığa yıl sayısında göre alcağı maaş artışı.

            if (hireYear < 10) {
                return (salary*0.05);
            }
            if (hireYear > 9 && hireYear < 20) {
                return (salary*0.1);
            }
            if (hireYear > 19) {
                return (salary*0.15);
            }
            return 0;
        }
        public String toString(){ //Bilgileri ekrana yazdır.
           /* Adı : kemal
            Maaşı : 2000.0
            Çalışma Saati : 45
            Başlangıç Yılı : 1985
            Vergi : 60.0
            Bonus : 150.0
            Maaş Artışı : 300.0
            Vergi ve Bonuslar ile birlikte maaş : 2090.0
            Toplam Maaş : 2300.0*/
            return "Adı: " + this.name + "\nMaaşı: " + this.salary + "\nÇalışma saati: " + this.workHours + "\nBaşlangıç Yılı:" +
                    hireYear+"\nVergi: " + tax() + "\nBonus: "+ bonus() + "\nMaaş artışı: " + raiseSalary() + "\nToplam maaş: " + (salary+bonus()-tax());

        }
        public static void main(String[] args) {

            Employee employee = new Employee("Aybike Dalbul", 1985,2000,45);
            System.out.println(employee.toString());
        }
    }


