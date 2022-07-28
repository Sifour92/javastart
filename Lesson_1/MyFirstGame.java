public class MyFirstGame {
    public static void main(String[] args) {
        int computerNum = 34;
        int playerNum = 54;
        while (playerNum != computerNum) {
            if (playerNum > computerNum) {
                System.out.println("Число " + playerNum + " больше того, что загадал компьютер");
                playerNum--;
            } else {
                System.out.println("Число " + playerNum + " меньше того, что загадал компьютер");
                playerNum++;
            }
        }
        System.out.println("Компьютер загадал число " + computerNum + ". Вы победили!");
    }
}