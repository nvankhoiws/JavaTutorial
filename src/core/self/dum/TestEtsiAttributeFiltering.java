package core.self.dum;

import java.net.URI;
import java.net.URISyntaxException;

public class TestEtsiAttributeFiltering {
	public static void main(String[] args) throws URISyntaxException {
		String fakeUri = "http://localhost:8080/container?filter=(eq,parts/id,3)&&otherParam=4.5";
		URI uri = new URI(fakeUri);
		System.out.println();
	}
}
