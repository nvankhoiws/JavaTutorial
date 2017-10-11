package core.docs.oracle.com.networking;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

public class CreatingURL {
	
	public static void main(String[] args) {
		try {
			//Cat 1
			URL url01 = new URL("http://doutzen.ifisolution.local:8081/FrontalOCR/private/listFacture.action");
			//Cat 1 modified
			URL baseURL = new URL("https://docs.oracle.com/javase/tutorial");
			URL url0101 = new URL(baseURL, "/networking/urls/creatingUrls.html");
			URL url0102 = new URL(baseURL, "/javase/tutorial/networking/urls/urlInfo.html");
			
			//Cat 2
			URL url02 = new URL("https", "docs.oracle.com", "/javase/tutorial/networking/urls/creatingUrls.html");
			//Cat 3
			URL url03 = new URL("https", "docs.oracle.com", 8080, "/javase/tutorial/networking/urls/creatingUrls.html");
			//Cat 4
			URI uri = new URI("http", "doutzen.ifisolution.local:8081", "FrontalOCR/private/list Facture.action");
			URL url04 = uri.toURL();
			
			//INVESTIGATION OF URL CAT 4
			System.out.println("Investigate a URL Information for url02");
			//Get Protocol
			System.out.println("Protocol: " + url04.getProtocol());
			//Get Authority
			System.out.println("Authority: " + url04.getAuthority());
			//Get Pathname
			System.out.println("Pathname: " + url04.getPath());
			//Get Port
			System.out.println("Port: " + url04.getPort());
			//Get Query
			System.out.println("Query: " + url04.getQuery());
			//Get Ref
			System.out.println("Ref: " + url04.getRef());
			//Get Filename
			System.out.println("Filename(pathname + query): " + url04.getFile());
			//Get Host
			System.out.println("Host: " + url04.getHost());
			System.out.println("==============================================");
			
/*			//INVESTIGATION OF URL CAT 3
			System.out.println("Investigate a URL Information for url02");
			//Get Protocol
			System.out.println("Protocol: " + url03.getProtocol());
			//Get Authority
			System.out.println("Authority: " + url03.getAuthority());
			//Get Pathname
			System.out.println("Pathname: " + url03.getPath());
			//Get Port
			System.out.println("Port: " + url03.getPort());
			//Get Query
			System.out.println("Query: " + url03.getQuery());
			//Get Ref
			System.out.println("Ref: " + url03.getRef());
			//Get Filename
			System.out.println("Filename(pathname + query): " + url03.getFile());
			//Get Host
			System.out.println("Host: " + url03.getHost());
			System.out.println("==============================================");
			
/*			//INVESTIGATION OF URL CAT 2
			System.out.println("Investigate a URL Information for url02");
			//Get Protocol
			System.out.println("Protocol: " + url02.getProtocol());
			//Get Authority
			System.out.println("Authority: " + url02.getAuthority());
			//Get Pathname
			System.out.println("Pathname: " + url02.getPath());
			//Get Port
			System.out.println("Port: " + url02.getPort());
			//Get Query
			System.out.println("Query: " + url02.getQuery());
			//Get Ref
			System.out.println("Ref: " + url02.getRef());
			//Get Filename
			System.out.println("Filename(pathname + query): " + url02.getFile());
			//Get Host
			System.out.println("Host: " + url02.getHost());
			System.out.println("==============================================");
			
/*			//Investigate a URL Information cat 1 modified
			System.out.println("Investigate a URL Information for url0102");
			//Get Protocol
			System.out.println("Protocol: " + url0102.getProtocol());
			//Get Authority
			System.out.println("Authority: " + url0102.getAuthority());
			//Get Pathname
			System.out.println("Pathname: " + url0102.getPath());
			//Get Port
			System.out.println("Port: " + url0102.getPort());
			//Get Query
			System.out.println("Query: " + url0102.getQuery());
			//Get Ref
			System.out.println("Ref: " + url0102.getRef());
			//Get Filename
			System.out.println("Filename(pathname + query): " + url0102.getFile());
			//Get Host
			System.out.println("Host: " + url0102.getHost());
			System.out.println("==============================================");
			//Investigate a URL Information cat 1 modified
			System.out.println("Investigate a URL Information for url0101");
			//Get Protocol
			System.out.println("Protocol: " + url0101.getProtocol());
			//Get Authority
			System.out.println("Authority: " + url0101.getAuthority());
			//Get Pathname
			System.out.println("Pathname: " + url0101.getPath());
			//Get Port
			System.out.println("Port: " + url0101.getPort());
			//Get Query
			System.out.println("Query: " + url0101.getQuery());
			//Get Ref
			System.out.println("Ref: " + url0101.getRef());
			//Get Filename
			System.out.println("Filename(pathname + query): " + url0101.getFile());
			//Get Host
			System.out.println("Host: " + url0101.getHost());
			System.out.println("==============================================");
			//Investigate a URL Information
			System.out.println("Investigate a URL Information for url01");
			//Get Protocol
			System.out.println("Protocol: " + url01.getProtocol());
			//Get Authority
			System.out.println("Authority: " + url01.getAuthority());
			//Get Pathname
			System.out.println("Pathname: " + url01.getPath());
			//Get Port
			System.out.println("Port: " + url01.getPort());
			//Get Query
			System.out.println("Query: " + url01.getQuery());
			//Get Ref
			System.out.println("Ref: " + url01.getRef());
			//Get Filename
			System.out.println("Filename(pathname + query): " + url01.getFile());
			//Get Host
			System.out.println("Host: " + url01.getHost()); */
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}
	}

}
