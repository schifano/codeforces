public class StringTask{

	public static void dotTheConsonants(String input){
		String out = "", bad = "aeiouy";;
		input = input.toLowerCase();
		for(int i = 0; i < input.length(); i++){
			if(bad.indexOf(input.charAt(i)) == -1){
				out += "." + input.charAt(i);
			}
		}
		System.out.println(out);
	}

	public static void main(String[] args){
		dotTheConsonants(args[0]);
	}
}