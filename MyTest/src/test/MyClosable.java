package test;

import java.io.Closeable;
import java.io.IOException;

public class MyClosable implements AutoCloseable, Closeable{

	@Override
	public void close() throws IOException {		
		System.out.println("Closing my closable");
	}

}
