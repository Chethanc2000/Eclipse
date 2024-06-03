import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> playlist1 = readPlaylist(scanner);
		ArrayList<Integer> playlist2 = readPlaylist(scanner);
		scanner.close();
		
		ArrayList<Integer> uniquePlaylist = findUniqueElements(playlist1, playlist2);
		
		for(int songID : uniquePlaylist) {
			System.out.println(songID + " ");
		}

	}

	public static ArrayList<Integer> readPlaylist(Scanner scanner) {
		// TODO Auto-generated method stub
		ArrayList<Integer> playlist = new ArrayList<>();
		String [] input = scanner.nextLine().split(" ");
		for(String str : input) {
			playlist.add(Integer.parseInt(str));
		}
		return playlist;
	}
	public static ArrayList<Integer> findUniqueElements(ArrayList<Integer> playlist1, ArrayList<Integer> playlist2) {
		// TODO Auto-generated method stub
		ArrayList<Integer> combinedPlaylist = new ArrayList<>(playlist1);
		combinedPlaylist.addAll(playlist2);
		HashSet<Integer> uniqueSet = new HashSet<>(combinedPlaylist);
		
		ArrayList<Integer> uniquePlaylist = new ArrayList<>(uniqueSet);

	        return uniquePlaylist;
	
	}

}
