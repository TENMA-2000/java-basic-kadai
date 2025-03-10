package kadai_021;

public class DictionaryExec_Chapter21 {

	public static void main(String[] args) {
		
		Dictionary_Chapter21 zisyo = new Dictionary_Chapter21();
		
		String wordToSearch1 = "apple";
		System.out.println(zisyo.searchWithLoop(wordToSearch1));
		
		String wordToSearch2 = "banana";
		System.out.println(zisyo.searchWithLoop(wordToSearch2));
		
		String wordToSearch3 = "grape";
		System.out.println(zisyo.searchWithLoop(wordToSearch3));
		
		String wordToSearch4 = "orange";
		System.out.println(zisyo.searchWithLoop(wordToSearch4));

	}

}
