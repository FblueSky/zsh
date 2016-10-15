package com.samrtlife.util;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Util {
	
	/**
	 * ��ǰ�ڵ��λ��
	 * return value 0 -8֮���ʾ��λ�� -1λ��ȡʧ��
	  * return value 0 -8֮���ʾ��λ�� -1λ��ȡʧ��
	   * return value 0 -8֮���ʾ��λ�� -1λ��ȡʧ��
	 */
	public static int getCurPos() {

		int value = -1;

		try {
			FileReader freader;
			freader = new FileReader(new File(
					"/sys/electrical/electrical_cur_pos"));
			value = freader.read() - '0';
			freader.close();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return -1;
		}
		
		return value;

	}

	/**
	 * �����ƶ�
	 */
	public static void Ele_move_left() {

		int value = -1;

		try {
			FileWriter fwriter;
			fwriter = new FileWriter(new File(
					"/sys/electrical/electrical_move_left"));
			fwriter.write("0");
			fwriter.close();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	/*
	 * 
	 * �����ƶ�
	 * 
	 * **/
	public static void Ele_move_right() {

		int value = -1;

		try {
			FileWriter fwriter;
			fwriter = new FileWriter(new File(
					"/sys/electrical/electrical_move_right"));
			fwriter.write("0");
			fwriter.close();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	/*
	 * �ƶ��������
	 * 
	 * 
	 * **/
	public static void Ele_move_left_end() {

		int value = -1;

		try {
			FileWriter fwriter;
			fwriter = new FileWriter(new File(
					"/sys/electrical/set_move_left_end"));
			fwriter.write("0");
			fwriter.close();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	/*
	 * 
	 * �ƶ������ұ�
	 * 
	 * **/
	public static void Ele_move_right_end() {

		int value = -1;

		try {
			FileWriter fwriter;
			fwriter = new FileWriter(new File(
					"/sys/electrical/set_move_right_end"));
			fwriter.write("0");
			fwriter.close();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
