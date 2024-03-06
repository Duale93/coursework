package utils;

public class Constants {
    public static  class Directions{
        public static final int LEFT = 0;
        public static final int UP = 1;
        public static final int RIGHT = 2;
        public static final int DOWN = 3;

    }

   public static class PlayerConstants {
       public static final int RUNNING = 0;
       public static final int IDLE = 1;
       public static final int DAMAGED = 2;
       public static final int ATTACK = 3;
       public static final int DEAD1 = 4;
       public static final int DEAD2 = 5;

       public static int GetSpriteAmount(int player_action) {
           switch (player_action) {
               case RUNNING:
                   return 5;
               case ATTACK:
                   return 4;
               case IDLE:
                   return 3;
               case DAMAGED:
                   return 2;
               case DEAD1:
               case DEAD2:
               default:
                   return 1;
           }

       }

    }

}
