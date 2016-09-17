package oops;

public class EncapsulationWorker extends EncapsulationVO{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		EncapsulationVO ecpVO = new EncapsulationVO();
		
		ecpVO.set_age(32);
		
		ecpVO.set_name("Bharat Verma");
		
		
		System.out.println(ecpVO.get_name());
		System.out.println(ecpVO.get_age());
	}

}
