package uk.ac.qub.revision;

public class MScStudent extends Student {
	
	private int program;
	private int cf;
	private int dbs;
	private int web;
	private int softEng;
	

	public MScStudent() {
		
	}

	public MScStudent(int sNum, String fname, String lname, int program, int cf, int dbs, int web, int softEng) {
		super(sNum, fname, lname);
		this.program = program;
		this.cf = cf;
		this.dbs = dbs;
		this.web = web;
		this.softEng = softEng;
	}

	public int getProgram() {
		return program;
	}

	public void setProgram(int program) {
		this.program = program;
	}

	public int getCf() {
		return cf;
	}

	public void setCf(int cf) {
		this.cf = cf;
	}

	public int getDbs() {
		return dbs;
	}

	public void setDbs(int dbs) {
		this.dbs = dbs;
	}

	public int getWeb() {
		return web;
	}

	public void setWeb(int web) {
		this.web = web;
	}

	public int getSoftEng() {
		return softEng;
	}

	public void setSoftEng(int softEng) {
		this.softEng = softEng;
	}
	
}
