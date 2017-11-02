package System;


/**
 * @author crossover
 * @version 1.0
 * @created 02-Nov-2017 1:32:44 AM
 */
public class Class1 extends Class2 implements Interface1 {

	public Class3 m_Class3;

	public Class1(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}
}//end Class1