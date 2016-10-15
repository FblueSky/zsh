package com.samrtlife.elect;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

import com.samrtlife.util.Util;

/***************************/
public class MainActivity extends ActionBarActivity {

	private TextView tv_cur_pos;
	private Button left_move, right_move, left_end, right_end;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		tv_cur_pos = (TextView) findViewById(R.id.cur_pos);
		left_move = (Button) findViewById(R.id.left_move);
		right_move = (Button) findViewById(R.id.right_move);
		left_end = (Button) findViewById(R.id.left_move_end);
		right_end = (Button) findViewById(R.id.right_move_end);

		left_move.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Util.Ele_move_left();
				tv_cur_pos.setText(" "+Util.getCurPos());
			}
		});

		right_move.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Util.Ele_move_right();
				tv_cur_pos.setText(" "+Util.getCurPos());
			}
		});

		left_end.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Util.Ele_move_left_end();
				tv_cur_pos.setText(" "+Util.getCurPos());
			}
		});

		right_end.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Util.Ele_move_right_end();
				tv_cur_pos.setText(" "+Util.getCurPos());
			}
		});

	}

}
