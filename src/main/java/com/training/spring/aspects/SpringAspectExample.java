package com.training.spring.aspects;

public class SpringAspectExample {

	static RegularLogger logger=new RegularLogger();
	
	public static RegularLogger getLogger() {
		return logger;
	}
	public static void main(String[] args) {
		
		try {
			authenticateUser(args[0], args[1]);
			performSomeTask(args[2]);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	public static boolean  performSomeTask(String validationContent) throws Exception
	{
		boolean matching=false;
		try {
			getLogger().writeLog();
			if(validationContent!=null && validationContent.length()==10)
			{
				if(validationContent.startsWith("A"))
				{
					matching=true;
				}
				else
				{
					throw new Exception("Business Logic Failed Exception");
				}
			}
			getLogger().writeLog();
		} catch (Exception e) {
			throw e;
		}
		return matching;
	}
	
	public static boolean authenticateUser(String username , String Password)
	{
		
		if(username!=null && username.equals("saravana") && Password!=null && Password.equals("test123") ) 
		{
			return true;
		}
		else {
			return false;
		}
	}
}
