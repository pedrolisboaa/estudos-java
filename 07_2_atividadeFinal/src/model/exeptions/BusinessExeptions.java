package model.exeptions;

public class BusinessExeptions extends RuntimeException{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public BusinessExeptions (String msg) {
		super(msg);
	}

}
