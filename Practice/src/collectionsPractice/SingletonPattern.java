package collectionsPractice;

public class SingletonPattern {
	private SingletonPattern singletonPattern;
	private SingletonPattern() {
		
	}
	public static SingletonPattern getObject() {
		
		return new SingletonPattern();
	}
	public String getMessage() {
		return "aVINAHS";
	}
}
