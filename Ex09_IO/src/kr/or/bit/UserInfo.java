package kr.or.bit;

import java.io.Serializable;
/*
 * ��ü�� �ְ�޴� ��� (��ü���)
 * ��Ʈ��ũ�� ���ؼ�..
 * ���ϰ� ���ϰ���...(���Ͽ��ٰ� ��ü�� write, �� ������ read)
 * 
 * ����ȭ(��ü�� �����ؼ� ���� ���� ������ ����)
 * ������ȭ(��ü�� �����ؼ� �ϼ���Ű�� ����)
 * 
 * �ǽ�)
 * ���: ����(txt)
 * 
 * ��ü�� ���Ͽ��� write (����ȭ)
 * ������ read(������ȭ)
 * 
 */

//���� (��ü ���) ���赵�� �ݵ�� implements Serializable ����
public class UserInfo implements Serializable{
	public String name;
	public String pwd;
	public int age;
	
	public UserInfo() {}
	public UserInfo(String name, String qwd, int age) {
		this.name = name;
		this.pwd= pwd;
		this.age=age;
	}
	@Override
	public String toString() {
		return "UserInfo [name=" + name + ", pwd=" + pwd + ", age=" + age + "]";
	}
	
	
	
}
