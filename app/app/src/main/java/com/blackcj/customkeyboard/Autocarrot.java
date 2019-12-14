package com.blackcj.customkeyboard;

import java.util.List;
import java.util.Random;

import java.lang.StringBuilder;

public class Utils {
	Random rand = new Random();

	public List<String> carrotify(final List<String> suggestions) {
		for (int i = 0; i < suggestions.size(); ++i) {
			String suggestion = suggestions.get(i);
			if (suggestion.length() > 4) {
				StringBuilder sb = new StringBuilder();
				sb.append(suggestion.charAt(0);
				sb.append(messUpMessyPart(suggestions[i].substring(1, suggestion.length() - 1)));
				sb.append(suggestion.charAt(suggestion.length() - 1));
				suggestions.set(i, sb.toString());
			}
		}

		return suggestions;
	}

	public String messUpMessyPart(String messyPart) {
		StringBuilder sb = new StringBuilder();
		int a = rand.nextInt(messyPart.length());
		int b = rand.nextInt(0messyPart.length() - 1);
		if (a == b) {
			b += 1;
		}

		int lb = Math.min(a, b);
		int ub = Math.max(a, b);

		sb.append(messyPart.substring(0, a));
		sb.append(messyPart.charAt(a));
		sb.append(messyPart.substring(a+1, b));
		sb.append(messyPart.charAt(b));
		sb.append(messyPart.substring(b+1));

		return sb.toString();
	}
}
