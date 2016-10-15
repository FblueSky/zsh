package com.samrtlife.util;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Util {
	
	/**
	 * 当前节点的位置
	 * return value 0 -8之间表示的位置 -1位读取失败
	  * return value 0 -8之间表示的位置 -1位读取失败
	   * return value 0 -8之间表示的位置 -1位读取失败
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
	 * 望左移动
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
	 * 望右移动
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
	 * 移动到最左边
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
	 * 移动到最右边
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
