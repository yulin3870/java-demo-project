package day03;

/**
 *
 */
public class Demo04 {
    public static void main(String[] args) {
        String[] players = {"佟大为", "邓超", "孙俪"};
        //                      0      1      2
        //System.out.println(players[1]);
        int i = 0;
        System.out.println(players[i++ % 3]);
        System.out.println(players[i++ % 3]);
        System.out.println(players[i++ % 3]);
        System.out.println(players[i++ % 3]);
        System.out.println(players[i++ % 3]);
        System.out.println(players[i++ % 3]);
        System.out.println(players[i++ % 3]);
        System.out.println(players[i++ % 3]);
    }
}
