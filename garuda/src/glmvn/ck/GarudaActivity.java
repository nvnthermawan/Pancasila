package glmvn.ck;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class GarudaActivity extends Activity implements View.OnClickListener {
	private ImageView bntang;
	private ImageView rntai;
	private ImageView brngin;
	private ImageView bnteng;
	private ImageView dipas;
	private ImageView gocuk;
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
       tmbl();
    }
    
    private void tmbl()
    {
    	bntang=(ImageView)findViewById(R.id.bntang);
        rntai=(ImageView)findViewById(R.id.rntai);
        brngin=(ImageView)findViewById(R.id.bringin);
        bnteng=(ImageView)findViewById(R.id.bnteng);
        dipas=(ImageView)findViewById(R.id.padipas);
        gocuk=(ImageView)findViewById(R.id.ck);
        bntang.setOnClickListener(this);
        rntai.setOnClickListener(this);
        brngin.setOnClickListener(this);
        bnteng.setOnClickListener(this);
        dipas.setOnClickListener(this);
        gocuk.setOnClickListener(this);
    }
    
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		switch (v.getId())
		{
		case R.id.bntang:
			Intent aintent =  new Intent(GarudaActivity.this,Sila.class);
			GarudaActivity.this.startActivity(aintent);
		break;
		
		case R.id.bnteng:
			Intent dintent = new Intent(GarudaActivity.this,empat.class);
			GarudaActivity.this.startActivity(dintent);
			break;
			
		case R.id.bringin:
			Intent cintent = new Intent(GarudaActivity.this,tiga.class);
			GarudaActivity.this.startActivity(cintent);
			break;
			
		case R.id.rntai:
			Intent bintent = new Intent(GarudaActivity.this,dua.class);
			GarudaActivity.this.startActivity(bintent);
			break;
			
		case R.id.padipas:
			Intent eintent = new Intent(GarudaActivity.this,lima.class);
			GarudaActivity.this.startActivity(eintent);
			break;
			
		case R.id.ck:
			Intent fintent = new Intent(GarudaActivity.this,logocuk.class);
			GarudaActivity.this.startActivity(fintent);
			break;
			
		}
		}
		
	
	
	/**
	 * method ketika tombol untuk konfirmasi tombol back
	 */
	public void onBackPressed()
	  {
		    AlertDialog.Builder localBuilder = new AlertDialog.Builder(this);
		    localBuilder.setTitle("konfirmasi");
		    localBuilder.setMessage("apakah anda benar ingin keluar?");
		    localBuilder.setPositiveButton("ya", new OnClickListener(){
				public void onClick(DialogInterface dialog, int which) {
					// TODO Auto-generated method stub
					exit();
				}});
		    localBuilder.setNegativeButton("tidak", new OnClickListener(){
		    	public void onClick(DialogInterface dialog, int which){	
		    	}});
		    localBuilder.show();
	  }
	
	public void exit()
	{
		this.finish();
	}


}