package org.howard.edu.lsp.finalExam;

public class NullMapException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * implements the NullMapException exception
	 * @author julianf17
	 */

	public NullMapException() {
		super("One of the maps is empty!");
	}
	
	public NullMapException(String message) {
		super(message);
	}
}
