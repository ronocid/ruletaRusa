package org.pmm.ruletarusa;

import java.util.ArrayList;
import java.util.Collections;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class Actividad extends Activity {
	private ArrayList<Integer> tambor=new ArrayList<Integer>();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_actividad);
		final ImageButton bala1=(ImageButton)findViewById(R.id.imageButton1);
		final ImageButton bala2=(ImageButton)findViewById(R.id.imageButton2);
		final ImageButton bala3=(ImageButton)findViewById(R.id.imageButton3);
		final ImageButton bala4=(ImageButton)findViewById(R.id.imageButton4);
		final ImageButton bala5=(ImageButton)findViewById(R.id.imageButton5);
		final ImageButton bala6=(ImageButton)findViewById(R.id.imageButton6);
		final Button continuar =(Button)findViewById(R.id.button1);
		final ImageView fin=(ImageView)findViewById(R.id.imageView1);
		tambor.add(1);
		tambor.add(0);
		tambor.add(0);
		tambor.add(0);
		tambor.add(0);
		tambor.add(0);
		Collections.shuffle(tambor);
		
		bala1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				bala1.setVisibility(View.INVISIBLE);
				if(tambor.get(0)==1){
					//fin.setVisibility( 0);
					continuar.setVisibility(0);
				}
			}
		});
		
		bala2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				bala2.setVisibility(View.INVISIBLE);
				if(tambor.get(1)==1){
					fin.setVisibility( 0);
					continuar.setVisibility(0);
				}
			}
		});
		
			bala3.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				bala3.setVisibility(View.INVISIBLE);
				if(tambor.get(2)==1){
					fin.setVisibility( 0);
					continuar.setVisibility(0);
				}
			}
		});
			
			bala4.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					bala4.setVisibility(View.INVISIBLE);
					if(tambor.get(3)==1){
						fin.setVisibility( 0);
						continuar.setVisibility(0);
					}
				}
			});
			
			bala5.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					bala5.setVisibility(View.INVISIBLE);
					if(tambor.get(4)==1){
						fin.setVisibility( 0);
						continuar.setVisibility(0);
					}
				}
			});
			
			bala6.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					bala6.setVisibility(View.INVISIBLE);
					if(tambor.get(5)==1){
						fin.setVisibility( 0);
						continuar.setVisibility(0);
					}
				}
			});	
				
			continuar.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					Collections.shuffle(tambor);
					bala1.setVisibility(View.VISIBLE);
					bala2.setVisibility(View.VISIBLE);
					bala3.setVisibility(View.VISIBLE);
					bala4.setVisibility(View.VISIBLE);
					bala5.setVisibility(View.VISIBLE);
					bala6.setVisibility(View.VISIBLE);
					fin.setVisibility(View.INVISIBLE);
					continuar.setVisibility(View.INVISIBLE);
				}
			});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.actividad, menu);
		return true;
	}

}
