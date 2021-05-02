package com.example.springboot;

public class UserDAO {
	int a,b,c;
	String sa,sb,sc;
	UserDAO(int a, int b, int c, String sa, String sb, String sc){
		this.a = a;
		this.b = b;
		this.c = c;
		this.sa = sa;
		this.sb = sb;
		this.sc = sc;
	}
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public int getC() {
		return c;
	}
	public void setC(int c) {
		this.c = c;
	}
	public String getSa() {
		return sa;
	}
	public void setSa(String sa) {
		this.sa = sa;
	}
	public String getSb() {
		return sb;
	}
	public void setSb(String sb) {
		this.sb = sb;
	}
	public String getSc() {
		return sc;
	}
	public void setSc(String sc) {
		this.sc = sc;
	}
}
