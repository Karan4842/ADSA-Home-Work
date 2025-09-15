import java.util.*;

public class Playlist {
    public static int longestUniqueSubarray(int[] songs) {
        Set<Integer> set = new HashSet<>();
        int left = 0, maxLen = 0;

        for (int right = 0; right < songs.length; right++) {
            // If duplicate found, shrink window
            while (set.contains(songs[right])) {
                set.remove(songs[left]);
                left++;
            }
            set.add(songs[right]);
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of songs
        System.out.print("Enter number of songs: ");
        int n = sc.nextInt();

        // Input playlist
        int[] songs = new int[n];
        System.out.println("Enter song IDs:");
        for (int i = 0; i < n; i++) {
            songs[i] = sc.nextInt();
        }

        // Output answer
        int ans = longestUniqueSubarray(songs);
        System.out.println("Longest playlist with unique songs: " + ans);

        sc.close();
    }
}
