package ДЗ2;

import java.util.Scanner;
public class Net {
    static class NetworkInfo {
        private String ssid;
        private String passwd;
        private String securityType;

        public void showParameters() {
            System.out.println("Имя: " + ssid);
            System.out.println("Пароль: " + passwd);
            System.out.println("Тип безопасности: " + securityType);
        }
        public static NetworkInfo Obj(String ssid, String passwd, String securityType){
            NetworkInfo obj = new NetworkInfo();
            obj.ssid = ssid;
            obj.passwd = passwd;
            obj.securityType = securityType;
            obj.showParameters();
            return obj;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Имя:");
            String ssid = sc.nextLine();


            System.out.println("Пароль:");
            String passwd = sc.nextLine();


            System.out.println("Тип безопасности:");
            String securityType = sc.nextLine();

            NetworkInfo.Obj(ssid,passwd,securityType);

        }
    }
}
