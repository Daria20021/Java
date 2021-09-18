package ДЗ2;

    public class Employees {
        protected  void havingchildren(){
            System.out.println("Все работники, имеющие детей");
        }
        protected  void havingnochildren(){
            System.out.println("Все работники, не имеющие детей");
        }

    }
    class Woman extends Employees {
        protected  void havingchildren(){
            System.out.println("Все женщины-работники, имеющие детей");
        }
        protected void havingnochildren(){
            System.out.println("Все женщины-работники, не имеющие детей");
        }
    }

    class retirementage extends Woman {
        protected void havingchildren(){
            System.out.println("Все женщины-работники пенсионного возраста, имеющие детей");
        }
        protected void havingnochildren(){
            System.out.println("Все женщины-работники пенсионного возраста, не имеющие детей");
        }

    }

