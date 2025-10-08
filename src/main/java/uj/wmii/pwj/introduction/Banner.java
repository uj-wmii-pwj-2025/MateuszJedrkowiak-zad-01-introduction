package uj.wmii.pwj.introduction;

import java.util.HashMap;
import java.util.Map;

public class Banner {
    private final Map<Character, String[]> bannerMap = new HashMap<>();

    Banner() {
        font();
    }

    private void font() {
        bannerMap.put('A', new String[] {
                "   #   ",
                "  # #  ",
                " #   # ",
                "#     #",
                "#######",
                "#     #",
                "#     #"
        });
        bannerMap.put('B', new String[] {
                "###### ",
                "#     #",
                "#     #",
                "###### ",
                "#     #",
                "#     #",
                "###### "
        });
        bannerMap.put('C', new String[] {
                " ##### ",
                "#     #",
                "#      ",
                "#      ",
                "#      ",
                "#     #",
                " ##### "
        });
        bannerMap.put('D', new String[] {
                "###### ",
                "#     #",
                "#     #",
                "#     #",
                "#     #",
                "#     #",
                "###### "
        });
        bannerMap.put('E', new String[] {
                "#######",
                "#      ",
                "#      ",
                "#####  ",
                "#      ",
                "#      ",
                "#######"
        });
        bannerMap.put('F', new String[] {
                "#######",
                "#      ",
                "#      ",
                "#####  ",
                "#      ",
                "#      ",
                "#      "
        });
        bannerMap.put('G', new String[] {
                " ##### ",
                "#     #",
                "#      ",
                "#  ####",
                "#     #",
                "#     #",
                " ##### "
        });
        bannerMap.put('H', new String[] {
                "#     #",
                "#     #",
                "#     #",
                "#######",
                "#     #",
                "#     #",
                "#     #"
        });
        bannerMap.put('I', new String[] {
                "###",
                " # ",
                " # ",
                " # ",
                " # ",
                " # ",
                "###"
        });
        bannerMap.put('J', new String[] {
                "      #",
                "      #",
                "      #",
                "      #",
                "#     #",
                "#     #",
                " ##### "
        });
        bannerMap.put('K', new String[] {
                "#    #",
                "#   # ",
                "#  #  ",
                "###   ",
                "#  #  ",
                "#   # ",
                "#    #"
        });
        bannerMap.put('L', new String[] {
                "#      ",
                "#      ",
                "#      ",
                "#      ",
                "#      ",
                "#      ",
                "#######"
        });
        bannerMap.put('M', new String[] {
                "#     #",
                "##   ##",
                "# # # #",
                "#  #  #",
                "#     #",
                "#     #",
                "#     #"
        });
        bannerMap.put('N', new String[] {
                "#     #",
                "##    #",
                "# #   #",
                "#  #  #",
                "#   # #",
                "#    ##",
                "#     #"
        });
        bannerMap.put('O', new String[] {
                "#######",
                "#     #",
                "#     #",
                "#     #",
                "#     #",
                "#     #",
                "#######"
        });
        bannerMap.put('P', new String[] {
                "###### ",
                "#     #",
                "#     #",
                "###### ",
                "#      ",
                "#      ",
                "#      "
        });
        bannerMap.put('Q', new String[] {
                " ##### ",
                "#     #",
                "#     #",
                "#     #",
                "#   # #",
                "#    # ",
                " #### #"
        });
        bannerMap.put('R', new String[] {
                "###### ",
                "#     #",
                "#     #",
                "###### ",
                "#   #  ",
                "#    # ",
                "#     #"
        });
        bannerMap.put('S', new String[] {
                " ##### ",
                "#     #",
                "#      ",
                " ##### ",
                "      #",
                "#     #",
                " ##### "
        });
        bannerMap.put('T', new String[] {
                "#######",
                "   #   ",
                "   #   ",
                "   #   ",
                "   #   ",
                "   #   ",
                "   #   "
        });
        bannerMap.put('U', new String[] {
                "#     #",
                "#     #",
                "#     #",
                "#     #",
                "#     #",
                "#     #",
                " ##### "
        });
        bannerMap.put('W', new String[] {
                "#     #",
                "#  #  #",
                "#  #  #",
                "#  #  #",
                "#  #  #",
                "#  #  #",
                " ## ## "
        });
        bannerMap.put('V', new String[] {
                "#     #",
                "#     #",
                "#     #",
                "#     #",
                " #   # ",
                "  # #  ",
                "   #   "
        });
        bannerMap.put('X', new String[] {
                "#     #",
                " #   # ",
                "  # #  ",
                "   #   ",
                "  # #  ",
                " #   # ",
                "#     #"
        });
        bannerMap.put('Y', new String[] {
                "#     #",
                " #   # ",
                "  # #  ",
                "   #   ",
                "   #   ",
                "   #   ",
                "   #   "
        });
        bannerMap.put('Z', new String[] {
                "#######",
                "     # ",
                "    #  ",
                "   #   ",
                "  #    ",
                " #     ",
                "#######"
        });
        bannerMap.put(' ', new String[] {
                "  ",
                "  ",
                "  ",
                "  ",
                "  ",
                "  ",
                "  "
        });
    }

    public String[] toBanner(String input) {
        if (input == null || input.isEmpty()) {
            return new String[0];
        }

        String[] result = new String[7];

        for (int i = 0; i < 7; i++) {
            StringBuilder temp = new StringBuilder();
            for (char c : input.toCharArray()) {
                c = Character.toUpperCase(c);
                String[] letter = bannerMap.getOrDefault(c, bannerMap.get(' '));
                temp.append(letter[i]).append(" ");

            }
            result[i] = temp.toString();
        }

        return result;
    }
}
