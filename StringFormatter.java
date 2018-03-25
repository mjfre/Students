import java.util.List;

public class StringFormatter
{
public static int totalLetters(List<String> wordList) {
	int totalLetters = 0;
	for(String s : wordList) {
		totalLetters += s.length();
	}
	return totalLetters;
}

public static int basicGapWidth(List<String> wordList, int formattedLen) {
	int numGaps = wordList.size()-1;
	int totalLetters = totalLetters(wordList);
	int basicGapWidth = formattedLen - totalLetters;
	return basicGapWidth/numGaps;
}
}