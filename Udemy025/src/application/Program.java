package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);

		String path = "C://in.txt";

		try (BufferedReader bReader = new BufferedReader(new FileReader(path))) {

			Map<String, Integer> votes = new HashMap<>();

			String line = bReader.readLine();

			while (line != null) {
				String[] voteLine = line.split(",");
				String username = voteLine[0];
				Integer voteQuantity = Integer.parseInt(voteLine[1]);

				votes.put(username, voteQuantity);
				
				if (votes.containsKey(username)) {
					int votesSoFar = votes.get(username);
					votes.put(username, voteQuantity + votesSoFar);
				}
				else {
					votes.put(username, voteQuantity);
				}
				
				line = bReader.readLine();
			}

			for (String key : votes.keySet()) {
				System.out.println(key + ": " + votes.get(key));
			}

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

		scanner.close();

	}

}
