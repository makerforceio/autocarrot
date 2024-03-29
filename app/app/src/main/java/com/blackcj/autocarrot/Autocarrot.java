package com.blackcj.autocarrot;

import java.util.List;
import java.util.Random;

import java.lang.StringBuilder;

public class Autocarrot {
	Random rand = new Random();

	public List<String> carrotify(final List<String> suggestions) {
		for (int i = 0; i < suggestions.size(); ++i) {
			String suggestion = suggestions.get(i);
			if (suggestion.length() > 3) {
				StringBuilder sb = new StringBuilder();

				sb.append(suggestion.charAt(0));
				sb.append(multiMess(suggestions.get(i).substring(1, suggestion.length() - 1)));

				sb.append(suggestion.charAt(suggestion.length() - 1));
				suggestions.set(i, sb.toString());
			}
		}

		return suggestions;
	}

	public String multiMess(String messyPart) {
		for (int i = 0; i < Math.ceil((messyPart.length() + 2) / 3); ++i) {
			messyPart = messUpMessyPart(messyPart);
		}
		return messyPart;
	}

	public String messUpMessyPart(String messyPart) {
		StringBuilder sb = new StringBuilder();
		int a = rand.nextInt(messyPart.length());

		int b = rand.nextInt(messyPart.length() - 1);

		if (a == b) {
			b += 1;
		}

		int lb = Math.min(a, b);
		int ub = Math.max(a, b);

		a = lb;
		b = ub;

		sb.append(messyPart.substring(0, a));
		sb.append(messyPart.charAt(b));
		sb.append(messyPart.substring(a+1, b));
		sb.append(messyPart.charAt(a));
		sb.append(messyPart.substring(b+1));

		return sb.toString();
	}
}
