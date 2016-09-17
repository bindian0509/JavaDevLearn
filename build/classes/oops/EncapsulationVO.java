package oops;

public class EncapsulationVO {
	
	protected String _name = "";
	
	protected int _age = 0;
	
	protected float _ssn = 1 ;
	
	protected byte _flag ; 
	
	
	protected boolean _jhanda = true;


	public String get_name() {
		return _name;
	}


	public void set_name(String _name) {
		this._name = _name;
	}


	public int get_age() {
		return _age;
	}


	public void set_age(int _age) {
		this._age = _age;
	}


	public float get_ssn() {
		return _ssn;
	}


	public void set_ssn(float _ssn) {
		this._ssn = _ssn;
	}


	public byte get_flag() {
		return _flag;
	}


	public void set_flag(byte _flag) {
		this._flag = _flag;
	}


	public boolean is_jhanda() {
		return _jhanda;
	}


	public void set_jhanda(boolean _jhanda) {
		this._jhanda = _jhanda;
	}

}
