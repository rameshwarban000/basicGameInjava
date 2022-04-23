package javaProjects.firstProject;

public class Main {
    public static void main(String[] args) {
        Player1 player1=new Player1("Akash", "Sward", 500);
        // System.out.println(player1.getName());
        System.out.println(player1.getHealth());
        // System.out.println(player1.getWeapon());
        // player1.damageByGun1();
        // player1.damageByGun1();
        // player1.damageByGun2();
        Player2 wariyar=new Player2("akshay", "talwar", 100, false);
        wariyar.damageByGun1();
        wariyar.damageByGun1();
        wariyar.damageByGun1();
        wariyar.damageByGun1();
        wariyar.damageByGun2();
    }
}
