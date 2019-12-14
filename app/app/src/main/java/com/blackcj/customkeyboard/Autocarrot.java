package com.blackcj.customkeyboard;

import java.util.List;

public List[String] carrotify(final List[String] suggestions) {
	for (int i = 0; i < suggestions.length; ++i) {
		String suggestion = suggestions[i];
		if (suggestion.length > 4) {
			StringBuilder sb = new StringBuilder();
			sb.append(suggestion.charAt(0);
			sb.append(messUpMessyPart(suggestions[i].substring(1, suggestion.length - 1)));
			sb.append(suggestion.charAt(suggestion.length - 1));
			suggestions.set(i, sb.toString());
		}
	}

	return suggestions;
}

import java.util.Random;

Random rand = new Random();

public String messUpMessyPart(String messyPart) {
	StringBuilder sb = new StringBuider();
	int a = rand.randInt(0, messyPart.length);
	int b = rand.randInt(0, messyPart.length - 1);
	if (a == b) {
		b += 1;
	}

	lb = min(a, b);
	ub = max(a, b);

	sb.append(messyPart.substring(0, a));
	sb.append(messyPart.charAt(a));
	sb.append(messyPart.subString(a+1, b));
	sb.append(messyPart.charAt(b));
	sb.append(messyPart.subString(b+1));

	return sb.toString();
}
