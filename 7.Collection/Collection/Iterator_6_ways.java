package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Iterator_6_ways {

	public static void main(String[] args) {

		List<String> tvShows = new ArrayList<String>();

		tvShows.add("The Game Of Thrones");
		tvShows.add("The Evil dead");
		tvShows.add("The Titanic");
		tvShows.add("RRR");
		tvShows.add("The BahuBali");
		tvShows.add("WWE Serice");
		System.out.println(tvShows);
		// O/p:
		// [The Game Of Thrones, The Evil dead, The Titanic, RRR, The BahuBali, WWE
		// Serice]
		// 6 ways we can Iterate
		System.out.println("---------------------");

		System.out.println("Case (1):Iterate with for each Loop");
		System.out.println("---------------------");
		for (String show : tvShows) {

			System.out.println(show);
		}

		System.out.println("---------------------");
		System.out.println("Case (2):Iterate with for Loop");
		for (int i = 0; i < tvShows.size(); i++) {
			String text = tvShows.get(i);
			System.out.println(text);

		}

		System.out.println("---------------------");
		System.out.println("Case (3):Using Iterator");

		Iterator<String> it = tvShows.iterator();
		while (it.hasNext()) {
			String s = it.next();
			System.out.println(s);
		}

		System.out.println("---------------------");
		System.out.println("Case (4):Using List Iterator");

		ListIterator<String> list_ite = tvShows.listIterator(tvShows.size());
		// Here It expects Size
		while (list_ite.hasPrevious()) {
			String s1 = list_ite.previous();
			System.out.println(s1);
		}

		System.out.println("---------------------");
		System.out.println("Case (5):Using Java_8 LAMDA & foreach() ");

		System.out.println("---------------------");
		System.out.println("Case (6):Using Java_8 foreach() & remains method");

	}

}
